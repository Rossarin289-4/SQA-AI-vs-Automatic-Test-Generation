package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "-1", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "10", "2147483614"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"2147483647", "<sample:0>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<s:>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "-1", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<i:-32>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "0", "0"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "-1", "<s:key>", "<i:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-2147483648", "1"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:3>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:Fb>", "<i:1>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}}, 3), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"2147483632"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:3>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "1", "<null>", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "1", "<s:>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-1"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:keC>", "<i:-1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1", "<i:0>", "<i:0>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:<>", "<i:-4>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:H>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-1", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}, 2), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:c>", "<s:a>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:j;y>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<i:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<s:key>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"int", "int"}, new String[]{"2147481599", "-2147483648"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:jey>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "-2147483648", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2147483647", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "1073741783", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "2", "<s:>", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-2146960386", "<s:jey>", "<d:-0.22999999999999998>"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-257", "-1"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:key>"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2147483647", "-2"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"int", "int"}, new String[]{"2147483614", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<d:1.5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:-110>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "10", "<s:b>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<s:a>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:l=a'>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-20", "<s:y>", "<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"2147483647", "<sample:0>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:4>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<i:17>", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", new String[]{"int"}, new String[]{"-3"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"int", "int"}, new String[]{"2147483647", "-2"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:8>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "2147483614", "<i:-2>", "<d:0.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:da>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2147483614", "2147483614"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:-47>", "<s:b>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "10"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "1", "<i:1>", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2", "<s:c>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483614"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<i:-22>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "10", "<b:true>", "<d:1.5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "2147483614", "2147483614"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 12, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:;Bkd!y>", "<sample:2>"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2", "50"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"2", "<i:0>", "<d:-0.5>"}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:aB>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}, 3), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:aB>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<d:1.5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:3>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<d:1.5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"int", "int"}, new String[]{"-1", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"int", "int"}, new String[]{"0", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<i:0>"}, false, 3, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:jey>", "<null>"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "1", "0"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2", "0"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2", "0"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "-1", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-1", "<null>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"2147483614", "<i:0>", "<d:-0.27>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:key>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", new String[]{"int"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-1", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"0", "<sample:1>", "<null>"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2147483614", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"int", "int"}, new String[]{"2147483614", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "2", "<s:>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b>", "<s:jey>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "2"}, {"set", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:a>", "<d:-0.27>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-2147483648", "-1"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:1>"}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "1", "2147483614"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "-1", "1"}}), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:aB>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2147483614", "<s:jey>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483614"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"2147483614", "2"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "2147483614"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2147483647", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2147483647", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:bg>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-32>", "<i:2>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:key>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ff\u00e9kD>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:a>", "<i:-2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<s:jey>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<s:jey>", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-8388640>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2147483647", "<s:jey>", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2147483647", "<s:jeys>", "<i:-7>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:6>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"size", "", "6"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "2", "<b:false>", "<d:1.5>"}}, 3), new String[][]{{"size", "", "6"}, {"clone", "", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "4", "<b:false>", "<i:0>"}}), new String[][]{{"size", "", "6"}, {"clone", "", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:r5:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:ck\u00e9ey>"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:40>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:c>"}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:c>"}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:3>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"2147483647", "<b:true>", "<d:-0.027000000000000003>"}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:-32>", "<d:1.5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:-2147483648>"}}, 3), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2", "<i:-524287>", "<i:-1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<i:0>"}}, 3), new String[][]{{"add", "java.lang.Object", "3"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", ""}}, 1), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-1", "58"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:b>", "<i:-8388607>"}}, 2), new String[][]{{"clone", "", "2"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:b>", "<i:-16777214>"}}), new String[][]{{"listIterator", "int", "2"}, {"nextIndex", "", "0"}, {"hasPrevious", "", "3"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:b>", "<i:-16777214>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "5", "<i:2>", "<d:-0.5>"}}, 1), new String[][]{{"clone", "", "2"}, {"remove", "java.lang.Object", "0"}, {"trimToSize", "", "3"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "2", "1073741823"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:jey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 47, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "-2147483648", "<sample:0>", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "3"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "2147483647"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<b:true>"}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}}, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "fireDatasetChanged", ""}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1), new String[][]{{"isEmpty", "", "5"}, {"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-32>", "<s:a>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "2"}, {"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "0", "1"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"1073741823"}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "1", "<s:>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"-604004359"}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<d:1.5>", "<i:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "-2147483632"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2147483647", "10"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"2", "10"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "-2", "<b:false>", "<null>"}}, 2), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:key>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:b>"}}), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:key>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:b>"}}, 1), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "-43"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:ley>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "-20", "-1073741816"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}), new String[][]{{"add", "int,java.lang.Object", "2"}, {"removeAll", "java.util.Collection", "7"}, {"clear", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:2>"}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2", "2147483614"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "2147483647", "1"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-1"}}), new String[][]{{"clone", "", "5"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "-1"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 45, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}}, 2), new String[][]{{"ensureCapacity", "int", "2"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<null>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "6"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:1>"}}, 3), new String[][]{{"remove", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "0"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<i:23>", "<d:-10.060000000000002>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"remove", "java.lang.Object", "1"}, {"listIterator", "", "0"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:key>", "<i:-1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:2>"}}, 2), new String[][]{{"remove", "java.lang.Object", "1"}, {"listIterator", "", "0"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<b:false>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<d:1.5>", "<i:-262144>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:-2147483648>"}}, 3), new String[][]{{"ensureCapacity", "int", "3"}, {"clear", "", "2"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "0", "<d:1.5>", "<d:-30.0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "2147483647"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:2>"}}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<b:false>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1", "<s:b>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2", "2147483646"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:a>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", ""}}, 2), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "-1"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "36"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:aU>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:-128>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:>", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:>"}, false, 3, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getValue", "int,int", "-2147483648", "-2147483648"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "int,int", "2147483614", "2147483614"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2147483614", "0"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"ensureCapacity", "int", "0"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", new String[]{"java.lang.Comparable[]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-63"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:7>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}), new String[][]{{"getID", "", "3"}, {"getID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:6>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}, 3), new String[][]{{"getID", "", "3"}, {"getID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:6>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}, 3), new String[][]{{"getID", "", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}, 3), new String[][]{{"getID", "", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", ""}}, 3), new String[][]{{"getID", "", "3"}, {"clone", "", "7"}, {"getID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:0>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:key>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<i:62>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "hasListener", "java.util.EventListener", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKey", "int", "2147483647"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "2147483647", "<i:-1>", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"int", "int"}, new String[]{"2147483614", "2"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 9, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setEndValue", "int,java.lang.Comparable,java.lang.Number", "1", "<sample:3>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesKey", "int", "10"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "indexOf", "java.lang.Comparable", "<i:-32>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", "int,int", "2147483614", "2147483647"}}, 3), new String[][]{{"listIterator", "", "6"}, {"nextIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:b>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"2147483614"}, false, 4, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryIndex", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<null>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesChanged", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesIndex", "java.lang.Comparable", "<s:>"}}, 3), new String[][]{{"trimToSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 30, new String[][]{}, 1), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "2"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", "java.lang.Comparable,java.lang.Comparable", "<s:jey>", "<b:true>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:a>"}}, 1), new String[][]{{"clear", "", "6"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getCategoryCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 44, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setCategoryKeys", "java.lang.Comparable[]", "<empty>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", "java.lang.Object", "<s:la>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=0, getRowCount=!NullPointerException, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2147483632", "<b:false>", "<d:-0.27>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "getSeriesCount", ""}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCategoryCount=0, getColumnCount=!NullPointerException, getRowCount=0, getSeriesCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getStartValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:.>", "<s:key>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "setStartValue", "int,java.lang.Comparable,java.lang.Number", "2147483632", "<i:1>", "<d:-0.5>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "getEndValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-32>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.category.DefaultIntervalCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:2>"}, {"org.jfree.data.category.DefaultIntervalCategoryDataset", "setSeriesKeys", "java.lang.Comparable[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
}
