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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<null>", "false"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483646"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "2147483647", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "hashCode", ""}}), new String[][]{{"getY", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.0", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"16.5", "1.1817018576394304E20"}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:4>"}, {"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<null>", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "isEmpty", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.0", "<null>"}, {"org.jfree.data.xy.XYSeries", "toArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<d:-0.25>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:0>"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:5>"}, {"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "1", "<d:-0.5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:3>", "true"}, false, 12, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "10"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "NaN", "0.44999999999999996", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=10, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.xy.XYSeries", "clear", ""}, {"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "-1", "0"}}, 2), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:-2147483648>"}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-1>"}, {"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}}), new String[][]{{"getX", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"2.147483647E8", "-1.9000000000000001"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "NaN", "<i:1>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "-Infinity"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.25>", "<null>"}, {"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "0", "1073739698"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1650766844", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "Infinity", "2.14748364686E8", "true"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "2147483647", "<i:-2147483648>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2032002192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jfree.data.xy.XYSeries", "hashCode", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<d:0.43>"}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-2.147483648E9], [0.43]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "-5"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-268435454>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<d:3.83>"}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=-5, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-536870902>"}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "0", "19"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<d:3.8240000000000003>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-2.147483648E9], [3.8240000000000003]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:1>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<d:0.43>"}, {"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=0, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"Infinity", "NaN", "true"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "NaN", "1.1817018576394304E20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "-7"}, {"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "8388598", "31"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "2.14748364704E9", "2.147483647E8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=-7, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "NaN", "<i:-536870902>", "false"}, {"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:3.83>", "<i:1>"}}, 3), new String[][]{{"setY", "double", "2"}, {"getYValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1.12345678901234561.12345678", "<i:1>", "<i:15>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-/.v0A", "<i:-31>", "<i:-155>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-/.v0A", "<i:-31>", "<i:-155>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}, {"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1e10"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "2147483647", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "hashCode", ""}}, 1), new String[][]{{"getY", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1e10"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "2147483647", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1e10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1073741823"}, false, 15, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1073741823, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147481657"}, false, 15, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147481657, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147481657"}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147481657, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147481657"}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=123456789012345678901234567890, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146777178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146069926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134267292", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1809254782", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1613171070", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-857147774", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1132433679", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-836636654", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1592659950", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("915040776", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1633682248", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getItems", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1633682220", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "0", "<null>", "<s:b>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5908509288197150436", "Infinity", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-211359899", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.12345678", "<b:true>", "<i:-31>"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "0", "<null>", "<s:b>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5908509288197150436", "Infinity", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2032492468", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.12345678", "<b:true>", "<i:-31>"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "0", "<null>", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146775527", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Hello, World", "<b:true>", "<i:-6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1769471189", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Hello, World", "<b:true>", "<i:-6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-871373831", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Hello, World", "<b:true>", "<i:-6>"}, {"org.jfree.data.xy.XYSeries", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-871373831", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Hello, World", "<b:true>", "<i:-6>"}, {"org.jfree.data.xy.XYSeries", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2078878203", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2078170921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:5>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:5>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:5>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "updateByIndex", new String[]{"int", "java.lang.Number"}, new String[]{"-1", "<d:1.5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:0>", "<d:-0.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:6>", "false"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:-1>", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "getY", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:4>", "false"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:1>", "<null>"}, {"org.jfree.data.xy.XYSeries", "getY", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:7>", "false"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:1>", "<null>"}, {"org.jfree.data.xy.XYSeries", "getY", "int", "-7"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-5908509288197150436"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-5908509288197150436"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482836", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146777178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}, {"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "getNotify", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<i:9>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}, {"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "getNotify", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<i:9>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "-1.0", "1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "getNotify", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"8388598", "10"}, false, 0, null, 3), new String[][]{{"add", "java.lang.Number,java.lang.Number,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=\u00e9, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-Infinity", "8.988465674311579E307"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "31"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "31"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "-5908509288197150436", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:-12>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "2147483647"}, {"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.00565"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<s:k{y>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:6>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:6>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-1", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"2147483647", "Infinity"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"2147483647", "Infinity"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "2147483647", "-2147483648"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", ".5", "<d:1.5>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"NaN", "0.5"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "java.lang.Number", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "java.lang.Number", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "java.lang.Number", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "toArray", ""}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "0", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1.1234567890123456", "<i:-1>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-/.v0A", "<i:-31>", "<i:-155>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=10, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"57"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=57, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-7"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1073741817"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1073741817, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483636"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483636, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<i:0>", "<d:-0.5>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<d:1.5>", "<i:-1>", "true"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "-1.7976931348623157E308", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-5908509288197150436", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "-2.7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"8388598", "37"}, false), new String[][]{{"getY", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"8388598", "2147483646"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "hashCode", ""}}), new String[][]{{"getY", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"1.0", "<d:-0.5>", "false"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "toArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=5., getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2", "-2147483648"}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1e10"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "2147483647", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1e10, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1e10"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "2147483647", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:0.5>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-2147483648", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-2147483648", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-2147483648", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-2147483648", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.7976931348623157E308", "<i:0>"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "8388598"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "0", "0"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "31", "0"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "31", "0"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"-5908509288197150436", "0.0", "true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "getDataItem", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"5.9085092881971507E18", "-0.005", "true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "1"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"5.9085092881971507E18", "-0.005", "true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "1"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "-5908509288197150436"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"5.9085092881971507E18", "-0.005", "true"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "1"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "-5908509288197150436"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"5.9085092881971507E18", "-0.005", "true"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "1"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "-5908509288197150436"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "updateByIndex", new String[]{"int", "java.lang.Number"}, new String[]{"1", "<d:-0.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=123456789012345678901234567890, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:1>", "<null>"}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "31", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"int"}, new String[]{"-7"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "31"}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "8388598", "31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146777178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0], [-0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 0.0], [-0.5, -0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 0.0], [-0.5, -0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 0.0], [-0.5, -0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0], [-0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "true"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0], [-0.5]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "true"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 1.7976931348623157E308], [-0.5, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "true"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.7976931348623157E308, -1.0, 1.7976931348623157E308], [-1.7976931348623157E308, -0.5, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-1>", "<d:-0.5>", "true"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, -1.0, 1.7976931348623157E308], [Infinity, -0.5, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, 1.7976931348623157E308], [Infinity, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1613171070", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-857147774", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1809254782", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1633682220", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1633682248", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1587543224", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5908509288197150436", "Infinity", "true"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1152353315", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5908509288197150436", "Infinity", "true"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1152353287", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5908509288197150436", "Infinity", "true"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("930714545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.0", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.0", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.7976931348623157E308", "<d:-0.5>"}, {"org.jfree.data.xy.XYSeries", "remove", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146069926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:9>", "true"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getY", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-5908509288197150436"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-5908509288197150436"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.7976931348623157E308", "-5908509288197150436"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482836", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}, {"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "a b"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "0.0", "1.0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=a b, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "0.0", "1.0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "38"}, {"org.jfree.data.xy.XYSeries", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"8388598", "10"}, false), new String[][]{{"add", "java.lang.Number,java.lang.Number,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\u00e9, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=\u00e9, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getY", new String[]{"int"}, new String[]{"8388598"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:3>", "true"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "1.0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"Infinity", "<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"Infinity", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "1.7976931348623157E308", "NaN", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "8388598", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "2147483647", "-2147483648"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:28>", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"31", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<d:-0.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "a,b,c"}, {"org.jfree.data.xy.XYSeries", "remove", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=a,b,c, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDataItem", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=+1, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "Infinity"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=+1, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "Infinity"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=+, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"+"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "Infinity"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=+, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{","}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "Infinity"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:9>"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=,, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<d:1.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "1.0"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\u00e9, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:10>", "<d:1.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "1.0"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\u00e9\u00e9, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:10>", "<d:1.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "1.0"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\u00e9\u00e9<"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\u00e9\u00e9<, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:10>", "<d:1.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYDataItem", actual.getClass().getName());
  assertEquals("[-0.5, 1.5] {getX=-0.5, getXValue=-0.5, getY=1.5, getYValue=1.5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}}), new String[][]{{"getXValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<d:-1.0>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:0>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<i:-1>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "\t"}}), new String[][]{{"getXValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=\t, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "1"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "-1"}, {"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "1.0"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:0>", "<null>"}, {"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2036>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:52>", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "No observation for x = "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=No observation for x = , getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "No observation for x = "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=No observation for x = , getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=010, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12:30:45", "<sample:0>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12:30:45", "<sample:0>", "<s:key>"}, {"org.jfree.data.xy.XYSeries", "getAutoSort", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=0, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"64"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12:30:45", "<sample:0>", "<s:key>"}, {"org.jfree.data.xy.XYSeries", "getAutoSort", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=64, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12:30:45", "<sample:0>", "<s:key>"}, {"org.jfree.data.xy.XYSeries", "getAutoSort", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=32, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"8388598"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:0>", "false"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12:30:45", "<sample:0>", "<s:key>"}, {"org.jfree.data.xy.XYSeries", "getAutoSort", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=8388598, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-Infinity", "<i:36>", "false"}, {"org.jfree.data.xy.XYSeries", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-1", "-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-17", "2147483647"}, false, 0, null, 3), new String[][]{{"add", "org.jfree.data.xy.XYDataItem,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false), new String[][]{{"delete", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getX", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "1.7976931348623157E308", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "1.7976931348623157E308", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-1.0", "<d:-0.5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getX", new String[]{"int"}, new String[]{"2147483647"}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:4>"}, {"org.jfree.data.xy.XYSeries", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<d:1.5>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"2147483647", "<i:-1>", "false"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"1.0737418235E9", "<i:-1>", "true"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623157E308", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-7", "31"}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-7", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}, {"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "0", "<d:-0.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}, {"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "0", "<d:-0.35>"}, {"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.0", "NaN"}}), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-13.0", "NaN"}}), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-13.0", "-1.0"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"Infinity", "-1.7976931348623157E308"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "-2147483648"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"Infinity", "-1.7976931348623157E308"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "-5908509288197150436"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623157E308"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "-5908509288197150436"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"Infinity", "Infinity"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<d:1.5>"}, {"org.jfree.data.xy.XYSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"1.0", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=i, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "i"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "1.7976931348623157E308", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=i, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 10, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "i"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "1.7976931348623157E308", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=i, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0], [1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0], [1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.0", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[[0.0, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<d:1.5>", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<d:1.5>", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<d:1.5>", "<null>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", ".5"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2110705847", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=.5, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-Infinity", "<d:1.457>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
