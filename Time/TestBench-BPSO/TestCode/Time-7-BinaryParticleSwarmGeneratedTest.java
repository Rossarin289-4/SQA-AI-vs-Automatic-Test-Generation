package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:5>", "9223372036854775807"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "-0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"trud"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:1>", "-60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:9>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}), new String[][]{{"parseLocalDate", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}), new String[][]{{"withOffsetParsed", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "2147483642"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<null>", "Instant must not be null", "-2147483648"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1D-5/a/b"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-131073"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "+1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"withZoneUTC", "", "5"}, {"parseDateTime", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", ".51.123456789012345671.1234567\n"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"parseLocalDateTime", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "-"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"3"}, false, 3, new String[][]{}, 2), new String[][]{{"withPivotYear", "int", "7"}, {"isPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}), new String[][]{{"parseDateTime", "java.lang.String", "5"}, {"getWeekyear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:7>"}}, 2), new String[][]{{"isParser", "", "4"}, {"parseDateTime", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "0x1234556789"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "4"}, {"addWeeks", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-29T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=29, getDayOfWeek=4, getDayOfYear=29, getEra=1, getHourOfDay=0, getMillis=2448000000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#-539876478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"withLocale", "java.util.Locale", "3"}, {"print", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<null>", "16384"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "H"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"parseMillis", "java.lang.String", "1"}, {"parseMutableDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.000Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMin...#310#1116908173", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:1>", "95", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"parseDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:2>", "-9223372036854775808"}}, 2), new String[][]{{"withOffsetParsed", "", "7"}, {"getChronology", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 7, new String[][]{}), new String[][]{{"withPivotYear", "java.lang.Integer", "4"}, {"isParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "PP41H"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<null>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd \ufffd \ufffd \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:2>", "1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:4>", "-1099511627778"}, {"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1.123456789012345671.1234567\n"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "45"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"12"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "a,b,c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:6>", "17592186044426"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:1>", "Z1,2]", "66"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 5, new String[][]{}, 2), new String[][]{{"getZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<null>", "-9223372036854775808"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "-0.0h"}}, 3), new String[][]{{"estimatePrintedLength", "", "2"}, {"estimatePrintedLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "536870911"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:2>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.D23456789012345671.1234567\n"}}, 3), new String[][]{{"getParser", "", "4"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"1.123456890123"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:13>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isOffsetParsed", "", "1"}, {"withDefaultYear", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=-2147483648, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:2>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"112"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"5.1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "Titpe"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"/10"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:8>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483640"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:4>"}}, 2), new String[][]{{"parseLocalDate", "java.lang.String", "4"}, {"getYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Samstag, 16. Mai -292275055", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"32768"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=32768, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFEF"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"2020-002-30T25:61:61"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"print", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:6>"}}, 1), new String[][]{{"getPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "ab,c"}}, 2), new String[][]{{"minusMonths", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("178958940-09-01T00:00:00.000-07:00 {getCenturyOfEra=1789589, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=245, getEra=1, getHourOfDay=0, getMillis=5647336533442800000, getMillisOfDay=0, getMillisOfSe...#346#-1982730591", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "acc"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"0?F"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"--]"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<null>", "-27"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "\""}}, 1), new String[][]{{"getZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"12:30:445"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "Instant; must not be null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Donnerstag, 23. 4 1962", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:5>", "", "-2147483593"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"+\r"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "\t"}}, 1), new String[][]{{"parseMillis", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:3>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3), new String[][]{{"getPrinter", "", "7"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 2), new String[][]{{"getPivotYear", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"t"}, false, 5, new String[][]{}, 1), new String[][]{{"minuteOfDay", "", "7"}, {"compareTo", "org.joda.time.ReadablePartial", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1048576"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1048576, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:5>", "1.123456789012345671.123{567\n", "18"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"0L"}, false, 5, new String[][]{}, 3), new String[][]{{"getMillis", "", "6"}, {"minusHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:6>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1E,"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}}, 1), new String[][]{{"minus", "org.joda.time.ReadableDuration", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T23:59:59.999 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#441#1666131001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "1.4", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"withZone", "org.joda.time.DateTimeZone", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"17592186044426"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-2147483649"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.12345678901234561.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"estimateParsedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:6>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.123456789012345671.1234567\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"P41H"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.5e300PT1H"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:0>", "1.123456781.5", "67108863"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}}), new String[][]{{"getPrinter", "", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"-0.0i"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:2>", "536870912"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaa`aaaaaaa"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:4>", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:5>", "<sample:5>"}}), new String[][]{{"estimateParsedLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"a"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "17179869185"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"2020-02-30TF5:61:61"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<null>", "-1099511627778"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tuesday, February 2, 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=1, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0?1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.1234567890123456."}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "<null>", "335544330"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false), new String[][]{{"print", "long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 3, new String[][]{}), new String[][]{{"millisOfDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfDay] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=86399999, getMaximumValueOverall=86399999, getMinimumValue=0, getMinimumValueOverall=0, get...#231#-1645065469", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-2147483649"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "Title\n"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:1>", "1.1234467890123456", "57"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "-32770"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:2>", "<sample:4>"}}), new String[][]{{"isAfter", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-xF"}, false, 7, new String[][]{}), new String[][]{{"minuteOfDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime$Property", actual.getClass().getName());
  assertEquals("Property[minuteOfDay] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=1439, getMaximumValueOverall=1439, getMinimumValue=0, getMinimumValueOverall=0, getName=min...#223#1414382335", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 7, new String[][]{}), new String[][]{{"minusDays", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("-5877641-06-24T00:00:00.000-07:52:58 {getCenturyOfEra=58776, getDayOfMonth=24, getDayOfWeek=3, getDayOfYear=175, getEra=0, getHourOfDay=0, getMillis=-185542587072422000, getMillisOfDay=0, getMillisOfS...#346#-750978007", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "M", "-2147483616"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=-2147483648, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-16777206"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-16777206, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "33281"}}), new String[][]{{"getParser", "", "6"}, {"estimateParsedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "9223372036854775807"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}}), new String[][]{{"minusWeeks", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-11T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=11, getDayOfWeek=4, getDayOfYear=345, getEra=1, getHourOfDay=0, getMillis=-1785600000, getMillisOfDay=0, getMillisOfSecond=0, getMinute...#325#2000647904", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"estimateParsedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:0>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:0>", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"."}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:5>", "9223372036854775797"}}), new String[][]{{"toDateTimeToday", "org.joda.time.DateTimeZone", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<sample:6>"}}), new String[][]{{"getMinuteOfHour", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", ""}}), new String[][]{{"getChronology", "", "0"}, {"getZone", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-32764"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "15f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Monday, January 1, 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "-9223372036854775807"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "\n", "2147483647"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.123446781.5PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-60"}}), new String[][]{{"isParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, 4 22, 1686", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, -1 -1, -1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}), new String[][]{{"getDayOfMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "{\"a\":]1}"}}), new String[][]{{"getPivotYear", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false), new String[][]{{"getPivotYear", "", "7"}, {"getZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:6>", "17592185782282"}}), new String[][]{{"isParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"ab,c"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "<null>"}}), new String[][]{{"getMinuteOfHour", "", "5"}, {"isBefore", "org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"a.0i"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}), new String[][]{{"getMinuteOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"0.1"}, false, 5, new String[][]{}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"a "}, false, 5, new String[][]{}), new String[][]{{"getFields", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], DateTimeField[secondOfMinute], DateTimeField[millisOfSecond]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"estimatePrintedLength", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1.12"}, false, 5, new String[][]{}), new String[][]{{"plusMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("6053-01-23T02:07:00.000-08:00 {getCenturyOfEra=60, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=23, getEra=1, getHourOfDay=2, getMillis=128849047620000, getMillisOfDay=7620000, getMillisOfSecond=0, ...#337#2072885707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"withOffsetParsed", "", "4"}, {"isOffsetParsed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<null>", "<sample:1>"}}), new String[][]{{"getParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"iiabc"}, false, 7, new String[][]{}), new String[][]{{"minusHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("01:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=1, getMillisOfDay=3600000,...#293#1171972336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:7>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "0J"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483648"}, false), new String[][]{{"parseLocalDate", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1"}, false, 5, new String[][]{}), new String[][]{{"minusMonths", "int", "1"}, {"isEqual", "org.joda.time.ReadablePartial", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"ab,c"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "/aB>/b"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.5c300pPT1H"}}), new String[][]{{"minusMonths", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-02-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=7, getDayOfYear=32, getEra=1, getHourOfDay=0, getMillis=2707200000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfD...#320#1031131004", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isOffsetParsed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483647"}, false), new String[][]{{"print", "org.joda.time.ReadableInstant", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<null>", "9223372036854775807"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "2020\t01-01"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:4>"}}), new String[][]{{"isOffsetParsed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "2137483649"}}), new String[][]{{"plusMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:02:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=120000, ...#292#1977448951", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"centuryOfEra", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[centuryOfEra] {get=19, getAsShortText=19, getAsString=19, getAsText=19, getLeapAmount=0, getMaximumValue=2922789, getMaximumValueOverall=2922789, getMinimumValue=0, getMinimumValueOverall=0, ...#235#490113409", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<empty>", "<sample:1>"}}), new String[][]{{"getPivotYear", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1073741697"}, false), new String[][]{{"parseLocalDate", "java.lang.String", "4"}, {"toDate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 01 00:00:00 PST 1970 {getDate=1, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=28800000, getTimezoneOffset=480, getYear=70}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "92"}}), new String[][]{{"print", "long", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isParser", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "2020-0d1-01PT1H"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-4294967298"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"2E5"}, false, 5, new String[][]{}), new String[][]{{"minus", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "4"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"14"}, false), new String[][]{{"isOffsetParsed", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-1"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Title"}}), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "0"}, {"getValue", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getChronology", "", "7"}, {"parseLocalDate", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "-1099511627778"}}), new String[][]{{"hourOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=23, getMaximumValueOverall=23, getMinimumValue=0, getMinimumValueOverall=0, getName=hourOfDay...#215#329496543", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-32758"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<null>"}}), new String[][]{{"getChronolgy", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "5", "-10"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "2020-01-1"}}), new String[][]{{"estimatePrintedLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"Titlle"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"millisOfSecond", "", "0"}, {"getLeapDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1e10"}}), new String[][]{{"getChronology", "", "4"}, {"clockhourOfHalfday", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ZeroIsMaxDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:8>"}}), new String[][]{{"getChronolgy", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"65"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:5>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<null>", "-1152922604118474754"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:1>", "-1099511595010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Saturday, October 3, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147450886"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}), new String[][]{{"print", "long", "0"}, {"getPivotYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147450886", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"?"}, false, 5, new String[][]{}), new String[][]{{"monthOfYear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[monthOfYear] {get=1, getAsShortText=Jan, getAsString=1, getAsText=January, getLeapAmount=0, getMaximumValue=12, getMaximumValueOverall=12, getMinimumValue=1, getMinimumValueOverall=1, getName...#227#939221978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-25"}}), new String[][]{{"getZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "11.5d"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<empty>", "<sample:12>"}}), new String[][]{{"getChronology", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "I"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "d+1"}}), new String[][]{{"parseLocalDate", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 5, new String[][]{}), new String[][]{{"print", "org.joda.time.ReadableInstant", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false), new String[][]{{"getChronolgy", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "2147483647"}}), new String[][]{{"estimatePrintedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}), new String[][]{{"getDefaultYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:1>"}}), new String[][]{{"getPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}), new String[][]{{"getPrinter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false), new String[][]{{"getDefaultYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Saturday, June 3, 178958997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false), new String[][]{{"parseMutableDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{}), new String[][]{{"minusMonths", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("178958940-09-01 {getCenturyOfEra=1789589, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=245, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mont...#387#161382926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "4194244"}}), new String[][]{{"getLocale", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"parseMillis", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "-1099511562242"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "7"}, {"parseLocalDateTime", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"parseLocalTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.5e300PT1H"}}), new String[][]{{"getDefaultYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"5d"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:0>", "<sample:1>"}}), new String[][]{{"weekOfWeekyear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[weekOfWeekyear] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getLeapAmount=0, getMaximumValue=53, getMaximumValueOverall=53, getMinimumValue=1, getMinimumValueOverall=1, getName=week...#225#-755266739", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"i"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}), new String[][]{{"add", "long", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("-292275055-05-16T16:54:06.192-07:52:58 {getCenturyOfEra=2922750, getDayOfMonth=16, getDayOfWeek=6, getDayOfYear=136, getEra=0, getHourOfDay=16, getMillis=-9223372036825975808, getMillisOfDay=60846192,...#366#1930124693", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1.12345678"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<empty>", "<sample:1>"}}, 1), new String[][]{{"getZone", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"abd"}, false, 5, new String[][]{}), new String[][]{{"addWeeks", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-29T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=29, getDayOfWeek=4, getDayOfYear=29, getEra=1, getHourOfDay=0, getMillis=2448000000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#-539876478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"\ri"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-562949953421311"}}, 1), new String[][]{{"getValues", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "abcTITLE"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<null>", "<sample:3>"}}), new String[][]{{"parseDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Monday, April 13, 5881637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thursday, 4 23, 1962", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"5-"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "000"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"4."}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:5>", "9223372036854775807"}}, 2), new String[][]{{"millisOfSecond", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#-304628391", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"++o"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<sample:4>"}}, 1), new String[][]{{"getYearOfEra", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"print", "org.joda.time.ReadablePartial", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, October 3, 2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:4>", "1.5d", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"1.2P"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "2147483637"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"abhc"}, false, 7, new String[][]{}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#422#-829573023", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"i"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "--b"}}), new String[][]{{"add", "org.joda.time.ReadablePeriod", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-05T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=5, getDayOfWeek=1, getDayOfYear=5, getEra=1, getHourOfDay=0, getMillis=374400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay...#319#709521586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:1>", "2147483649"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.12345678{"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "1L1.5e300", "-4"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}), new String[][]{{"isAfter", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"524288"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "1.1234567890123456true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"15"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<null>", "72058693549555714"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "Thtle\n", "-262144"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483643"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:3>"}}, 3), new String[][]{{"parseMillis", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "2147483647"}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"\to"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-12"}}), new String[][]{{"print", "org.joda.time.ReadablePartial", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-1073741862"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "10"}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"P41H"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:9>"}}), new String[][]{{"plusMonths", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-02-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=7, getDayOfYear=32, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#355#-36476793", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"i"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "20"}}), new String[][]{{"era", "", "5"}, {"isLeap", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"h+1"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:7>"}}), new String[][]{{"toDateTime", "org.joda.time.ReadableInstant", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T16:00:00.001-08:00 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=16, getMillis=86400001, getMillisOfDay=57600001, getMillisOfSecond=1, getMinu...#331#-1268739818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1.5d"}}, 2), new String[][]{{"withDefaultYear", "int", "0"}, {"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147352576"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
}
