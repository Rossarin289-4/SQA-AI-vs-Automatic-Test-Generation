package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2097151"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":P1}\u00e9"}}), new String[][]{{"print", "long", "3"}, {"getChronology", "", "6"}, {"withPivotYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":PB1}\u00ea"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "onull"}}), new String[][]{{"print", "long", "3"}, {"getChronology", "", "6"}, {"withPivotYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{ \u00e9-1.5"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}}, 2), new String[][]{{"getLocale", "", "7"}, {"print", "org.joda.time.ReadablePartial", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:9>", "/QP5oaa,b,c1.5", "117440650"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<null>", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "112345678901234568:012"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.6f"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "6"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "4"}, {"parseDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMinute...#305#311528952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "4"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ""}}, 1), new String[][]{{"withOffsetParsed", "", "2"}, {"parseMillis", "java.lang.String", "2"}, {"getChronolgy", "", "1"}, {"parseDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", ">2:30:45", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "0"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}, {"minusYears", "int", "7"}, {"getFieldType", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "2.25"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:0>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "{ \u00e9-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "~"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "2097151"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.15a,b,c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "abcnull"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:8>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "A"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "2"}, {"isAfter", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 1), new String[][]{{"isSupported", "org.joda.time.DurationFieldType", "4"}, {"plusHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("07:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=7, getMillisOfDay=25200000...#294#-1434405746", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"withLocale", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}}, 3), new String[][]{{"parseMutableDateTime", "java.lang.String", "0"}, {"getMonthOfYear", "", "2"}, {"isEqual", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "117440601"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<null>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "0"}}, 1), new String[][]{{"getPrinter", "", "4"}, {"estimatePrintedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:3>", "0"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "a"}}), new String[][]{{"withOffsetParsed", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"012345r789"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1Title"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "12:30:45", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"134217729"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}}, 1), new String[][]{{"parseLocalDate", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2097174"}, false, 6, new String[][]{}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-2097174, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2097174"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-2097174, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{!a\":B1}"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "7"}, {"print", "org.joda.time.ReadablePartial", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{ \u00e9-1.5"}}, 2), new String[][]{{"getLocale", "", "7"}, {"print", "org.joda.time.ReadablePartial", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483645"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{ \u00e9-1.5"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}}, 2), new String[][]{{"getLocale", "", "7"}, {"print", "org.joda.time.ReadablePartial", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}}, 2), new String[][]{{"getLocale", "", "7"}, {"getLocale", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}}, 2), new String[][]{{"getLocale", "", "7"}, {"getLocale", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "-1"}}, 3), new String[][]{{"getLocale", "", "7"}, {"getLocale", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "\u00e9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:7>", "{\"a\"9P1}\u00e9", "134217733"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.12345678"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "{\"a\"9P1}\u00e9", "268435466"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.12345678aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "l", "-536870937"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870937", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "l", "-536870937"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870937", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:5>", "12:30:45Title", "-536870937"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "1l:30:55Title", "-536870936"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870936", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "1l:3:55Title", "-536870952"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870952", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "1l:39555Titl\ne", "-268435476"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435476", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", ".5", "-234881044"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-234881044", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:10>", "-0.0", "-2030042998"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:10>", "-0.0", "2147483647"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:10>", "-0.0", "2147483628"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!1Title1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483629", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "-0.1", "2147483615"}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!1Title1"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:2>", "123456789012345678901234567890", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483616", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "a b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:7>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:10>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:2>"}, false, 16, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "12:30:45"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<null>", "9223372036854775807"}}, 2), new String[][]{{"withOffsetParsed", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "192:30:45"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<null>", "9223372036854775807"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 1), new String[][]{{"withOffsetParsed", "", "4"}, {"getChronology", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "192:30:45"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<null>", "9223372036854775807"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 1), new String[][]{{"withOffsetParsed", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}}, 1), new String[][]{{"getZone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}}, 1), new String[][]{{"getChronology", "", "3"}, {"print", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 23, 1962", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}}, 1), new String[][]{{"getChronology", "", "3"}, {"print", "org.joda.time.ReadableInstant", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:1>", "-33554437"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:6>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<null>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<empty>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "010a,b,"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:8>", ".5", "-1073741824"}}, 2), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"getPivotYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "010a,lb,"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:8>", ".5", "-1073741812"}}, 2), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"getParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "Printing "}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "5"}, {"print", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "Printing "}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "5"}, {"getMillisOfSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "Printing "}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "5"}, {"plus", "org.joda.time.ReadablePeriod", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-05T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=5, getDayOfWeek=1, getDayOfYear=5, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-1323382816", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "5"}, {"property", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1970, getAsShortText=1970, getAsString=1970, getAsText=1970, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#2108357693", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "1024"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "b"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<empty>", "9223372036854775807"}}, 1), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "1024"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "b"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<empty>", "9223372036854775807"}}, 1), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "6"}, {"getFieldType", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "281474976646191"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "b"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<empty>", "9223372036854775807"}}, 3), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"minus", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-23T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=23, getDayOfWeek=2, getDayOfYear=357, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-1422851702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<empty>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "1Titkd"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<empty>", "9223372036854775807"}}, 1), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 45, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "0xFFFFFFFF"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 47, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:7>"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:6>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:5>", "1"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "-67108863"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}, {"printTo", "java.lang.Appendable,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "-67108863"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "-67108863"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"2/20-0-30T25:61:61"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"l"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2147483645"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.5"}}, 1), new String[][]{{"getChronology", "", "1"}, {"getPivotYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"2/20-0-30T25:61:61"}, false, 14, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "2/20-0-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "12:30:45", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1Title"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", "12:30:45", "-2097151"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Title"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=0, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"671088616"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}, {"minusDays", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-02 {getCenturyOfEra=19, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=2, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-1065135404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"671088616"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-41"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}, {"plusMonths", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-05-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=5, getDayOfYear=121, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#357#1402879693", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"56"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1Titkd"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-41"}}), new String[][]{{"isParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-41"}}), new String[][]{{"getLocale", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2097174"}, false, 13, new String[][]{}), new String[][]{{"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1073741804"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":P1}\u00e9"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"print", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":PB1}\u00ea"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "null"}}), new String[][]{{"print", "long", "3"}, {"getChronology", "", "6"}, {"withPivotYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":B1}\u00ea"}}), new String[][]{{"print", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":B1}\u00ea"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<null>", "<sample:5>"}}), new String[][]{{"print", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "{\"a\":B1}\u00ea"}}), new String[][]{{"printTo", "java.io.Writer,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-1073741824, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"Printing not supported"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:0>", "9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "{\"a\":P1}\u00e9", "-2097151"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "{\"a\":P1}\u00e9", "-2097125"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<empty>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:0>", "1.12345678901234567", "-2097151"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=-2147483648, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<null>", "1.12345678901224", "-1073742187"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:0>", "1.12345678901224", "-1073742187"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "1.12345pm{678901224", "-2147483392"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:7>", "1.12345pm{678901224", "-2147483648"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "l", "-536870937"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "1l:3:55Title", "-536870952"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:10>", "/QP5oaa,b,c1.5", "117440650"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "13:30945!"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-117440651", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false), new String[][]{{"parseLocalDate", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "192:30:45"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<null>", "9223372036854775807"}}), new String[][]{{"withOffsetParsed", "", "4"}, {"getChronology", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"onull"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}), new String[][]{{"getZone", "", "1"}, {"withZone", "org.joda.time.DateTimeZone", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:2>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}}), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"isPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<null>", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "2020-01-01"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}}), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"withZoneUTC", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "2020-01-01"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}}), new String[][]{{"isParser", "", "3"}, {"withPivotYear", "int", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"getDefaultYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "5"}, {"getMillisOfSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "F", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:0>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "5"}, {"print", "long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:2>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:2>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "7"}, {"minus", "org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-16T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=16, getDayOfWeek=2, getDayOfYear=350, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-632456640", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "-9223372036854775808"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:4>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}, {"isSupported", "org.joda.time.DateTimeFieldType", "4"}, {"getWeekOfWeekyear", "", "7"}, {"getChronology", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<empty>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<null>", "9223372036854775807"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<null>", "9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false), new String[][]{{"parseDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"getChronolgy", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false), new String[][]{{"getDefaultYear", "", "3"}, {"isParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "12:30:45"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "Hello, World"}}, 2), new String[][]{{"parseMutableDateTime", "java.lang.String", "7"}, {"add", "org.joda.time.DurationFieldType,int", "5"}, {"getZone", "", "6"}, {"getOffsetFromLocal", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "1"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false), new String[][]{{"withPivotYear", "java.lang.Integer", "3"}, {"print", "long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:5>"}}), new String[][]{{"withZoneUTC", "", "0"}, {"getDefaultYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:2>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, false), new String[][]{{"getChronolgy", "", "3"}, {"isOffsetParsed", "", "5"}, {"print", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false), new String[][]{{"parseMutableDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Saturday, October 3, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2097151"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:1>", "<sample:2>"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "1"}, {"withPivotYear", "int", "1"}, {"isPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3), new String[][]{{"getDefaultYear", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "1"}, {"withZoneUTC", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=1, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:7>", "onull", "-1073741824"}}), new String[][]{{"estimateParsedLength", "", "3"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "3"}, {"estimateParsedLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"1Title"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", "<null>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:1>", "2020-01-01", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false), new String[][]{{"parseLocalDate", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "--1"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}), new String[][]{{"getChronolgy", "", "2"}, {"parseMillis", "java.lang.String", "0"}, {"parseLocalDate", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "13:30945!"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "-41"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false), new String[][]{{"isOffsetParsed", "", "4"}, {"printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"10"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=10, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "--1"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}), new String[][]{{"getChronolgy", "", "2"}, {"parseMillis", "java.lang.String", "0"}, {"parseLocalDate", "java.lang.String", "5"}, {"toDate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<null>", "1"}}), new String[][]{{"estimatePrintedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:6>"}}, 1), new String[][]{{"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:6>"}}), new String[][]{{"estimateParsedLength", "", "2"}, {"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:5>"}}, 1), new String[][]{{"isPrinter", "", "3"}, {"print", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:5>"}}, 1), new String[][]{{"isPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:2>", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<empty>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "{\"a\":P1}\u00e9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "-9223372036854775808"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"getChronology", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2097034"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<null>"}}, 2), new String[][]{{"printTo", "java.io.Writer,long", "6"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2097034"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<null>"}}, 2), new String[][]{{"printTo", "java.io.Writer,long", "6"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2097034"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<null>"}}, 2), new String[][]{{"printTo", "java.io.Writer,long", "6"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:7>"}}), new String[][]{{"parseMillis", "java.lang.String", "5"}, {"getChronolgy", "", "3"}, {"millis", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:7>"}}), new String[][]{{"parseMillis", "java.lang.String", "5"}, {"getChronolgy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BuddhistChronology", actual.getClass().getName());
  assertEquals("BuddhistChronology[America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:7>"}}), new String[][]{{"parseMillis", "java.lang.String", "5"}, {"getChronolgy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}), new String[][]{{"parseMillis", "java.lang.String", "5"}, {"getChronolgy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "112345678901234568:0121.5e300"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "112345678901234568:0121.5e300"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "8"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<empty>", "-1"}}, 3), new String[][]{{"getDefaultYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1."}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1."}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "\u00e9"}}), new String[][]{{"millisOfDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfDay] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=86399999, getMaximumValueOverall=86399999, getMinimumValue=0, getMinimumValueOverall=0, get...#231#-1645065469", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1/"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "\u00e9"}}), new String[][]{{"millisOfDay", "", "0"}, {"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, getRange=86400000, getUnitMillis=1, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2097151"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2097151, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Monday, January 1, 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "\u00e9"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "\u00e9"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tuesday, February 2, 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"8796093022323"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 3), new String[][]{{"parseLocalDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "0"}}, 3), new String[][]{{"parseLocalDateTime", "java.lang.String", "5"}, {"compareTo", "org.joda.time.ReadablePartial", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:7>"}}, 3), new String[][]{{"estimatePrintedLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:8>"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}}), new String[][]{{"estimatePrintedLength", "", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"estimatePrintedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 27, new String[][]{}, 3), new String[][]{{"estimatePrintedLength", "", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"estimatePrintedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:1>"}}), new String[][]{{"getMinuteOfDay", "", "2"}, {"getWeekOfWeekyear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"\n1.5f"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4:00:00 PM -08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "1.12345678"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:00:00 AM -07:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "1.12345678"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:00:00 AM +00:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "1.12345678"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd:\ufffd\ufffd:\ufffd\ufffd \ufffd -08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "1{.12345678"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd:\ufffd\ufffd:\ufffd\ufffd \ufffd +00:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"{"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<null>", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", "12:30:45", "-2"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:4>"}}, 3), new String[][]{{"parseLocalDate", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", "12:30:45", "-1"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:4>"}}), new String[][]{{"parseLocalDate", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
