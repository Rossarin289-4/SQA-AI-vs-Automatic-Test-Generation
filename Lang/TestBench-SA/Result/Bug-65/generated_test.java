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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:00:00 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=0, getMonth=11, getSeconds=0, getTime=-3599999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "2"}, true), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#665103516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:b>", "3600001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Sep 30 16:00:00 PDT 1969 {getDate=30, getDay=2, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=-7952399999, getTimezoneOffset=420, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 16 03:40:00 PDT 2502 {getDate=16, getDay=2, getHours=3, getMinutes=40, getMonth=4, getSeconds=0, getTime=16800000000001, getTimezoneOffset=420, getYear=602}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86399999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "12"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:a>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "59956"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "172799998"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 01 09:43:26 PDT 194002123 {getDate=1, getDay=2, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=6122053529311406464, getTimezoneOffset=420, getYear=194000223}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 30 05:01:01 PST 203167161 {getDate=30, getDay=0, getHours=5, getMinutes=1, getMonth=4, getSeconds=1, getTime=-6411530122801138688, getTimezoneOffset=480, getYear=203165261}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:10 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=10, getTime=10005, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{".b", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "477"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{":,a,+B1.1234567", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "4"}, true), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "30"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "560000030"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "14"}, true), new String[][]{{"getGreatestMinimum", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1001"}, true), new String[][]{{"setDate", "int", "1"}, {"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "1001"}, true), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Nov 16 00:00:00 PST 1909 {getDate=16, getDay=2, getHours=0, getMinutes=0, getMonth=10, getSeconds=0, getTime=-1897401600000, getTimezoneOffset=480, getYear=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "9"}, true, 0, null, 1), new String[][]{{"clone", "", "2"}, {"getMonth", "", "5"}, {"setTime", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "9"}, true), new String[][]{{"getWeekYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "13"}, true, 0, null, 1), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:17>", "3"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 3), new String[][]{{"hasNext", "", "6"}, {"next", "", "2"}, {"getMinimalDaysInFirstWeek", "", "1"}, {"getCalendarType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gregory", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<i:2>", "-2004"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#665103516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:1b>", "3600001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "3599999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "59974"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "106"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 17:46:00 PST 1969 {getDate=31, getDay=3, getHours=17, getMinutes=46, getMonth=11, getSeconds=0, getTime=6360005, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "106"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 12:58:00 PST 1908 {getDate=10, getDay=6, getHours=12, getMinutes=58, getMonth=9, getSeconds=0, getTime=-1932087720000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "53"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:53:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=53, getMonth=11, getSeconds=0, getTime=3180000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 25 16:00:00 PDT 5368267 {getDate=25, getDay=3, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=169343999996400001, getTimezoneOffset=420, getYear=5366367}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280000042"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 15 16:00:00 PDT 5368268 {getDate=15, getDay=3, getHours=16, getMinutes=0, getMonth=6, getSeconds=0, getTime=169344025398000000, getTimezoneOffset=420, getYear=5366368}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "279999995"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 20 09:43:26 PST 214023684 {getDate=20, getDay=4, getHours=9, getMinutes=43, getMonth=0, getSeconds=26, getTime=6753872957391806464, getTimezoneOffset=480, getYear=214021784}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "279999995"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Nov 30 16:00:00 PST 23335302 {getDate=30, getDay=4, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=736328866780800001, getTimezoneOffset=480, getYear=23333402}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "559999990"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 31 16:00:00 PDT 46668635 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=1472657733644400001, getTimezoneOffset=420, getYear=46666735}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "560000246"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Feb 28 16:00:00 PST 46668657 {getDate=28, getDay=6, getHours=16, getMinutes=0, getMonth=1, getSeconds=0, getTime=1472658406790400001, getTimezoneOffset=480, getYear=46666757}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1120000492"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 05 06:07:08 PDT 93335277 {getDate=5, getDay=0, getHours=6, getMinutes=7, getMonth=8, getSeconds=8, getTime=2945314710479228000, getTimezoneOffset=420, getYear=93333377}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "560000246"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jul 05 06:07:08 PDT 46668590 {getDate=5, getDay=1, getHours=6, getMinutes=7, getMonth=6, getSeconds=8, getTime=1472656303429628000, getTimezoneOffset=420, getYear=46666690}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "560000246"}, true, 0, null, 1), new String[][]{{"setMonth", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 05 06:07:08 PST 46668590 {getDate=5, getDay=5, getHours=6, getMinutes=7, getMonth=2, getSeconds=8, getTime=1472656292892428000, getTimezoneOffset=480, getYear=46666690}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "568388854"}, true, 0, null, 1), new String[][]{{"setMonth", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 05 06:07:08 PST 47367641 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=2, getSeconds=8, getTime=1494716211756428000, getTimezoneOffset=480, getYear=47365741}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 20:00:00 PST 1969 {getDate=31, getDay=3, getHours=20, getMinutes=0, getMonth=11, getSeconds=0, getTime=14400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true, 0, null, 1), new String[][]{{"setYear", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 20:00:00 PST 1903 {getDate=31, getDay=4, getHours=20, getMinutes=0, getMonth=11, getSeconds=0, getTime=-2082830400000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-4"}, true, 0, null, 1), new String[][]{{"setYear", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 12:00:00 PST 1903 {getDate=31, getDay=4, getHours=12, getMinutes=0, getMonth=11, getSeconds=0, getTime=-2082859200000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-4"}, true, 0, null, 1), new String[][]{{"setYear", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 04 01:06:00 PST 1903 {getDate=4, getDay=6, getHours=1, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2106312840000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 01:06:00 PST 1902 {getDate=4, getDay=5, getHours=1, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137848840000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 05:43:26 PST 190690351 {getDate=20, getDay=2, getHours=5, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090510206464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Nov 28 16:43:26 PST 190935334 {getDate=28, getDay=0, getHours=16, getMinutes=43, getMonth=10, getSeconds=26, getTime=6025275031653806464, getTimezoneOffset=480, getYear=190933434}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-29987"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:b>", "2113929159"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "1001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:16:41 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=16, getMonth=11, getSeconds=41, getTime=1001006, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "5", "1"}, true, 0, null, 2), new String[][]{{"getHours", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "86400001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "172799998"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 22 18:07:00 PST 6053 {getDate=22, getDay=3, getHours=18, getMinutes=7, getMonth=0, getSeconds=0, getTime=128849018820000, getTimezoneOffset=480, getYear=4153}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 16 03:40:00 PDT 2502 {getDate=16, getDay=2, getHours=3, getMinutes=40, getMonth=4, getSeconds=0, getTime=16800000000001, getTimezoneOffset=420, getYear=602}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "280000000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "279999956"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 16 02:56:00 PDT 2502 {getDate=16, getDay=2, getHours=2, getMinutes=56, getMonth=4, getSeconds=0, getTime=16799997360005, getTimezoneOffset=420, getYear=602}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "279999956"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 21 21:08:00 PST 2441 {getDate=21, getDay=4, getHours=21, getMinutes=8, getMonth=1, getSeconds=0, getTime=14867903280000, getTimezoneOffset=480, getYear=541}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "288388564"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 02 20:04:00 PST 2456 {getDate=2, getDay=0, getHours=20, getMinutes=4, getMonth=0, getSeconds=0, getTime=15336878640000, getTimezoneOffset=480, getYear=556}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "288388526"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Feb 03 06:38:00 PST 2457 {getDate=3, getDay=6, getHours=6, getMinutes=38, getMonth=1, getSeconds=0, getTime=15371217480000, getTimezoneOffset=480, getYear=557}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-3"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "6"}, {"getTime", "", "4"}, {"getSeconds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "6"}, {"getTime", "", "4"}, {"setTime", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=4, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"123456789012345678901234567890", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "172799952"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 31 12:43:26 PST 190690351 {getDate=31, getDay=3, getHours=12, getMinutes=43, getMonth=0, getSeconds=26, getTime=6017544088807406464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Mar 31 03:43:26 PDT 190690351 {getDate=31, getDay=6, getHours=3, getMinutes=43, getMonth=2, getSeconds=26, getTime=6017544093869006464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "938"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 28 12:43:26 PST 190690351 {getDate=28, getDay=3, getHours=12, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544091226606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "898"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 31 02:00:00 PST 1970 {getDate=31, getDay=6, getHours=2, getMinutes=0, getMonth=0, getSeconds=0, getTime=2628000000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "954"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 31 10:00:00 PST 1970 {getDate=31, getDay=6, getHours=10, getMinutes=0, getMonth=0, getSeconds=0, getTime=2656800001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Sep 30 00:00:00 PDT 246953 {getDate=30, getDay=0, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=7730940351600001, getTimezoneOffset=420, getYear=245053}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2143289343"}, true, 0, null, 3), new String[][]{{"getMinutes", "", "4"}, {"after", "java.util.Date", "3"}, {"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Mar 31 08:00:00 PDT 246475 {getDate=31, getDay=0, getHours=8, getMinutes=0, getMonth=2, getSeconds=0, getTime=7715840338800001, getTimezoneOffset=420, getYear=244575}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "3"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "6"}, true), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#665103516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "104"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 30 16:00:00 PDT 1970 {getDate=30, getDay=4, getHours=16, getMinutes=0, getMonth=3, getSeconds=0, getTime=10364400001, getTimezoneOffset=420, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jun 20 09:43:26 PDT 190690351 {getDate=20, getDay=3, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=6017544100889006464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Aug 31 16:00:00 PDT 1969 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=7, getSeconds=0, getTime=-10544399999, getTimezoneOffset=420, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-67"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 31 16:00:00 PDT 1964 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=4, getSeconds=0, getTime=-176259600000, getTimezoneOffset=420, getYear=64}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "172799998"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147483617"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "280000000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:10:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=10, getMonth=11, getSeconds=0, getTime=600005, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-53"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:07:00 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=7, getMonth=11, getSeconds=0, getTime=-3179995, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "-53"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 10:19:00 PST 1908 {getDate=10, getDay=6, getHours=10, getMinutes=19, getMonth=9, getSeconds=0, getTime=-1932097260000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "-106"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 09:26:00 PST 1908 {getDate=10, getDay=6, getHours=9, getMinutes=26, getMonth=9, getSeconds=0, getTime=-1932100440000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "106"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 10 12:58:00 PST 1908 {getDate=10, getDay=6, getHours=12, getMinutes=58, getMonth=9, getSeconds=0, getTime=-1932087720000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "106"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 17:46:00 PST 1969 {getDate=31, getDay=3, getHours=17, getMinutes=46, getMonth=11, getSeconds=0, getTime=6360005, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"a", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"2", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"elko, Woorld", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 02 16:00:00 PST 238525 {getDate=2, getDay=5, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=7464960086400001, getTimezoneOffset=480, getYear=236625}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "86400001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 22 09:43:26 PDT 190926906 {getDate=22, getDay=4, getHours=9, getMinutes=43, getMonth=3, getSeconds=26, getTime=6025009050607406464, getTimezoneOffset=420, getYear=190925006}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1002"}, true), new String[][]{{"setMonth", "int", "4"}, {"after", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 03 16:00:00 PST 3119 {getDate=3, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=36288000000000, getTimezoneOffset=480, getYear=1219}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "12"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280000042"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 15 16:00:00 PDT 5368268 {getDate=15, getDay=3, getHours=16, getMinutes=0, getMonth=6, getSeconds=0, getTime=169344025398000000, getTimezoneOffset=420, getYear=5366368}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-280000042"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Aug 13 16:00:00 PST 5364220 {getDate=13, getDay=3, getHours=16, getMinutes=0, getMonth=7, getSeconds=0, getTime=-169344025401600000, getTimezoneOffset=480, getYear=5362320}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "280000042"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Sep 04 09:43:26 PDT 196056649 {getDate=4, getDay=2, getHours=9, getMinutes=43, getMonth=8, getSeconds=26, getTime=6186888115922606464, getTimezoneOffset=420, getYear=196054749}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-280000042"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280000001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu May 31 16:00:00 PDT 23335303 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=4, getSeconds=0, getTime=736328882502000000, getTimezoneOffset=420, getYear=23333403}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "279999941"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 31 16:00:00 PDT 23335298 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=4, getSeconds=0, getTime=736328724822000000, getTimezoneOffset=420, getYear=23333398}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 20:00:00 PST 1969 {getDate=31, getDay=3, getHours=20, getMinutes=0, getMonth=11, getSeconds=0, getTime=14400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:07:15 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=4, getSeconds=15, getTime=-2103616365000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 16 02:53:00 PST 1835 {getDate=16, getDay=4, getHours=2, getMinutes=53, getMonth=3, getSeconds=0, getTime=-4251100020000, getTimezoneOffset=480, getYear=-65}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 23 10:21:15 PDT 1971 {getDate=23, getDay=0, getHours=10, getMinutes=21, getMonth=4, getSeconds=15, getTime=43867275000, getTimezoneOffset=420, getYear=71}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 31 16:00:00 PST 1966 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-94694400000, getTimezoneOffset=480, getYear=66}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1073741810"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 28 23:20:16 PST 190690385 {getDate=28, getDay=4, getHours=23, getMinutes=20, getMonth=1, getSeconds=16, getTime=6017545164266416464, getTimezoneOffset=480, getYear=190688485}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "5"}, true), new String[][]{{"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true), new String[][]{{"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-262102"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 260134 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-8271308995199999, getTimezoneOffset=480, getYear=258234}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:1>", "5", "280000001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 18 16:00:00 PST 768583 {getDate=18, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=24192000086400000, getTimezoneOffset=480, getYear=766683}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "5", "280000001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 06 09:43:26 PST 191456965 {getDate=6, getDay=3, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6041736090611006464, getTimezoneOffset=480, getYear=191455065}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "5", "280000001"}, true), new String[][]{{"getHours", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "10"}, true), new String[][]{{"getDay", "", "4"}, {"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6048000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2147483648"}, true), new String[][]{{"before", "java.util.Date", "6"}, {"getTime", "", "4"}, {"setTime", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=4, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1791057600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#1572937617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:b>", "1001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 30 16:00:00 PST 1969 {getDate=30, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-86399999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true), new String[][]{{"compareTo", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "59999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:59 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=59, getTime=59999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "59999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:01:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=1, getMonth=11, getSeconds=0, getTime=60004, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "119998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:02:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=2, getMonth=11, getSeconds=0, getTime=120003, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "119998"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:02:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=2, getMonth=11, getSeconds=0, getTime=120003, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "119998"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:01:59 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=1, getMonth=11, getSeconds=59, getTime=119999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "153790"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:09:41 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=9, getMonth=4, getSeconds=41, getTime=-2103616218210, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "153844"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:09:41 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=9, getMonth=4, getSeconds=41, getTime=-2103616218156, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-153844"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:04:34 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=4, getMonth=4, getSeconds=34, getTime=-2103616525844, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-153844"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:57:26 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=57, getMonth=11, getSeconds=26, getTime=-153839, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-153844"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 1), new String[][]{{"after", "java.util.Date", "6"}, {"toLocaleString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan 25, 1970, 12:31:23 PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "0", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "0", "86400001"}, true), new String[][]{{"setTime", "long", "6"}, {"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "256", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:4>", "-1020"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "4"}, true), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "1000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5e300", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5e300", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-1>", "3600000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:0>", "2", "-3"}, true, 0, null, 2), new String[][]{{"setDate", "int", "6"}, {"setSeconds", "int", "3"}, {"getTimezoneOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "280000000"}, true, 0, null, 1), new String[][]{{"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Nov 15 09:01:40 PST 1978 {getDate=15, getDay=3, getHours=9, getMinutes=1, getMonth=10, getSeconds=40, getTime=279997300005, getTimezoneOffset=480, getYear=78}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "140000000"}, true, 0, null, 1), new String[][]{{"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jun 09 01:01:20 PDT 1974 {getDate=9, getDay=0, getHours=1, getMinutes=1, getMonth=5, getSeconds=20, getTime=139996880006, getTimezoneOffset=420, getYear=74}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2147483647"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 06 19:27:59 PST 1969 {getDate=6, getDay=6, getHours=19, getMinutes=27, getMonth=11, getSeconds=59, getTime=-2147520647, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-2147483648"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 10 08:33:59 PST 1902 {getDate=10, getDay=1, getHours=8, getMinutes=33, getMonth=2, getSeconds=59, getTime=-2139981960648, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-536870912"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 28 23:57:59 PST 1902 {getDate=28, getDay=5, getHours=23, getMinutes=57, getMonth=2, getSeconds=59, getTime=-2138371320912, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1073741824"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Mar 22 18:49:59 PST 1902 {getDate=22, getDay=6, getHours=18, getMinutes=49, getMonth=2, getSeconds=59, getTime=-2138908200824, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-1073741824"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 19 05:43:59 PST 1969 {getDate=19, getDay=5, getHours=5, getMinutes=43, getMonth=11, getSeconds=59, getTime=-1073760819, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3599999"}, true, 0, null, 3), new String[][]{{"getTimezoneOffset", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 06:04:59 PST 1902 {getDate=4, getDay=5, getHours=6, getMinutes=4, getMonth=3, getSeconds=59, getTime=-2137830900001, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "7794303"}, true, 0, null, 3), new String[][]{{"getDay", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 07:14:59 PST 1902 {getDate=4, getDay=5, getHours=7, getMinutes=14, getMonth=3, getSeconds=59, getTime=-2137826700697, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "7794303"}, true, 0, null, 3), new String[][]{{"getDay", "", "0"}, {"setSeconds", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 11:52:59 PST 190690351 {getDate=20, getDay=2, getHours=11, getMinutes=52, getMonth=1, getSeconds=59, getTime=6017544090532379767, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "279999999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-279999999"}, true, 0, null, 3), new String[][]{{"setYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 21 01:43:26 PST 190690351 {getDate=21, getDay=5, getHours=1, getMinutes=43, getMonth=11, getSeconds=26, getTime=6017544116761406469, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3"}, true), new String[][]{{"hasNext", "", "5"}, {"next", "", "7"}, {"clear", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,t...#951#1039276335", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1"}, true, 0, null, 2), new String[][]{{"setHours", "int", "3"}, {"getHours", "", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 04 01:06:00 PST 1903 {getDate=4, getDay=6, getHours=1, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2106312840000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "67108865"}, true, 0, null, 2), new String[][]{{"setHours", "int", "3"}, {"getHours", "", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 04 01:06:00 PDT 67110767 {getDate=4, getDay=2, getHours=1, getMinutes=6, getMonth=3, getSeconds=0, getTime=2117749093747560000, getTimezoneOffset=420, getYear=67108867}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "67108865"}, true, 0, null, 2), new String[][]{{"setHours", "int", "3"}, {"getHours", "", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Feb 20 01:43:26 PST 257799216 {getDate=20, getDay=6, getHours=1, getMinutes=43, getMonth=1, getSeconds=26, getTime=8135295322095806464, getTimezoneOffset=480, getYear=257797316}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 2), new String[][]{{"setHours", "int", "3"}, {"getHours", "", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon May 30 01:01:01 PST 203167160 {getDate=30, getDay=1, getHours=1, getMinutes=1, getMonth=4, getSeconds=1, getTime=-6411530091279538688, getTimezoneOffset=480, getYear=203165260}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 28 07:35:26 PST 190686268 {getDate=28, getDay=2, getHours=7, getMinutes=35, getMonth=0, getSeconds=26, getTime=6017415241505726464, getTimezoneOffset=480, getYear=190684368}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "5"}, true), new String[][]{{"setMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 00:02:00 PST 1903 {getDate=5, getDay=2, getHours=0, getMinutes=2, getMonth=4, getSeconds=0, getTime=-2103638280000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 280001970 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8835946591536000001, getTimezoneOffset=480, getYear=280000070}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-694217755"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 02 06:25:51 PST 109673740 {getDate=2, getDay=0, getHours=6, getMinutes=25, getMonth=1, getSeconds=51, getTime=-3461102150376848379, getTimezoneOffset=480, getYear=109671840}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "2"}, true), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:key>", "118"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "2", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 01 00:00:00 PST 1902 {getDate=1, getDay=2, getHours=0, getMinutes=0, getMonth=3, getSeconds=0, getTime=-2138112000000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "0"}, true), new String[][]{{"setYear", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 01 00:00:00 PST 1900 {getDate=1, getDay=1, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-2208960000000, getTimezoneOffset=480, getYear=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "0"}, true, 0, null, 1), new String[][]{{"setYear", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 01 00:00:00 PST 1900 {getDate=1, getDay=1, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-2208960000000, getTimezoneOffset=480, getYear=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "0"}, true, 0, null, 1), new String[][]{{"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62135740800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 1), new String[][]{{"getDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "5"}, true, 0, null, 1), new String[][]{{"getDay", "", "1"}, {"getTimezoneOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "5"}, true, 0, null, 1), new String[][]{{"getDay", "", "1"}, {"getTimezoneOffset", "", "2"}, {"after", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "4"}, true), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:13>", "-956"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "560000030"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 30 04:33:50 PDT 1987 {getDate=30, getDay=3, getHours=4, getMinutes=33, getMonth=8, getSeconds=50, getTime=560000030005, getTimezoneOffset=420, getYear=87}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 00:00:00 PST 1902 {getDate=4, getDay=5, getHours=0, getMinutes=0, getMonth=3, getSeconds=0, getTime=-2137852800000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 26 13:52:00 PST 2115 {getDate=26, getDay=3, getHours=13, getMinutes=52, getMonth=11, getSeconds=0, getTime=-128849018879995, getTimezoneOffset=480, getYear=215}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 22 18:07:00 PST 6053 {getDate=22, getDay=3, getHours=18, getMinutes=7, getMonth=0, getSeconds=0, getTime=128849018820005, getTimezoneOffset=480, getYear=4153}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1073741823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 13 18:03:00 PDT 4011 {getDate=13, getDay=3, getHours=18, getMinutes=3, getMonth=6, getSeconds=0, getTime=64424509380005, getTimezoneOffset=420, getYear=2111}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1073741823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Sep 01 11:46:26 PDT 190692392 {getDate=1, getDay=2, getHours=11, getMinutes=46, getMonth=8, getSeconds=26, getTime=6017608515033986464, getTimezoneOffset=420, getYear=190690492}", SearchInputFactory_scaffolding.observe(actual));
 }
}
