package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 0, 2026 {getFirstMillisecond=1766304000000, getLastMillisecond=1766908799999, getMiddleMillisecond=1766606399999, getSerialIndex=107378, getWeek=0, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 18, 1903 {getFirstMillisecond=-2104416000000, getLastMillisecond=-2103811200001, getMiddleMillisecond=-2104113600001, getSerialIndex=100877, getWeek=18, getYearValue=1903}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"Null 'time' argumen"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"2020-0101"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2027 {getFirstMillisecond=1798790400000, getLastMillisecond=1830326399999, getMiddleMillisecond=1814558399999, getSerialIndex=2027, getYear=2027}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"2020-0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"2020-0010"}, true, 0, null, 2), new String[][]{{"compareTo", "java.lang.Object", "1"}, {"getLastMillisecond", "java.util.Calendar", "3"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 11, 2020 {getFirstMillisecond=1583654400000, getLastMillisecond=1584255599999, getMiddleMillisecond=1583954999999, getSerialIndex=107071, getWeek=11, getYearValue=2020}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"1.5010"}, true, 0, null, 1), new String[][]{{"peg", "java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 1, 5010 {getFirstMillisecond=95933059200000, getLastMillisecond=95933663999999, getMiddleMillisecond=95933361599999, getSerialIndex=265531, getWeek=1, getYearValue=5010}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"1z.5010"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 16:59:59 PDT 2026 {getDate=4, getDay=0, getHours=16, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791158399999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 23:59:59 PDT 2026 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791183599999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791183599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}}, 2), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "createInstance", new String[]{"java.lang.Class", "java.util.Date", "java.util.TimeZone"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<s:l3ey>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765785600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 2, 1970 {getFirstMillisecond=374400000, getLastMillisecond=979199999, getMiddleMillisecond=676799999, getSerialIndex=104412, getWeek=2, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:a2>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"setDate", "int", "2"}, {"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"compareTo", "java.lang.Object", "5"}, {"getMiddleMillisecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790276399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790881199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62199158400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766390399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("374399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"010true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "createInstance", new String[]{"java.lang.Class", "java.util.Date", "java.util.TimeZone"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 24 09:43:26 PDT 190690351 {getDate=24, getDay=1, getHours=9, getMinutes=43, getMonth=8, getSeconds=26, getTime=6017544109183406463, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}}, 1), new String[][]{{"getEnd", "", "2"}, {"setMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 11 23:02:59 PST 1970 {getDate=11, getDay=0, getHours=23, getMinutes=2, getMonth=0, getSeconds=59, getTime=975779999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790578800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"peg", "java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789887600000, getLastMillisecond=1790492399999, getMiddleMillisecond=1790189999999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("374399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setSeconds", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 23:59:03 PDT 2026 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=9, getSeconds=3, getTime=1791183543999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1), new String[][]{{"toGMTString", "", "1"}, {"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "createInstance", new String[]{"java.lang.Class", "java.util.Date", "java.util.TimeZone"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:3>"}, {"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:2>"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 23:59:59 PST 1970 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=374399999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.data.time.Week", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790578800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790578800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 42, 2026 {getFirstMillisecond=1791702000000, getLastMillisecond=1792306799999, getMiddleMillisecond=1792004399999, getSerialIndex=107420, getWeek=42, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791183599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getEnd", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 27 23:59:59 PDT 2026 {getDate=27, getDay=0, getHours=23, getMinutes=59, getMonth=8, getSeconds=59, getTime=1790578799999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("104411", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 23:03:59 PDT 2026 {getDate=4, getDay=0, getHours=23, getMinutes=3, getMonth=9, getSeconds=59, getTime=1791180239999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 23:59:59 PST 1970 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=374399999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getYear", "", "0"}, {"setSeconds", "int", "5"}, {"compareTo", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:'b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.jfree.data.time.Millisecond {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.jfree.data.time.Millisecond, getClasses=[], getConstructors=[public org.jfree.data.time.Millise...#822#-101823795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}}), new String[][]{{"setMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 20 23:02:59 PST 2025 {getDate=20, getDay=6, getHours=23, getMinutes=2, getMonth=11, getSeconds=59, getTime=1766300579999, getTimezoneOffset=480, getYear=125}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:1>"}, {"org.jfree.data.time.Week", "getLastMillisecond", "java.util.Calendar", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("104411", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "createInstance", new String[]{"java.lang.Class", "java.util.Date", "java.util.TimeZone"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790855999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "previous", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}, {"org.jfree.data.time.Week", "getYearValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789887600000, getLastMillisecond=1790492399999, getMiddleMillisecond=1790189999999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 19, 1903", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false), new String[][]{{"getMiddleMillisecond", "java.util.Calendar", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790189999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25879", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "previous", ""}}), new String[][]{{"getSerialIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107417", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}), new String[][]{{"setSeconds", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 23:59:03 PDT 2026 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=9, getSeconds=3, getTime=1791097143999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103206400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getLastMillisecond", "java.util.Calendar", "7"}, {"previous", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 38, 2026 {getFirstMillisecond=1789282800000, getLastMillisecond=1789887599999, getMiddleMillisecond=1789585199999, getSerialIndex=107416, getWeek=38, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"peg", "java.util.Calendar", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 2, 1970 {getFirstMillisecond=288000000, getLastMillisecond=892799999, getMiddleMillisecond=590399999, getSerialIndex=104412, getWeek=2, getYearValue=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 09 15:59:59 PST 1903 {getDate=9, getDay=6, getHours=15, getMinutes=59, getMonth=4, getSeconds=59, getTime=-2103235200001, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103811200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.Week", "previous", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791097200000, getLastMillisecond=1791701999999, getMiddleMillisecond=1791399599999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"peg", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 20, 1903 {getFirstMillisecond=-2103206400000, getLastMillisecond=-2102601600001, getMiddleMillisecond=-2102904000001, getSerialIndex=100879, getWeek=20, getYearValue=1903}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}), new String[][]{{"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 09 15:03:59 PST 1903 {getDate=9, getDay=6, getHours=15, getMinutes=3, getMonth=4, getSeconds=59, getTime=-2103238560001, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23309", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766001599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false), new String[][]{{"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1903", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "next", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791097200000, getLastMillisecond=1791701999999, getMiddleMillisecond=1791399599999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62199158400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("126", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 27 00:00:00 PDT 2026 {getDate=27, getDay=0, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=1790492400000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getMiddleMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2104113600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false), new String[][]{{"getMiddleMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791399599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"after", "java.util.Date", "2"}, {"getYear", "", "7"}, {"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("2026-10-04T06:59:59.999Z {getEpochSecond=1791097199, getNano=999000000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getMiddleMillisecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198251200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYearValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getYearValue", "", "6"}, {"getLastMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766908799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false), new String[][]{{"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103840000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "parseWeek", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.time.TimePeriodFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false), new String[][]{{"after", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 40, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1789887600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<s:'bg>"}}), new String[][]{{"getLastMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198856000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<s:ab>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 03 23:59:59 PST 1970 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=287999999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791158399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}}), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 04 23:59:59 PST 2 {getDate=4, getDay=6, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=-62198553600001, getTimezoneOffset=480, getYear=-1898}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false), new String[][]{{"getMiddleMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1783022399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 29 00:00:00 PST 3 {getDate=29, getDay=0, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-62199158400000, getTimezoneOffset=480, getYear=-1897}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false), new String[][]{{"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("2026-09-27T07:00:00Z {getEpochSecond=1790492400, getNano=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 52, 1969 {getFirstMillisecond=-921600000, getLastMillisecond=-316800001, getMiddleMillisecond=-619200001, getSerialIndex=104409, getWeek=52, getYearValue=1969}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62198856000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765699200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"after", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25262", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766001599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setDate", "int", "7"}, {"getYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100878", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, 1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62199158400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 28 00:00:00 PST 1969 {getDate=28, getDay=0, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-316800000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false), new String[][]{{"compareTo", "java.util.Date", "3"}, {"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("1970 {getFirstMillisecond=28800000, getLastMillisecond=31564799999, getMiddleMillisecond=15796799999, getSerialIndex=1970, getYear=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107377", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week -1, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week -2, 2026 {getFirstMillisecond=1765094400000, getLastMillisecond=1765699199999, getMiddleMillisecond=1765396799999, getSerialIndex=107376, getWeek=-2, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"after", "java.util.Date", "7"}, {"setMinutes", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 28 00:04:00 PST 1969 {getDate=28, getDay=0, getHours=0, getMinutes=4, getMonth=11, getSeconds=0, getTime=-316560000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-316800000, getLastMillisecond=287999999, getMiddleMillisecond=-14400001, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103235200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765699200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765699200000, getLastMillisecond=1766303999999, getMiddleMillisecond=1766001599999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false), new String[][]{{"getLastMillisecond", "", "7"}, {"getLastMillisecond", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1798790399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, -1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199158400000, getLastMillisecond=-62198553600001, getMiddleMillisecond=-62198856000001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("1970 {getFirstMillisecond=28800000, getLastMillisecond=31564799999, getMiddleMillisecond=15796799999, getSerialIndex=1970, getYear=1970}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765785600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789974000000, getLastMillisecond=1790578799999, getMiddleMillisecond=1790276399999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("374399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789974000000, getLastMillisecond=1790578799999, getMiddleMillisecond=1790276399999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765699200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790881199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getSerialIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("107418", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103508800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 23:59:59 PDT 2026 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791183599999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103753600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790553600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "peg", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getEnd", ""}}, 1), new String[][]{{"getYear", "", "7"}, {"toGMTString", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 Oct 2026 06:59:59 GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week -2, 2026 {getFirstMillisecond=1765180800000, getLastMillisecond=1765785599999, getMiddleMillisecond=1765483199999, getSerialIndex=107376, getWeek=-2, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setMonth", "int", "7"}, {"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("2026-05-05T06:59:59.999Z {getEpochSecond=1777964399, getNano=999000000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1766303999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getSeconds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"toLocaleString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sep 28, 2026, 12:00:00 AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790794799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false), new String[][]{{"getStart", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1767254400000, getTimezoneOffset=480, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}, {"org.jfree.data.time.Week", "previous", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"after", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "previous", ""}, {"org.jfree.data.time.Week", "getLastMillisecond", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790881199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:x>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}, {"org.jfree.data.time.Week", "previous", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.time.Week", "getWeek", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791097199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getLastMillisecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791788399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "downsize", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setMonth", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon May 04 23:59:59 PDT 2026 {getDate=4, getDay=1, getHours=23, getMinutes=59, getMonth=4, getSeconds=59, getTime=1777964399999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getStart", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setMonth", "int", "0"}, {"getTimezoneOffset", "", "6"}, {"setHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Feb 22 07:00:00 PST 178709967 {getDate=22, getDay=1, getHours=7, getMinutes=0, getMonth=1, getSeconds=0, getTime=-5639719785843600000, getTimezoneOffset=480, getYear=178708067}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790553600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getSerialIndex", ""}}, 1), new String[][]{{"getFirstMillisecond", "", "4"}, {"getLastMillisecond", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790578799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getFirstMillisecond", "java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1789887600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"toInstant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("2026-10-04T23:59:59.999Z {getEpochSecond=1791158399, getNano=999000000}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:62>"}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25879", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Week 1, 1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getStart", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1767254400000, getTimezoneOffset=480, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103206400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 23:59:59 PST 1970 {getDate=4, getDay=0, getHours=23, getMinutes=59, getMonth=0, getSeconds=59, getTime=374399999, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getWeek", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:aP>"}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getMiddleMillisecond", "java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2104113600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<empty>"}}), new String[][]{{"getLastMillisecond", "java.util.Calendar", "3"}, {"getMiddleMillisecond", "java.util.Calendar", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2104113600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103811200000, getLastMillisecond=-2103206400001, getMiddleMillisecond=-2103508800001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"after", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:2>"}, {"org.jfree.data.time.Week", "getLastMillisecond", ""}}), new String[][]{{"previous", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2025 {getFirstMillisecond=1735718400000, getLastMillisecond=1767254399999, getMiddleMillisecond=1751486399999, getSerialIndex=2025, getYear=2025}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getLastMillisecond", ""}, {"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-316800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getYearValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791183599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.Week", "previous", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791183600000, getLastMillisecond=1791788399999, getMiddleMillisecond=1791485999999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setMonth", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 04 23:59:59 PDT 2026 {getDate=4, getDay=6, getHours=23, getMinutes=59, getMonth=3, getSeconds=59, getTime=1775372399999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getYear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Year", actual.getClass().getName());
  assertEquals("2026 {getFirstMillisecond=1767254400000, getLastMillisecond=1798790399999, getMiddleMillisecond=1783022399999, getSerialIndex=2026, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.Week", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-230400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "compareTo", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 41, 2026 {getFirstMillisecond=1791183600000, getLastMillisecond=1791788399999, getMiddleMillisecond=1791485999999, getSerialIndex=107419, getWeek=41, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26779", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setDate", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 23:59:59 PDT 2026 {getDate=3, getDay=6, getHours=23, getMinutes=59, getMonth=9, getSeconds=59, getTime=1791097199999, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25280", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<sample:2>"}}, 1), new String[][]{{"getLastMillisecond", "java.util.Calendar", "2"}, {"getYearValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790492400000, getLastMillisecond=1791097199999, getMiddleMillisecond=1790794799999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25879", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("71999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.Week", "peg", "java.util.Calendar", "<null>"}, {"org.jfree.data.time.Week", "getLastMillisecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103537600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103840000000, getLastMillisecond=-2103235200001, getMiddleMillisecond=-2103537600001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2103508800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 19, 1903 {getFirstMillisecond=-2103753600000, getLastMillisecond=-2103148800001, getMiddleMillisecond=-2103451200001, getSerialIndex=100878, getWeek=19, getYearValue=1903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "toString", ""}}, 3), new String[][]{{"next", "", "0"}, {"compareTo", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", "java.util.Calendar", "<sample:0>"}}, 3), new String[][]{{"getYearValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1765699200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, -1 {getFirstMillisecond=-62199072000000, getLastMillisecond=-62198467200001, getMiddleMillisecond=-62198769600001, getSerialIndex=-52, getWeek=1, getYearValue=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 39, 2026 {getFirstMillisecond=1789974000000, getLastMillisecond=1790578799999, getMiddleMillisecond=1790276399999, getSerialIndex=107417, getWeek=39, getYearValue=2026}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.Week", "next", ""}}, 3), new String[][]{{"compareTo", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790578800000, getLastMillisecond=1791183599999, getMiddleMillisecond=1790881199999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getMiddleMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getLastMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("287999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getEnd", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 21 23:59:59 PST 2025 {getDate=21, getDay=0, getHours=23, getMinutes=59, getMonth=11, getSeconds=59, getTime=1766390399999, getTimezoneOffset=480, getYear=125}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week -1, 2026 {getFirstMillisecond=1765785600000, getLastMillisecond=1766390399999, getMiddleMillisecond=1766087999999, getSerialIndex=107377, getWeek=-1, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.Week", "getMiddleMillisecond", ""}, {"org.jfree.data.time.Week", "getFirstMillisecond", "java.util.Calendar", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-230400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "previous", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.Week", actual.getClass().getName());
  assertEquals("Week 52, 1969 {getFirstMillisecond=-835200000, getLastMillisecond=-230400001, getMiddleMillisecond=-532800001, getSerialIndex=104409, getWeek=52, getYearValue=1969}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Week 1, 1970 {getFirstMillisecond=-230400000, getLastMillisecond=374399999, getMiddleMillisecond=71999999, getSerialIndex=104411, getWeek=1, getYearValue=1970}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.Week", "org.jfree.data.time.Week", "getFirstMillisecond", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790492400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Week 40, 2026 {getFirstMillisecond=1790553600000, getLastMillisecond=1791158399999, getMiddleMillisecond=1790855999999, getSerialIndex=107418, getWeek=40, getYearValue=2026}", SearchInputFactory_scaffolding.receiverState());
 }
}
