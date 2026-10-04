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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:a>", "280000000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280000000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 280001969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8835946560000000000, getTimezoneOffset=480, getYear=280000069}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "19"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "26"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "3599999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 03 01:43:26 PDT 190690351 {getDate=3, getDay=2, getHours=1, getMinutes=43, getMonth=3, getSeconds=26, getTime=6017544094121006464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 22 18:07:00 PST 6053 {getDate=22, getDay=3, getHours=18, getMinutes=7, getMonth=0, getSeconds=0, getTime=128849018820001, getTimezoneOffset=480, getYear=4153}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<i:2>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 16:00:00 PST 1970 {getDate=1, getDay=4, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=86400001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.1234567", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-1>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 27 16:00:00 PDT 1972 {getDate=27, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=86482800000, getTimezoneOffset=420, getYear=72}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Nov 30 16:00:00 PST 1969 {getDate=30, getDay=0, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=-2678399999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "86400001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"2020-02.30T25:61:61null", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1d5", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "4"}, true), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=6017544090230400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,us...#985#-1457852987", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 3), new String[][]{{"hasNext", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "5"}, true), new String[][]{{"hasNext", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-2145386496"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 12:00:00 PST 1969 {getDate=31, getDay=3, getHours=12, getMinutes=0, getMonth=11, getSeconds=0, getTime=-14400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "9"}, true), new String[][]{{"setYear", "int", "5"}, {"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true), new String[][]{{"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 04 00:00:00 PST 1970 {getDate=4, getDay=0, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=288000000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "14"}, true), new String[][]{{"setWeekDate", "int,int,int", "6"}, {"getFirstDayOfWeek", "", "0"}, {"getGreatestMinimum", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "12"}, true), new String[][]{{"before", "java.util.Date", "7"}, {"getDate", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true, 0, null, 2), new String[][]{{"getYear", "", "1"}, {"getDay", "", "6"}, {"compareTo", "java.util.Date", "7"}, {"getTimezoneOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "1001"}, true), new String[][]{{"getYear", "", "0"}, {"after", "java.util.Date", "6"}, {"compareTo", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "13"}, true, 0, null, 2), new String[][]{{"set", "int,int,int", "1"}, {"clear", "", "1"}, {"getDisplayName", "int,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("CE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "7200002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 01 00:00:00 PDT 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1790838000000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3599999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1903 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-2114352000000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86399999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 11 09:43:26 PDT 192346237 {getDate=11, getDay=2, getHours=9, getMinutes=43, getMonth=3, getSeconds=26, getTime=6069798809916206464, getTimezoneOffset=420, getYear=192344337}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "86399999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 23 06:07:08 PDT 1657789 {getDate=23, getDay=2, getHours=6, getMinutes=7, getMonth=5, getSeconds=8, getTime=52252615775228000, getTimezoneOffset=420, getYear=1655889}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "86399999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 23 05:06:00 PDT 1657788 {getDate=23, getDay=5, getHours=5, getMinutes=6, getMonth=4, getSeconds=0, getTime=52252581557160000, getTimezoneOffset=420, getYear=1655888}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86399999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 20 16:00:00 PST 1657856 {getDate=20, getDay=3, getHours=16, getMinutes=0, getMonth=1, getSeconds=0, getTime=52254719395200000, getTimezoneOffset=480, getYear=1655956}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "43199999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 22 16:00:00 PST 829913 {getDate=22, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=26127359395200000, getTimezoneOffset=480, getYear=828013}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "43199999"}, true, 0, null, 3), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "10"}, true, 0, null, 3), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86399999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 86401968 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2726520621264000000, getTimezoneOffset=480, getYear=86400068}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1"}, true, 0, null, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" ic not valid.", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "60000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "12"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("185540449262760000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3600001"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("308902248360000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3600016"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("308903544360000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3600016"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6017855131903406464", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3600016"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("311041378800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3599969"}, true, 0, null, 1), new String[][]{{"getYear", "", "6"}, {"getTimezoneOffset", "", "1"}, {"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("311037318000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:4>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "1001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:XB>", "3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Nov 16 09:43:27 PST 190690353 {getDate=16, getDay=1, getHours=9, getMinutes=43, getMonth=10, getSeconds=27, getTime=6017544176924607464, getTimezoneOffset=480, getYear=190688453}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true, 0, null, 2), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86268929"}, true, 0, null, 2), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "172537858"}, true, 0, null, 2), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "172537860"}, true, 0, null, 2), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 2), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3599999"}, true, 0, null, 3), new String[][]{{"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3599999"}, true, 0, null, 3), new String[][]{{"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147483644"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-1073741824"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1073741824"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1069547520"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1069547520"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 13 01:05:47 PST 1970 {getDate=13, getDay=2, getHours=1, getMinutes=5, getMonth=0, getSeconds=47, getTime=1069547520, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1069547574"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Mar 04 18:49:14 PST 190690351 {getDate=4, getDay=0, getHours=18, getMinutes=49, getMonth=2, getSeconds=14, getTime=6017544091594154038, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1069547574"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 17 15:12:55 PST 1903 {getDate=17, getDay=0, getHours=15, getMinutes=12, getMonth=4, getSeconds=55, getTime=-2102546824426, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "279999999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 18 16:00:00 PDT 5368267 {getDate=18, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=169343999391600000, getTimezoneOffset=420, getYear=5366367}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "559999916"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Nov 09 16:00:00 PST 10734563 {getDate=9, getDay=3, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=338687949196800001, getTimezoneOffset=480, getYear=10732663}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "279999958"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 05 16:00:00 PST 5368266 {getDate=5, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=169343974598400001, getTimezoneOffset=480, getYear=5366366}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:03:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=3, getMonth=11, getSeconds=0, getTime=180000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "7199998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 23 09:43:26 PST 190710064 {getDate=23, getDay=3, getHours=9, getMinutes=43, getMonth=0, getSeconds=26, getTime=6018166170351806464, getTimezoneOffset=480, getYear=190708164}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "7199998"}, true, 0, null, 1), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 23 00:43:26 PST 190710064 {getDate=23, getDay=3, getHours=0, getMinutes=43, getMonth=0, getSeconds=26, getTime=6018166170319406464, getTimezoneOffset=480, getYear=190708164}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "142097152"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 03 08:25:52 PDT 1974 {getDate=3, getDay=3, getHours=8, getMinutes=25, getMonth=6, getSeconds=52, getTime=142097152001, getTimezoneOffset=420, getYear=74}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 00:00:00 PST 190690351 {getDate=20, getDay=2, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090489600000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280524288"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 280526257 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8852491491264000000, getTimezoneOffset=480, getYear=280524357}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "280524288"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Mar 09 19:17:34 PST 113337084 {getDate=9, getDay=3, getHours=19, getMinutes=17, getMonth=2, getSeconds=34, getTime=-3576708491920945152, getTimezoneOffset=480, getYear=113335184}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 31 16:00:00 PST 2969 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=31556995200000, getTimezoneOffset=480, getYear=1069}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 05 06:07:08 PDT 2903 {getDate=5, getDay=6, getHours=6, getMinutes=7, getMonth=4, getSeconds=8, getTime=29453375228000, getTimezoneOffset=420, getYear=1003}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Feb 20 09:43:26 PST 190691351 {getDate=20, getDay=6, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017575647519806464, getTimezoneOffset=480, getYear=190689451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 04 05:06:00 PDT 2902 {getDate=4, getDay=2, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=29419157160000, getTimezoneOffset=420, getYear=1002}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3600001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 02 16:00:00 PDT 41159243 {getDate=2, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=1298798109702000000, getTimezoneOffset=420, getYear=41157343}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1048566"}, true), new String[][]{{"getMonth", "", "7"}, {"toLocaleString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("May 22, 21998, 5:06:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1048566"}, true), new String[][]{{"getMonth", "", "7"}, {"toLocaleString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Feb 17, 22066, 4:00:00 PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-25"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Feb 19 08:43:26 PST 190690351 {getDate=19, getDay=1, getHours=8, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090434606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-38"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 18 19:43:26 PST 190690351 {getDate=18, getDay=0, getHours=19, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090387806464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-262163"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 25 23:43:26 PDT 190690321 {getDate=25, getDay=5, getHours=23, getMinutes=43, getMonth=2, getSeconds=26, getTime=6017543146737806464, getTimezoneOffset=420, getYear=190688421}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Nov 28 16:43:26 PST 190935334 {getDate=28, getDay=0, getHours=16, getMinutes=43, getMonth=10, getSeconds=26, getTime=6025275031653806464, getTimezoneOffset=480, getYear=190933434}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "536870911"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 29 16:43:26 PST 190751597 {getDate=29, getDay=3, getHours=16, getMinutes=43, getMonth=0, getSeconds=26, getTime=6019476825804206464, getTimezoneOffset=480, getYear=190749697}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3599999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 28 09:43:26 PDT 190690761 {getDate=28, getDay=6, getHours=9, getMinutes=43, getMonth=9, getSeconds=26, getTime=6017557050521006464, getTimezoneOffset=420, getYear=190688861}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 03 02:43:26 PDT 190690351 {getDate=3, getDay=2, getHours=2, getMinutes=43, getMonth=3, getSeconds=26, getTime=6017544094124606464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "280000001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" is not valid.", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.123456f7", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<null>", "2147483647", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600000"}, true), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-60117"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 00:00:00 PST 190690351 {getDate=20, getDay=2, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090489600000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "500"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 15 16:00:00 PDT 1971 {getDate=15, getDay=6, getHours=16, getMinutes=0, getMonth=4, getSeconds=0, getTime=43196400001, getTimezoneOffset=420, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "544"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jun 28 16:00:00 PDT 1971 {getDate=28, getDay=1, getHours=16, getMinutes=0, getMonth=5, getSeconds=0, getTime=46998000001, getTimezoneOffset=420, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "544"}, true), new String[][]{{"getYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("71", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-544"}, true), new String[][]{{"getYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("68", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2147483648"}, true), new String[][]{{"getYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5875621", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-2147483648"}, true), new String[][]{{"getYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5875565", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-2147483648"}, true), new String[][]{{"getYear", "", "6"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true), new String[][]{{"getYear", "", "6"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true), new String[][]{{"getSeconds", "", "3"}, {"getMonth", "", "4"}, {"setTime", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=3, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "86400033"}, true), new String[][]{{"getSeconds", "", "3"}, {"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "86400033"}, true), new String[][]{{"getSeconds", "", "3"}, {"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "-86400033"}, true), new String[][]{{"getSeconds", "", "3"}, {"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "-2147483648"}, true), new String[][]{{"getSeconds", "", "3"}, {"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Oct 31 16:00:00 PST 1969 {getDate=31, getDay=5, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=-5270399999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2"}, true), new String[][]{{"after", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-2"}, true), new String[][]{{"after", "java.util.Date", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2"}, true), new String[][]{{"after", "java.util.Date", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1"}, true), new String[][]{{"after", "java.util.Date", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "44"}, true), new String[][]{{"after", "java.util.Date", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("73", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "44"}, true), new String[][]{{"after", "java.util.Date", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"+1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Nov 16 09:43:27 PST 190690353 {getDate=16, getDay=1, getHours=9, getMinutes=43, getMonth=10, getSeconds=27, getTime=6017544176924607464, getTimezoneOffset=480, getYear=190688453}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60001"}, true), new String[][]{{"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:01 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=1, getTime=1000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 01 06:29:18 PST 190690283 {getDate=1, getDay=4, getHours=6, getMinutes=29, getMonth=1, getSeconds=18, getTime=6017541943040958464, getTimezoneOffset=480, getYear=190688383}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 13 12:45:52 PST 1901 {getDate=13, getDay=5, getHours=12, getMinutes=45, getMonth=11, getSeconds=52, getTime=-2147483647994, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "-2147483613"}, true), new String[][]{{"setSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 13 12:46:01 PST 1901 {getDate=13, getDay=5, getHours=12, getMinutes=46, getMonth=11, getSeconds=1, getTime=-2147483638994, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#959#-33800775", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "500"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "1001"}, true), new String[][]{{"getMaximum", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "26"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 10:09:26 PST 190690351 {getDate=20, getDay=2, getHours=10, getMinutes=9, getMonth=1, getSeconds=26, getTime=6017544090526166464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606469, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "5"}, true), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137834439995, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-26"}, true), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-26, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2147483648"}, true), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 06 19:28:36 PST 1969 {getDate=6, getDay=6, getHours=19, getMinutes=28, getMonth=11, getSeconds=36, getTime=-2147483648, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true), new String[][]{{"getMinutes", "", "4"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jan 26 13:12:02 PST 190690351 {getDate=26, getDay=5, getHours=13, getMinutes=12, getMonth=0, getSeconds=2, getTime=6017544088377122816, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 21 09:43:26 PDT 190926906 {getDate=21, getDay=3, getHours=9, getMinutes=43, getMonth=3, getSeconds=26, getTime=6025009050521006464, getTimezoneOffset=420, getYear=190925006}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "3599999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Aug 08 09:43:26 PDT 190700207 {getDate=8, getDay=6, getHours=9, getMinutes=43, getMonth=7, getSeconds=26, getTime=6017855130434606464, getTimezoneOffset=420, getYear=190698307}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "3599999"}, true), new String[][]{{"getMinutes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "6", "7199998"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 23 09:43:26 PST 190710064 {getDate=23, getDay=3, getHours=9, getMinutes=43, getMonth=0, getSeconds=26, getTime=6018166170351806464, getTimezoneOffset=480, getYear=190708164}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-316800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight...#959#-1230392182", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true), new String[][]{{"next", "", "7"}, {"compareTo", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Mar 01 00:00:00 PST 190690351 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=6017544091267200000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86399999"}, true, 0, null, 1), new String[][]{{"getMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true, 0, null, 1), new String[][]{{"getMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60000"}, true, 0, null, 1), new String[][]{{"getMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:Av>", "-1073758208"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 3), new String[][]{{"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147418111"}, true, 0, null, 3), new String[][]{{"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-60117"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "559999986"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "1"}, {"setDate", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jun 01 11:00:00 PDT 65854 {getDate=1, getDay=4, getHours=11, getMinutes=0, getMonth=5, getSeconds=0, getTime=2015997444000001, getTimezoneOffset=420, getYear=63954}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "627108867"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "1"}, {"setDate", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 01 20:00:00 PST 73510 {getDate=1, getDay=2, getHours=20, getMinutes=0, getMonth=2, getSeconds=0, getTime=2257589505600001, getTimezoneOffset=480, getYear=71610}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "0"}, true, 0, null, 2), new String[][]{{"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:03:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=3, getMonth=0, getSeconds=0, getTime=-62135740620000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "0"}, true), new String[][]{{"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:03:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=3, getMonth=0, getSeconds=0, getTime=-62135740620000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-58"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2"}, true, 0, null, 2), new String[][]{{"getMinutes", "", "1"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:41:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=41, getMonth=1, getSeconds=26, getTime=6017544090524486464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "14"}, true, 0, null, 2), new String[][]{{"getMinutes", "", "1"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:57:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=57, getMonth=1, getSeconds=26, getTime=6017544090525446464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "14"}, true, 0, null, 2), new String[][]{{"getMinutes", "", "1"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:14:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=14, getMonth=11, getSeconds=0, getTime=840001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "14"}, true, 0, null, 2), new String[][]{{"getMinutes", "", "1"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:20:00 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=20, getMonth=3, getSeconds=0, getTime=-2137833600000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "14"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Feb 16 00:00:00 PST 190690351 {getDate=16, getDay=5, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090144000000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 01 00:00:00 PDT 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1790838000000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 01 00:00:00 PST 1903 {getDate=1, getDay=5, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=-2103984000000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 16 00:00:00 PST 1969 {getDate=16, getDay=2, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1353600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1001"}, true, 0, null, 2), new String[][]{{"getSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 2), new String[][]{{"toLocaleString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan 1, 1969, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 01 00:00:00 PST 1969 {getDate=1, getDay=1, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-2649600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 00:00:00 PST 1969 {getDate=1, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-31507200000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "999"}, true, 0, null, 1), new String[][]{{"getTime", "", "2"}, {"compareTo", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-969"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true), new String[][]{{"before", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true), new String[][]{{"compareTo", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1001"}, true), new String[][]{{"compareTo", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483648"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "139064"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "139064"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:45:45 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=45, getMonth=1, getSeconds=45, getTime=6017544090524745528, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "278128"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:48:04 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=48, getMonth=1, getSeconds=4, getTime=6017544090524884592, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "139064"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:45:45 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=45, getMonth=1, getSeconds=45, getTime=6017544090524745528, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "139064"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "139064"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "139064"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "139064"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}, {"after", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "139041"}, true, 0, null, 2), new String[][]{{"getDate", "", "4"}, {"after", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "-60117"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:6>", "1073741765"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "7"}, true, 0, null, 3), new String[][]{{"toGMTString", "", "5"}, {"setMinutes", "int", "6"}, {"compareTo", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:1>", "-86400052", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1791097200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#970#-758187647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "2147483641"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:0>", "60000", "6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "5"}, true, 0, null, 3), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790492400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-547963711", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true, 0, null, 1), new String[][]{{"getTimezoneOffset", "", "0"}, {"after", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "20"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "20"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 21 05:43:26 PST 190690351 {getDate=21, getDay=3, getHours=5, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090596606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
}
