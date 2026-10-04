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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2130706431"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "-10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "-6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "86399744"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 05 05:05:59 PST 1902 {getDate=5, getDay=6, getHours=5, getMinutes=5, getMonth=3, getSeconds=59, getTime=-2137748040256, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<b:true>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 13 18:03:00 PDT 4011 {getDate=13, getDay=3, getHours=18, getMinutes=3, getMonth=6, getSeconds=0, getTime=64424509380001, getTimezoneOffset=420, getYear=2111}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "2147483642"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483609"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 18 19:13:29 PST 2038 {getDate=18, getDay=1, getHours=19, getMinutes=13, getMonth=0, getSeconds=29, getTime=2147483609001, getTimezoneOffset=480, getYear=138}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:2>", "-3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "20"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 20 16:00:00 PST 1970 {getDate=20, getDay=2, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=1728000005, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-536868910"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0100", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<empty>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "-3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "4"}, true), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"M0", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Feb 16 00:00:00 PST 190690351 {getDate=16, getDay=5, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090144000000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "6"}, true, 0, null, 2), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790578800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-2105150021", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:13>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 12:00:00 PST 1969 {getDate=31, getDay=3, getHours=12, getMinutes=0, getMonth=11, getSeconds=0, getTime=-14400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "13"}, true), new String[][]{{"getActualMinimum", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 00:00:00 PST 1902 {getDate=4, getDay=5, getHours=0, getMinutes=0, getMonth=3, getSeconds=0, getTime=-2137852800000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:15>", "3"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-1614528000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayl...#967#1857419191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true), new String[][]{{"setDate", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "1001"}, true), new String[][]{{"before", "java.util.Date", "7"}, {"setTime", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:16>", "9"}, true), new String[][]{{"getTimezoneOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "345599938"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "7200000"}, true, 0, null, 2), new String[][]{{"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("138117", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-2147483648"}, true, 0, null, 1), new String[][]{{"setTime", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "86399790"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-4>", "2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:4>", "59999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 13 12:45:53 PST 1901 {getDate=13, getDay=5, getHours=12, getMinutes=45, getMonth=11, getSeconds=53, getTime=-2147483646999, getTimezoneOffset=480, getYear=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "279999999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true, 0, null, 3), new String[][]{{"setHours", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 01:43:29 PST 190690351 {getDate=20, getDay=2, getHours=1, getMinutes=43, getMonth=1, getSeconds=29, getTime=6017544090495809464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:06 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=6, getTime=-2137834434000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "337211330"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "524291"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "345599938"}, true, 0, null, 1), new String[][]{{"setMonth", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 08 02:00:00 PST 41395 {getDate=8, getDay=0, getHours=2, getMinutes=0, getMonth=1, getSeconds=0, getTime=1244136189600001, getTimezoneOffset=480, getYear=39495}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-1001"}, true, 0, null, 3), new String[][]{{"setMonth", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 19 17:02:26 PST 190690350 {getDate=19, getDay=2, getHours=17, getMinutes=2, getMonth=11, getSeconds=26, getTime=6017544085107746464, getTimezoneOffset=480, getYear=190688450}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:a>", "280000001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2146959338"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "280000061"}, true, 0, null, 2), new String[][]{{"getMonth", "", "2"}, {"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("420", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-6"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "12"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-16777241"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 06 19:28:36 PST 1969 {getDate=6, getDay=6, getHours=19, getMinutes=28, getMonth=11, getSeconds=36, getTime=-2147483647, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "345599938"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Feb 05 14:58:00 PST 2627 {getDate=5, getDay=1, getHours=14, getMinutes=58, getMonth=1, getSeconds=0, getTime=20735996280005, getTimezoneOffset=480, getYear=727}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "131072"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 01 16:32:00 PST 1970 {getDate=1, getDay=3, getHours=16, getMinutes=32, getMonth=3, getSeconds=0, getTime=7864320006, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"Could not round ", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:`>", "172800002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<null>", "-2147483647", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 12 05:06:00 PDT 5881512 {getDate=12, getDay=6, getHours=5, getMinutes=6, getMonth=9, getSeconds=0, getTime=185540449262760000, getTimezoneOffset=420, getYear=5879612}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<empty>", "2147483647", "72891135"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<d:1.5>", "-65516"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "-536868940"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "7"}, {"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57319", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<s:X>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-5"}, true, 0, null, 2), new String[][]{{"getSeconds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "103177217"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 12:43:26 PST 190690351 {getDate=20, getDay=2, getHours=12, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090535406464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "10"}, true, 0, null, 1), new String[][]{{"getMaximum", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "82"}, true, 0, null, 3), new String[][]{{"getDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 03 05:06:00 PST 1902 {getDate=3, getDay=4, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137920840000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 13 02:15:41 PST 1970 {getDate=13, getDay=2, getHours=2, getMinutes=15, getMonth=0, getSeconds=41, getTime=1073741824, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.5d", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.12345678901234561.5d", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1002"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "0"}, true, 0, null, 3), new String[][]{{"isWeekDateSupported", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "2"}, true, 0, null, 3), new String[][]{{"add", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 08:40:00 PST 1970 {getDate=1, getDay=4, getHours=8, getMinutes=40, getMonth=0, getSeconds=0, getTime=60000000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "280000001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "12"}, true, 0, null, 2), new String[][]{{"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147417599"}, true, 0, null, 1), new String[][]{{"toLocaleString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Mar 28, 246946, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 22 08:20:07 PST 1970 {getDate=22, getDay=3, getHours=8, getMinutes=20, getMonth=3, getSeconds=7, getTime=9649207000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "172800002"}, true, 0, null, 3), new String[][]{{"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6471964204418606464", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 3), new String[][]{{"setMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 28 07:01:26 PST 190686268 {getDate=28, getDay=2, getHours=7, getMinutes=1, getMonth=0, getSeconds=26, getTime=6017415241503686464, getTimezoneOffset=480, getYear=190684368}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1073741821"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 13 18:01:00 PDT 4011 {getDate=13, getDay=3, getHours=18, getMinutes=1, getMonth=6, getSeconds=0, getTime=64424509260000, getTimezoneOffset=420, getYear=2111}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1073741823"}, true, 0, null, 2), new String[][]{{"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("+193630156-05-25T16:43:26.464Z {getEpochSecond=6110315384028206, getNano=464000000}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "279999984"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 1974 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=157766400005, getTimezoneOffset=480, getYear=74}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "-23"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "14"}, true, 0, null, 1), new String[][]{{"before", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:7>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:49:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=49, getMonth=1, getSeconds=26, getTime=6017544090524966464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:8>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "14", "-86400001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Apr 03 05:05:59 PST 1902 {getDate=3, getDay=4, getHours=5, getMinutes=5, getMonth=3, getSeconds=59, getTime=-2137920840001, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#959#1999790820", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true), new String[][]{{"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6017544092672090111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3599999"}, true), new String[][]{{"setMonth", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 28 09:43:26 PDT 190690761 {getDate=28, getDay=0, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=6017557037301806464, getTimezoneOffset=420, getYear=190688861}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0xFFFFFFFF", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true), new String[][]{{"getMinutes", "", "2"}, {"compareTo", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:5>", "-2", "-1002"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-3599996"}, true), new String[][]{{"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 61970 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1893448656000000, getTimezoneOffset=480, getYear=60070}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-1002"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:07:06 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=4, getSeconds=6, getTime=-2103616373002, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "268435458"}, true), new String[][]{{"getYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("580", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1031"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Sep 05 06:07:08 PST 178955069 {getDate=5, getDay=6, getHours=6, getMinutes=7, getMonth=8, getSeconds=8, getTime=-5647454599830772000, getTimezoneOffset=480, getYear=178953169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "47"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Nov 25 16:00:00 PST 1970 {getDate=25, getDay=3, getHours=16, getMinutes=0, getMonth=10, getSeconds=0, getTime=28425600000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true), new String[][]{{"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483594"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 26 07:20:00 PDT 5985 {getDate=26, getDay=5, getHours=7, getMinutes=20, getMonth=3, getSeconds=0, getTime=126711181200000, getTimezoneOffset=420, getYear=4085}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 01 06:29:18 PST 190690283 {getDate=1, getDay=4, getHours=6, getMinutes=29, getMonth=1, getSeconds=18, getTime=6017541943040958464, getTimezoneOffset=480, getYear=190688383}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-1"}, true), new String[][]{{"setDate", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 01 09:43:26 PST 190690351 {getDate=1, getDay=4, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544088883006464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "25"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true), new String[][]{{"getMinutes", "", "4"}, {"getMonth", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\037", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1000"}, true), new String[][]{{"setMonth", "int", "5"}, {"after", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "280000030"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jul 04 21:53:26 PDT 190690883 {getDate=4, getDay=0, getHours=21, getMinutes=53, getMonth=6, getSeconds=26, getTime=6017560890526406464, getTimezoneOffset=420, getYear=190688983}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "172799488"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jun 23 16:51:28 PDT 1975 {getDate=23, getDay=1, getHours=16, getMinutes=51, getMonth=5, getSeconds=28, getTime=172799488001, getTimezoneOffset=420, getYear=75}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "67109802"}, true), new String[][]{{"setTime", "long", "4"}, {"getMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600001"}, true), new String[][]{{"setMonth", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 10 16:00:00 PST 70965 {getDate=10, getDay=4, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=2177272828800001, getTimezoneOffset=480, getYear=69065}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-27"}, true), new String[][]{{"toLocaleString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Apr 4, 1902, 5:05:33 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "86399942"}, true), new String[][]{{"before", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3"}, true), new String[][]{{"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1"}, true), new String[][]{{"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"abc0x1F", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 08:40:01 PST 1970 {getDate=1, getDay=4, getHours=8, getMinutes=40, getMonth=0, getSeconds=1, getTime=60001000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:01 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=1, getTime=-2137834439000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "140000000"}, true), new String[][]{{"after", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1791057600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#1572937617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "3600000"}, true), new String[][]{{"toGMTString", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11 Feb 1970 16:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-64095"}, true), new String[][]{{"getTimezoneOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-37"}, true), new String[][]{{"setTime", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=4, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PST 1902 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137834439001, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3599949"}, true), new String[][]{{"getYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("412", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "500"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Oct 20 09:43:26 PDT 190690392 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=9, getSeconds=26, getTime=6017545405356206464, getTimezoneOffset=420, getYear=190688492}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "191071"}, true), new String[][]{{"toLocaleString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Oct 19, 1991, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2130706431"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Sep 30 16:00:00 PST 177556901 {getDate=30, getDay=2, getHours=16, getMinutes=0, getMonth=8, getSeconds=0, getTime=-5603331771158399999, getTimezoneOffset=480, getYear=177555001}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1034"}, true), new String[][]{{"getTimezoneOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:10:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=10, getMonth=11, getSeconds=0, getTime=600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 21 01:43:26 PST 190690420 {getDate=21, getDay=1, getHours=1, getMinutes=43, getMonth=11, getSeconds=26, getTime=6017546294300606465, getTimezoneOffset=480, getYear=190688520}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-57"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "30000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "280000001"}, true), new String[][]{{"setYear", "int", "5"}, {"getHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:5>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:11>", "280000045"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 11 12:16:32 PST 23335246 {getDate=11, getDay=2, getHours=12, getMinutes=16, getMonth=11, getSeconds=32, getTime=736327100578592000, getTimezoneOffset=480, getYear=23333346}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1073741814"}, true), new String[][]{{"setYear", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 27 16:00:00 PST 1903 {getDate=27, getDay=5, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=-2106950399999, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 10 17:01:00 PDT 2134 {getDate=10, getDay=6, getHours=17, getMinutes=1, getMonth=3, getSeconds=0, getTime=5184000060001, getTimezoneOffset=420, getYear=234}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2147483647"}, true), new String[][]{{"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "280000049"}, true), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 31 16:00:00 PST 280002018 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8835948106300800006, getTimezoneOffset=480, getYear=280000118}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:07:08 PST 1908 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=4, getSeconds=8, getTime=-1945763572000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "1"}, true), new String[][]{{"getLeastMaximum", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "536870918"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483642"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Aug 25 09:43:26 PDT 196569961 {getDate=25, getDay=5, getHours=9, getMinutes=43, getMonth=7, getSeconds=26, getTime=6203086677189806464, getTimezoneOffset=420, getYear=196568061}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-1"}, true), new String[][]{{"getMonth", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-536868922"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Mar 22 05:06:00 PST 1467966 {getDate=22, getDay=3, getHours=5, getMinutes=6, getMonth=2, getSeconds=0, getTime=-46387612695240000, getTimezoneOffset=480, getYear=1466066}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 21 09:43:26 PST 190690351 {getDate=21, getDay=3, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090611006464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "2", "2147483647"}, true), new String[][]{{"getTime", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5647452499151999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=4, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=-6017791952124993536, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 01 00:00:00 PDT 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1790838000000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:3>", "2", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 20 09:43:26 PDT 11733380 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=370207557103406464, getTimezoneOffset=420, getYear=11731480}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "-130617728", "0"}, true), new String[][]{{"getSeconds", "", "4"}, {"getDay", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "3"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "7", "-56"}, true), new String[][]{{"getSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "12", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Mar 30 02:59:00 PST 2182 {getDate=30, getDay=5, getHours=2, getMinutes=59, getMonth=2, getSeconds=0, getTime=-130986853260000, getTimezoneOffset=480, getYear=282}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "172799998"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:2>", "1001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "16778166"}, true, 0, null, 3), new String[][]{{"getDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true, 0, null, 1), new String[][]{{"getDate", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "7"}, true, 0, null, 3), new String[][]{{"getDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "999"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:2>", "14", "-2147483600"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 06 19:28:36 PST 1969 {getDate=6, getDay=6, getHours=19, getMinutes=28, getMonth=11, getSeconds=36, getTime=-2147483599, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86334208"}, true, 0, null, 2), new String[][]{{"getYear", "", "4"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 23 23:28:00 PST 2134 {getDate=23, getDay=2, getHours=23, getMinutes=28, getMonth=1, getSeconds=0, getTime=5180052480000, getTimezoneOffset=480, getYear=234}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "14"}, true), new String[][]{{"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true, 0, null, 1), new String[][]{{"getDate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86399939"}, true, 0, null, 3), new String[][]{{"after", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 14 12:50:26 PDT 190694434 {getDate=14, getDay=2, getHours=12, getMinutes=50, getMonth=2, getSeconds=26, getTime=6017672939543426464, getTimezoneOffset=420, getYear=190692534}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "59999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Feb 20 09:43:26 PST 190750350 {getDate=20, getDay=1, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6019437476108606464, getTimezoneOffset=480, getYear=190748450}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 2), new String[][]{{"getDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "65538"}, true, 0, null, 2), new String[][]{{"getHours", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2"}, true), new String[][]{{"next", "", "7"}, {"isWeekDateSupported", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "3600001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 06:06:00 PST 1902 {getDate=4, getDay=5, getHours=6, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137830839999, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "10"}, true), new String[][]{{"setSeconds", "int", "4"}, {"getDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 01 00:00:00 PST 190690351 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544088848000000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-280000000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 04 05:06:00 PST 23331433 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=11, getSeconds=0, getTime=-736346136624840000, getTimezoneOffset=480, getYear=23329533}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86400001"}, true, 0, null, 3), new String[][]{{"toGMTString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 Feb 7201970 00:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "8196"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<s:a>", "999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "3600000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jun 19 16:00:00 PDT 11826 {getDate=19, getDay=1, getHours=16, getMinutes=0, getMonth=5, getSeconds=0, getTime=311039996400001, getTimezoneOffset=420, getYear=9926}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "30"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:30:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=30, getMonth=11, getSeconds=0, getTime=1800001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "2"}, true, 0, null, 3), new String[][]{{"getMonth", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "280000000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "60017"}, true, 0, null, 2), new String[][]{{"getTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5185465200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<s:D>", "172800002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:1>", "0", "20"}, true, 0, null, 3), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "2147483647"}, true, 0, null, 1), new String[][]{{"getDate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "3600001"}, true, 0, null, 2), new String[][]{{"clone", "", "0"}, {"getDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86399995"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 23 16:00:00 PST 1657856 {getDate=23, getDay=3, getHours=16, getMinutes=0, getMonth=0, getSeconds=0, getTime=52254716976000000, getTimezoneOffset=480, getYear=1655956}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "10"}, true, 0, null, 2), new String[][]{{"setDate", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 13:00:00 PDT 2026 {getDate=4, getDay=0, getHours=13, getMinutes=0, getMonth=9, getSeconds=0, getTime=1791144000000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1"}, true, 0, null, 1), new String[][]{{"getHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "0"}, true), new String[][]{{"getDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "3"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-57600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=...#957#-1369525745", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "14"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "1800000"}, true, 0, null, 1), new String[][]{{"setYear", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon May 05 17:00:00 PST 1902 {getDate=5, getDay=1, getHours=17, getMinutes=0, getMonth=4, getSeconds=0, getTime=-2135113199999, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true), new String[][]{{"after", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "60256"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "60000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 21 02:23:26 PST 190690351 {getDate=21, getDay=3, getHours=2, getMinutes=23, getMonth=1, getSeconds=26, getTime=6017544090584606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "540470912"}, true, 0, null, 1), new String[][]{{"clone", "", "7"}, {"getHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400001"}, true, 0, null, 3), new String[][]{{"clone", "", "2"}, {"toInstant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("+11826-06-20T01:00:00.001Z {getEpochSecond=311040003600, getNano=1000000}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1002"}, true, 0, null, 1), new String[][]{{"setHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 04 16:00:01 PST 243010 {getDate=4, getDay=3, getHours=16, getMinutes=0, getMonth=3, getSeconds=1, getTime=-7730940067198993, getTimezoneOffset=480, getYear=241110}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-10"}, true, 0, null, 1), new String[][]{{"getMonth", "", "7"}, {"clone", "", "2"}, {"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 21 16:03:00 PST 1969 {getDate=21, getDay=0, getHours=16, getMinutes=3, getMonth=11, getSeconds=0, getTime=-863819995, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "add", new String[]{"java.util.Date", "int", "int"}, new String[]{"<sample:4>", "1", "7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 04 05:06:00 PST 1909 {getDate=4, getDay=0, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=-1916909640000, getTimezoneOffset=480, getYear=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DateUtils", "org.apache.commons.lang.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "280000000"}, true, 0, null, 3), new String[][]{{"toGMTString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("18 Dec 768583 00:00:00 GMT", String.valueOf(actual));
 }
}
