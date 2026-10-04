package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "\t", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1", "<sample:6>", "true"}}), new String[][]{{"getTimezoneOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "5.", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"format", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0xFFFFFFF8"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"31"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02./", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Title"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"setMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=31, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 2 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=-62167392000000, getTimezoneOffset=480, getYear=-1898}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"621740364800", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "null", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "01237456789", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3), new String[][]{{"setMonth", "int", "5"}, {"toGMTString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14 Mar 1989 02:39:24 GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1", "<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "n-lCl", "<sample:6>", "false"}}, 3), new String[][]{{"setMonth", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 31 15:59:59 PST 178955003 {getDate=31, getDay=5, getHours=15, getMinutes=59, getMonth=4, getSeconds=59, getTime=-5647452525417600001, getTimezoneOffset=480, getYear=178953103}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"(locale: ", "<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"[1Hello, Wnrld"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:yb>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "-1.5", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", ".5", "<sample:6>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"A111C-urnue--1", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "-1.5", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"yyyy-MM-dd", "<sample:10>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", ">aa[aaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"B111C-5rnue", "<sample:12>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "123456789012345678901234567890", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"1_E-\n(2020-02-30T25:61:61", "<sample:10>", "false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "-[00m0-0/2-/1", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1E-5", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "+"}}, 2), new String[][]{{"toInstant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("0020-02-29T02:02:01Z {getEpochSecond=-61530962279, getNano=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"yyyyy-MM-dd", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-02-30T25:\t[61:61"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-02-30T25:61:61\t"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-0T-3:61:61+1\u00e9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Title", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "3020-te;3.:UU25+1:61"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-0T-3:61:61+1\u00e9abc", "<sample:12>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"ul.l1.12345678null", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", ">`a[aaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "49#0-i,J3Z"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, World)"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, World)"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1.5", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, World)"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1.5", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, Lorld)"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0", "<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, Lorld)"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, Lorld)"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"M", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Iy", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<null>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"MMUTC", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "I1", "<sample:12>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"xnMUTCo", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "I1", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<empty>", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"H\nello,!World-0.0", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "u"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"H\nello,!World-0.0", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "u"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "2020-01-01", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"setNumberFormat", "java.text.NumberFormat", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L1e10", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"abc", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345668", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getOffsetsByWall", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1("}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.5e300", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1", "<sample:6>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{".1(01W23a4567\u00e99"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.5e30I\", \"", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-02-30T25:61:61", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1", "<sample:6>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "abc"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"11154"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "1.5e30I\",  \"", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-02-30T25:61:61", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}}, 1), new String[][]{{"getTimezoneOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("480", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}}, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"setCalendar", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: a) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "a", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--11", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "--1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "--1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{":12D0000-0.010x1234567891.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "PT1H", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"applyLocalizedPattern", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1903-05-05T14:07:08.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"append", "char[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "o<If"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "/ax/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "/ax/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"010"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=10, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"applyPattern", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getDisplayName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Coordinated Universal Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:?>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0123x456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: a) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", ".1(01W23a4567\u00e99", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample__a) {is...#213#1059971973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", ".1(01W23ca4567\u00e99", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 2), new String[][]{{"format", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.002+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", ".1(01W23ca4567\u00e99", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 2), new String[][]{{"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:2>"}}, 1), new String[][]{{"getHours", "", "1"}, {"setMonth", "int", "4"}, {"setHours", "int", "7"}, {"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"214748648", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}}, 1), new String[][]{{"getHours", "", "1"}, {"setMonth", "int", "4"}, {"setHours", "int", "7"}, {"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"214748648", "<null>"}, false, 1, new String[][]{}, 1), new String[][]{{"getHours", "", "1"}, {"setMonth", "int", "4"}, {"setHours", "int", "7"}, {"getDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "/a/b", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getCalendar", "", "7"}, {"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-/"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "0xFFFFFFF8"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5dI", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#208#-288163767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "DateFormat ", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: )", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#206#-956014997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#211#-98189449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"yyyy-MM-dd", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{")", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "Hel4loo, World)"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<empty>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<null>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=1, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "-1"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"H\nello, World", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L1e10", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<empty>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "00"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001+0000 {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "00"}}), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+00000.0 {length=36}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Title", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464+0000 {length=33}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<empty>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<empty>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}), new String[][]{{"codePointBefore", "int", "3"}, {"substring", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getOffsetsByWall", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"H\nello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true), new String[][]{{"getDSTSavings", "", "3"}, {"hasSameRules", "java.util.TimeZone", "0"}, {"getDisplayName", "boolean,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"Hello World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1", "<sample:6>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: sample__a) {isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1970-01-01T00:00:00.000+0000 {length=34}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<empty>", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}}), new String[][]{{"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000+0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"/a/b", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.12345678", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"Hel4loo, World)", "<sample:0>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"0x123456789", "<sample:0>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"0x123456789", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"01237456789", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"0123x456789", "<sample:3>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "-0.0"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1.5e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", "java.lang.String,java.text.ParsePosition", "a", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#-2058956532", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "--1", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getDefaultTimeZone", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"applyLocalizedPattern", "java.lang.String", "4"}, {"getNumberFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#-163332241", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"00"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}}), new String[][]{{"getSeconds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:11>"}, false), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1L"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample190690351-02-20T17:43:26.464+0000 {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "1L"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample190690351-02-20T17:43:26.464+0000 {length=39}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#206#828275690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}), new String[][]{{"getHours", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}), new String[][]{{"getHours", "", "1"}, {"setMonth", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Aug 31 16:00:00 PDT 178958939 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=7, getSeconds=0, getTime=5647336501791600001, getTimezoneOffset=420, getYear=178957039}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}}), new String[][]{{"getHours", "", "1"}, {"setMonth", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Aug 31 16:00:00 PDT 178958939 {getDate=31, getDay=1, getHours=16, getMinutes=0, getMonth=7, getSeconds=0, getTime=5647336501791600001, getTimezoneOffset=420, getYear=178957039}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"getTimeZone", "", "2"}, {"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"getTimeZone", "", "2"}, {"getOffsets", "long,int[]", "7"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:false>"}}), new String[][]{{"getTimeZone", "", "2"}, {"getOffsets", "long,int[]", "7"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<b:false>"}}), new String[][]{{"getTimeZone", "", "2"}, {"getOffsets", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getCalendar", "", "7"}, {"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Mar 01 18:02:01 PST 2020 {getDate=1, getDay=0, getHours=18, getMinutes=2, getMonth=2, getSeconds=1, getTime=1583114521000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:\t[61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2020-02-/"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hel4loo, Lorld)", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hel4loo, Lorld)", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}), new String[][]{{"getMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Jan 25 12:31:23 PST 1970 {getDate=25, getDay=0, getHours=12, getMinutes=31, getMonth=0, getSeconds=23, getTime=2147483648, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0_SAMPLE) {isL...#213#1985935208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"set2DigitYearStart", "java.util.Date", "4"}, {"getTimeZone", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"Hel4lloo, Worle(<a>b</a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}}), new String[][]{{"insert", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("19370-01-01T00:00:00.000+0000 {length=29}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"nA1112.12.45678901234567"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"nA1112.12.45678901134567(loca{e: "}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<empty>"}, true), new String[][]{{"applyPattern", "java.lang.String", "1"}, {"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "6"}, {"append", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PMkey {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<empty>"}, true), new String[][]{{"applyPattern", "java.lang.String", "1"}, {"format", "java.util.Date,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getLastRuleInstance", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getLastRuleInstance", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getLastRuleInstance", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"setLenient", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#210#-965997657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 16, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#211#-98189449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#206#486434458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"getDateFormatSymbols", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BC, AD], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[January, February, March, April, May, June, July, August, S.., getShortMonths=[Jan, Feb, Mar, Apr, May,...#388#-1242400131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<empty>", "<sample:4>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thu, 01 Jan 1970 00:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<sample:0>"}, true), new String[][]{{"applyPattern", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234567890123456", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234567890123456", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234567890123456", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234567890123456", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "1.1234567890123456", "<sample:1>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a) {isLenient=...#205#998966735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"inDaylightTime", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"applyLocalizedPattern", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "\n", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#210#-965997657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"1.5d", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"Hel4loo, Lorld)", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"Hel4loo, Lorld)", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "i", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"Hel4looz Lorld)E", "<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "ii", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"SITLE0.5", "<null>", "true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", new String[]{"java.lang.String", "java.text.ParsePosition", "boolean"}, new String[]{"2020-01-01", "<sample:0>", "false"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<empty>"}, true), new String[][]{{"toPattern", "", "6"}, {"parse", "java.lang.String,java.text.ParsePosition", "6"}, {"getDateFormatSymbols", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DateFormatSymbols", actual.getClass().getName());
  assertEquals("{getAmPmStrings=[AM, PM], getEras=[BCE, CE], getLocalPatternChars=GyMdkHmsSEDFwWahKzZ, getMonths=[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec,.., getShortMonths=[Jan, Feb, Mar, Apr, May...#364#-349615412", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<null>", "<empty>"}, true), new String[][]{{"toPattern", "", "6"}, {"parse", "java.lang.String,java.text.ParsePosition", "6"}, {"parse", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getOffsets", "long,int[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true), new String[][]{{"getTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getRFC1123Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=f...#205#-1566897247", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=f...#205#-1566897247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setLenient", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 2), new String[][]{{"getTimeZone", "", "6"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=f...#205#-1566897247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 2), new String[][]{{"withTimeZone", "java.util.TimeZone", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}, 2), new String[][]{{"withTimeZone", "java.util.TimeZone", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", new String[]{"java.lang.String"}, new String[]{"00"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: a_0) {isLenien...#207#1528169024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "clone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", "java.util.Locale", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _A) {isLenient...#207#-510020641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02-/", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"3"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02./", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Title"}}), new String[][]{{"setMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=3, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"31"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02./", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "looksLikeISO8601", "java.lang.String", "Title"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"setMinutes", "int", "2"}, {"getSeconds", "", "0"}, {"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"32"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02./", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:0>"}}, 3), new String[][]{{"setMinutes", "int", "2"}, {"getSeconds", "", "0"}, {"getYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parse", new String[]{"java.lang.String"}, new String[]{"000"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsISO8601", "java.lang.String,java.text.ParsePosition,boolean", "2020-02./", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "isLenient", ""}}, 3), new String[][]{{"setMinutes", "int", "3"}, {"after", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}}), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}}, 3), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}, {"before", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "setTimeZone", "java.util.TimeZone", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}}, 3), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US) {isLeni...#209#813566754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "_clearFormats", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "parse", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:2>"}}, 3), new String[][]{{"getNumberFormat", "", "2"}, {"setCalendar", "java.util.Calendar", "3"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "parseAsRFC1123", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1234567", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "withTimeZone", "java.util.TimeZone", "<sample:0>"}}), new String[][]{{"length", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample__a) {is...#213#1059971973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: 0) {isLenient=...#205#-571584546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.StdDateFormat", "getTimeZone", ""}, {"com.fasterxml.jackson.databind.util.StdDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: ) {isLenient=t...#204#517088232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: sample) {isLen...#210#-405365422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.StdDateFormat", "com.fasterxml.jackson.databind.util.StdDateFormat", "getISO8601Format", new String[]{"java.util.TimeZone", "java.util.Locale"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 3), new String[][]{{"applyPattern", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
