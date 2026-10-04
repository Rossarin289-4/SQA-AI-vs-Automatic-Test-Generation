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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:0>"}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-8202"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 1), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "3"}, {"createCopy", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:2147483647>"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1365029741", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:6>", "<null>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 3), new String[][]{{"getValue", "org.jfree.data.time.RegularTimePeriod", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:11>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "-2", "<d:1.5>", "<i:-1073741824>"}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:6>", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<d:1.6>", "false"}}, 3), new String[][]{{"getValue", "org.jfree.data.time.RegularTimePeriod", "2"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:3>"}, false, 12, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<d:0.8>", "true"}}, 3), new String[][]{{"clear", "", "2"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false, 12, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483615", "-2097153"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<d:-0.63>", "true"}}, 3), new String[][]{{"clear", "", "2"}, {"getTimePeriodClass", "", "5"}, {"getMaximumItemAge", "", "1"}, {"add", "org.jfree.data.time.TimeSeriesDataItem", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-2147483649"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:-2147483624>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "PT1H"}, {"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<d:-0.485>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=PT1H, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "10", "2147483639"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:5>", "false"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483647", "false"}, {"org.jfree.data.time.TimeSeries", "getItems", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483584"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "10", "-2147483615"}, {"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483605", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=2147483584, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<d:-0.0025>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}}, 1), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:0.8>"}}, 3), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "0"}, {"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "false"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}}, 2), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "0"}, {"add", "org.jfree.data.time.RegularTimePeriod,double", "4"}, {"getTimePeriods", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2-October-2026, 3-October-2026]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"0", "<d:0.8>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:12>", "<i:-2147483624>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:-7.153>"}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:12>", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<d:-0.63>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:5>", "<i:0>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<d:-172.511>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:8>", "2147483647"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:10>", "4.2949672429999995E9"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "-1.9649999999999996"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "2020-02-30T25:61:61", "<null>", "<d:1.5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "-1.9649999999999996"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "2020-02-30T25:61:61", "<null>", "<d:1.5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "9223372036854775807", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "9223372036854775807", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-8.988465674311578E307"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "-8.988465674311578E307"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483646", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:Vb>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1", "-2147483605"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "9223372036854775806"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775806, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:Va>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1", "-2147483605"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-25>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "0", "2147483639"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483646"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483646, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-25>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "0", "2147483639"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-1"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483646"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483646, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483639", "2147483639"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483646, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "2.0"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1073741824", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "2.0"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483605", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1073741881", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "2.0"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483605", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1073741881", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483605", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1073741881", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483605", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-1073741881", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "abc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=abc, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "acc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=acc, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "acc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=acc, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483584", "true"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.6>"}}, 2), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483639", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483639", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483639", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-2147483648"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:-0.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.5", "<i:0>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.5", "<i:0>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "2147483593"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.52020-02-30T25:61:61", "<i:0>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "p.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=p.5, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:2>", "-1.9649999999999996"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:-1073741797>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:-1073741846>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:-1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<d:-0.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<d:-0.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-2147483605"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}, 3), new String[][]{{"isEmpty", "", "1"}, {"remove", "java.lang.Object", "5"}, {"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}, 3), new String[][]{{"isEmpty", "", "1"}, {"remove", "java.lang.Object", "5"}, {"retainAll", "java.util.Collection", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1E-5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"_E-5"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=_E-5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{" `E-5"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "10"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription= `E-5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{" `F-5"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "2147483647"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription= `F-5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PT1H, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 13, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "getDataItem", "int", "2147483647"}, {"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=PT1H, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-1073741824", "-2147483605"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "2147483593"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483639", "2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:0>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:5>", "<i:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "null"}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "--1", "<sample:0>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.5d, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "p.5d"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "9223372036854775806"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=p.5d, getItemCount=0, getMaximumItemAge=9223372036854775806, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "false"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "p.5"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=p.5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=1.1234567, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "0.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=0.1234567, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:keyq>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "0.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=0.1234567, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "NaN", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:0>", "<i:-2147483648>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:0>", "<i:-2147483601>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "9223372036854775806"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775806, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:0>", "<i:-2147483601>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "4611686018427387903"}, {"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=4611686018427387903, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:0>", "<i:-2147483624>", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483646", "2147483647"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "4611686018427387903"}, {"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=4611686018427387903, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<i:-2147483648>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "getNotify", ""}}), new String[][]{{"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}), new String[][]{{"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:9>", "0.5015"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=2147483647, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-1.9999999999999998"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-1.9649999999999996"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "-1.9649999999999996"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "-1.9649999999999996"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-8.988465674311578E307"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "9223372036854775807", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:7>", "-2.147483648E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "-2.147483648E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "-2.147483648E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}}), new String[][]{{"compareTo", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "-1.073741824E9"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "2147483648"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=2147483648, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=a b, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a bb"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=a bb, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a "}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=a , getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a m"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=a m, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:-2147483648>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=0, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:Vb>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "8796093022208"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=8796093022208, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:Vb>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "9223372036854775806"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775806, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "63", "-2147483605"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-122>"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "63", "-2147483605"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-25>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "0", "-2147483639"}, {"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "2147483646"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483646, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:2>", "<i:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "2.0"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483648", "2147483639"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-5032960206869675528"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:2>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "8202"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"-2097152", "8202"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073676287", "-16404"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "-2147483605"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2097152", "2147483639"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.5>"}}), new String[][]{{"getDescription", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483584", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.5>"}}), new String[][]{{"getDescription", "", "5"}, {"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483584", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.6>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "false"}}), new String[][]{{"getDescription", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483584", "true"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<d:1.6>"}}), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "2147483647"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483639", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "8202"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483639", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:1.5>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<d:1.5>"}, {"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:-2147483624>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.5", "<i:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "2147483593"}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1.52020-02-30T25:61:61", "<i:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "2147483593"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<d:1.6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=a,b,c, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"-2147483605", "<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}}), new String[][]{{"update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "-8202"}, {"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"8202"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=8202, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"8261"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=8261, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"8261"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=8261, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:6>", "true"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "Requires start <= end."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}}), new String[][]{{"getNextTimePeriod", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<null>", "-5032960206869675528", "true"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}, {"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-1.9649999999999996"}, false, 14, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:2>", "2147483647"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"9223372036854775806", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}}, 3), new String[][]{{"isEmpty", "", "1"}, {"remove", "java.lang.Object", "5"}, {"retainAll", "java.util.Collection", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isEmpty", "", "1"}, {"remove", "java.lang.Object", "5"}, {"retainAll", "java.util.Collection", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:8>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483584"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ".5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=.5, getItemCount=0, getMaximumItemAge=2147483584, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:0>", "<d:1.6>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483639", "-2097152"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:1.5>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<null>", "1.7976931348623157E308", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:1.5>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:2>", "1.7976931348623157E308", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<d:-0.552>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}}), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<d:-0.138>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}, {"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=true, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "tsue"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=tsue, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "Requires start <= end."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Requires start <= end., getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, is...#211#-1646852270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=sample, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}, {"org.jfree.data.time.TimeSeries", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:3>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Null 'period' argument.", "<i:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Null 'period' argument.", "<i:0>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"0", "-1073741824"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-1", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-1", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "5."}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=5., getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1L", "<i:1>", "<s:a>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1L", "<i:1>", "<s:a>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483639", "-2147483639"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:-2147483624>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:-2147483624>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-2147483624}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:-2147483624>"}}), new String[][]{{"compareTo", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.88>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"vonP/l1a;m"}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=vonP/l1a;m, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=+1, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5f, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.5tf"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5tf, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.5g"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5g, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<null>", "-1.7976931348623157E308", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:4>", "-Infinity", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
