package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:H->"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=0, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"922337203685r4775807+1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "-2147483647", "2147483603"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=922337203685r4775807+1, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isE...#210#688454315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:4>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "2147483647", "-2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "NaN"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-0.151"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "0"}}), new String[][]{{"getTimePeriods", "", "1"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=0, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"-2.147583648E9"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:-1>"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=-2.147583648E9, isEmpty=true...#201#514553724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:40>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-0.09999999999999999"}, {"org.jfree.data.time.TimeSeries", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"0", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:-20>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "1073741832"}, {"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<null>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=1073741832, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clear", ""}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<i:-51>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-65538", "-536870911"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-2251799813685247"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "-9223372036854775808"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:4>", "<d:0.5>", "true"}}), new String[][]{{"getTimePeriod", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "hashCode", ""}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<null>", "<i:40>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=2020-02-30T25:61:61, isEmpty...#206#1876398077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"1073741824", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:4>", "<i:-40>", "false"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483647", "-2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<null>"}}, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:-16440>"}}, 3), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "0\010"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=0\010, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0\010, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:0.25>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "88", "false"}, {"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}}, 3), new String[][]{{"removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}, 3), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "7"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<i:-93>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:6>", "5.0329602068696771E18", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "-5.032960206869675E18", "false"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("628892838", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-0.151"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}, {"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "2147483647", "<d:3.0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483647", "<d:-0.5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<i:-40>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:4>", "1.0"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:1.53>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:4>", "-Infinity", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.5e300Null 'start' argument."}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1.5e300Null 'start' argument...#217#-1584315241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<i:33>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<d:1.5>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "-2147483648", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-2147483646"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"1073741821"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:9>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:9>", "<i:63>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "-2147483648", "<d:-0.1195>"}}, 1), new String[][]{{"add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"10", "2147467266"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:0>", "0.0"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:4>", "<i:-16490>"}, {"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"21474836482146483648", "<sample:0>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1338313027", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"Null 'end' argument."}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Null 'end' argument., getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=t...#204#-1080657858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-5032964600621219414", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "int", "0"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-4.7"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "Domai", "<s:a>", "<s:=keyx>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-4", "2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:19>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNotify", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"TimePS1H"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "-32769"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=TimePS1H, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "isEmpty", ""}}, 3), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "2147483646", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1090519039"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<d:-0.0451>"}}, 1), new String[][]{{"isEmpty", "", "7"}, {"getTimePeriodClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483647", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:3>", "<d:-0.248>", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:1>", "<i:-1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"536870848", "2147467266"}, false, 6, new String[][]{}, 1), new String[][]{{"fireSeriesChanged", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getRangeDescription", ""}, {"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073741823", "1073733633"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:0>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1.12345678901234561"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.12345678901234561, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpt...#207#1335204387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:5>", "0.0", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-590391184", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1e00"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<i:70>"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1e00, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-1, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:0>", "-1.7976931348623157E308", "false"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-5032964604916186649", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Comain+1", "<s:aR>", "<b:false>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147483646", "-32769"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483646", "-26"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<i:-40>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "1", "<i:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:1>", "<i:-16440>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getIndex", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483647", "<i:-1>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"2020-01-02"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "getValue", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=2020-01-02, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"0.1234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0.1234567, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:8>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDataItem", new String[]{"int"}, new String[]{"1073741783"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "-1073741823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<sample:8>", "true"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"addChangeListener", "org.jfree.data.general.SeriesChangeListener", "6"}, {"add", "org.jfree.data.time.RegularTimePeriod,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:8>", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1-1235567890123456"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=1-1235567890123456, isEmpty=...#205#213567722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNextTimePeriod", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:5>", "-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:6>", "<i:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:9>", "8.98846567431158E307"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriod", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"O"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=O, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"1073741824", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:5>"}}), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-5032964604916186710"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<sample:5>", "<i:8220>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:-0.25>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:0>", "<i:19>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriod", new String[]{"int"}, new String[]{"-63"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"576460752303423488", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=9223372036854775807, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpt...#208#318614219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"-2147483646", "1073741823"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number", "boolean"}, new String[]{"<null>", "<d:4.45>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"11.m5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=11.m5d, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"-1.I"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=-1.I, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<null>", "2.1474836470000002E9", "true"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<null>", "-2.1474836539E9"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:6>", "2.1474836469999998E9", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:6>", "<null>", "true"}}), new String[][]{{"removePropertyChangeListener", "java.beans.PropertyChangeListener", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<i:-1>", "true"}, {"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double", "boolean"}, new String[]{"<sample:7>", "-1.073741824E9", "false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "update", "int,java.lang.Number", "0", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "NaN"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:2>", "-0.1"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "org.jfree.data.time.RegularTimePeriod,org.jfree.data.time.RegularTimePeriod", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<d:-0.25>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getNotify", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false), new String[][]{{"delete", "org.jfree.data.time.RegularTimePeriod", "3"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "Requires start >=5 0."}}), new String[][]{{"getNextTimePeriod", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:7>", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "-4.7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeriesDataItem", actual.getClass().getName());
  assertEquals("{getValue=-4.7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"Nulk 'end' argument."}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "1073741796", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Nulk 'end' argument., getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmp...#208#1497908783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<i:-2147483648>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "int", "1073750023"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"1073733638", "-2147475454"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<null>", "9223372036854775807"}}), new String[][]{{"setMaximumItemCount", "int", "7"}, {"setKey", "java.lang.Comparable", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=4, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}}), new String[][]{{"contains", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "7"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"0m12456789"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0m12456789, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "delete", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemAge", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:5>", "<i:19>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:6>", "-2.516480103434838E18"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"-2.147483648E9\t"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getIndex", "org.jfree.data.time.RegularTimePeriod", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=-2.147483648E9\t, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=tr...#203#-1677619444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", "org.jfree.data.time.TimeSeries", "<sample:13>"}}), new String[][]{{"addAndOrUpdate", "org.jfree.data.time.TimeSeries", "3"}, {"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemCount", ""}, {"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "2147483647", "-2147352576"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"9223372036854775807Null 'end' argument."}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:2>", "<i:32880>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=9223372036854775807Null 'end' argument., getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescr...#227#-1067008486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"H"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "the uime period ", "<s:>", "<s:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=H, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1338313027", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=a, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setDescription", new String[]{"java.lang.String"}, new String[]{"202-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=202-01-01, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getTimePeriods", ""}}), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:4>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "double"}, new String[]{"<sample:3>", "-4.7"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "-1.175"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:7>", "0.159"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addOrUpdate", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:-2147483648>"}, false, 2, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "Qange"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:3>", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:6>", "-2.1474836539000006E9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeAgedItems", new String[]{"long", "boolean"}, new String[]{"-2147483585", "true"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "Requires start <= end.Range"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Requires start <= end.Range, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value...#215#1993173926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}, {"org.jfree.data.time.TimeSeries", "isEmpty", ""}}), new String[][]{{"add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.general.SeriesException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:9>", "<i:-40>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:6>", "<d:-0.25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "update", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:-29>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "0xFFFFFFEF"}, {"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFEF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0xFFFFFFEF, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "1073741780"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=1073741780, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getRangeDescription", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "removeAgedItems", "long,boolean", "-5032964604916186710", "false"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ""}}), new String[][]{{"addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "W1"}, {"org.jfree.data.time.TimeSeries", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "+1", "<i:49>", "<s:8H->"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=W1, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:53>"}, false, 3, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double,boolean", "<sample:0>", "-61.0", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"4294967350"}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "delete", "org.jfree.data.time.RegularTimePeriod", "<sample:0>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=4294967350, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,java.lang.Number,boolean", "<sample:0>", "<i:19>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "5.-0"}}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=5.-0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "-2"}, {"org.jfree.data.time.TimeSeries", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=-2, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "ull 'end' argument."}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=ull 'end' argument., getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpt...#207#1005203784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"8796093022208"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:2>"}, {"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:1>", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=8796093022208, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "addAndOrUpdate", "org.jfree.data.time.TimeSeries", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1.12345678901234561E-5Requires start >= 0."}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem,boolean", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1783462042", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=1.12345678901234561E-5Requires start >= 0., getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDe...#230#-1052354869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "Comain+1Value9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Comain+1Value9223372036854775807, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=...#220#-536586431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "0xx1F"}, {"org.jfree.data.time.TimeSeries", "update", "org.jfree.data.time.RegularTimePeriod,java.lang.Number", "<sample:7>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0xx1F, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"int", "int"}, new String[]{"2147483603", "2147483615"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "32769"}, {"org.jfree.data.time.TimeSeries", "clone", ""}}), new String[][]{{"getDataItem", "org.jfree.data.time.RegularTimePeriod", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=32769, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=TITLE, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"null", "<s:key>", "<b:true>"}, false, 4, new String[][]{{"org.jfree.data.time.TimeSeries", "getItemCount", ""}, {"org.jfree.data.time.TimeSeries", "getDomainDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.5, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "createCopy", "int,int", "2147483647", "-32755"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("704391971", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.RegularTimePeriod,double", "<sample:0>", "Infinity"}, {"org.jfree.data.time.TimeSeries", "getTimePeriodClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Day {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Day, getClasses=[], getConstructors=[public org.jfree.data.time.Day(), public org.jfree...#806#2005248653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemCount", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setKey", "java.lang.Comparable", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.RegularTimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"2147483649"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimeSeries", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=2147483649, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemCount", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=0, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=010, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "addOrUpdate", "org.jfree.data.time.RegularTimePeriod,double", "<sample:5>", "-2.147483628E9"}, {"org.jfree.data.time.TimeSeries", "setDomainDescription", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=1, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "x010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("471422651", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=x010, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "createCopy", new String[]{"org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setMaximumItemAge", "long", "66571993031"}, {"org.jfree.data.time.TimeSeries", "getMaximumItemAge", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimeSeries", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=66571993031, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getMaximumItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=false, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDescription", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriods", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimeSeries", "getKey", ""}, {"org.jfree.data.time.TimeSeries", "getItemCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getValue", new String[]{"org.jfree.data.time.RegularTimePeriod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getValue", "org.jfree.data.time.RegularTimePeriod", "<sample:7>"}, {"org.jfree.data.time.TimeSeries", "setRangeDescription", "java.lang.String", "0x1234567W9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=0x1234567W9, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "setMaximumItemAge", new String[]{"long"}, new String[]{"-5032964604916186711"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "getDataItem", "org.jfree.data.time.RegularTimePeriod", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimeSeries", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.time.TimeSeries", "add", "org.jfree.data.time.TimeSeriesDataItem", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "add", new String[]{"org.jfree.data.time.TimeSeriesDataItem", "boolean"}, new String[]{"<null>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "getTimePeriodsUniqueToOtherSeries", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}, {"org.jfree.data.time.TimeSeries", "delete", "int,int", "2147467239", "-10"}}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-590391184", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", "addAndOrUpdate", new String[]{"org.jfree.data.time.TimeSeries"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimeSeries", "setDescription", "java.lang.String", "1.E5"}, {"org.jfree.data.time.TimeSeries", "getNextTimePeriod", ""}}, 1), new String[][]{{"getItems", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=1.E5, getDomainDescription=Time, getItemCount=0, getMaximumItemAge=9223372036854775807, getMaximumItemCount=2147483647, getNotify=true, getRangeDescription=Value, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
