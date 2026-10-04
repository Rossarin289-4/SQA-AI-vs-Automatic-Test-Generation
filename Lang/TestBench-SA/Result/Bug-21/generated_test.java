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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "86399999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 20 09:43:26 PDT 190690434 {getDate=20, getDay=6, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=6017546717513006464, getTimezoneOffset=420, getYear=190688534}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<null>", "<sample:3>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Apr 10 17:00:00 PDT 2134 {getDate=10, getDay=6, getHours=17, getMinutes=0, getMonth=3, getSeconds=0, getTime=5184000000001, getTimezoneOffset=420, getYear=234}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "280000001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"\n", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Nov 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=10, getSeconds=26, getTime=6017544114111806464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:1>", "60001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<d:1.5>", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"-0.0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"abcc", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "59999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "279999938"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "279999938"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 01 00:00:00 PST 1903 {getDate=1, getDay=5, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=-2103984000000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "280000001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 18 23:53:49 PST 1912 {getDate=18, getDay=1, getHours=23, getMinutes=53, getMonth=2, getSeconds=49, getTime=-1823616371000, getTimezoneOffset=480, getYear=12}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "279999999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 08 11:53:47 PST 1903 {getDate=8, getDay=5, getHours=11, getMinutes=53, getMonth=4, getSeconds=47, getTime=-2103336372001, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:2>", "<sample:0>", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "7"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 23:00:00 PST 1969 {getDate=31, getDay=3, getHours=23, getMinutes=0, getMonth=11, getSeconds=0, getTime=25200001, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "59943"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "47"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "7200056"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "59951"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 31 16:00:00 PST 61920 {getDate=31, getDay=5, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1891870819200000, getTimezoneOffset=480, getYear=60020}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6636", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "3"}, true), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606002, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:07:13 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=7, getMonth=4, getSeconds=13, getTime=-2103616367000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<d:1.5>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "16388"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameDay", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameLocalTime", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:0>", "<sample:6>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "12"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:1>", "<sample:3>", "14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 12:00:00 PST 190690351 {getDate=20, getDay=2, getHours=12, getMinutes=0, getMonth=1, getSeconds=0, getTime=6017544090532800000, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "6"}, true), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 04 00:00:00 PDT 2026 {getDate=4, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1791097200000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:10>", "<sample:1>", "13"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "4"}, true, 0, null, 1), new String[][]{{"next", "", "3"}, {"clear", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "1001"}, true), new String[][]{{"toZonedDateTime", "", "1"}, {"isBefore", "java.time.chrono.ChronoZonedDateTime", "6"}, {"withLaterOffsetAtOverlap", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.ZonedDateTime", actual.getClass().getName());
  assertEquals("2026-10-16T00:00-07:00[America/Los_Angeles] {getDayOfMonth=16, getDayOfWeek=FRIDAY, getDayOfYear=289, getHour=0, getMinute=0, getMonth=OCTOBER, getMonthValue=10, getNano=0, getSecond=0, getYear=2026}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "5"}, true), new String[][]{{"hasNext", "", "3"}, {"next", "", "2"}, {"setTimeZone", "java.util.TimeZone", "0"}, {"getCalendarType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gregory", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 20 09:43:26 PDT 11733380 {getDate=20, getDay=6, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=370207554425006464, getTimezoneOffset=420, getYear=11731480}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jul 04 05:06:00 PST 178955070 {getDate=4, getDay=4, getHours=5, getMinutes=6, getMonth=6, getSeconds=0, getTime=-5647454636900040000, getTimezoneOffset=480, getYear=178953170}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setDays", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<sample:3>", "4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:1>", "<sample:0>", "-2099436"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<empty>", "13"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "2147483559"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-66988844"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Aug 19 15:16:00 PST 1842 {getDate=19, getDay=5, getHours=15, getMinutes=16, getMonth=7, getSeconds=0, getTime=-4019330640000, getTimezoneOffset=480, getYear=-58}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-133977688"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 07 14:32:00 PST 1715 {getDate=7, getDay=0, getHours=14, getMinutes=32, getMonth=3, getSeconds=0, getTime=-8038661280000, getTimezoneOffset=480, getYear=-185}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"o5D1.6", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1000", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "60026"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "279999999"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"before", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "279999938"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "279999938"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "30"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 01 06:07:08 PST 1903 {getDate=1, getDay=2, getHours=6, getMinutes=7, getMonth=11, getSeconds=8, getTime=-2085472372000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jun 12 09:43:26 PDT 149533077 {getDate=12, getDay=2, getHours=9, getMinutes=43, getMonth=5, getSeconds=26, getTime=4718745980210606464, getTimezoneOffset=420, getYear=149531177}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 17 09:43:26 PDT 170111714 {getDate=17, getDay=2, getHours=9, getMinutes=43, getMonth=3, getSeconds=26, getTime=5368145035365806464, getTimezoneOffset=420, getYear=170109814}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147221503"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jun 01 00:00:00 PST 1903 {getDate=1, getDay=1, getHours=0, getMinutes=0, getMonth=5, getSeconds=0, getTime=-2101305600000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "52"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Aug 05 06:07:08 PST 178955069 {getDate=5, getDay=3, getHours=6, getMinutes=7, getMonth=7, getSeconds=8, getTime=-5647454602509172000, getTimezoneOffset=480, getYear=178953169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 31 16:00:00 PST 178955002 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=-5647452499151999995, getTimezoneOffset=480, getYear=178953102}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2147483647"}, true, 0, null, 1), new String[][]{{"setHours", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Aug 05 02:07:08 PST 178955069 {getDate=5, getDay=3, getHours=2, getMinutes=7, getMonth=7, getSeconds=8, getTime=-5647454602523572000, getTimezoneOffset=480, getYear=178953169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483647"}, true, 0, null, 1), new String[][]{{"setHours", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Oct 05 02:07:08 PST 178955069 {getDate=5, getDay=1, getHours=2, getMinutes=7, getMonth=9, getSeconds=8, getTime=-5647454597253172000, getTimezoneOffset=480, getYear=178953169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "-2147483648"}, true, 0, null, 1), new String[][]{{"setHours", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Sep 05 02:07:08 PST 178955069 {getDate=5, getDay=6, getHours=2, getMinutes=7, getMonth=8, getSeconds=8, getTime=-5647454599845172000, getTimezoneOffset=480, getYear=178953169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "280000001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#959#-33800775", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-1>", "2147483640"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:2>", "<sample:0>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "1041"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.lang.Object", "int"}, new String[]{"<i:0>", "60000"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "60001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "-1073741813"}, true, 0, null, 2), new String[][]{{"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "1073741813"}, true, 0, null, 2), new String[][]{{"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "1073741813"}, true, 0, null, 2), new String[][]{{"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-1073741818"}, true, 0, null, 2), new String[][]{{"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "172800002"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "5"}, true, 0, null, 1), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:8>", "72891135"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "4"}, true, 0, null, 2), new String[][]{{"setMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 10 11:00:00 PST 1908 {getDate=10, getDay=0, getHours=11, getMinutes=0, getMonth=4, getSeconds=0, getTime=-1945314000000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun May 10 11:12:00 PST 1908 {getDate=10, getDay=0, getHours=11, getMinutes=12, getMonth=4, getSeconds=0, getTime=-1945313280000, getTimezoneOffset=480, getYear=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:10>", "4"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "4"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "0"}, {"setDate", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Apr 29 16:00:00 PDT 1969 {getDate=29, getDay=2, getHours=16, getMinutes=0, getMonth=3, getSeconds=0, getTime=-21257999999, getTimezoneOffset=420, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "4"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "0"}, {"setDate", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Apr 29 09:43:26 PDT 190690351 {getDate=29, getDay=0, getHours=9, getMinutes=43, getMonth=3, getSeconds=26, getTime=6017544096396206464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-59997"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 58029 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1893360182400000, getTimezoneOffset=480, getYear=56129}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-119994"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 31 16:00:00 PST 118026 {getDate=31, getDay=5, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-3786721574400000, getTimezoneOffset=480, getYear=116126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "7200056"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "7200056"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "6"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "-261235400"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "6"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "-261235400"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "6"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "2147483647"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "6"}, {"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "2147483647"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "33554437"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "33554437"}, true, 0, null, 1), new String[][]{{"getDay", "", "2"}, {"clone", "", "7"}, {"compareTo", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "0"}, true, 0, null, 1), new String[][]{{"getDay", "", "2"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 1), new String[][]{{"getDay", "", "2"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 1), new String[][]{{"getDay", "", "2"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 14 12:50:26 PDT 190694434 {getDate=14, getDay=2, getHours=12, getMinutes=50, getMonth=2, getSeconds=26, getTime=6017672939543426464, getTimezoneOffset=420, getYear=190692534}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "13"}, true, 0, null, 1), new String[][]{{"getDay", "", "2"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:56:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=56, getMonth=1, getSeconds=26, getTime=6017544090525386464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"The vrangd s.yle ", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "-67108770"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<sample:1>", "-139999908"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 31 16:00:00 PST 178955002 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=2, getSeconds=0, getTime=-5647452499152000000, getTimezoneOffset=480, getYear=178953102}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jul 04 05:06:00 PST 178955070 {getDate=4, getDay=4, getHours=5, getMinutes=6, getMonth=6, getSeconds=0, getTime=-5647454636900040000, getTimezoneOffset=480, getYear=178953170}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-2"}, true), new String[][]{{"setSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Nov 18 19:14:07 PST 2037 {getDate=18, getDay=3, getHours=19, getMinutes=14, getMonth=10, getSeconds=7, getTime=2142213247000, getTimezoneOffset=480, getYear=137}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-35"}, true), new String[][]{{"setSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 18 19:14:07 PST 2035 {getDate=18, getDay=0, getHours=19, getMinutes=14, getMonth=1, getSeconds=7, getTime=2055467647000, getTimezoneOffset=480, getYear=135}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86399999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#960#822329971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"aaaaaabaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "86400001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:2>", "<sample:3>", "-1119999996"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<empty>", "<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "1000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "5"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Feb 24 23:43:26 PST 190690351 {getDate=24, getDay=6, getHours=23, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090920606464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "131077"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 05 23:43:26 PST 190690710 {getDate=5, getDay=3, getHours=23, getMinutes=43, getMonth=0, getSeconds=26, getTime=6017555415541406464, getTimezoneOffset=480, getYear=190688810}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-131077"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Feb 13 23:00:00 PST 1611 {getDate=13, getDay=0, getHours=23, getMinutes=0, getMonth=1, getSeconds=0, getTime=-11325113999999, getTimezoneOffset=480, getYear=-289}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "33423355"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Jan 13 23:00:00 PST 93480 {getDate=13, getDay=2, getHours=23, getMinutes=0, getMonth=0, getSeconds=0, getTime=2887777810800001, getTimezoneOffset=480, getYear=91580}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "33423355"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 04 23:43:26 PST 190781861 {getDate=4, getDay=1, getHours=23, getMinutes=43, getMonth=2, getSeconds=26, getTime=6020431868360606464, getTimezoneOffset=480, getYear=190779961}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addDays", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3600001"}, true), new String[][]{{"setHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Aug 09 23:43:26 PDT 190700207 {getDate=9, getDay=0, getHours=23, getMinutes=43, getMonth=7, getSeconds=26, getTime=6017855130571406464, getTimezoneOffset=420, getYear=190698307}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "59999"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 11 07:59:00 PST 1970 {getDate=11, getDay=3, getHours=7, getMinutes=59, getMonth=1, getSeconds=0, getTime=3599940001, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-66988866"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Aug 19 14:54:00 PST 1842 {getDate=19, getDay=5, getHours=14, getMinutes=54, getMonth=7, getSeconds=0, getTime=-4019331960000, getTimezoneOffset=480, getYear=-58}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-66988844"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Aug 19 15:16:00 PST 1842 {getDate=19, getDay=5, getHours=15, getMinutes=16, getMonth=7, getSeconds=0, getTime=-4019330640000, getTimezoneOffset=480, getYear=-58}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<empty>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "toCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true), new String[][]{{"before", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 01 00:00:00 PST 1903 {getDate=1, getDay=5, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=-2103984000000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 01 00:00:00 PDT 2026 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1790838000000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "round", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "-524286"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "12"}, true), new String[][]{{"setMonth", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 15 09:43:26 PDT 190690351 {getDate=15, getDay=2, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=6017544097778606464, getTimezoneOffset=420, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-16"}, true), new String[][]{{"setMonth", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed May 31 09:43:26 PDT 190690350 {getDate=31, getDay=3, getHours=9, getMinutes=43, getMonth=4, getSeconds=26, getTime=6017544067625006464, getTimezoneOffset=420, getYear=190688450}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "-16"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addWeeks", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "30"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 29 16:00:00 PDT 1970 {getDate=29, getDay=3, getHours=16, getMinutes=0, getMonth=6, getSeconds=0, getTime=18140400001, getTimezoneOffset=420, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "279999900"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 18 23:52:08 PST 1912 {getDate=18, getDay=1, getHours=23, getMinutes=52, getMonth=2, getSeconds=8, getTime=-1823616472000, getTimezoneOffset=480, getYear=12}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 13:07:08 PST 1903 {getDate=5, getDay=2, getHours=13, getMinutes=7, getMonth=4, getSeconds=8, getTime=-2103591172000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 13:00:00 PST 1969 {getDate=31, getDay=3, getHours=13, getMinutes=0, getMonth=11, getSeconds=0, getTime=-10800000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:1>", "0"}, true), new String[][]{{"getMinimum", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "1001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedEquals", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:1>", "<sample:1>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue May 05 06:03:08 PST 1903 {getDate=5, getDay=2, getHours=6, getMinutes=3, getMonth=4, getSeconds=8, getTime=-2103616612000, getTimezoneOffset=480, getYear=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:03:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=3, getMonth=1, getSeconds=26, getTime=6017544090522206464, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "279999938"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 31 16:00:00 PST 279999938 {getDate=31, getDay=6, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8835882467788800001, getTimezoneOffset=480, getYear=279998038}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "279999936"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 279999936 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=8835882404716800001, getTimezoneOffset=480, getYear=279998036}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Dec 31 16:00:00 PST 86400000 {getDate=31, getDay=0, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2726458517203200001, getTimezoneOffset=480, getYear=86398100}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "86399951"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 31 16:00:00 PST 86399951 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2726456970816000000, getTimezoneOffset=480, getYear=86398051}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "86399951"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 04 05:06:00 PDT 86399951 {getDate=4, getDay=3, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=2726456947358760000, getTimezoneOffset=420, getYear=86398051}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "43199975"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 05:06:00 PDT 43199975 {getDate=4, getDay=5, getHours=5, getMinutes=6, getMonth=3, getSeconds=0, getTime=1363197378341160000, getTimezoneOffset=420, getYear=43198075}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "43199975"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Feb 20 09:43:26 PST 43199975 {getDate=20, getDay=4, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=1363197374646206464, getTimezoneOffset=480, getYear=43198075}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "-2"}, true), new String[][]{{"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<empty>", "1001"}, true), new String[][]{{"compareTo", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:3>", "5"}, true), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=1790492400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDayli...#971#-2070453511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Calendar", "java.util.Calendar", "int"}, new String[]{"<sample:2>", "<sample:0>", "1001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Calendar", "java.util.Calendar"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.DateUtils$DateIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "iterator", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "5"}, true), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Jan 01 00:00:00 PST 1 {getDate=1, getDay=6, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-62135740800000, getTimezoneOffset=480, getYear=-1899}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "0"}, true), new String[][]{{"getMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:5>", "279999999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 1974 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=157766400000, getTimezoneOffset=480, getYear=74}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addYears", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "-59997"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Dec 31 16:00:00 PST 58029 {getDate=31, getDay=4, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1893360182400000, getTimezoneOffset=480, getYear=56129}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<empty>", "<sample:5>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<empty>", "<sample:1>", "3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" ", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDateStrictly", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{" ", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInHours", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:4>", "5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addSeconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "86399999"}, true), new String[][]{{"toGMTString", "", "7"}, {"getTime", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6017544176924605464", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "60001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "4"}, true), new String[][]{{"clone", "", "1"}, {"setHours", "int", "2"}, {"before", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "4"}, true), new String[][]{{"clone", "", "1"}, {"toInstant", "", "2"}, {"plus", "long,java.time.temporal.TemporalUnit", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "13"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 05:00:00 PST 1970 {getDate=1, getDay=4, getHours=5, getMinutes=0, getMonth=0, getSeconds=0, getTime=46800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Apr 04 18:06:00 PST 1902 {getDate=4, getDay=5, getHours=18, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137787640000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "13"}, true), new String[][]{{"setDate", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Apr 02 18:06:00 PST 1902 {getDate=2, getDay=3, getHours=18, getMinutes=6, getMonth=3, getSeconds=0, getTime=-2137960440000, getTimezoneOffset=480, getYear=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:4>", "59951"}, true), new String[][]{{"setDate", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 02 04:06:00 PST 1909 {getDate=2, getDay=2, getHours=4, getMinutes=6, getMonth=1, getSeconds=0, getTime=-1922183640000, getTimezoneOffset=480, getYear=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMinutes", new String[]{"java.util.Calendar", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncate", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:5>", "1"}, true, 0, null, 1), new String[][]{{"setTimeZone", "java.util.TimeZone", "7"}, {"isLenient", "", "5"}, {"getGregorianChange", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 04 16:00:00 PST 1582 {getDate=4, getDay=4, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=-12219292800000, getTimezoneOffset=480, getYear=-318}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "88"}, true, 0, null, 3), new String[][]{{"getTime", "", "7"}, {"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "22"}, true, 0, null, 3), new String[][]{{"getTime", "", "7"}, {"setHours", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 09 02:00:00 PST 1907 {getDate=9, getDay=1, getHours=2, getMinutes=0, getMonth=8, getSeconds=0, getTime=-1966428000000, getTimezoneOffset=480, getYear=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<sample:9>", "22"}, true, 0, null, 3), new String[][]{{"clone", "", "7"}, {"getTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1966356000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addHours", new String[]{"java.util.Date", "int"}, new String[]{"<null>", "22"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:2>", "-1073610752"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "parseDate", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"1.25", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tr...#960#822329971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "1"}, true, 0, null, 3), new String[][]{{"getActualMinimum", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "ceiling", new String[]{"java.util.Calendar", "int"}, new String[]{"<sample:0>", "9"}, true, 0, null, 3), new String[][]{{"getActualMinimum", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "59943"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMonths", new String[]{"java.util.Date", "int"}, new String[]{"<sample:1>", "9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Oct 31 16:00:00 PST 1969 {getDate=31, getDay=5, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=-5270400000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "1500799"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:7>", "9"}, true), new String[][]{{"getTime", "", "0"}, {"setMinutes", "int", "2"}, {"getDay", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "setMinutes", new String[]{"java.util.Date", "int"}, new String[]{"<sample:6>", "9"}, true), new String[][]{{"getTime", "", "0"}, {"setMinutes", "int", "2"}, {"getDay", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:2>", "<sample:5>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "truncatedCompareTo", new String[]{"java.util.Date", "java.util.Date", "int"}, new String[]{"<sample:6>", "<sample:6>", "9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "getFragmentInMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:0>", "280000000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "isSameInstant", new String[]{"java.util.Date", "java.util.Date"}, new String[]{"<sample:5>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:2>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 15:59:59 PST 1969 {getDate=31, getDay=3, getHours=15, getMinutes=59, getMonth=11, getSeconds=59, getTime=-1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.DateUtils", "org.apache.commons.lang3.time.DateUtils", "addMilliseconds", new String[]{"java.util.Date", "int"}, new String[]{"<sample:3>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 20 09:43:26 PST 190690351 {getDate=20, getDay=2, getHours=9, getMinutes=43, getMonth=1, getSeconds=26, getTime=6017544090524606462, getTimezoneOffset=480, getYear=190688451}", SearchInputFactory_scaffolding.observe(actual));
 }
}
