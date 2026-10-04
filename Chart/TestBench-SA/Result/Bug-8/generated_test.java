package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:0>"}, {"org.jfree.data.time.Week", "previous", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 0, 2026 {getFirstMillisecond=1766390400000, getLastMillisecond=1766995199999, getMiddleMillisecond=1766692799999, getSerialIndex=107378, getWeek=0, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}, {"org.jfree.data.time.Week", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 4, 1973 {getFirstMillisecond=96537600000, getLastMillisecond=97142399999, getMiddleMillisecond=96839999999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 3, 1973 {getFirstMillisecond=95904000000, getLastMillisecond=96508799999, getMiddleMillisecond=96206399999, getSerialIndex=104572, getWeek=3, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"5."}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:0>"}, {"org.jfree.data.time.Week", "equals", "java.lang.Object", "<i:-2147483646>"}}, 1), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "4"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<s:jjey>"}}, 1), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "4"}, {"next", "", "3"}, {"getYearValue", "", "4"}, {"getStart", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 03 00:00:00 PST 1903 {getDate=3, getDay=0, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=-2103811200000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"3021-1010"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"3021-0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"3021-1"}, true, 0, null, 3), new String[][]{{"previous", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 53, 3020 {getFirstMillisecond=33165705600000, getLastMillisecond=33166310399999, getMiddleMillisecond=33166007999999, getSerialIndex=160113, getWeek=53, getYearValue=3020}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"1.02345"}, true), new String[][]{{"getYearValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2345", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{".02345"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-230400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62199072000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765785600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24273", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 0, 1000 {getFirstMillisecond=-30610368000000, getLastMillisecond=-30609763200001, getMiddleMillisecond=-30610065600001, getSerialIndex=53000, getWeek=0, getYearValue=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24411", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -24, 2026 {getFirstMillisecond=1751871600000, getLastMillisecond=1752476399999, getMiddleMillisecond=1752173999999, getSerialIndex=107354, getWeek=-24, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25533", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 10, 1890 {getFirstMillisecond=-2519251200000, getLastMillisecond=-2518646400001, getMiddleMillisecond=-2518948800001, getSerialIndex=100180, getWeek=10, getYearValue=1890}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 26, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23426", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 4, 5 {getFirstMillisecond=-62007955200000, getLastMillisecond=-62007350400001, getMiddleMillisecond=-62007652800001, getSerialIndex=269, getWeek=4, getYearValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25484", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 5, 2026 {getFirstMillisecond=1769414400000, getLastMillisecond=1770019199999, getMiddleMillisecond=1769716799999, getSerialIndex=107383, getWeek=5, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<i:-1>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<null>"}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 11, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<null>"}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61655961600000, getLastMillisecond=-61655356800001, getMiddleMillisecond=-61655659200001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1776063600000, getLastMillisecond=1776668399999, getMiddleMillisecond=1776365999999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 3, 1973 {getFirstMillisecond=95904000000, getLastMillisecond=96508799999, getMiddleMillisecond=96206399999, getSerialIndex=104572, getWeek=3, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1789887600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2082816000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791183600000, getLastMillisecond=1791788399999, getMiddleMillisecond=1791485999999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 2, 1970 {getFirstMillisecond=374400000, getLastMillisecond=979199999, getMiddleMillisecond=676799999, getSerialIndex=104412, getWeek=2, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 2, -1 {getFirstMillisecond=-62198467200000, getLastMillisecond=-62197862400001, getMiddleMillisecond=-62198164800001, getSerialIndex=-51, getWeek=2, getYearValue=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 20, 1903 {getFirstMillisecond=-2103120000000, getLastMillisecond=-2102515200001, getMiddleMillisecond=-2102817600001, getSerialIndex=100879, getWeek=20, getYearValue=1903}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791183600000, getLastMillisecond=1791788399999, getMiddleMillisecond=1791485999999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 7, 7 {getFirstMillisecond=-61943241600000, getLastMillisecond=-61942636800001, getMiddleMillisecond=-61942939200001, getSerialIndex=378, getWeek=7, getYearValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943846400000, getLastMillisecond=-61943241600001, getMiddleMillisecond=-61943544000001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 8, 2026 {getFirstMillisecond=1771228800000, getLastMillisecond=1771833599999, getMiddleMillisecond=1771531199999, getSerialIndex=107386, getWeek=8, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770624000000, getLastMillisecond=1771228799999, getMiddleMillisecond=1770926399999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 47, 1909 {getFirstMillisecond=-1897488000000, getLastMillisecond=-1896883200001, getMiddleMillisecond=-1897185600001, getSerialIndex=101224, getWeek=47, getYearValue=1909}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898121600000, getLastMillisecond=-1897516800001, getMiddleMillisecond=-1897819200001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791183600000, getLastMillisecond=1791788399999, getMiddleMillisecond=1791485999999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 13, 16 {getFirstMillisecond=-61655356800000, getLastMillisecond=-61654752000001, getMiddleMillisecond=-61655054400001, getSerialIndex=861, getWeek=13, getYearValue=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61655961600000, getLastMillisecond=-61655356800001, getMiddleMillisecond=-61655659200001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}, {"org.jfree.data.time.Week", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 17, 2026 {getFirstMillisecond=1776668400000, getLastMillisecond=1777273199999, getMiddleMillisecond=1776970799999, getSerialIndex=107395, getWeek=17, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1776063600000, getLastMillisecond=1776668399999, getMiddleMillisecond=1776365999999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 23:59:59 PDT 2026 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791097199999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 03 23:59:59 PST 1970 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=287999999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 04 23:59:59 PST 2 {getDate=4, getDay=6, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=-62198553600001, getTimezoneOffset=480, getYear=-1898}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 20 23:59:59 PST 2025 {getDate=20, getDay=6, getHours=23, getMinutes=59, getMonth=11, getSeconds=59, getTime=1766303999999, getTimezoneOffset=480, getYear=125}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791183599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("374399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198467200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766390399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103206400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 3), new String[][]{{"getSerialIndex", "", "4"}, {"previous", "", "3"}, {"getStart", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 13 00:00:00 PDT 2026 {getDate=13, getDay=0, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=1789282800000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61942636800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943241600000, getLastMillisecond=-61942636800001, getMiddleMillisecond=-61942939200001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1771228799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770624000000, getLastMillisecond=1771228799999, getMiddleMillisecond=1770926399999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1897516800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 45, 1909 {getFirstMillisecond=-1898121600000, getLastMillisecond=-1897516800001, getMiddleMillisecond=-1897819200001, getSerialIndex=101222, getWeek=45, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791071999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61655356800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61655961600000, getLastMillisecond=-61655356800001, getMiddleMillisecond=-61655659200001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1776668399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1776063600000, getLastMillisecond=1776668399999, getMiddleMillisecond=1776365999999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("96508799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 3, 1973 {getFirstMillisecond=95904000000, getLastMillisecond=96508799999, getMiddleMillisecond=96206399999, getSerialIndex=104572, getWeek=3, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791158399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("374399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198467200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766390399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1770839999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770624000000, getLastMillisecond=1771228799999, getMiddleMillisecond=1770926399999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"\013y.k.+202z0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23309", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25558", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26884", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23733", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25891", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25394", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 4, 1973 {getFirstMillisecond=96422400000, getLastMillisecond=97027199999, getMiddleMillisecond=96724799999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25484", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 5, 2026 {getFirstMillisecond=1769328000000, getLastMillisecond=1769932799999, getMiddleMillisecond=1769630399999, getSerialIndex=107383, getWeek=5, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 28, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26549", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 37, 1907 {getFirstMillisecond=-1966550400000, getLastMillisecond=-1965945600001, getMiddleMillisecond=-1966248000001, getSerialIndex=101108, getWeek=37, getYearValue=1907}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 32, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23654", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 10, 11 {getFirstMillisecond=-61815110400000, getLastMillisecond=-61814505600001, getMiddleMillisecond=-61814808000001, getSerialIndex=593, getWeek=10, getYearValue=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25706", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 11, 2026 {getFirstMillisecond=1772956800000, getLastMillisecond=1773557999999, getMiddleMillisecond=1773257399999, getSerialIndex=107389, getWeek=11, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26856", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 45, 1918 {getFirstMillisecond=-1614556800000, getLastMillisecond=-1613952000001, getMiddleMillisecond=-1614254400001, getSerialIndex=101699, getWeek=45, getYearValue=1918}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<null>"}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 0, 1000 {getFirstMillisecond=-30610454400000, getLastMillisecond=-30609849600001, getMiddleMillisecond=-30610152000001, getSerialIndex=53000, getWeek=0, getYearValue=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, 1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, -1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week -1, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 19, 1903", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 6, 7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 7, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 46, 1909", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}, {"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 12, 16", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("104411", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107377", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789887600000, getLastMillisecond=1790492399999, getMiddleMillisecond=1790189999999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1789887600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31564799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:3>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:5>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1893427200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:5>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"getLastMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("1970 {getFirstMillisecond=28800000, getLastMillisecond=31564799999, getMiddleMillisecond=15796799999, getSerialIndex=1970, getYear=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("1973 {getFirstMillisecond=94723200000, getLastMillisecond=126259199999, getMiddleMillisecond=110491199999, getSerialIndex=1973, getYear=1973}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 4, 1973 {getFirstMillisecond=96422400000, getLastMillisecond=97027199999, getMiddleMillisecond=96724799999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"getMiddleMillisecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("110491199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 4, 1973 {getFirstMillisecond=96422400000, getLastMillisecond=97027199999, getMiddleMillisecond=96724799999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"getMiddleMillisecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1783022399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791097200000, getLastMillisecond=1791701999999, getMiddleMillisecond=1791399599999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 2, 1970 {getFirstMillisecond=288000000, getLastMillisecond=892799999, getMiddleMillisecond=590399999, getSerialIndex=104412, getWeek=2, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}}), new String[][]{{"getStart", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 00:00:00 PST 1970 {getDate=4, getDay=0, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=288000000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}}), new String[][]{{"getStart", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 06 00:00:00 PST 7 {getDate=6, getDay=0, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=-61943328000000, getTimezoneOffset=480, getYear=-1893}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}), new String[][]{{"getMiddleMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791399599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"getMiddleMillisecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("590399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 1, 1000 {getFirstMillisecond=-30609849600000, getLastMillisecond=-30609244800001, getMiddleMillisecond=-30609547200001, getSerialIndex=53001, getWeek=1, getYearValue=1000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 0, 1000 {getFirstMillisecond=-30610454400000, getLastMillisecond=-30609849600001, getMiddleMillisecond=-30610152000001, getSerialIndex=53000, getWeek=0, getYearValue=1000}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week -23, 2026 {getFirstMillisecond=1752390000000, getLastMillisecond=1752994799999, getMiddleMillisecond=1752692399999, getSerialIndex=107355, getWeek=-23, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -24, 2026 {getFirstMillisecond=1751785200000, getLastMillisecond=1752389999999, getMiddleMillisecond=1752087599999, getSerialIndex=107354, getWeek=-24, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 22, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 11, 1890 {getFirstMillisecond=-2518704000000, getLastMillisecond=-2518099200001, getMiddleMillisecond=-2518401600001, getSerialIndex=100181, getWeek=11, getYearValue=1890}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 10, 1890 {getFirstMillisecond=-2519337600000, getLastMillisecond=-2518732800001, getMiddleMillisecond=-2519035200001, getSerialIndex=100180, getWeek=10, getYearValue=1890}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 23, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791097200000, getLastMillisecond=1791701999999, getMiddleMillisecond=1791399599999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 26, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 5, 5 {getFirstMillisecond=-62007436800000, getLastMillisecond=-62006832000001, getMiddleMillisecond=-62007134400001, getSerialIndex=270, getWeek=5, getYearValue=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 4, 5 {getFirstMillisecond=-62008041600000, getLastMillisecond=-62007436800001, getMiddleMillisecond=-62007739200001, getSerialIndex=269, getWeek=4, getYearValue=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 27, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 6, 2026 {getFirstMillisecond=1769932800000, getLastMillisecond=1770537599999, getMiddleMillisecond=1770235199999, getSerialIndex=107384, getWeek=6, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 5, 2026 {getFirstMillisecond=1769328000000, getLastMillisecond=1769932799999, getMiddleMillisecond=1769630399999, getSerialIndex=107383, getWeek=5, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 28, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 38, 1907 {getFirstMillisecond=-1965916800000, getLastMillisecond=-1965312000001, getMiddleMillisecond=-1965614400001, getSerialIndex=101109, getWeek=38, getYearValue=1907}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 37, 1907 {getFirstMillisecond=-1966550400000, getLastMillisecond=-1965945600001, getMiddleMillisecond=-1966248000001, getSerialIndex=101108, getWeek=37, getYearValue=1907}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 38, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 1, 256 {getFirstMillisecond=-54088790400000, getLastMillisecond=-54088185600001, getMiddleMillisecond=-54088488000001, getSerialIndex=13569, getWeek=1, getYearValue=256}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 100, 255 {getFirstMillisecond=-54060364800000, getLastMillisecond=-54059760000001, getMiddleMillisecond=-54060062400001, getSerialIndex=13615, getWeek=100, getYearValue=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "getEnd", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 3, 1970 {getFirstMillisecond=892800000, getLastMillisecond=1497599999, getMiddleMillisecond=1195199999, getSerialIndex=104413, getWeek=3, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198856000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766001599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103537600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790855999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}}), new String[][]{{"getYearValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}}), new String[][]{{"getYearValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 27 00:00:00 PDT 2026 {getDate=27, getDay=0, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=1790492400000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 28 00:00:00 PST 1969 {getDate=28, getDay=0, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-316800000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 29 00:00:00 PST 3 {getDate=29, getDay=0, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-62199158400000, getTimezoneOffset=480, getYear=-1897}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 23:59:59 PDT 2026 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791097199999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765699200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<empty>"}, {"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103206400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1897574400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "createInstance", new String[]{"java.lang.Class", "java.util.Date", "java.util.TimeZone"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198553600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103235200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791158399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61943328000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103840000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790553600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1771142399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1897603200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61655443200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1776581999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}, {"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("97027199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 4, 1973 {getFirstMillisecond=96422400000, getLastMillisecond=97027199999, getMiddleMillisecond=96724799999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<`>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<<`>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Mar 15 00:00:00 PST 16 {getDate=15, getDay=0, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=-61656048000000, getTimezoneOffset=480, getYear=-1884}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 12 00:00:00 PDT 2026 {getDate=12, getDay=0, getHours=0, getMinutes=0, getMonth=3, getSeconds=0, getTime=1775977200000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107394", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("104573", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 4, 1973 {getFirstMillisecond=96422400000, getLastMillisecond=97027199999, getMiddleMillisecond=96724799999, getSerialIndex=104573, getWeek=4, getYearValue=1973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("377", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107385", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("101223", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "previous", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"\0135.k.+2020-01-01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.jfree.data.time.Week", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}}), new String[][]{{"getLastMillisecond", "java.util.Calendar", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 52, 1969 {getFirstMillisecond=-921600000, getLastMillisecond=-316800001, getMiddleMillisecond=-619200001, getSerialIndex=104409, getWeek=52, getYearValue=1969}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 15, 2026 {getFirstMillisecond=1775372400000, getLastMillisecond=1775977199999, getMiddleMillisecond=1775674799999, getSerialIndex=107393, getWeek=15, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 16, 2026 {getFirstMillisecond=1775977200000, getLastMillisecond=1776581999999, getMiddleMillisecond=1776279599999, getSerialIndex=107394, getWeek=16, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"org.jfree.data.time.Week", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61943328000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25879", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<null>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<null>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:3>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:3>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:3>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:0>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790467200000, getLastMillisecond=1791071999999, getMiddleMillisecond=1790769599999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61656048000000, getLastMillisecond=-61655443200001, getMiddleMillisecond=-61655745600001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "getStart", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "getStart", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}, {"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198553600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790578800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790855999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790881199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("71999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198856000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1903", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23309", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25262", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25879", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, 1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, -1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week -1, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 19, 1903", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 6, 7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943241600000, getLastMillisecond=-61942636800001, getMiddleMillisecond=-61942939200001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.Week", "toString", ""}, {"org.jfree.data.time.Week", "getEnd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, 1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 12, 16", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 12, 16 {getFirstMillisecond=-61655961600000, getLastMillisecond=-61655356800001, getMiddleMillisecond=-61655659200001, getSerialIndex=860, getWeek=12, getYearValue=16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943241600000, getLastMillisecond=-61942636800001, getMiddleMillisecond=-61942939200001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770624000000, getLastMillisecond=1771228799999, getMiddleMillisecond=1770926399999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-56>"}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 18, 1903 {getFirstMillisecond=-2104416000000, getLastMillisecond=-2103811200001, getMiddleMillisecond=-2104113600001, getSerialIndex=100877, getWeek=18, getYearValue=1903}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789887600000, getLastMillisecond=1790492399999, getMiddleMillisecond=1790189999999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 5, 7 {getFirstMillisecond=-61944537600000, getLastMillisecond=-61943932800001, getMiddleMillisecond=-61944235200001, getSerialIndex=376, getWeek=5, getYearValue=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 29 00:00:00 PST 1969 {getDate=29, getDay=1, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-230400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 29 00:00:00 PST 1969 {getDate=29, getDay=1, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-230400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 30 00:00:00 PST 3 {getDate=30, getDay=1, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-62199072000000, getTimezoneOffset=480, getYear=-1897}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789974000000, getLastMillisecond=1790578799999, getMiddleMillisecond=1790276399999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 52, 1969 {getFirstMillisecond=-835200000, getLastMillisecond=-230400001, getMiddleMillisecond=-532800001, getSerialIndex=104409, getWeek=52, getYearValue=1969}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-921600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765094400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2104416000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1789887600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "1"}, {"getYearValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 7, 2026 {getFirstMillisecond=1770537600000, getLastMillisecond=1771142399999, getMiddleMillisecond=1770839999999, getSerialIndex=107385, getWeek=7, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.Week", "next", ""}, {"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}}), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "3"}, {"getYearValue", "", "3"}, {"getYearValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1909", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 46, 1909 {getFirstMillisecond=-1898208000000, getLastMillisecond=-1897603200001, getMiddleMillisecond=-1897905600001, getSerialIndex=101223, getWeek=46, getYearValue=1909}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61943630400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 6, 7 {getFirstMillisecond=-61943932800000, getLastMillisecond=-61943328000001, getMiddleMillisecond=-61943630400001, getSerialIndex=377, getWeek=6, getYearValue=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
}
