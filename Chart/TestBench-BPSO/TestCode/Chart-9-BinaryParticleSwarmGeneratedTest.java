package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"21474836C8"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-4996931409850711552"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=21474836C8, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "-5032960206869675528", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "2147481599"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483678", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:4>"}, false), new String[][]{{"removeAgedItems", "long,boolean", "2"}, {"getValue", "org.jfree.data.time.RegularTimePeriod", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "2.1474836521E9"}}), new String[][]{{"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "1073741769", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<d:-0.15>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:7>"}}, 3), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:8>", "-Infinity"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "4194373", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "-2147483609"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "-5032960206869675528123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=-5032960206869675528123456789012345678901234567890, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, ge...#238#-240358862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-5032960206869675528123456789012345678901234567890, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, ge...#238#-240358862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:8>", "2.1474836463E9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-5023953007614934504", "false"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:-0.15>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:8>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:4>", "-2.147483648057E9", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-2.147483648057E9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483646", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=0, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:-1.625>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", ".5s"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:-0.55>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=.5s, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:10>", "<d:-0.15>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "-Infinity"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 2), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483646", "2147483646"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:7>", "<d:-0.5>", "true"}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "2"}, {"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}}), new String[][]{{"setMaximumItemCount", "int", "2"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"1", "<i:-15>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:-0.55>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"2", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:-1>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Requires start <> end."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=1, getNotify=true, getRangeDescription=Requires start <> end., isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:8>"}, false, 0, null, 3), new String[][]{{"addPropertyChangeListener", "java.beans.PropertyChangeListener", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:4>", "<d:0.5>", "false"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<i:0>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:2>", "<d:0.15>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:1>", "-0.9999999999999999"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=123456789012345678901234567890, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Va...#218#2121746102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.12345671.1234567890123456a,b,c"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1.12345671.1234567890123456a...#219#-30522711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "9.223372036854778E18"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "4194304"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=4194304, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "2147483648"}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:key>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483648, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"1879048191", "0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"Requires start <= end."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Requires start <= end., getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isE...#210#-1061634041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-268431387", "2147483647"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "true"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:3>", "-1.7976931348623157E308", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5f, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:5>", "4.294967294E9", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"0.123456781"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0.123456781, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}}, 2), new String[][]{{"clear", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:5>"}, false, 5, new String[][]{}, 2), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:7>", "-2.5164801034348375E18"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:0>", "<d:-34.85>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:1>", "false"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1-4"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1-4, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"i1:30:45"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=i1:30:45, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"is "}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=is , getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-10", "2147483646"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"120"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=120, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:10>", "<d:471.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "4.294967294E9"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:11>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483647", "<d:0.015>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "37"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483595"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=2147483595, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:aaa>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:2>", "true"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-0.0", "<i:0>", "<i:-2147483648>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Domain9223372036854775807", "<s:>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:0.15>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<i:0>", "true"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "true1.1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=true1.1234567, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true...#201#1495625144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5d, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "9.223372036854776E18"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-268435456"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1.12345678, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"5."}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=5., getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<null>", "<d:-0.25>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-9223372036854775804"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"0", "1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{".0.0a,b,c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=.0.0a,b,c, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"/10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=/10, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:5>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<d:0.131>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1.12245678"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.12245678, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<i:1>"}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:2>", "-1.0"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"F0.0"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=F0.0, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"2147483652", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "21", "<sample:0>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147481599"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "-27"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:4>", "-5.032960206869676E18", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"createCopy", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"1073741808"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=1073741808, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "getKey", ""}}), new String[][]{{"getTimePeriods", "", "1"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}), new String[][]{{"getTimePeriod", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483646"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<d:0.03>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "Title-5032960206869675528-5032960206869675528"}, {"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Title-5032960206869675528-5032960206869675528, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRang...#233#1251488349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:4>", "9.223372036854778E18", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"2147483647null"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483647null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"-aac"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=-aac, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:0>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "0"}}), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "21574836C81L", "<s:>", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}), new String[][]{{"setKey", "java.lang.Comparable", "0"}, {"getTimePeriods", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<d:0.15>", "true"}}), new String[][]{{"delete", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:12>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:-5.0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483583", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<null>", "-1.7976931348623157E308"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "2.147483647E10", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<b:false>"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "21474836C8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=21474836C8, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "2147483678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=2147483678, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:-14>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "1073741823", "-27"}}), new String[][]{{"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:0.15>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<d:0.75>"}}), new String[][]{{"setRangeDescription", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-1"}}), new String[][]{{"createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-5032960206869675527", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-20", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:10>", "<i:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "70405251399680", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"17590038560769", "false"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getNotify", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>", "<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:-1>"}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"1", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"74"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=74, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"-10"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "277025390590"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=277025390590, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:1.5>"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "5"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}}), new String[][]{{"isEmpty", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "4.6116860184273879E18", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<d:-0.15>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:3>", "<i:-1>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-27", "<d:0.15>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}), new String[][]{{"addAndOrUpdate", "org.jfree.data.time.TimeSeries", "6"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 1, new String[][]{}), new String[][]{{"isEmpty", "", "7"}, {"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:610x1F-5032960206869675528"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=2020-02-30T25:61:610x1F-5032...#230#-1758847222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "17"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=17, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=17, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:-0.15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-1073741823", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1E-5\ti"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1E-5\ti, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "0.0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "2147483647", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "21474836C8Null 'start' argument.true", "<i:2>", "<b:false>"}}), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Hello, World, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:0.015>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:-0.5>"}, {"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1927190602", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<null>", "1.7976931348623157E308", "false"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:-1>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:9>", "9.223372036854776E19", "false"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:0>", "2147483647", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}), new String[][]{{"clear", "", "5"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"\nthe time period "}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:3>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=\nthe time period , isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<null>", "-10.0", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<d:-38.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1338313027", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "createInstanceRa=nge", "<s:>", "<s:ao>"}}), new String[][]{{"getNextTimePeriod", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483648", "134217727"}}), new String[][]{{"getDomainDescription", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-27", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:4>", "NaN", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1e10--2"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1e10--2, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-4194304", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "is "}, {"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=is , getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-586536873", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=PT1H, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "0"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ".a"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=.a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:6>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "9323372036854775807"}}), new String[][]{{"setKey", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=9323372036854775807, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpt...#207#2082903840", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=9323372036854775807, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpt...#207#2082903840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-0.15>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:6>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "-2.147483648E9"}, {"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "aPT1H"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=aPT1H, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "isr ,"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=isr ,, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:2>", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "clear", ""}}), new String[][]{{"getTimePeriodClass", "", "7"}, {"getTimePeriods", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}), new String[][]{{"getValue", "org.jfree.data.time.RegularTimePeriod", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:8>", "10.062"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=10.062}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Null 'start' argument.Range"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Null 'start' argument.Range,...#214#1269926404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "2.147483665E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:-0.11500000000000002>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
