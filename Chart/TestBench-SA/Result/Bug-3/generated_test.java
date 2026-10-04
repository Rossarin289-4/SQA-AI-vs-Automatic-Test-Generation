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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "-1073745984"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1", "-2147483647", "true"}, {"org.jfree.data.time.TimeSeries", "getItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}}, 2), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"setKey", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"10", "1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-1>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=2.147483647E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDes...#230#1002691957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1073741781", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1179183926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:3>", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:12>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<null>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.event.SeriesChangeEvent", "<null>"}, {"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"-1342181440", "<i:0>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMinY", ""}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}}), new String[][]{{"getDescription", "", "1"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "7"}, {"fireSeriesChanged", "", "7"}, {"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483647", "1073741794", "false"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<d:0.015>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<i:-2050>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.015, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.015, getNotify=true, getRangeDescriptio...#223#-6707224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "-5032960206869675528"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<i:4104>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<null>"}}, 1), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4104", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=4104.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=4104.0, getNotify=true, getRangeDescript...#225#1924252304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483647", "2147483647", "false"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "-10.799999999999995"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getMinY=NaN, getNotify=true, getRangeDescription=, isEmpty...#206#1723191414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:12>", "<d:-0.5>", "true"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double", "6"}, {"setDomainDescription", "java.lang.String", "4"}, {"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "-8.988465674311579E307", "false"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEm...#209#-2049506306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "2147483646", "1073745984"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-2147483647"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Time"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Ti...#218#2063210048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "-1.0"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:0>", "<i:-1073741823>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-3221225472", "false"}}, 3), new String[][]{{"setSelected", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-1073741823, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=0, ...#214#190751227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073741868", "2147483647"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<null>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "37781503", "true"}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:6>", "<sample:10>"}}, 2), new String[][]{{"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "6"}, {"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "NaN"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "NaN"}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "NaN"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:9>", "-0.5000000000000001"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-0.5000000000000001, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5000000000000001, getN...#248#-2066799202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:9>", "1.7976931348623157E308"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=1.7976931348623157E308, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.7976931348623157E308...#254#121373492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:9>", "-1.7976931348623157E308"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-1.7976931348623157E308, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.7976931348623157E3...#256#738641738", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 2), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-96691287", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-96691287", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<null>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<null>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-96691287", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}}, 1), new String[][]{{"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}}, 2), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"setKey", "java.lang.Comparable", "7"}, {"removeAgedItems", "long,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}}, 2), new String[][]{{"delete", "int,int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:1.0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:4.300000000000001>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=4.300000000000001, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=4.300000000000001, getNotify=...#247#963107744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<d:-0.5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescription=...#221#-827976976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:-1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-16326"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "-2.147483648E9"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"36028831378718662"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=36028831378718662, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ge...#239#-32344339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"36031030401974214"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=36031030401974214, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ge...#239#664599168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"37156930308816838"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=37156930308816838, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ge...#239#-268600577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"37156930308816838"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "2147483647"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=2147483647, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=37156930308816838, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=tr...#245#-1489025730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"37156930308816819"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "2147483647"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=2147483647, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=37156930308816819, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=tr...#245#-2080828261", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"39408730122502067"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-547608330240", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=39408730122502067, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Valu...#216#2055372001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"Value01.5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Value01.5, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescripti...#223#-1482730040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-5032960206869675527"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-41>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-41.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-41.0, getNotify=true, getRangeDescriptio...#223#-1463319876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-41>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-41.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-41.0, getNotify=true, getRangeDescript...#220#-1547648280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-41>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-41.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-41.0, getNotify=true, getRangeDescriptio...#223#-1463319876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:12>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483646", "-2147483588"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<null>"}, {"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483592", "<i:0>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "2247583647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-4194247>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "2147483633"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=...#216#-1283389834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "1073741781"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-1073741781"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"65536", "false"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"9223372036854775806", "true"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-5032960206869675528", "false"}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "2139095040"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:7>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483648"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "a,b,c", "<sample:1>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=2147483648, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=, isEmpty...#206#-1634493409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "2.147483647E8"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-5.4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=2.147483647E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.4, getNotify=true, getRangeDes...#230#1816394604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "1.0737418235E8"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-5.4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=1.0737418235E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.4, getNotify=true, getRangeDe...#231#843708215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "5.3687091175E7"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-5.4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=5.3687091175E7, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.4, getNotify=true, getRangeDe...#231#839271639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "5.3687091175E7"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-5.3999999999999995"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=5.3687091175E7, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.3999999999999995, getNotify=t...#246#430282477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "5.368709117499999E7"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-5.3999999999999995"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=5.368709117499999E7, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.3999999999999995, getNot...#251#-1732178461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-5.3999999999999995"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=NaN, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=-5.3999999999999995, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.3999999999999995, getNot...#251#-474577659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-5.3999999999999995"}}, 2), new String[][]{{"compareTo", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=-5.3999999999999995, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.3999999999999995, getNot...#251#-474577659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}}, 2), new String[][]{{"compareTo", "java.lang.Object", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=-10.799999999999999, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-10.799999999999999, getN...#248#-1687607847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}}, 2), new String[][]{{"compareTo", "java.lang.Object", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.799999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#1849510821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#370704799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription...#216#1675492343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription=V...#219#-1585505955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription=0, i...#212#90432074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=12...#222#577615432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "2147483646"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=2147483646, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEm...#210#-1470728303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-0.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescription=...#221#-827976976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-4.8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-4.8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-4.8, getNotify=true, getRangeDescription=...#221#-1048910704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-0.5>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescriptio...#218#-446492940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<d:-0.5>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescription=0, ...#214#-527655045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:-2>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-2.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.0, getNotify=true, getRangeDescription=0, ...#214#620893019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:-2050>"}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "-2147483647", "-2147483647", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-2050.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2050.0, getNotify=true, getRangeDescripti...#220#1176122383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:-2050>"}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "-2147483647", "-2147483647", "false"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-2050.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2050.0, getNotify=true, getRangeDescripti...#220#1176122383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "9223372036854775807"}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=9.223372036854776E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=9.223372036854776E18, getN...#253#-1430246672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:7>", "1.0", "true"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#370704799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "getItems", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#370704799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:8>", "NaN"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "false"}, {"org.jfree.data.time.TimeSeries", "getItems", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#1849510821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:12>", "NaN"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:10>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=...#216#-888691245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-0.0, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1948138676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "-1.0"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescriptio...#218#-284771212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-0.5"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescriptio...#218#-446492940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-0.5"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.event.SeriesChangeEvent", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:9>", "-0.5000000000000001"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-0.5000000000000001, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5000000000000001, getN...#248#-2066799202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:-0.5>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescription=...#221#-827976976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:0.5>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.5, getNotify=true, getRangeDescription=Va...#219#1349131750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:1.0>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:1.0>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:0.974>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.974, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.974, getNotify=true, getRangeDescriptio...#223#-934502940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<d:0.974>", "false"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=0.974, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.974, getNotify=true, getRangeDescript...#220#342970048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=...#216#-1835858188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:0>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "Requires start >= 0."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Requires start >= 0., getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRan...#235#558599734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=...#216#-1283389834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescriptio...#218#-284771212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}, {"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-1073741824"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}}), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMinY", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}, {"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "3"}, {"addChangeListener", "org.jfree.data.event.SeriesChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=10, getMinY=NaN, getNotify=true, getRangeDescription=Value, isE...#210#1864178457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDesc...#229#-303707088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<i:-134217728>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.34217728E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.34217728E8, getNotify=true, ge...#239#-1666988210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<i:-268435456>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.68435456E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.68435456E8, getNotify=true, ge...#239#1238932122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<i:2147483647>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=2.147483647E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483647E9, getNotify=true, ge...#239#1480525352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:1.0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483648"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=2147483648, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEm...#210#-1352286829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-547608330240"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=false...#201#2005851116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"8192"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=8192, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=tr...#203#303832624", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"8171"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=8171, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=tr...#203#-509255857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-5032960206869675528", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "-2147483648", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "-2147483648", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"1073741823", "2147483633", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "2147483633", "true"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<null>"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483588", "2147483647", "false"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483588", "2147483647", "true"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "2147483647", "true"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"-2147483648", "2147483646", "true"}, false, 15, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "1", "false"}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PT1H, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1772677726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PU1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PU1H, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1357350909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PTlH"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PTlH, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#150933017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PTlI"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PTlI, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#-533297288", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getItems", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483646", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "-1.5"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=-1.5, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1176541520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "-1.5"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=-1.5, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#858970494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "-1.5"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=-1.5, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#2043189917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-1073741824", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "39408730122502067"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=39408730122502067, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Valu...#216#2055372001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "0"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "39408730122502067"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<null>", "-5032960206869675528"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=39408730122502067, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=, ...#213#-1243967091", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "0"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "39408730122502067"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:5>", "-5032960206869675528"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-5.032960206869676E18, getMaximumItemAge=39408730122502067, getMaximumItemCount=2147483647, getMinY=-5.032960206869676E18, ge...#250#-437153395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:3>", "<sample:12>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-96691287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:3>", "<sample:12>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-41>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-41>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-41.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-41.0, getNotify=true, getRangeDescription=0...#216#1635547719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "int", "-1073745984"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:12>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:12>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"-2147483588", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"1073741781", "<i:1>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}), new String[][]{{"getItemCount", "", "5"}, {"delete", "int,int,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "0.0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "2147483633"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"39408730122502067", "false"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"65536", "false"}, false, 15, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "9223372036854775806"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775806, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#-2093411422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "true"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-1.0065920413739352E19", "false"}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "1069547541"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"2147483648", "true"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-1.0065920413739352E19", "false"}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "1069547541"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-1.0065920413739352E19, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0065920413739352E19, get...#250#-251200005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"2147483648", "false"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-1.0065920413739352E19", "false"}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "935329813"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0065920413739352E19, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0065920413739352E19, ...#257#-788146320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription=V...#219#-1585505955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=2.147483647E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483647E9, getNotify=true, ge...#239#-2014867415", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "Infinity"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescript...#225#1971655315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=2.147483647E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.0, getNotify=true, getRangeDes...#230#-805155564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}), new String[][]{{"compareTo", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#370704799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#221#-1826983972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:7>", "NaN", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#221#-1999398053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-10.799999999999999"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Value"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "4"}, {"setValue", "java.lang.Number", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=null, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#221#-1999398053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483633", "2147483633", "true"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "1.5"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "int", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483633", "2147450865", "false"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "1.5"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-235127859", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-908657090", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("359695462", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1073741781", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-829951180", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1073741781", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1253116651", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1073741781", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("975227182", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "1073741781", "1", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1424774501", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<null>", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null 'itel' argument."}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483588"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("119704855", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Nu...#234#-2020274811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null 'itel' argument."}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483588"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1975736164", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#236#-1535427160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null 'itel' argument."}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483588"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2092194610", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Nu...#234#-2020274811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null 'itel' argument."}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483588"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2021593078", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Null ...#231#1124598489", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null &itel' argument."}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483588"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1965522469", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Null ...#231#773798552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null &itel' argument."}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-167266717", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Nu...#234#1923892548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null &itel' argument."}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2091595447", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#236#-1886227097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null &itel' argument."}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-105204859", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Nu...#234#1923892548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-235127859", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-908657090", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1179183926", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.event.SeriesChangeEvent", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
}
