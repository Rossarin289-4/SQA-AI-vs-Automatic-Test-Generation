package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-0.1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-0.1, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.1, getNotify=true, getRangeDescription=...#221#-730616464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "9.223372036854776E18"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<d:3.0>"}}, 1), new String[][]{{"update", "int,java.lang.Number", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:2>", "Infinity", "false"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "-2147483648", "0", "false"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDescrip...#222#-1049228101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "10"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=10, getMinY=NaN, getNotify=true, getRangeDescription=Value, isE...#210#1864178457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:10>", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=3.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=3.0, getNotify=true, getRangeDescription=Va...#219#1180476650", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=3.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=3.0, getNotify=true, getRangeDescription=Va...#219#1180476650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-5032960206869675571"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:8>", "false"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:6>"}}, 2), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483636", "0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483648", "2097153"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:12>", "<i:21>", "false"}, {"org.jfree.data.time.TimeSeries", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2097142", "1073741834"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "1073741823", "-2147483648"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=123456789012345678901234567890, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=tr...#239#-1726460791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=123456789012345678901234567890, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=tr...#239#-1726460791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-5050974605379157513"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:-2147483648>"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:11>", "<i:-39>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:5>", "NaN"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:-0.25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getMinY=NaN, getNotify=true, getRangeDescription=, isEmpty...#206#1723191414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false), new String[][]{{"addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "5"}, {"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "1.073741824E9"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:0>", "-2.147483648E9", "true"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<i:39>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxY=1.073741824E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true,...#237#-1557690022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"1125897759358975", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:kBey>"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<i:-67108864>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "NaN"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<i:-134217715>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:12>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<null>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "-0.95", "false"}}, 1), new String[][]{{"removeAgedItems", "long,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-0.95, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.95, getNotify=true, getRangeDescription=0...#216#1446388369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=-0.95, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.95, getNotify=true, getRangeDescription=0...#216#1446388369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:6>", "NaN", "true"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "2.147483648E9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483648E9, getNotify=true, ge...#239#-1184753881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-2147483648"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "-1.073741824E9"}}, 3), new String[][]{{"getValue", "org.jfree.data.time.RegularTimePeriod", "5"}, {"setDomainDescription", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=0, getItemCount=1, getMaxY=-1.073741824E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.073741824E9, getNotify=true, get...#238#938953451", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.073741824E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.073741824E9, getNotify=true, ...#241#1051575984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "-2147483628"}}, 1), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.FixedMillisecond", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getFirstMillisecond=3, getLastMillisecond=3, getMiddleMillisecond=3, getSerialIndex=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:4>", "<sample:9>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEm...#209#-2049506306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<i:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=6.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=6.0, getNotify=true, getRangeDescription=Va...#219#-1932867036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"0", "<i:-2147483648>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:9>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true...#238#-1758582284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"2147483582"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:9>", "<d:-0.25>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "0"}}), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double", "4"}, {"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-Infinity, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=-Infinity, getNotify=true, getRangeDescription=Value, i...#213#-1356452616", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:67.0>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=67.0, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:-32>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:10>", "-2.1474836478E9"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=-32.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.1474836478E9, getNotify=true, getRange...#233#-1363281072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-908657090", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#219#1249956859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<i:1>", "false"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:32>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=12...#243#-797689036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Requires stars >= 0.", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "-2.147483648E<9"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-2.147483648E<9, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDes...#229#1101231509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:0>", "4.294967294E9", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=4.294967294E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=4.294967294E9, getNotify=true, ge...#239#-483705440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.event.SeriesChangeEvent", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<i:-262145>", "<i:-126>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-524287>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:1>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:-0.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.5, getNotify=true, getRangeDescription=...#221#-827976976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "-2147483603"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"-2147467264"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:5>", "-1.7976931348623155E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1966081", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:5>", "-2.147483648E9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ...#241#-1169803152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:4>", "<i:39>", "true"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=39.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=39.0, getNotify=true, getRangeDescription=0, ...#214#2033880251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"14"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483634", "-2147483567"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483632", "-2147483648"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"0"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value...#215#1751689617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483646, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#-231992691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "2.147483648E9", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483648E9, getNotify=true, ...#236#-1444562882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:56.18>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaxY", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=56.18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=56.18, getNotify=true, getRangeDescription=0...#216#-1018029449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"14", "2147483647", "false"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "getKey", ""}}, 3), new String[][]{{"setValue", "java.lang.Number", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=null, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "123456789012345678901234567890-5032960206869675528"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "0", "-15"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=123456789012345678901234567890-5032960206869675528, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMi...#260#-2083812685", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=2.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.0, getNotify=true, getRangeDescription=Va...#219#-645053652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.1n345678"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "-1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#226#1039762734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 3), new String[][]{{"update", "int,java.lang.Number", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"int"}, new String[]{"-20"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "12345678901234567890123456q890", "<i:0>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}, {"org.jfree.data.time.TimeSeries", "clone", ""}}, 1), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:6>"}}, 1), new String[][]{{"getMaximumItemAge", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "3.6893488147419103E19"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=3.6893488147419103E19, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=3.6893488147419103E19, ge...#255#1883995800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}, 1), new String[][]{{"addAndOrUpdate", "org.jfree.data.time.TimeSeries", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2097153", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-0.1", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "16384"}, {"org.jfree.data.time.TimeSeries", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:2>"}}, 3), new String[][]{{"contains", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:-1073741824>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "-2.147483648E9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:12>", "<d:-0.1>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-0.1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-0.1, getNotify=true, getRangeDescription=...#221#-730616464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<i:3>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=3.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=3.0, getNotify=true, getRangeDescription=Va...#219#1180476650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:3>", "<i:6>", "false"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=6.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=6.0, getNotify=true, getRangeDescription=Va...#219#-1932867036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483648", "20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:E>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "-2", "-2147483648", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:11>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "Requires start >= 0.2020-01"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-0.10000000000000002"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Requires start >= 0.2020-01, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true,...#241#-1331027760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:8>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-Infinity, getNotify=true, getRangeDe...#231#2089976618", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-Infinity, getNotify=true, getRangeDe...#231#2089976618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:11>", "<i:-129>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "Infinity"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=0, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147221456", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"int"}, new String[]{"-2147483643"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:-2147483648>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ...#241#-1169803152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<d:30.0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "`bH"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=`b...#217#1010623379", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:10>", "2.147483648E9"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483648", "<i:13>"}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:-262145>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483648E9, getNotify=true, ge...#239#-1984328410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"2147221503"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMinY", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483646", "-20", "true"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"lange"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=lange, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=V...#219#492829994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:2>", "<d:1.5>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.5, getNotify=true, getRangeDescription=Va...#219#-1120305244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "14"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"TIULE"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=TI...#218#-1766959676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int,boolean", "10", "0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1is "}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "\t0x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=\t0x123456789, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescri...#225#1846214007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"14"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"2097153"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "2147483647", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:3>", "<i:58>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=58.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=58.0, getNotify=true, getRangeDescription=...#221#1638429712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-235127859", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=...#216#-1283389834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:6>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "-0.1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:39>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<null>"}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:10>", "2.1474836522999997E9"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=2.1474836522999997E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.1474836522999997E9, getN...#253#-612245456", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-5032960206869675571", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:7>", "false"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-96691287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}}), new String[][]{{"getDomainDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:36>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=36.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=36.0, getNotify=true, getRangeDescription=...#221#-289924080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:-8388646>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-8388646.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-8388646.0, getNotify=true, getRange...#233#1735555696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:1>", "<i:156>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=156.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=156.0, getNotify=true, getRangeDescriptio...#223#-250162068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:6>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-4400193994751", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}), new String[][]{{"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-8793945538531"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"92233703685477580B", "<s:ke>", "<b:true>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:9>", "0.0"}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=2, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#212#-799287126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:-2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.0, getNotify=true, getRangeDescription=...#221#830379728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}), new String[][]{{"getDomainDescription", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-Infinity, getNotify=true, getRangeDe...#231#2089976618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "1073741823", "<i:23>"}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.5", "<sample:0>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}), new String[][]{{"addAndOrUpdate", "org.jfree.data.time.TimeSeries", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483703"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=2147483703, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value, isEm...#209#-930353483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "-2.147483648E8"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E8, getNotify=true, ...#241#-385979312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:7>", "true"}}), new String[][]{{"setSelected", "boolean", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=null, isSelected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "clone", ""}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483603", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:-2147483585>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483585E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483585E9, getNotify=true, ...#241#-1795248272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}}), new String[][]{{"getDataItem", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:4>", "true"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:51.0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=51.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=51.0, getNotify=true, getRangeDescription=...#221#-1055511952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:-64>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=-64.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-64.0, getNotify=true, getRangeDescript...#220#-391907670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int", "boolean"}, new String[]{"2147483647", "2147483647", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:7>", "1.0", "false"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:10>", "1.0", "false"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaxY", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "70"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"urue", "<i:0>", "<i:0>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:10>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getMaxY", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<null>"}}), new String[][]{{"getMaximumItemAge", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:6>", "Infinity", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDesc...#229#-303707088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}), new String[][]{{"getValue", "org.jfree.data.time.RegularTimePeriod", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "9.2233720368547748E18"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=9.2233720368547748E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=9.2233720368547748E18, ge...#255#93277932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=0, is...#212#865040377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:0>", "2.147483648E8", "true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=2.147483648E8, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=2.147483648E8, getNotify=true, ge...#239#-1779605848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"52", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.event.SeriesChangeListener", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getTimePeriod", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-908657090", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:62.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Month", actual.getClass().getName());
  assertEquals("November 2026 {getFirstMillisecond=1793516400000, getLastMillisecond=1796111999999, getMiddleMillisecond=1794814199999, getMonth=11, getSerialIndex=24323, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=62.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=62.5, getNotify=true, getRangeDescription=...#221#-1286777520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#216#902343878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "-50329602068696755280", "<i:53>", "<s:h'>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=9.223372036854776E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=9.223372036854776E18, getN...#253#-1430246672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:11>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:5>", "<i:-1>", "false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:13>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=13.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=13.0, getNotify=true, getRangeDescription=...#221#-1375993168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "1048576"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=1048576, getMinY=NaN, getNotify=true, getRangeDescription=Value...#215#2132371133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<i:-2147483648>"}}), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "PH"}}), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=PH...#216#1297337435", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=PH...#215#65152749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1.5e300C"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=1.5e300C, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescriptio...#222#-595644478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"2020-h01-u1"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=2020-h01-u1, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescrip...#220#-496601119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "5.032960206869676E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=5.032960206869676E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=5.032960206869676E18, getNoti...#246#1567154011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:3>"}}), new String[][]{{"getMaximumItemAge", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription...#216#1675492343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}}), new String[][]{{"getDataItem", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"getTimePeriods", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<i:13>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxY=13.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=13.0, getNotify=true, getRangeDescription=...#221#1105181425", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-1.073741824E9"}}), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:-39>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getRawDataItem", "int", "2147483640"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-39.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-39.0, getNotify=true, getRangeDescriptio...#223#210946282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "9.223372036854776E18"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<null>", "<d:-0.05>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=9.223372036854776E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=9.223372036854776E18, getN...#253#-1430246672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:2>", "<i:-2147483648>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-2.147483648E9, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-2.147483648E9, getNotify=true, ...#241#-1169803152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-40", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:0>"}}), new String[][]{{"getDomainDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:-13>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-13.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-13.0, getNotify=true, getRangeDescriptio...#223#-1001393806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:6>", "<d:-0.5>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "<null>", "<s:b>", "<s:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:5>", "<i:-35>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-35.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-35.0, getNotify=true, getRangeDescriptio...#223#-618303246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:9>", "Infinity", "true"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDe...#226#1083243188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:12>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDesc...#229#-303707088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{" "}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:25>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=25.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=25.0, getNotify=true, getRangeDescription=...#217#-1858648993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:2>", "-Infinity", "false"}, {"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:3>", "<i:0>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=Va...#219#-1146960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:1>", "<d:62.5>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=62.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=62.5, getNotify=false, getRangeDescription...#222#-65413511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:10>", "-5032960206869675528"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMinY", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-5.032960206869676E18, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-5.032960206869676E18, ge...#255#-1299068532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1253116651", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Value,...#214#229039737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:3>", "2.147483648E10", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:2>", "<i:-2147483648>", "true"}}), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:5>", "-1.7976931348623155E308", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.7976931348623155E308, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.7976931348623155E308...#259#583744670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.0, getNotify=true, getRangeDescription=Va...#219#1824383342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:10>", "1.7976931348623157E308"}}), new String[][]{{"getMinY", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.7976931348623157E308, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.7976931348623157E308, ...#257#-1537162960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"21p47483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=21p47483647, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescrip...#225#1477769323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "-2.147483686E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}), new String[][]{{"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-5032960207003893342", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:53.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=53.5, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=53.5, getNotify=true, getRangeDescription=...#221#-1788040176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription=V...#219#-1585505955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=1.7976931348623157E308, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=1.7976931348623157E308, ...#257#-1537162960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:14>", "true"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:6>", "<d:1.5>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=-1.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=-1.0, getNotify=true, getRangeDescription=...#221#1672664432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=0, is...#211#1002820609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:2>", "0.0", "true"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-2147483603"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#219#198290718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.event.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "i3", "<sample:0>", "<s:keyn>"}, {"org.jfree.data.time.TimeSeries", "getRawDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:5>", "<i:13>", "false"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.event.SeriesChangeEvent", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=13.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=13.0, getNotify=true, getRangeDescription=...#221#-1375993168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRawDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=...#215#-680738590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:10>", "false"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=0.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=0.0, getNotify=true, getRangeDescription=0, is...#212#918390587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<null>", "4.6116860184273879E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=false, getRangeDescription=V...#219#-1585505955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:9>", "<d:125.0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=125.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=125.0, getNotify=true, getRangeDescriptio...#223#1737310504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", ":"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=:,...#214#-1942186141", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.event.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:6>", "<i:39>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxY=39.0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=39.0, getNotify=true, getRangeDescription=...#221#1478189104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false), new String[][]{{"getDomainDescription", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxY=NaN, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=NaN, getNotify=true, getRangeDescription=Va...#218#1953941356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:2>", "false"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxY=Infinity, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getMinY=Infinity, getNotify=true, getRangeDescrip...#222#-1049228101", SearchInputFactory_scaffolding.receiverState());
 }
}
