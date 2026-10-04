package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "-48"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<null>", "<i:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482836", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483587", "1610612735"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:3>", "false"}}), new String[][]{{"clear", "", "6"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:5>", "<d:1.5>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=-2147483648, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "2.1474836469999998E9", "-42.99999999999999", "true"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"2.1474836470000004E10", "-4.9E-324"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYDataItem", actual.getClass().getName());
  assertEquals("[NaN, NaN] {getX=NaN, getXValue=NaN, getY=NaN, getYValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073741823", "-511"}, false), new String[][]{{"add", "org.jfree.data.xy.XYDataItem,boolean", "0"}, {"delete", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<d:0.375>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "NaN", "-5908509288197150436"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-1.0", "1.7976931348623156E306", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYDataItem", actual.getClass().getName());
  assertEquals("[NaN, -5.9085092881971507E18] {getX=NaN, getXValue=NaN, getY=-5.9085092881971507E18, getYValue=-5.9085092881971507E18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:22>", "<d:-0.75>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "hashCode", ""}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "NaN", "<d:-0.5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "0.25", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.25], [NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "updateByIndex", new String[]{"int", "java.lang.Number"}, new String[]{"0", "<i:11>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:20>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "1.7976931348623163E306", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:5>", "<i:-22>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "-1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=-1073741824, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "1073741793"}, {"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:-22>", "<i:-10>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1073741793, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-1>"}}, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYDataItem", actual.getClass().getName());
  assertEquals("[-2.147483648E9, -1.0] {getX=-2147483648, getXValue=-2.147483648E9, getY=-1, getYValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:1>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-22>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=1, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:-2147483648>", "<i:-15>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<d:-0.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "NaN", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, NaN], [1.0, 2.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "Infinity", "-1.0E-323"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1709226818", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"1.7976931348623158E307", "NaN"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"-4.9E-324", "<i:-10>", "false"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "-65560"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getY", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "1073741825"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getX", "int", "-10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-10", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<d:0.75>", "<d:-0.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "2147483647", "<i:0>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:4>", "true"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"47", "0"}, false, 0, null, 2), new String[][]{{"delete", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"1.0", "1.7976931348623157E308", "false"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:-0.39>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getX", new String[]{"int"}, new String[]{"2147483587"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "updateByIndex", new String[]{"int", "java.lang.Number"}, new String[]{"-131120", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "toArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 3), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"Infinity", "<i:11>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "2147483646", "-48"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"-1.7976931348623157E308", "-2.9542546440985754E18", "false"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:0>", "<i:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"1.7976931348623156E306", "2.9542546440985754E18", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"\n", "<b:false>", "<i:1>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146069926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<i:4>", "<i:40>", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:20>", "<i:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-1.0E-323", "<i:10>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-9.0", "<null>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"NaN", "Infinity"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "NaN", "<i:5>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-0.0", "<i:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getAutoSort", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "2147483583", "-1"}, {"org.jfree.data.xy.XYSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:10>", "<i:11>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-4.9E-324", "<i:2>", "false"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-0.0", "1.7976931348623157E308", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "6.0"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-Infinity", "1.7976931348623155E307"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-1.0", "<i:20>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<d:-0.5>", "<i:106>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "-262222", "-1073741824"}, {"org.jfree.data.xy.XYSeries", "getX", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<d:-3.0>", "<i:42>"}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-3.0], [42.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<d:0.75>", "<i:-1048560>"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:-2147483648>", "<i:5>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<d:1.5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "clear", ""}, {"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"NaN", "2.14748364702E9"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-Infinity", "<i:-50>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483587", "16777226"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-1.7976931348623157E308", "<i:-29>", "false"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "I2020-01-01"}}, 3), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=I2020-01-01, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=I2020-01-01, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483646", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:2147483642>", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getItemCount", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getAutoSort", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"1.7976931348623157E308", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623158E307", "-0.034"}, {"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1073741808"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1073741808, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-1.0000000000000002", "<d:15.0>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-1073741823", "2147483647"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-1.0", "<i:20>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "4.9E-324", "-8.988465674311579E307"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"-Infinity", "1.797693134862316E306"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-10", "-78"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}}, 2), new String[][]{{"add", "double,java.lang.Number", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}, {"org.jfree.data.xy.XYSeries", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:20>", "<d:0.375>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "2.0", "-1.7976931348623156E306"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Null 'item' argument.", "<b:true>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"--0"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-Infinity", "-0.0", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=--0, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483642", "-1073741824"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "<null>", "<i:2>", "<b:true>"}, {"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=0, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=0, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483646, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-65560", "-107"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "java.lang.Number", "<i:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:40>", "<i:30>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "nuklNo observation for x = "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=nuklNo observation for x = , getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-Infinity", "<i:40>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"25.0", "1.0000000000000002", "true"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "getY", "int", "65560"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:-20>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<i:-2147483648>", "<i:10>", "false"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Hello, Word", "<i:2>", "<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"-1.0", "1.7976931348623158E307", "true"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "1073741823"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "NaN", "-1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=1073741823, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "-10", "2147483647"}, {"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"0.0", "4.294967294E10"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<d:-0.558>", "<null>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-5908509288197150436", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "4106"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}, {"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-48"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"NaN", "3.5953862697246315E307"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<null>", "<d:-2.0>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDataItem", new String[]{"int"}, new String[]{"2097104"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-45>", "<i:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"Null 'item' argument.\t"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=Null 'item' argument.\t, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription={\"a\":1}, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"int"}, new String[]{"2"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}, {"org.jfree.data.xy.XYSeries", "getY", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146777178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "536870911"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870911", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=536870911, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:4>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getY", "int", "-63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<d:-0.5>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<i:13>", "<i:-18>", "false"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<i:-2147483648>", "<i:0>", "true"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "toArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getY", new String[]{"int"}, new String[]{"2147483616"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-2147483648>", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-1", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483646, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}, {"org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "updateByIndex", new String[]{"int", "java.lang.Number"}, new String[]{"-48", "<i:34>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"-1.0000000000000002", "1.7976931348623157E308", "true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-Infinity", "NaN", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968922040", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<i:10>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:-10>", "<i:-2147483627>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "updateByIndex", "int,java.lang.Number", "-2147483616", "<i:-10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:10>", "<d:0.75>"}, {"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "3.5953862697246315E307", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "-65560"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", " "}}), new String[][]{{"add", "java.lang.Number,java.lang.Number", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-48", "-78"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}, {"org.jfree.data.xy.XYSeries", "clone", ""}}), new String[][]{{"getDataItem", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "0.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[[0.0, -1.7976931348623157E308]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1e10", "<d:1.5>", "<sample:0>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1276821548", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134267292", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"4.9E-324", "<i:10>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getY", "int", "2147483647"}, {"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getX", new String[]{"int"}, new String[]{"-48"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<d:-0.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "-2147483604"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number", "boolean"}, new String[]{"<d:0.75>", "<i:5>", "false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "-2147483648", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "22020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=22020-02-30T25:61:61, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "Infinity", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-20", "1073741823"}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}, {"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:M>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-0.982", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2.1474836470000002E9", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-2.0", "0.1", "true"}}), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "update", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:4>", "<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:1>", "<i:5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:0>", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getY", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-4.9E-324", "<d:-0.5>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2077463640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"2020-0P2-30T25:61:61"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "4.9E-324", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=2020-0P2-30T25:61:61, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false, 4, new String[][]{}), new String[][]{{"delete", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.123456789023456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1.123456789023456, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"196584"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=196584, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-2.0000000000000004", "-0.063"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "2147483647", "-5.4E-323", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-48", "2147483587"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "java.lang.Number", "<i:0>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "Infinity", "1.7976931348623156E306", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2078170921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-5.908509288197151E19", "-4.9E-324", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "2147483647", "1073741833"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("870662100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=-1, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"4097", "156"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getDataItem", "int", "2147483647"}}), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"Infinity", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "/a/c1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/c1E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=/a/c1E-5, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:ke>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073741823", "-1073741824"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "-Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "add", "double,double", "-5.9085092881971507E18", "2.1474836443999999E9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-24>", "<i:-2147483648>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getItems", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-Infinity", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-1", "<s:`>", "<i:0>"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:1>", "true"}, {"org.jfree.data.xy.XYSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getAutoSort", ""}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483587", "-2147483646"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:-51>", "<i:4>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "134086632"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=134086632, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getDescription", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:10>"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:22>", "<i:10>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "1.0", "<i:11>", "false"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:63>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getY", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "NaN", "-0.19999999999999996", "true"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN], [-0.19999999999999996]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "1", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-5908509288197150436", "<d:0.5>"}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:1>", "<i:20>"}, {"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-1.0", "<d:-1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1524158137", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "setMaximumItemCount", "int", "1073741809"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=1073741809, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=0, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=a,b,c, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"-0.0", "-1.7976931348623156E306"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getItems", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"Infinity", "1.7976931348623156E306", "true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "-27", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "getY", "int", "101"}}), new String[][]{{"add", "double,java.lang.Number,boolean", "3"}, {"getItems", "", "3"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-0.0", "<i:10>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"1.0", "-1.7976931348623157E308", "true"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:nkcy>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:0>", "<i:11>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "2147483646"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "50.0", "<d:-0.75>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-4", "-64"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}}), new String[][]{{"getDescription", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-2", "-2147483648"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:11>", "<i:-1>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "-2.0", "<d:0.05>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "remove", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:1>"}, {"org.jfree.data.xy.XYSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<i:0>", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYDataItem", actual.getClass().getName());
  assertEquals("[0.0, 1.0] {getX=0.0, getXValue=0.0, getY=1.0, getYValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double", "-1.7976931348623158E307", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=false, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number", "Infinity", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"-1.0", "<i:-33>", "false"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getKey", ""}, {"org.jfree.data.xy.XYSeries", "getItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "NaN"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<d:-15.25>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"-4.9E-324", "<d:-2.0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"-0.0", "<d:-0.75>", "false"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-5.908509288197151E19", "<i:-51>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "Infinity", "<i:-24>", "false"}, {"org.jfree.data.xy.XYSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "delete", new String[]{"int", "int"}, new String[]{"-10", "-33"}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "-1073741696", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146069926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-10", "-2147483648"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "4.9E-324", "1.7976931348623156E306", "false"}}), new String[][]{{"createCopy", "int,int", "2"}, {"setDescription", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=sample, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "addOrUpdate", new String[]{"double", "double"}, new String[]{"-5908509288197150436", "-1.0000000000000002"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:11>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-129587377", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"Infinity", "<d:7.5>"}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:4>", "<i:14>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483587", "-24"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getNotify", ""}, {"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1.5d", "<s:ley>", "<i:2>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<d:-0.125>", "<d:0.75>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "8.988465674311579E307", "-1.7976931348623156E306", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[8.988465674311579E307], [-1.7976931348623156E306]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:67>", "<i:29>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-89296749", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false), new String[][]{{"update", "java.lang.Number,java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:0>", "true"}}), new String[][]{{"delete", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"java.lang.Number", "java.lang.Number"}, new String[]{"<i:11>", "<i:-268435436>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}, {"org.jfree.data.xy.XYSeries", "delete", "int,int", "44", "-2147483520"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:0>"}, {"org.jfree.data.xy.XYSeries", "equals", "java.lang.Object", "<i:8>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0], [0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 3, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "1.123456789012345670x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=1.123456789012345670x1F, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-0.5", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:1>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-16380>", "<i:24>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=3, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:}a_>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:0>", "<i:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:0.75>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,java.lang.Number,boolean", "-0.0", "<i:1>", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:5>"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<d:1.5>", "<i:-10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double", "boolean"}, new String[]{"-0.9999999999999999", "NaN", "true"}, false, 6, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<i:-2147483648>", "<d:0.71>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<d:-1.683>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number", "boolean"}, new String[]{"1.7976931348623157E308", "<i:11>", "true"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"NaN", "<i:50>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number,boolean", "<d:0.75>", "<i:10>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:1>"}, {"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", "-1No observation for x = "}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=-1No observation for x = , getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "1.7976931348623157E308", "-0.56", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:15>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[], []]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "update", "java.lang.Number,java.lang.Number", "<i:20>", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "java.lang.Number"}, new String[]{"1.7976931348623157E308", "<d:-0.5>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "getItems", ""}, {"org.jfree.data.xy.XYSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=false, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483582", "7"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "indexOf", "java.lang.Number", "<i:20>"}}), new String[][]{{"setNotify", "boolean", "4"}, {"addPropertyChangeListener", "java.beans.PropertyChangeListener", "4"}, {"getItemCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "getY", "int", "-48"}, {"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "0.0", "1.7976931348623156E306"}, {"org.jfree.data.xy.XYSeries", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "-Infinity", "-Infinity", "true"}, {"org.jfree.data.xy.XYSeries", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-1.7976931348623157E308"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getAutoSort", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"org.jfree.data.xy.XYDataItem", "boolean"}, new String[]{"<sample:2>", "false"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "double,double,boolean", "Infinity", "-3.9000000000000004", "true"}, {"org.jfree.data.xy.XYSeries", "createCopy", "int,int", "10", "-78"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=2, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "-4"}}), new String[][]{{"getItemCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "remove", "int", "2"}, {"org.jfree.data.xy.XYSeries", "addOrUpdate", "java.lang.Number,java.lang.Number", "<i:-28>", "<i:20>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "org.jfree.data.xy.XYDataItem,boolean", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity], [-1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAllowDuplicateXValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.xy.XYSeries", "fireSeriesChanged", ""}, {"org.jfree.data.xy.XYSeries", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-18", "2147483587"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}, {"org.jfree.data.xy.XYSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:0>"}}), new String[][]{{"getAutoSort", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "indexOf", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.jfree.data.xy.XYSeries", "setDescription", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=false, getDescription=, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-1073741824"}, false, 7, new String[][]{{"org.jfree.data.xy.XYSeries", "addOrUpdate", "double,double", "2147483647", "1.073741823459E9"}, {"org.jfree.data.xy.XYSeries", "getKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "setKey", "java.lang.Comparable", "<s:b8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getAutoSort", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483646", "-78"}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "delete", "int,int", "-536870912", "-65517"}}), new String[][]{{"getItems", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "getNotify", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=0, getMaximumItemCount=2147483647, getNotify=true, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.xy.XYSeries", "add", "java.lang.Number,java.lang.Number", "<i:-59>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-59.0], [0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.xy.XYSeries", "org.jfree.data.xy.XYSeries", "add", new String[]{"double", "double"}, new String[]{"1.7976931348623156E306", "-2.0000000000000004"}, false, 5, new String[][]{{"org.jfree.data.xy.XYSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAllowDuplicateXValues=false, getAutoSort=true, getDescription=null, getItemCount=1, getMaximumItemCount=2147483647, getNotify=true, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
