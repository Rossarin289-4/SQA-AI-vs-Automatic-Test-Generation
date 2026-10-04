package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"+00:00\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "null", "<sample:7>"}}), new String[][]{{"setLenient", "boolean", "3"}, {"toPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:5>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"10", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=10, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0/0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"format", "java.util.Date", "1"}, {"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a, lenient: f...#255#-515490538", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:2>", "-1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:5>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 1), new String[][]{{"setTimeZone", "java.util.TimeZone", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: fa...#255#656826533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"'', '"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2021-_02-30T25:61:6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2021-_02-30T25:61:60", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}, 1), new String[][]{{"withColonInTimeZone", "boolean", "6"}, {"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0x\txFFFFFFFF"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1L010", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#255#-942662804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-30T25:61:61", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<sample:3>", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "123456789012345678901234567890", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "'6- '", "<sample:5>"}}, 3), new String[][]{{"setMinutes", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 07 13:52:00 PST 2064 {getDate=7, getDay=1, getHours=13, getMinutes=52, getMonth=0, getSeconds=0, getTime=-127270058880000, getTimezoneOffset=480, getYear=164}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", "boolean", "false"}}, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}, {"setLength", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("19 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", "java.lang.String,java.text.ParsePosition", "00", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2021-02-30T25:61:61.12345678901234567", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-30T24:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2020-02-30T24:61:61.5010", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: t...#253#266206670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T24:61:61.55+00:00", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "`bc", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2021-02-30T25:61:61.123"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<i:-16>"}}), new String[][]{{"setMonth", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Feb 02 18:02:01 PST 2021 {getDate=2, getDay=2, getHours=18, getMinutes=2, getMonth=1, getSeconds=1, getTime=1612317721123, getTimezoneOffset=480, getYear=121}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"1.1234567[1,2]1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "-11", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2020-02-30T24:61.4+00", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-62-30T24:61:61-5010", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}, 1), new String[][]{{"getYear", "", "7"}, {"getDate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:y>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{") f", "<sample:5>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a.b)]", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "/ab2020-01-01", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"t", "<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "', '"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1E-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"before", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: tr...#203#-471540594", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: tr...#253#-1522322273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "2020-02-3", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#258#-503144193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#212#-1729789414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.25123456779012345678901234567890", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "B5.2020-01-01"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"'  (", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"0"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<sample:0>", "-1073741824"}}, 3), new String[][]{{"setSeconds", "int", "3"}, {"getSeconds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"{\""}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"TITLE\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:z>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<sample:6>", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PU1,", "<sample:4>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#260#-1726743263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hello, W2orld", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1.5", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c,Hello, World", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<a>b</a>Hello, World", "<sample:6>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0/0", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", "java.util.TimeZone", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1E-5-1.5", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#1672272097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#1672272097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"yyyy-MM-dd", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#257#-239600537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2021-02-30T25:61:61", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}}, 3), new String[][]{{"before", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "0x12345678", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "010"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=true, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"ssrct", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "+00:00\\d\\d\\d\\d[-]\\d\\d[-]\\d\\Ld"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"a>b</a>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c,Hello, World", "<sample:5>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2021-02-30T25:61:6", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "a,b,c,Helmo, World"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}}, 1), new String[][]{{"withTimeZone", "java.util.TimeZone", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: t...#253#266206670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:2>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2), new String[][]{{"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: tr...#253#-1522322273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"60000"}, false, 0, null, 3), new String[][]{{"toLocaleString", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dec 31, 1969, 4:01:00 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"[12]"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/10", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", "java.lang.String,java.text.ParsePosition", "b ", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"B5.", "<sample:7>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"set2DigitYearStart", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "9", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:1>", "29999"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"2021-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<empty>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:1>", "-37"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d", "<sample:8>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:0>", "-60001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "B5.", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#-1515864037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/10", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:1>", "<sample:2>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.24"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}), new String[][]{{"setTimeInMillis", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2E-5", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", "java.lang.Boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"60000", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"getGregorianChange", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 04 16:00:00 PST 1582 {getDate=4, getDay=4, getHours=16, getMinutes=0, getMonth=9, getSeconds=0, getTime=-12219292800000, getTimezoneOffset=480, getYear=-318}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"`bc", "<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", "java.lang.String,java.text.ParsePosition", "1.5f", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:1>", "-60001"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<sample:0>", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c,Hello, World", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#261#1007302239", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<empty>", "-64"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#206#174667240", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#260#-1515899891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"withTimeZone", "java.util.TimeZone", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1x5", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/ab2/;0-01-01", "<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"214748364"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:3>", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_equals", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<b:false>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"0xFFFFeFFF"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", "java.lang.String,java.text.ParsePosition", "-1.5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false), new String[][]{{"parse", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.24", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false), new String[][]{{"getGreatestMinimum", "int", "6"}, {"getMinimalDaysInFirstWeek", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"truePT1H"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", "java.util.TimeZone", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"lenu", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{",1.5", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"setRawOffset", "int", "3"}, {"getDisplayName", "boolean,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "1.12345688"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: tr...#253#-1522322273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1234567890123456", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:3a>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#255#-942662804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#212#-1729789414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:2>", "<empty>", "<sample:2>", "<sample:1>"}}), new String[][]{{"setLenient", "boolean", "6"}, {"getCalendar", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#265#-1497434916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1.5d5.", "<sample:6>"}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"011"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=11, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "P"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"isLenient", "", "6"}, {"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "1.25b", "<null>"}}), new String[][]{{"withLocale", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: a_0, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#257#-239600537", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"clone", "", "6"}, {"clone", "", "7"}, {"parse", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xdFFFeFFF", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<empty>", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2021-02-30T25:61:61"}, false, 5, new String[][]{}), new String[][]{{"getYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("121", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"TITLE1.1234567890123456"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:5>", "<sample:1>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:5>", "<empty>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#260#-1726743263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"1.1234567H90123456"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "11--1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1H", "<sample:3>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:2>", "2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x1234567891L", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.1244567", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#1672272097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: a, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"I12:30:45", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#205#1780167131", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:4>", "<sample:2>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "t", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<null>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"0"}, false), new String[][]{{"getTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"20", "<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=20, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0xFFFFeFFF"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}}), new String[][]{{"withLenient", "java.lang.Boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#255#-942662804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFeFFF+0000", "<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"setNumberFormat", "java.text.NumberFormat", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "6"}, {"getMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"21448364"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 21:57:28 PST 1969 {getDate=31, getDay=3, getHours=21, getMinutes=57, getMonth=11, getSeconds=28, getTime=21448364, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "/a.b)n]", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"isColonIncludedInTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#1672272097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}), new String[][]{{"withLocale", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: sample, lenie...#259#291701296", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#257#-239600537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\tI", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}), new String[][]{{"getLeastMaximum", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:5>"}}), new String[][]{{"isColonIncludedInTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#203#-477000779", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"5.[one of: '"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"10", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"getMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#262#269917359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:8>", "<sample:8>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}), new String[][]{{"isColonIncludedInTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--01", "<sample:4>"}}), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", "java.lang.Boolean", "<null>"}}), new String[][]{{"withColonInTimeZone", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1/24", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", "java.lang.StringBuffer,int", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0_SAMPLE, len...#262#249110607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"clone", "", "7"}, {"useDaylightTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Tiitle"}}), new String[][]{{"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_format", new String[]{"java.util.TimeZone", "java.util.Locale", "java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:7>", "-60001"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "+00:000", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=2, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withColonInTimeZone", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#252#-592810689", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (strict)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: false) {isColonIncludedInTimeZone=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition", "214748364", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2021-02-30T25:61:61", "<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Mar 02 18:02:01 PST 2021 {getDate=2, getDay=2, getHours=18, getMinutes=2, getMonth=2, getSeconds=1, getTime=1614736921000, getTimezoneOffset=480, getYear=121}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "6"}, {"getDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getRawOffset", "", "3"}, {"getOffsetsByWall", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true), new String[][]{{"format", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678I", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_getCalendar", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false), new String[][]{{"compareTo", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"capacity", "", "3"}, {"insert", "int,char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false), new String[][]{{"setTimeZone", "java.util.TimeZone", "1"}, {"parse", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21447483648", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseDate", "java.lang.String,java.text.ParsePosition", "a b5.", "<sample:3>"}}), new String[][]{{"setHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Dec 08 16:38:03 PST 243010 {getDate=8, getDay=6, getHours=16, getMinutes=38, getMonth=11, getSeconds=3, getTime=-7730918637716352, getTimezoneOffset=480, getYear=241110}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<empty>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#258#-503144193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#258#-503144193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:10>", "<empty>", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00.000+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:5>"}}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: _A, lenient: ...#255#65097800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<sample:0>", "<sample:1>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "0"}, {"isDirty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "-/.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: , lenient: nu...#253#1165470726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "."}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "0"}, {"codePointAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}), new String[][]{{"isColonIncludedInTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: 0, lenient: f...#255#-838435376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false), new String[][]{{"getNumberFormat", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 1, new String[][]{}), new String[][]{{"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-0.0", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:2>"}, true), new String[][]{{"setDateFormatSymbols", "java.text.DateFormatSymbols", "5"}, {"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "t"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false), new String[][]{{"getCalendar", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"setMinutes", "int", "0"}, {"getTimezoneOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0_sample, l...#263#2140236438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_format", "java.util.TimeZone,java.util.Locale,java.util.Date,java.lang.StringBuffer", "<sample:5>", "<sample:4>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<null>", "-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_parseAsISO8601", "java.lang.String,java.text.ParsePosition", "i60000", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: 0_SAMPLE, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<i:52>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: true) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"'M(", "<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: a_0, lenient:...#256#-1090010247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}), new String[][]{{"setMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:02:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=2, getMonth=11, getSeconds=0, getTime=120005, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isColonIncludedInTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null], locale: en_US, lenien...#258#1171928962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLenient", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, null, 1), new String[][]{{"getCalendar", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_formatBCEYear", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<empty>", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
