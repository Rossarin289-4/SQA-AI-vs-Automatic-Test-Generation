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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "69"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jun 12 05:06:00 PST 1902 {getDate=12, getDay=4, getHours=5, getMinutes=6, getMonth=5, getSeconds=0, getTime=-2131872840000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 30 06:07:08 PDT 1657789 {getDate=30, getDay=2, getHours=6, getMinutes=7, getMonth=5, getSeconds=8, getTime=52252616380028000, getTimezoneOffset=420, getYear=1655889}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "501"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3599999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 20 09:43:26 PST 190990351 {getDate=20, getDay=6, getHours=9, getMinutes=43, getMonth=0, getSeconds=26, getTime=6027011173446206464, getTimezoneOffset=480, getYear=190988451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-2>", "988"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "280000057"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Aug 16 17:43:00 PDT 2434 {getDate=16, getDay=3, getHours=17, getMinutes=43, getMonth=7, getSeconds=0, getTime=14662168980000, getTimezoneOffset=420, getYear=534}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "988"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 31 16:00:00 PST 2957 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=31178304000000, getTimezoneOffset=480, getYear=1057}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137834439991, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "86400001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-2147483648>", "12"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "560000002"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:0>", "<sample:4>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<null>", "<sample:0>", "2147352575"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("84", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<null>", "<sample:1>", "-11"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "23129090"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "-16776214"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"tr,,e", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 31 16:00:00 PST 2000 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=978307200005, getTimezoneOffset=480, getYear=100}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "560000002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "14"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("22028000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jun 09 00:00:00 PST 1907 {getDate=9, getDay=0, getHours=0, getMinutes=0, getMonth=5, getSeconds=0, getTime=-1974384000000, getTimezoneOffset=480, getYear=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "6"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-1967644800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayl...#967#-62887871", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"o", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "280000057"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "69"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1"}, true), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:12>", "12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true, 0, null, 3), new String[][]{{"hasNext", "", "3"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=6017544088502400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,us...#985#1407841935", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 14 16:00:00 PST 1969 {getDate=14, getDay=0, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1468799995, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("45600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:8>", "<sample:4>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "60000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "9"}, true, 0, null, 3), new String[][]{{"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "1001"}, true), new String[][]{{"getHours", "", "0"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 16 00:00:00 PST 1907 {getDate=16, getDay=1, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=-1965830400000, getTimezoneOffset=480, getYear=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true, 0, null, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:8>", "<sample:11>", "13"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "30000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "19"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 09 00:19:00 PST 1907 {getDate=9, getDay=1, getHours=0, getMinutes=19, getMonth=8, getSeconds=0, getTime=-1966434060000, getTimezoneOffset=480, getYear=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "4"}, true, 0, null, 2), new String[][]{{"next", "", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790751600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-62904330", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "9"}, true), new String[][]{{"setMinutes", "int", "1"}, {"before", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "1001"}, true), new String[][]{{"getMinutes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:15>", "3"}, true), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-1614528000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayl...#967#1857419191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "1001"}, true), new String[][]{{"before", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:2>", "<sample:0>", "-59967"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "1002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<sample:3>", "58"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-16440"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"setLenient", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-2137834440000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayl...#965#1403094085", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "3600001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jun 05 06:07:08 PDT 301903 {getDate=5, getDay=5, getHours=6, getMinutes=7, getMonth=5, getSeconds=8, getTime=9464984658428000, getTimezoneOffset=420, getYear=300003}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "40"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "-28"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "1001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<sample:5>", "560000002"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:7>", "<sample:6>", "120000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:8>", "<sample:4>", "43200000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "2147483636"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-2143289344"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:1>", "<sample:6>", "140000000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:22:40 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=22, getMonth=3, getSeconds=40, getTime=-2137833440000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-1073741824"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<i:0>", "2000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "-33552428"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "86400000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3599996"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "23"}, true, 0, null, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=24, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-7227"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "9"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "1001"}, true, 0, null, 1), new String[][]{{"clear", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1002"}, true, 0, null, 1), new String[][]{{"after", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "120000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"Th fragment ", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:0>", "1000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-11"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "10"}, true, 0, null, 1), new String[][]{{"getHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:3>", "23"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "0"}, true, 0, null, 1), new String[][]{{"after", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "23"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "900000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "34"}, true, 0, null, 1), new String[][]{{"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jan 02 01:59:59 PST 1970 {getDate=2, getDay=5, getHours=1, getMinutes=59, getMonth=0, getSeconds=59, getTime=122399005, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-31"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:jey>", "60000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000057"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3600034"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "173848578"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "44"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Nov 23 11:12:00 PST 1908 {getDate=23, getDay=1, getHours=11, getMinutes=12, getMonth=10, getSeconds=0, getTime=-1928292480000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<empty>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Aug 05 06:07:08 PDT 1986 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=7, getSeconds=8, getTime=523631228000, getTimezoneOffset=420, getYear=86}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1L", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.1234567\t", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "140"}, true, 0, null, 2), new String[][]{{"getHours", "", "2"}, {"getDate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:6>", "<sample:10>", "279999999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"92233720368L54775807", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 31 16:00:00 PST 1970 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=2678400001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:16:39 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=16, getMonth=11, getSeconds=39, getTime=999000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "560000002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "28"}, true, 0, null, 3), new String[][]{{"setHours", "int", "3"}, {"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("276", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "172800002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-34"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"$1$2", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:1>", "<sample:1>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "501"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Nov 10 05:06:00 PST 1911 {getDate=10, getDay=5, getHours=5, getMinutes=6, getMonth=10, getSeconds=0, getTime=-1834829640000, getTimezoneOffset=480, getYear=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "86400000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "560000002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 06 05:06:00 PST 1902 {getDate=6, getDay=0, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137661640000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#959#1999790820", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-86400001"}, true), new String[][]{{"getMonth", "", "7"}, {"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "21"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "501"}, true), new String[][]{{"clone", "", "2"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 13 07:43:26 PDT 190690351 {getDate=13, getDay=2, getHours=7, getMinutes=43, getMonth=2, getSeconds=26, getTime=6017544092328206464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-28"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:0>", "<sample:3>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"i", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-16440"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 28 07:35:26 PST 190686268 {getDate=28, getDay=2, getHours=7, getMinutes=35, getMonth=0, getSeconds=26, getTime=6017415241505726464, getTimezoneOffset=480, getYear=190684368}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true), new String[][]{{"toGMTString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("30 May 203167161 13:01:01 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "2000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-1001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "8388613"}, true), new String[][]{{"clone", "", "4"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30199006800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:2>", "<sample:7>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "7199998"}, true), new String[][]{{"setHours", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jun 22 01:00:00 PDT 139960 {getDate=22, getDay=3, getHours=1, getMinutes=0, getMonth=5, getSeconds=0, getTime=4354558732800006, getTimezoneOffset=420, getYear=138060}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, true), new String[][]{{"getMaximum", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:2>", "<sample:5>", "560000002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "19"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 11:00:00 PST 1970 {getDate=1, getDay=4, getHours=11, getMinutes=0, getMonth=0, getSeconds=0, getTime=68400005, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1234567890123486", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "34"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:34 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=34, getTime=34000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "17"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1986 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=536457600000, getTimezoneOffset=480, getYear=86}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "23"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "8204"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"A1", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "2002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000117"}, true), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 16 05:37:00 PDT 2502 {getDate=16, getDay=2, getHours=5, getMinutes=37, getMonth=4, getSeconds=0, getTime=16800007020001, getTimezoneOffset=420, getYear=602}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "43200000"}, true), new String[][]{{"toGMTString", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 Apr 3601902 12:06:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3600001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Sep 21 05:06:00 PDT 11758 {getDate=21, getDay=4, getHours=5, getMinutes=6, getMonth=8, getSeconds=0, getTime=308902248360000, getTimezoneOffset=420, getYear=9858}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "172800005"}, true), new String[][]{{"setYear", "int", "4"}, {"setTime", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "560000070"}, true), new String[][]{{"setDate", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jul 03 23:00:00 PDT 65854 {getDate=3, getDay=1, getHours=23, getMinutes=0, getMonth=6, getSeconds=0, getTime=2016000252000005, getTimezoneOffset=420, getYear=63954}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 02 16:00:00 PDT 41159243 {getDate=2, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=1298798109702000005, getTimezoneOffset=420, getYear=41157343}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true), new String[][]{{"getMonth", "", "6"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 22 18:07:00 PST 6053 {getDate=22, getDay=3, getHours=18, getMinutes=7, getMonth=0, getSeconds=0, getTime=128849018820001, getTimezoneOffset=480, getYear=4153}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<empty>", "<sample:5>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "11988607"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 20 09:43:26 PDT 191689401 {getDate=20, getDay=0, getHours=9, getMinutes=43, getMonth=8, getSeconds=26, getTime=6049071081765806464, getTimezoneOffset=420, getYear=191687501}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 11:12:00 PST 1908 {getDate=10, getDay=6, getHours=11, getMinutes=12, getMonth=9, getSeconds=0, getTime=-1932094079999, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-16776172"}, true), new String[][]{{"after", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true), new String[][]{{"clone", "", "1"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 16 02:53:00 PST 1835 {getDate=16, getDay=4, getHours=2, getMinutes=53, getMonth=3, getSeconds=0, getTime=-4251100020000, getTimezoneOffset=480, getYear=-65}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 12 09:43:26 PDT 149533077 {getDate=12, getDay=2, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=4718745980210606464, getTimezoneOffset=420, getYear=149531177}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1903 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-2114352000000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true), new String[][]{{"setDate", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Feb 01 09:43:26 PST 190690354 {getDate=1, getDay=1, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544183577406464, getTimezoneOffset=480, getYear=190688454}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86395904"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 277086255 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=8743935486073406464, getTimezoneOffset=480, getYear=277084355}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-16776214"}, true), new String[][]{{"getTime", "", "0"}, {"getSeconds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "140000028"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Sep 28 06:07:08 PDT 2685052 {getDate=28, getDay=2, getHours=6, getMinutes=7, getMonth=8, getSeconds=8, getTime=84669913314428000, getTimezoneOffset=420, getYear=2683152}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:7>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "474"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147352319"}, true), new String[][]{{"getYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("190692533", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-34"}, true), new String[][]{{"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:26:01 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=26, getMonth=11, getSeconds=1, getTime=-2038994, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jan 01 00:00:00 PST 2027 {getDate=1, getDay=5, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1798790400000, getTimezoneOffset=480, getYear=127}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "28"}, true), new String[][]{{"getDate", "", "5"}, {"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 04 16:00:28 PST 1969 {getDate=4, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=28, getTime=-2332771999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "5"}, true), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 00:00:00 PST 5 {getDate=31, getDay=4, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-61978060799999, getTimezoneOffset=480, getYear=-1895}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1073676287"}, true), new String[][]{{"clone", "", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 29 05:47:00 PDT 4011 {getDate=29, getDay=0, getHours=5, getMinutes=47, getMonth=4, getSeconds=0, getTime=64420577220005, getTimezoneOffset=420, getYear=2111}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "9"}, true), new String[][]{{"getDate", "", "3"}, {"getTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("23583600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "988"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "23"}, true), new String[][]{{"toLocaleString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jul 31, 190690351, 9:43:26 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-16440"}, true), new String[][]{{"setMonth", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 05:06:00 PST 14539 {getDate=4, getDay=0, getHours=5, getMinutes=6, getMonth=0, getSeconds=0, getTime=-520951431240000, getTimezoneOffset=480, getYear=12639}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "1000"}, true), new String[][]{{"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 1000 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-30578169599994, getTimezoneOffset=480, getYear=-900}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "501"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 25 02:06:00 PST 1902 {getDate=25, getDay=5, getHours=2, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2136030840000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "467"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Apr 12 16:00:00 PST 1971 {getDate=12, getDay=1, getHours=16, getMinutes=0, getMonth=3, getSeconds=0, getTime=40348800001, getTimezoneOffset=480, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.1234567990123456", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "280000000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 11:12:00 PST 1908 {getDate=10, getDay=6, getHours=11, getMinutes=12, getMonth=9, getSeconds=0, getTime=-1932094080000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147352543"}, true, 0, null, 2), new String[][]{{"toGMTString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("24 Oct 6052 01:03:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147483647"}, true), new String[][]{{"getSeconds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "23129090"}, true), new String[][]{{"getHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147352575"}, true), new String[][]{{"toLocaleString", "", "7"}, {"setTime", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"The field GMT", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:8>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:7>", "<sample:4>", "-260641151"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "1000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "23"}, true), new String[][]{{"after", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true), new String[][]{{"getGreatestMinimum", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1064"}, true, 0, null, 3), new String[][]{{"setMonth", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 23 16:00:00 PST 1990 {getDate=23, getDay=5, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=638236800000, getTimezoneOffset=480, getYear=90}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:4>", "<sample:5>", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "2147352575"}, true), new String[][]{{"getDay", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:8>", "11"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 31 16:00:00 PDT 1970 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=4, getSeconds=0, getTime=13042800000, getTimezoneOffset=420, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 09 00:00:00 PST 1907 {getDate=9, getDay=1, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=-1966435200000, getTimezoneOffset=480, getYear=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:14>", "1000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1"}, true), new String[][]{{"getMonth", "", "4"}, {"toLocaleString", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan 1, 2027, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Nov 16 09:43:26 PST 190690353 {getDate=16, getDay=1, getHours=9, getMinutes=43, getMonth=10, getSeconds=26, getTime=6017544176924606464, getTimezoneOffset=480, getYear=190688453}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "560000002"}, true), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "560000114"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "74"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:9>", "<sample:5>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "34"}, true, 0, null, 3), new String[][]{{"getDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{".", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-2147483648"}, true), new String[][]{{"after", "java.util.Date", "1"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6636", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "11564601"}, true), new String[][]{{"getSeconds", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86399999"}, true), new String[][]{{"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("+86399999-02-20T17:43:26.464Z {getEpochSecond=2726458458428606, getNano=464000000}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "68"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "0"}, true), new String[][]{{"getTimezoneOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:5>", "<sample:9>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
