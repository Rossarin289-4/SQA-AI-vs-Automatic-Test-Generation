package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-20"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.12345678901234567"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:6>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getChronolgy", "", "6"}, {"printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "", "-2"}}), new String[][]{{"getChronolgy", "", "5"}, {"parseLocalTime", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"18874377"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:0>"}}, 3), new String[][]{{"parseMillis", "java.lang.String", "2"}, {"parseLocalDate", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "2147483648", "-2147483610"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseMutableDateTime", "java.lang.String", "3"}, {"hourOfDay", "", "7"}, {"getField", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, getRange=24, getUnitMillis=3600000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<null>", "1L", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:0>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}, {"getZone", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:9>", "2.Iu2", "2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "2010-01-01"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "<null>"}}, 3), new String[][]{{"getDayOfWeek", "", "2"}, {"addDays", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:2>", "\t", "-1"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "2"}, {"parseMillis", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}), new String[][]{{"isParser", "", "7"}, {"withLocale", "java.util.Locale", "2"}, {"withPivotYear", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "0"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "35184372088833"}}, 3), new String[][]{{"withZone", "org.joda.time.DateTimeZone", "7"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "7"}, {"isOffsetParsed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", ""}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"print", "long", "4"}, {"withOffsetParsed", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "null"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "-20"}}), new String[][]{{"getSecondOfMinute", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "0\"H10tuue\037"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1-12"}}, 3), new String[][]{{"withLocale", "java.util.Locale", "2"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "4"}, {"printTo", "java.io.Writer,long", "2"}, {"parseLocalDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", ".+5"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "--1"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:6>"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:3>"}}, 3), new String[][]{{"withPivotYear", "java.lang.Integer", "6"}, {"withLocale", "java.util.Locale", "2"}, {"parseDateTime", "java.lang.String", "0"}, {"plusHours", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T01:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=1, getMillis=32400000, getMillisOfDay=3600000, getMillisOfSecond=0, getMinute...#327#-330866256", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:2>"}}, 3), new String[][]{{"getLocale", "", "2"}, {"withZoneUTC", "", "6"}, {"parseDateTime", "java.lang.String", "0"}, {"plusMonths", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("178958940-08-01T00:00:00.000Z {getCenturyOfEra=1789589, getDayOfMonth=1, getDayOfWeek=1, getDayOfYear=214, getEra=1, getHourOfDay=0, getMillis=5647336530739200000, getMillisOfDay=0, getMillisOfSecond=...#341#-724160520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:4>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"withPivotYear", "java.lang.Integer", "4"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "7"}, {"isPrinter", "", "0"}, {"getParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:7>"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "1"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<empty>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "3"}, {"print", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "3"}, {"print", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"getChronolgy", "", "2"}, {"parseLocalTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-20"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"Parsing not supported-1"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-20"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:0>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "PT1H"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:0>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "PT1H"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", ".5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 3), new String[][]{{"withDefaultYear", "int", "5"}, {"getChronology", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "0xFFFFFFFF"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:9>"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:1>", "-2303591217989943296"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"224H483648"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0x123456789"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0x123456789"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ".5"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ".5"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 2), new String[][]{{"getMinuteOfHour", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1e10"}}, 3), new String[][]{{"getChronolgy", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1073741815"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 2), new String[][]{{"getChronolgy", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1073741815"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1073741815, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"4150"}, false, 9, new String[][]{}, 2), new String[][]{{"isPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483647"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}}, 1), new String[][]{{"isPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "35184372088833"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1e10"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.5d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "35184372088833"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "1"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1e10"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.5d"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "-20"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "TITLLE1E-5", "2075"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:1>", "17592186044417"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.25"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "9223372036854775807"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"18874360"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:1>"}}, 3), new String[][]{{"parseMillis", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "0"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-1"}}, 2), new String[][]{{"getLocale", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "0"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-53"}}, 2), new String[][]{{"getLocale", "", "4"}, {"parseLocalDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "0"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-53"}}, 2), new String[][]{{"getLocale", "", "4"}, {"parseLocalDateTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-53"}}, 2), new String[][]{{"getLocale", "", "4"}, {"withOffsetParsed", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-53"}}, 2), new String[][]{{"getLocale", "", "4"}, {"parseLocalDateTime", "java.lang.String", "5"}, {"plusSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("2038-01-19T03:14:07.000 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=2, getDayOfYear=19, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#434#2007765352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:3>", "202/p-00-01", "2147483647"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "a ba"}}, 2), new String[][]{{"parseMillis", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "2147483648", "-2147483610"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "2147483648", "-2147483610"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseLocalDateTime", "java.lang.String", "3"}, {"minusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1966-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=6, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#417#1084190732", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "2147483648", "-2147483610"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseLocalDateTime", "java.lang.String", "3"}, {"minusYears", "int", "7"}, {"plus", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1966-01-10T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=10, getDayOfWeek=1, getDayOfYear=10, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#419#1388163011", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "2147483648", "-2147483610"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseMutableDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "214748364d", "-1073741805"}}, 1), new String[][]{{"getChronology", "", "5"}, {"parseMutableDateTime", "java.lang.String", "3"}, {"hourOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=23, getMaximumValueOverall=23, getMinimumValue=0, getMinimumValueOverall=0, getName=hourOfDay...#215#329496543", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "215747", "-1073741805"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:6>"}}, 2), new String[][]{{"withZoneUTC", "", "5"}, {"isParser", "", "3"}, {"isPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"estimateParsedLength", "", "7"}, {"estimateParsedLength", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "5"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"printTo", "java.io.Writer,long", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "2"}, {"parseLocalDateTime", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"printTo", "java.io.Writer,long", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "2"}, {"parseLocalDateTime", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<null>", "<sample:2>"}}, 3), new String[][]{{"printTo", "java.io.Writer,long", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:5>", "9223372036854775807"}}, 3), new String[][]{{"getPivotYear", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "2"}, {"getChronolgy", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:0>", "-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "5"}, {"print", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sunday, August 17, 292278994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "5"}, {"print", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1073741823"}, false, 0, null, 1), new String[][]{{"isParser", "", "2"}, {"withOffsetParsed", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1073741823, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1073741823"}, false, 0, null, 1), new String[][]{{"isParser", "", "2"}, {"withOffsetParsed", "", "6"}, {"isParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "5"}, {"estimateParsedLength", "", "4"}, {"estimateParsedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"estimatePrintedLength", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "0"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-20"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-20"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false), new String[][]{{"getZone", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, false), new String[][]{{"getZone", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"printTo", "java.io.Writer,long", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:3>", "-0.0", "10"}, {"org.joda.time.format.DateTimeFormatter", "getParser", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=10, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:3>", "-0.0", "10"}, {"org.joda.time.format.DateTimeFormatter", "getParser", ""}}), new String[][]{{"isParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "\t", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "\t", "-2"}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:0>", "-20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "a,b,c"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "i"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "a,b,c"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "h"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"isOffsetParsed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false), new String[][]{{"getChronolgy", "", "6"}, {"printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getChronolgy", "", "6"}, {"parseMutableDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMinute...#306#-491275061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getChronolgy", "", "6"}, {"parseMutableDateTime", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getChronolgy", "", "6"}, {"parseMutableDateTime", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getChronolgy", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"getChronolgy", "", "2"}, {"parseLocalTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "2147483648"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"getChronolgy", "", "5"}, {"parseLocalTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}}), new String[][]{{"getChronolgy", "", "5"}, {"parseLocalTime", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "", "-2"}}), new String[][]{{"getChronolgy", "", "5"}, {"parseLocalTime", "java.lang.String", "2"}, {"getMinuteOfHour", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false), new String[][]{{"parseMutableDateTime", "java.lang.String", "0"}, {"addMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:02:00.000Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=120000, getMillisOfDay=120000, getMillisOfSecond=0, getMinuteOfDay=2,...#318#265238062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:0>"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "\t", "4151"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:2>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "\t", "4150"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:4>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "\t", "528438"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:3>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:5>", "0xFFFFFFFF", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}), new String[][]{{"print", "org.joda.time.ReadablePartial", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "2020-01-01", "4151"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"5."}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:9>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:2>", "-9223372036854775808"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0x123456789"}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}), new String[][]{{"getMinuteOfHour", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.1234567"}}), new String[][]{{"getChronolgy", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=10, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:3>", "35184372088833"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "a b"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:4>", "17592186044417"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "a b"}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<empty>", "<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false), new String[][]{{"getPivotYear", "", "7"}, {"isOffsetParsed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:2>"}}), new String[][]{{"estimateParsedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"4151"}, false), new String[][]{{"parseMillis", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:6>", "0x123456789abc", "-53"}}), new String[][]{{"getLocale", "", "4"}, {"parseLocalDateTime", "java.lang.String", "5"}, {"plusSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("2038-01-19T03:14:07.000 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=2, getDayOfYear=19, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#434#2007765352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false), new String[][]{{"print", "org.joda.time.ReadableInstant", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"estimateParsedLength", "", "7"}, {"estimateParsedLength", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "3"}, {"estimatePrintedLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "12:30:4,"}}), new String[][]{{"estimateParsedLength", "", "7"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"35184372088833"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "i"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}), new String[][]{{"parseLocalDate", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}), new String[][]{{"parseLocalDate", "java.lang.String", "4"}, {"era", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:2>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{","}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "1"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"getYearOfCentury", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{","}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "1"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-05T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=5, getDayOfWeek=1, getDayOfYear=5, getEra=1, getHourOfDay=0, getMillis=374400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay...#319#709521586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{","}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "1"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}}), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "6"}, {"getRoundingMode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}), new String[][]{{"isParser", "", "2"}, {"withOffsetParsed", "", "6"}, {"isParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "5"}, {"estimateParsedLength", "", "4"}, {"estimateParsedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "5"}, {"estimateParsedLength", "", "4"}, {"estimateParsedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"estimateParsedLength", "", "5"}, {"estimateParsedLength", "", "4"}, {"estimateParsedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}}, 1), new String[][]{{"estimateParsedLength", "", "5"}, {"estimateParsedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:11>", "1.1u2", "2147481558"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "2010-01-01"}, {"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}}), new String[][]{{"getDayOfWeek", "", "2"}, {"millisOfSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#-304628391", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:0>"}}), new String[][]{{"getDayOfWeek", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 1), new String[][]{{"getDayOfWeek", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 3), new String[][]{{"getDayOfWeek", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{":"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}, 3), new String[][]{{"getDayOfWeek", "", "2"}, {"addDays", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"35184372088833"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"35184388866049"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("vendredi 12 d\u00e9cembre 3084 \u00e0 09:21:06 -08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"17592194435072"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lundi 23 juin 2527 \u00e0 01:40:35 -07:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"1"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mercredi 31 d\u00e9cembre 1969 \u00e0 16:00:00 -08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"129"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"129"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Mittwoch, 31. Dezember 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-15"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-1"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "+1", "10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "", "2147483647"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "", "4151"}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<empty>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4152", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:8>", "", "-4151"}, false, 14, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<empty>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "print", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4151", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "novll"}}, 3), new String[][]{{"withZoneUTC", "", "1"}, {"parseLocalTime", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 3), new String[][]{{"withZoneUTC", "", "1"}, {"parseLocalTime", "java.lang.String", "3"}, {"getChronology", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 3), new String[][]{{"withZoneUTC", "", "1"}, {"parseLocalTime", "java.lang.String", "3"}, {"withField", "org.joda.time.DateTimeFieldType,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "3"}, {"parseLocalTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "7"}, {"parseLocalTime", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 11, new String[][]{}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "7"}, {"parseMutableDateTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "7"}, {"parseMutableDateTime", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:1>", "010", "10"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ".0.0"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "a b"}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "7"}, {"parseMutableDateTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "PT1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"4-"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "2020-01-01"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:1>", "--1", "20"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:0>", "--1", "20"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "--1", "-2147483609"}, false, 11, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:1>", "--1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-2147483609"}, false, 10, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-1"}, {"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "85"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "0x1F"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:0>", "1.1234567890123456", "4151"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Saturday, May 16, -292275055", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"estimatePrintedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"estimatePrintedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"estimatePrintedLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "6"}, {"estimatePrintedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "6"}, {"estimatePrintedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}), new String[][]{{"estimatePrintedLength", "", "6"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "010a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2147483647"}}), new String[][]{{"printTo", "java.lang.Appendable,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-2147483647"}}), new String[][]{{"isOffsetParsed", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "Pqinting not supported", "2147483647"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "Pqintjng not supported2147483648", "-2147483648"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "Qqintjng not supported2147483648\u00e9", "-2147483620"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483620", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "Instant must not!be nulla b", "-1073741824"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "Inttant mustF nptDbe!nulla b", "1073741790"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741791", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "Inttant mustF nptDbe!nulla b", "2147483580"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483581", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "12:30:45", "2147483639"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "12:30:45", "-2147483648"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "12:30:45", "2147483647"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<null>", "12:30:45", "2147483647"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "22:30:45", "2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "22:30:35", "-24"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:4>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:9>", "Hello, World", "0"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "5"}, {"print", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:9>"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "11L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"getPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:9>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "hh"}, {"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "la3"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false), new String[][]{{"parseLocalDate", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"print", "org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false), new String[][]{{"parseLocalDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-1"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<null>", "-9223372036854775808"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "PT1H"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "-20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "a b"}}, 1), new String[][]{{"printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Monday, April 13, 5881637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
