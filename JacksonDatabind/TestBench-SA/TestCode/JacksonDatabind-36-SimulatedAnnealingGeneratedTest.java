package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"-1Title", "<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT1H", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "/x124446789"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\", \"", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234 77890123457", "<sample:4>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\u00e9", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}, {"append", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000sample {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 14, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"a,b,c0x1F", "<sample:2>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-07z-/1"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "z,a!rtrrue", "<sample:13>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "15", "<null>", "false"}}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "2"}, {"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"\t", "<sample:5>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "accc"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1e10"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "-1itle", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"/0011TjtleUqte---1", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "1y:300:451.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"/001+1TjtleUqte---1.000", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.4d", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "1y:300:451.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "010", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-11\t", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "-"}}, 1), new String[][]{{"clone", "", "4"}, {"isLenient", "", "0"}, {"getTimeZone", "", "7"}, {"getLastRuleInstance", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:9>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "yyy5y--MM-d", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "1"}, {"append", "char", "6"}, {"substring", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("le1970-01-01T00:00:00.000+0000aa", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "00", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"237483647"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "/`/b1e10", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "eAf\",(n+yS", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".0001Ujt"}}, 1), new String[][]{{"setSeconds", "int", "5"}, {"toGMTString", "", "4"}, {"toGMTString", "", "4"}, {"getDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"60o0-0-/+21595:4770:[26.rr\u00e95.\no202-0,02ih5u\t220-01-/1t--1-01:0i"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "dAf\",(\"+xR", "<sample:1>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "Hello, Wold", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "CEdCgf!-]#+//+.", "<sample:5>", "false"}}, 1), new String[][]{{"getDate", "", "5"}, {"toGMTString", "", "6"}, {"getHours", "", "2"}, {"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"3A>2-*[-4AP^2*f>9x7./u22^;;Z"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:9>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ",,#\"rBttrrueTisle"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "EbBxgXT-]#+//+.1d-6", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "\n", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "3A>2-*[-4AP^2*f>9x7./u22^;;Z"}}, 2), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}, {"insert", "int,char[]", "5"}, {"ensureCapacity", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sa0mple1970-01-01T00:00:00.000+0000 {length=35}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: 0_SAMPLE) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: 0_SAMPLE) {isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 3), new String[][]{{"withTimeZone", "java.util.TimeZone", "6"}, {"getNumberFormat", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 3), new String[][]{{"withTimeZone", "java.util.TimeZone", "6"}, {"getNumberFormat", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#208#-288163767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".00x0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"UTC"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#206#486434458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{".000"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "-1.5", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaa`aaaaaaaaaaa"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"aaaTPaaaaaaaaaaaaaa`aaaaaaaaaaaP<1HDateFormat "}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a b", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.12345678901234567", "<null>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.5"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "15"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "15"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#206#-956014997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "15"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "15"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\",!r", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:4>"}}, 3), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "TITLE"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:5>"}}, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2), new String[][]{{"useDaylightTime", "", "7"}, {"getDisplayName", "boolean,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2), new String[][]{{"useDaylightTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "UTC", "<sample:5>"}}, 1), new String[][]{{"getCalendar", "", "2"}, {"parse", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"15", "<sample:6>"}, false, 11, new String[][]{}, 3), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT1H", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT2H", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: ) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}), new String[][]{{"withTimeZone", "java.util.TimeZone", "6"}, {"getNumberFormat", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#208#-288163767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".000"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".000"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".000"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", ".010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}), new String[][]{{"append", "char", "4"}, {"capacity", "", "1"}, {"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}), new String[][]{{"append", "char", "4"}, {"capacity", "", "1"}, {"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<empty>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}), new String[][]{{"append", "char", "4"}, {"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<empty>", "<sample:5>"}, false), new String[][]{{"deleteCharAt", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:30:45", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12\"30:45", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1.5", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1.5", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1.5", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"-1", "<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "a,b,c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"-1Title", "<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "0x124456789"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample__a) {is...#213#1059971973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}), new String[][]{{"format", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"format", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{".000"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "-1.5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"o5O"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"2020-01-/1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "C\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"toLocalizedPattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EEE, dd MMM yyyy HH:mm:ss zzz", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "0xFFFFFFFF", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "UTC", "<sample:5>"}}), new String[][]{{"getCalendar", "", "2"}, {"parse", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"15", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=15, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"15", "<sample:6>"}, false), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"15", "<sample:6>"}, false, 11, new String[][]{}), new String[][]{{"getMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"setLenient", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "http://example.com/a?b=c", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: sample__a) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample__a) {is...#213#1059971973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"clone", "", "5"}, {"setDateFormatSymbols", "java.text.DateFormatSymbols", "0"}, {"isLenient", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:30:45", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"applyPattern", "java.lang.String", "5"}, {"format", "java.lang.Object", "1"}, {"getDateFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"02C3:-4", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=28, getIndex=0, getRunLimit=4, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#210#-965997657", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=28, getIndex=0, getRunLimit=28, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=28, getIndex=0, getRunLimit=28, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=28, getIndex=0, getRunLimit=28, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-/1", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-/1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0x12334567A92020-0101"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0x1233457A92020-01011.5[1,2]"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "00.000", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"12345678901"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat May 23 14:21:18 PDT 1970 {getDate=23, getDay=6, getHours=14, getMinutes=21, getMonth=4, getSeconds=18, getTime=12345678901, getTimezoneOffset=420, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"090/abc", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0/a``cc", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getDisplayName", "java.util.Locale", "7"}, {"hasSameRules", "java.util.TimeZone", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 2), new String[][]{{"getCalendar", "", "7"}, {"setCalendar", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: a) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Fri, 04 Apr 1902 13:06:00 GMT {length=29}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Fri, 04 Apr 1902 13:06:00 GMT {length=29}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, true), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"12345677890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:5>"}}), new String[][]{{"getDay", "", "7"}, {"after", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "true"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"getDisplayName", "boolean,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "true"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "true"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "false"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "false"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "/a/b", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "false"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:61", "<null>", "false"}}, 3), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<null>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"getOffsetsByStandard", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<null>", "false"}}, 2), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"getOffsetsByStandard", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<null>", "false"}}, 2), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<null>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<null>", "false"}}, 2), new String[][]{{"getLastRuleInstance", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<sample:5>", "false"}}, 2), new String[][]{{"getLastRuleInstance", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-30T25:61:610xFFFFFFFF", "<sample:5>", "false"}}, 2), new String[][]{{"getLastRuleInstance", "", "3"}, {"observesDaylightTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false), new String[][]{{"getTimeZone", "", "6"}, {"getDisplayName", "boolean,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 31 16:00:00 PST 2019 {getDate=31, getDay=2, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1577836800000, getTimezoneOffset=480, getYear=119}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"5.1L"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#208#-288163767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#208#-288163767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=f...#205#-1566897247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"capacity", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".51.12345678901234567", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.123356789012345}67", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}, 2), new String[][]{{"deleteCharAt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("smple1970-01-01T00:00:00.000+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}, 2), new String[][]{{"deleteCharAt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("170-01-01T00:00:00.000+0000 {length=27}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.12345678901234567"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "+1", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#211#-98189449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, true), new String[][]{{"clone", "", "7"}, {"format", "java.util.Date", "6"}, {"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: a) {isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"15"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}}), new String[][]{{"getMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"15"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=15, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"15"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=15, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"15"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=15, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"154"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "-"}}, 2), new String[][]{{"getSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"154"}, false, 10, new String[][]{}, 2), new String[][]{{"getSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"155)"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"00"}, false, 10, new String[][]{}, 2), new String[][]{{"before", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2"}, false, 10, new String[][]{}, 2), new String[][]{{"getYear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2"}, false, 11, new String[][]{}, 2), new String[][]{{"getYear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=f...#205#-1566897247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tue, 20 Feb 190690351 17:43:26 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "3"}, {"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "java.util.Date", "3"}, {"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, true), new String[][]{{"format", "java.util.Date", "3"}, {"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampleThu, 01 Jan 1970 00:00:00 GMT {length=35}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"PTMH)"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"x"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"zxa"}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Tii]le"}}), new String[][]{{"substring", "int", "6"}, {"offsetByCodePoints", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Tii]m"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 15, new String[][]{}, 2), new String[][]{{"substring", "int", "6"}, {"offsetByCodePoints", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 2), new String[][]{{"append", "java.lang.String", "6"}, {"offsetByCodePoints", "int,int", "6"}, {"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+00000false {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 2), new String[][]{{"append", "java.lang.String", "6"}, {"replace", "int,int,java.lang.String", "6"}, {"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("197-01-01T00:00:00.001+00000false {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"append", "java.lang.String", "6"}, {"replace", "int,int,java.lang.String", "6"}, {"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("197-01-01T00:00:00.001+00000false {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:5>", "<sample:9>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"insert", "int,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("197true0-01-01T00:00:00.001+0000 {length=32}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", " (timezone: ", "<sample:4>", "true"}}, 2), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "trte", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", " )timezon2: ", "<sample:4>", "true"}}, 1), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".00x0", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".00x0", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
}
