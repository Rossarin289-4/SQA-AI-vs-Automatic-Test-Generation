package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:x>", "3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "139999977"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Feb 14 01:00:00 PST 17941 {getDate=14, getDay=5, getHours=1, getMinutes=0, getMonth=1, getSeconds=0, getTime=503999917200000, getTimezoneOffset=480, getYear=16041}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "86399999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:[>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "38"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 31 16:00:00 PST 1971 {getDate=31, getDay=5, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=63072000001, getTimezoneOffset=480, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:23:47 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=23, getMonth=4, getSeconds=47, getTime=-2103615373000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:05:00 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=5, getMonth=3, getSeconds=0, getTime=-2137834500000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "119998"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:45:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=45, getMonth=1, getSeconds=26, getTime=6017544090524726462, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:1>", "26"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "23"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "7208192"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:9>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "2147483614"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:4>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "4"}, true), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"The fie", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "1"}, true), new String[][]{{"hasNext", "", "4"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790492400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-2070453511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 3), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "3"}, true), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0x123456789", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "14"}, true), new String[][]{{"getGregorianChange", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 04 16:00:00 PST 1582 {getDate=4, getDay=4, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=-12219292800000, getTimezoneOffset=480, getYear=-318}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "119998"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "12"}, true), new String[][]{{"getMonth", "", "7"}, {"compareTo", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 12:00:00 PST 1969 {getDate=31, getDay=3, getHours=12, getMinutes=0, getMonth=11, getSeconds=0, getTime=-14400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1001"}, true, 0, null, 3), new String[][]{{"getHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 3), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-2105150021", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "1001"}, true), new String[][]{{"setMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Oct 08 02:07:00 PDT 5990 {getDate=8, getDay=1, getHours=2, getMinutes=7, getMonth=9, getSeconds=0, getTime=126883184820000, getTimezoneOffset=420, getYear=4090}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 21 00:00:00 PST 190690351 {getDate=21, getDay=3, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090576000000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "-2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "4"}, true, 0, null, 3), new String[][]{{"toInstant", "", "7"}, {"adjustInto", "java.time.temporal.Temporal", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "60001"}, true, 0, null, 3), new String[][]{{"before", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400000"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 02 16:00:00 PDT 41159243 {getDate=2, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=1298798109702000001, getTimezoneOffset=420, getYear=41157343}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:0>", "43199999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "23", "3600008"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "60001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "60000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "997"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "280000000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PDT 280001902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=8835944422161960000, getTimezoneOffset=420, getYear=280000002}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:keDy>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 1), new String[][]{{"getSeconds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 30 16:00:00 PST 1969 {getDate=30, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-86399995, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"l-0.0", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "-2147450880"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<i:0>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:6>", "1001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "23"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400001"}, true, 0, null, 2), new String[][]{{"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "43200000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 29 16:00:00 PST 829913 {getDate=29, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=26127360000000005, getTimezoneOffset=480, getYear=828013}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "86400000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jun 05 00:00:00 PST 1910 {getDate=5, getDay=0, getHours=0, getMinutes=0, getMonth=5, getSeconds=0, getTime=-1880035200000, getTimezoneOffset=480, getYear=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2147483647"}, true, 0, null, 1), new String[][]{{"setSeconds", "int", "5"}, {"setYear", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jan 04 06:07:02 PST 1901 {getDate=4, getDay=5, getHours=6, getMinutes=7, getMonth=0, getSeconds=2, getTime=-2177142778000, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:ky>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1009"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jun 05 06:07:08 PDT 1987 {getDate=5, getDay=5, getHours=6, getMinutes=7, getMonth=5, getSeconds=8, getTime=549896828000, getTimezoneOffset=420, getYear=87}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2061083649"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 04 13:51:00 PST 1950 {getDate=4, getDay=6, getHours=13, getMinutes=51, getMonth=3, getSeconds=0, getTime=-123665018939999, getTimezoneOffset=480, getYear=50}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "540470912"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "-3600001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "86399999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "536870935"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 14 14:07:08 PDT 63149 {getDate=14, getDay=4, getHours=14, getMinutes=7, getMonth=3, getSeconds=8, getTime=1930631749628000, getTimezoneOffset=420, getYear=61249}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:6>", "86400000", "2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "60044"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-41"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "60000"}, true, 0, null, 2), new String[][]{{"setYear", "int", "7"}, {"getTimezoneOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"12:30:45", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "52"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1"}, true, 0, null, 3), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 07 16:00:00 PST 1970 {getDate=7, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=604800005, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon May 11 00:00:00 PDT 41159181 {getDate=11, getDay=1, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=1298796143266800000, getTimezoneOffset=420, getYear=41157281}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:3>", "43200048"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "-134217724"}, true, 0, null, 3), new String[][]{{"after", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "75"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:13>", "29999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Nov 30 16:00:00 PST 4469 {getDate=30, getDay=6, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=78889766400011, getTimezoneOffset=480, getYear=2569}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-16280"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Apr 30 16:00:00 PST 613 {getDate=30, getDay=1, getHours=16, getMinutes=0, getMonth=3, getSeconds=0, getTime=-42812150399994, getTimezoneOffset=480, getYear=-1287}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:x>", "2147483614"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "52"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:08:00 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=8, getMonth=4, getSeconds=0, getTime=-2103616320000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 1), new String[][]{{"getDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "4"}, true, 0, null, 1), new String[][]{{"toLocaleString", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Apr 30, 1970, 4:00:00 PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-1001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:43:19 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=43, getMonth=11, getSeconds=19, getTime=-1000994, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "7"}, true, 0, null, 1), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 13:07:08 PST 1903 {getDate=5, getDay=2, getHours=13, getMinutes=7, getMonth=4, getSeconds=8, getTime=-2103591172000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "140000000"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "3"}, {"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Aug 31 16:03:00 PDT 11668636 {getDate=31, getDay=3, getHours=16, getMinutes=3, getMonth=7, getSeconds=0, getTime=368164439996580000, getTimezoneOffset=420, getYear=11666736}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "2147483626"}, true, 0, null, 1), new String[][]{{"getSeconds", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-2010"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147483647"}, true, 0, null, 1), new String[][]{{"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41157281", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true), new String[][]{{"getTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7730941129200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-280000018"}, true), new String[][]{{"getMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-126"}, true), new String[][]{{"getTimezoneOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "3599996"}, true), new String[][]{{"getSeconds", "", "3"}, {"getSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483647"}, true), new String[][]{{"setHours", "int", "3"}, {"getDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<null>", "26", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "52"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 21 16:00:00 PST 1970 {getDate=21, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=1814400001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" s not sup", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600056"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 10 01:00:00 PDT 2380 {getDate=10, getDay=3, getHours=1, getMinutes=0, getMonth=8, getSeconds=0, getTime=12960201600001, getTimezoneOffset=420, getYear=480}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "10", "26"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 21 11:43:26 PST 190690351 {getDate=21, getDay=3, getHours=11, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090618206464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-62>", "2147352575"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600000"}, true), new String[][]{{"setSeconds", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:02 PST 301969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=2, getTime=9467085600002001, getTimezoneOffset=480, getYear=300069}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "4"}, true), new String[][]{{"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 02 05:01:00 PST 1902 {getDate=2, getDay=5, getHours=5, getMinutes=1, getMonth=4, getSeconds=0, getTime=-2135415540000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Nov 17 09:43:26 PST 190690353 {getDate=17, getDay=2, getHours=9, getMinutes=43, getMonth=10, getSeconds=26, getTime=6017544177011006464, getTimezoneOffset=480, getYear=190688453}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "1001"}, true), new String[][]{{"setDate", "int", "0"}, {"after", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "86400017"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3600000"}, true), new String[][]{{"setHours", "int", "0"}, {"compareTo", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "2"}, true), new String[][]{{"getMinutes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 20 09:43:26 PDT 11733380 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=370207557103406464, getTimezoneOffset=420, getYear=11731480}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "139999977"}, true), new String[][]{{"toInstant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("2236-03-09T04:57:00Z {getEpochSecond=8399998620, getNano=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3600001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "52"}, true), new String[][]{{"before", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "52"}, true), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "3599999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jul 13 23:59:00 PST 1914 {getDate=13, getDay=1, getHours=23, getMinutes=59, getMonth=6, getSeconds=0, getTime=-1750435260000, getTimezoneOffset=480, getYear=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "139999977"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 08 20:57:00 PST 2236 {getDate=8, getDay=2, getHours=20, getMinutes=57, getMonth=2, getSeconds=0, getTime=8399998620000, getTimezoneOffset=480, getYear=336}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 13 12:45:52 PST 1901 {getDate=13, getDay=5, getHours=12, getMinutes=45, getMonth=11, getSeconds=52, getTime=-2147483647999, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2147483648"}, true), new String[][]{{"getDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "500"}, true), new String[][]{{"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "60039"}, true), new String[][]{{"getSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 11 12:16:32 PST 178955062 {getDate=11, getDay=4, getHours=12, getMinutes=16, getMonth=1, getSeconds=32, getTime=-5647454396768608000, getTimezoneOffset=480, getYear=178953162}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"aGMT", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"a,b,c", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86399999"}, true), new String[][]{{"getTimezoneOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-10"}, true), new String[][]{{"getYear", "", "3"}, {"setTime", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=4, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "6"}, true), new String[][]{{"getMinutes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "953"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 06 16:00:00 PDT 1988 {getDate=6, getDay=3, getHours=16, getMinutes=0, getMonth=3, getSeconds=0, getTime=576370800006, getTimezoneOffset=420, getYear=88}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "86400015"}, true), new String[][]{{"getDay", "", "6"}, {"after", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 09 00:06:00 PST 246886 {getDate=9, getDay=3, getHours=0, getMinutes=6, getMonth=0, getSeconds=0, getTime=7728803251560000, getTimezoneOffset=480, getYear=244986}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:5>", "2", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 05 06:07:08 PST 1903 {getDate=5, getDay=6, getHours=6, getMinutes=7, getMonth=11, getSeconds=8, getTime=-2085126772000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "991"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Nov 07 09:43:26 PST 190690353 {getDate=7, getDay=6, getHours=9, getMinutes=43, getMonth=10, getSeconds=26, getTime=6017544176147006464, getTimezoneOffset=480, getYear=190688453}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true), new String[][]{{"getTime", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6017546238008253464", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 16:00:00 PST 1970 {getDate=1, getDay=4, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=86400001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "26"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 26 16:00:00 PST 1970 {getDate=26, getDay=1, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=2246400000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 02 16:00:00 PST 5877521 {getDate=2, getDay=1, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=-185542587187199994, getTimezoneOffset=480, getYear=5875621}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-86399999"}, true), new String[][]{{"getTime", "", "4"}, {"getMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "104"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 29 16:00:00 PST 1971 {getDate=29, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=62899200001, getTimezoneOffset=480, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:01:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=1, getMonth=11, getSeconds=0, getTime=60001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true), new String[][]{{"getTimezoneOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true), new String[][]{{"setSeconds", "int", "0"}, {"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 15 12:46:52 PST 1901 {getDate=15, getDay=0, getHours=12, getMinutes=46, getMonth=11, getSeconds=52, getTime=-2147310787999, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3600000"}, true), new String[][]{{"toLocaleString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Feb 20, 190690351, 10:43:26 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-1001"}, true), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 05 00:00:00 PST 1967 {getDate=5, getDay=3, getHours=0, getMinutes=0, getMonth=3, getSeconds=0, getTime=-86543999994, getTimezoneOffset=480, getYear=67}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2113929215"}, true), new String[][]{{"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "280000000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 09 00:00:00 PDT 280001907 {getDate=9, getDay=1, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=8835944593561200000, getTimezoneOffset=420, getYear=280000007}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "499"}, true), new String[][]{{"setTime", "long", "1"}, {"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true), new String[][]{{"getHours", "", "4"}, {"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 21 01:43:01 PST 190690420 {getDate=21, getDay=1, getHours=1, getMinutes=43, getMonth=11, getSeconds=1, getTime=6017546294300581465, getTimezoneOffset=480, getYear=190688520}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600001"}, true), new String[][]{{"compareTo", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Nov 30 16:00:00 PST 3601970 {getDate=30, getDay=1, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=113605056057600001, getTimezoneOffset=480, getYear=3600070}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "8389609"}, true), new String[][]{{"toGMTString", "", "1"}, {"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-23"}, true), new String[][]{{"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "10"}, true), new String[][]{{"toInstant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("1980-01-01T00:00:00.001Z {getEpochSecond=315532800, getNano=1000000}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "38"}, true), new String[][]{{"getTime", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-904384372000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:5>", "7", "-86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 29 06:07:08 PST 234649 {getDate=29, getDay=0, getHours=6, getMinutes=7, getMonth=11, getSeconds=8, getTime=-7467063702772000, getTimezoneOffset=480, getYear=232749}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-126"}, true), new String[][]{{"getMinutes", "", "7"}, {"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "11"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1791057600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#1572937617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-22"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Apr 13 06:07:08 PST 1903 {getDate=13, getDay=1, getHours=6, getMinutes=7, getMonth=3, getSeconds=8, getTime=-2105517172000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "60032"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 14 16:00:00 PDT 3120 {getDate=14, getDay=3, getHours=16, getMinutes=0, getMonth=6, getSeconds=0, getTime=36307350000005, getTimezoneOffset=420, getYear=1220}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "2147483647"}, true, 0, null, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jun 12 11:12:00 PDT 41159182 {getDate=12, getDay=6, getHours=11, getMinutes=12, getMonth=5, getSeconds=0, getTime=1298796177607920000, getTimezoneOffset=420, getYear=41157282}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147483647"}, true, 0, null, 1), new String[][]{{"toGMTString", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 Oct 1907 04:31:23 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "86402049"}, true, 0, null, 2), new String[][]{{"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-1"}, true, 0, null, 1), new String[][]{{"getMonth", "", "5"}, {"toLocaleString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dec 24, 1969, 4:00:00 PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "191073"}, true, 0, null, 2), new String[][]{{"getSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2"}, true, 0, null, 1), new String[][]{{"setMonth", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Aug 01 00:00:00 PDT 178958877 {getDate=1, getDay=0, getHours=0, getMinutes=0, getMonth=7, getSeconds=0, getTime=5647334542700400000, getTimezoneOffset=420, getYear=178956977}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "120023"}, true, 0, null, 1), new String[][]{{"after", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:6>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "5"}, true, 0, null, 1), new String[][]{{"before", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "23"}, true, 0, null, 1), new String[][]{{"getDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "26"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "86400001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "8"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:08:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=8, getMonth=11, getSeconds=0, getTime=480001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true, 0, null, 1), new String[][]{{"setYear", "int", "2"}, {"getDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "5097"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=13, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "499"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:14:19 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=14, getMonth=3, getSeconds=19, getTime=-2137833941000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 25 12:31:23 PST 1970 {getDate=25, getDay=0, getHours=12, getMinutes=31, getMonth=0, getSeconds=23, getTime=2147483648, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:12>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Mar 17 07:14:50 PDT 190690351 {getDate=17, getDay=6, getHours=7, getMinutes=14, getMonth=2, getSeconds=50, getTime=6017544092672090111, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "23"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:23 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=23, getTime=-2137834417000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "38"}, true, 0, null, 1), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:38:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=38, getMonth=11, getSeconds=0, getTime=2280000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147483565"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 09 00:00:00 PDT 178958871 {getDate=9, getDay=2, getHours=0, getMinutes=0, getMonth=5, getSeconds=0, getTime=5647334348732400000, getTimezoneOffset=420, getYear=178956971}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-52"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 16:00:00 PST 1969 {getDate=1, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=-31449599999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "23"}, true, 0, null, 3), new String[][]{{"after", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "59999"}, true, 0, null, 2), new String[][]{{"toLocaleString", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Apr 4, 61901, 5:06:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "32705"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 04 05:06:00 PDT 34607 {getDate=4, getDay=6, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=1029932280360000, getTimezoneOffset=420, getYear=32707}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 00:00:00 PDT 2026 {getDate=4, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1791097200000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "-16"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3600000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PDT 301902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=9464947761960000, getTimezoneOffset=420, getYear=300002}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "164411394"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 27 00:37:26 PDT 190690663 {getDate=27, getDay=0, getHours=0, getMinutes=37, getMonth=8, getSeconds=26, getTime=6017553955208246464, getTimezoneOffset=420, getYear=190688763}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 02 16:00:00 PDT 41159243 {getDate=2, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=1298798109702000006, getTimezoneOffset=420, getYear=41157343}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "38"}, true, 0, null, 1), new String[][]{{"getDate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true, 0, null, 2), new String[][]{{"setMinutes", "int", "1"}, {"compareTo", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-1000"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true, 0, null, 3), new String[][]{{"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 24 16:01:00 PST 1969 {getDate=24, getDay=3, getHours=16, getMinutes=1, getMonth=11, getSeconds=0, getTime=-604739999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "6"}, true), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 16 00:00:00 PST 1969 {getDate=16, getDay=2, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1353600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jul 05 06:07:08 PST 1903 {getDate=5, getDay=0, getHours=6, getMinutes=7, getMonth=6, getSeconds=8, getTime=-2098345972000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Oct 04 05:06:00 PDT 1985 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=9, getSeconds=0, getTime=497275560000, getTimezoneOffset=420, getYear=85}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "6"}, true), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#665103516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "6"}, true, 0, null, 1), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#665103516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true, 0, null, 2), new String[][]{{"getYear", "", "6"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:00 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=0, getTime=-59999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "59999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu May 30 09:43:26 PDT 190690515 {getDate=30, getDay=4, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=6017549274434606464, getTimezoneOffset=420, getYear=190688615}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "43200000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 10 10:43:26 PDT 190690433 {getDate=10, getDay=0, getHours=10, getMinutes=43, getMonth=3, getSeconds=26, getTime=6017546682524606464, getTimezoneOffset=420, getYear=190688533}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "3600001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jun 15 22:07:09 PST 1903 {getDate=15, getDay=1, getHours=22, getMinutes=7, getMonth=5, getSeconds=9, getTime=-2100016371000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jun 21 16:00:00 PDT 1975 {getDate=21, getDay=6, getHours=16, getMinutes=0, getMonth=5, getSeconds=0, getTime=172623600005, getTimezoneOffset=420, getYear=75}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#959#-33800775", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 3), new String[][]{{"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "140000000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "1002"}, true, 0, null, 1), new String[][]{{"getMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:03 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=3, getTime=3001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000014"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Apr 01 23:00:00 PDT 33912 {getDate=1, getDay=1, getHours=23, getMinutes=0, getMonth=3, getSeconds=0, getTime=1008000050400001, getTimezoneOffset=420, getYear=32012}", SearchInputFactory_scaffolding.observe(actual));
 }
}
