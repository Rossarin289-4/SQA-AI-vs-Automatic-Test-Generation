package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-01-01"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:0>"}}), new String[][]{{"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(locale: ", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", " (timezone: "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"withLocale", "java.util.Locale", "2"}, {"format", "java.lang.Object", "3"}, {"format", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.005+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"withLocale", "java.util.Locale", "5"}, {"setCalendar", "java.util.Calendar", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#212#-1030872255", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5n", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-02-3T25:61:60tr]", "<sample:8>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+B1.5f", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "Eulk1.5", "<sample:11>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"00.00f0TTLEyyyy-MM-dda b", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"neutki+1I", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "0x1F", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "ndull+1I", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "220-01-01", "<null>"}}, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "2"}, {"insert", "int,char[]", "2"}, {"append", "java.lang.CharSequence,int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"22331.0-00-1-0.0", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "n+1", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "0xFFFFFFXF"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"3.31-),X0\n31,0}07eZ", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\"\",6 "}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "10zFEFGFFD,G2220-.001", "<sample:10>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2020-01-01-0.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"neut+3;+1Il ", "<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "n+1", "<sample:9>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:10>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"114748368"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1[30-60}WWu e7P8X+\r:e1Z", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 23:52:28 PST 1970 {getDate=1, getDay=4, getHours=23, getMinutes=52, getMonth=0, getSeconds=28, getTime=114748368, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"-\":1}", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:10>"}, true, 0, null, 3), new String[][]{{"applyLocalizedPattern", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1H", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null+1I", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:9>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234567890133457789012:30:45", "<sample:11>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "nulk"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234567890133457789012:30:45", "<sample:11>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Eulk1.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133457789012:30:45true1e10", "<sample:7>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Eul1.5"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133457789012:30:45true1e10", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Eul1.5"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133457789012:30:45true1e10", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Eul1.55"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1e10", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5d", "<sample:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a,b,c"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getDateFormatSymbols", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BCE, CE], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec,.., getShortMonths=[Jan, Feb, Mar, Apr, May...#364#-349615412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "0"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getTimeZone", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3), new String[][]{{"getTimeZone", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"getDisplayName", "boolean,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: ) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3), new String[][]{{"setLenient", "boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12d:30:45", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "-1", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}, {"toLocalizedPattern", "", "3"}, {"parseObject", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.2234567890\t2345_467", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<empty>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"010", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\titld", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=10, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"01.0", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"214u74834801..1234567 "}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0123457789X01234568890133447789012:30:45true1e10Hell3o, World"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"toPattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"getNumberFormat", "", "0"}, {"isParseBigDecimal", "", "6"}, {"setNegativeSuffix", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getNumberFormat", "", "2"}, {"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=1, getIndex=0, getRunLimit=1, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 3), new String[][]{{"getNumberFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getNumberFormat", "", "2"}, {"format", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u221e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"[1,2]GMT"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<empty>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"applyPattern", "java.lang.String", "2"}, {"format", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<a>b</a>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "--1", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"null+1I"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Thu, 01 Jan 1970 00:00:00 GMT {length=29}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"ww"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<empty>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.12345678901234567"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:2>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.13"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.23"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"applyPattern", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0"}}, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"nulk+TI", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.55.", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"000", "<sample:11>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.55.", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0005.", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.55.", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0005.", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<empty>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Eulk1.5"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getDateFormatSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.001+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1903-05-05T14:07:08.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 2), new String[][]{{"append", "int", "1"}, {"indexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:6>"}, true), new String[][]{{"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}}), new String[][]{{"isLenient", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"withLocale", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0x1F", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Title", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\titld", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\titld", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"00.000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\titld", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}), new String[][]{{"format", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}), new String[][]{{"withLocale", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=!...#221#-485460566", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "nulk"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}), new String[][]{{"withLocale", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=!...#221#-485460566", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "nulk"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}), new String[][]{{"withLocale", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=!...#221#-485460566", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "nulk"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}), new String[][]{{"withLocale", "java.util.Locale", "3"}, {"getCalendar", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\titld", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.5e300", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null+1I", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null+1I", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null+1I", "<sample:9>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:9>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123456789012345678901234567890", "<sample:11>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234567890133457789012:30:45", "<sample:11>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "nulk"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133457789012:30:45true1e10Hello, World", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Eul1.55"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133447789012:30:45true1e10Hell3o, World", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123457789X01234568890133447789012:30:45true1e10Hell3o, World", "<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\u00e9", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c", "<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a-b,}", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0123457789X0123456789013345778_9012:30:45", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a-b,}", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0123457789X0123456789013345778_9012:30:45", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1e10", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"getNumberFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, true), new String[][]{{"getNumberFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true), new String[][]{{"getDateFormatSymbols", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BCE, CE], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec,.., getShortMonths=[Jan, Feb, Mar, Apr, May...#364#-349615412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getRawOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getRawOffset", "", "0"}, {"toZoneId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true), new String[][]{{"getTimeZone", "", "0"}, {"toZoneId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:5>"}, true), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"getTimeZone", "", "0"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"getTimeZone", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"getDisplayName", "boolean,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: ) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#222#1689829027", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 1, new String[][]{}), new String[][]{{"setLenient", "boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "6"}, {"toLocaleString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dec 31, 1969, 4:00:00 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, false), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}}), new String[][]{{"format", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.005+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:3>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}, {"toLocalizedPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<empty>", "<sample:3>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}, {"toLocalizedPattern", "", "3"}, {"parseObject", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:0>"}}), new String[][]{{"setCalendar", "java.util.Calendar", "0"}, {"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=28, getIndex=0, getRunLimit=28, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "2"}, {"toPattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"214t7483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"01345789X012345688"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:6>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"parse", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1"}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}, {"append", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+00002 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1"}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}, {"append", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+00002 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.001+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"lastIndexOf", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"getDateFormatSymbols", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"getDateFormatSymbols", "", "4"}, {"getZoneStrings", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.String;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getCalendar", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"n}llb+19I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<empty>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"applyPattern", "java.lang.String", "2"}, {"format", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"applyPattern", "java.lang.String", "2"}, {"format", "java.util.Date", "3"}, {"getDateFormatSymbols", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"I", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "0x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, false), new String[][]{{"capacity", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Thu, 01 Jan 1970 00:00:00 GMT {length=29}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.12345678901234567"}}), new String[][]{{"getHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"observesDaylightTime", "", "2"}, {"getOffsetsByWall", "long,int[]", "6"}, {"getDisplayName", "boolean,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false), new String[][]{{"clone", "", "7"}, {"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"delete", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samle1903-05-05T14:07:08.000+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null+1I", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "x0.0000", "<sample:1>"}}), new String[][]{{"substring", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:1>", "<sample:15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:8>"}}), new String[][]{{"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.002+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".zb0\", \"", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "F-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "F-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "F-c"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "F\tc-1"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1e10", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#227#450149760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"applyPattern", "java.lang.String", "1"}, {"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"toPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-3T25:61:60tr]", "<sample:10>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-3T5:61:60tr]", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "40.000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-/2-3T5:61:6/tr]\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "5/000"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:8>"}, true), new String[][]{{"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"setCalendar", "java.util.Calendar", "0"}, {"parse", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"setCalendar", "java.util.Calendar", "0"}, {"parse", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getID", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "\n", "<null>"}}, 1), new String[][]{{"getCalendar", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "\n", "<null>"}}, 1), new String[][]{{"getCalendar", "", "4"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.001+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:0>"}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#229#1940517745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2.1234567", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.25", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"getDateFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"setTimeZone", "java.util.TimeZone", "2"}, {"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "yyyy-MM-dd", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"isDirty", "", "6"}, {"getID", "", "1"}, {"getOffsetsByWall", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#223#1759699432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"setLenient", "boolean", "0"}, {"getNumberFormat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"setLenient", "boolean", "0"}, {"getNumberFormat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Title", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Title", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: a_0) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"set2DigitYearStart", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"parse", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<null>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample190690351-02-20T17:43:26.464+0000 {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:7>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample190690351-02-20T17:43:26.464+0000 {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"getCalendar", "", "0"}, {"getActualMinimum", "int", "3"}, {"before", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"getDateFormatSymbols", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"toZoneId", "", "3"}, {"getRules", "", "2"}, {"previousTransition", "java.time.Instant", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"toZoneId", "", "3"}, {"getRules", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.time.zone.ZoneRules", actual.getClass().getName());
  assertEquals("ZoneRules[currentStandardOffset=Z] {isFixedOffset=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"getCalendar", "", "3"}, {"getCalendarType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gregory", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintRFC1123Format", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", ".000", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 2019 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1577836800000, getTimezoneOffset=480, getYear=119}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-11-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", ".000", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 31 17:00:00 PDT 2020 {getDate=31, getDay=6, getHours=17, getMinutes=0, getMonth=9, getSeconds=0, getTime=1604188800000, getTimezoneOffset=420, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-111-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", ".000", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2830-1-91\t"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "2020-02-3T25:61:60tr]"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Mar 31 17:00:00 PDT 2830 {getDate=31, getDay=0, getHours=17, getMinutes=0, getMonth=2, getSeconds=0, getTime=27146793600000, getTimezoneOffset=420, getYear=930}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2830-110-91\t"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "2020-12-3T25:61:60tr]"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"15"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "2020-111-01", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}), new String[][]{{"getTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"5"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "2020-111-01", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}), new String[][]{{"getTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getBlueprintISO8601Format", new String[]{}, new String[]{}, true), new String[][]{{"toLocalizedPattern", "", "7"}, {"parse", "java.lang.String,java.text.ParsePosition", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "00", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.001+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "/01", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.001+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "/012020-01-01", "<sample:9>"}}), new String[][]{{"format", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", ".000", "<sample:11>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#226#685550000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "1.5e300a b"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "0123457789X01234568890133447789012:30:45tque1e10Hell3o, World", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:4>", "<sample:7>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:4>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}}, 2), new String[][]{{"append", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000-1 {length=30}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#224#1768559186", SearchInputFactory_scaffolding.receiverState());
 }
}
