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
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"a b1.5d300"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "\t"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIn"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"<>b<0a>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "1.25aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2147221503"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<null>"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<null>", "0x1223456789", "0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1"}, false, 6, new String[][]{}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"withPivotYear", "java.lang.Integer", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=4, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "1"}}), new String[][]{{"getChronolgy", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:5>", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "="}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "4"}, {"parseLocalTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:9>", "1.1234567", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "2020-02-30T25:61r61true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "\n\n", "-1073741824"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "-8589934592"}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "2"}, {"getPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-2147483648"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "0"}, {"millisOfSecond", "", "0"}, {"add", "long", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.004--596:-31:-23.-648 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=2147483652, getMillisOfDay=4, getMillisOfSecond=4, g...#332#-1373255623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:0>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "-1010"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "/"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483547"}, false, 5, new String[][]{}, 2), new String[][]{{"printTo", "java.io.Writer,long", "1"}, {"withZoneUTC", "", "4"}, {"parseDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMinute...#305#311528952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "4"}, {"parseMillis", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:5>"}}, 1), new String[][]{{"parseDateTime", "java.lang.String", "1"}, {"getHourOfDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-22"}}), new String[][]{{"withPivotYear", "int", "4"}, {"parseDateTime", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"withPivotYear", "int", "4"}, {"withPivotYear", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"withOffsetParsed", "", "6"}, {"withOffsetParsed", "", "5"}, {"printTo", "java.lang.Appendable,long", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-9223372036854775808"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<empty>"}}), new String[][]{{"withLocale", "java.util.Locale", "3"}, {"parseLocalDate", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "1"}, {"parseMutableDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-\n;.0"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:5>", "2147483648", "2147483578"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"12:30:4512345789012345678901234567890"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "-9223372036854775807"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"> .5"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "-9223369837831520256"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"Printing not supported12345678u012345678901234567890"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"hI0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:6>", "<sample:1>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<empty>", "-4611686018427387904"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"01"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "9223372036854775807"}, {"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<null>", "9223372036854775807"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-9223372036854775787"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:0>", "-9223354444668731392"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-9223372036854775808"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "2146435002"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:7>", "-268435489"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"5"}, false, 7, new String[][]{}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "0"}, {"parseLocalTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}, {"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:9>", "9223372036854775807"}}, 2), new String[][]{{"isOffsetParsed", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:3>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:3>", "-9223372036854775806"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "02/"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<null>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"htp://exampLle.com/a?b=c"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:0>", "-4611686014132420606"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<null>", "9223372036854775806"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "536870913"}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "Eb"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"<>b<0a>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-2147483647, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"1.Id"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:4>", "-9223372036854775808"}}, 2), new String[][]{{"toDateTime", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1686-04-22T00:00:00.000Z {getCenturyOfEra=17, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=112, getEra=1, getHourOfDay=0, getMillis=-86400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0...#317#1346084282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "10"}}, 1), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "4"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1."}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"TITLLE"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"1325aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<empty>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-2147483648, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "abbc"}}, 1), new String[][]{{"isSupported", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:7>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:0>", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 1), new String[][]{{"parseMutableDateTime", "java.lang.String", "5"}, {"getYearOfCentury", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("dimanche 17 ao\u00fbt 292278994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "-1."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "1073741874"}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Mittwoch, 31. Dezember 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:6>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "null-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:9>", ".55", "0"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:3>", "-4611686018427387903"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"1.234567"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:5>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "2020-02-30T15:61:61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "2.5d"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:1>", "1.5e300", "-1"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "a\t b1.d300"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "-4398046511103"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:0>", "-18014398509481994"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:3>", "1e105.", "1"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPivotYear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thursday, December 19, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{".5"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "long"}, new String[]{"<sample:1>", "9223372036854775807"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getDefaultYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=true, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=-1, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483616"}, false), new String[][]{{"print", "long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1abc"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "long"}, new String[]{"<sample:2>", "-9223372036854775791"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"-\n;-00"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isParser", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:3>", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "/10"}, {"org.joda.time.format.DateTimeFormatter", "getParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", " \t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<null>", "-10"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "PT1H"}}), new String[][]{{"minusSeconds", "int", "0"}, {"minusYears", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2036-01-19T03:14:08.000-08:00 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=6, getDayOfYear=19, getEra=1, getHourOfDay=3, getMillis=2084354048000, getMillisOfDay=11648000, getMillisOfSecond=0, g...#338#-1628786216", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"18"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:4>", "<sample:1>"}}), new String[][]{{"getPrinter", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"He:l"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getParser", ""}, {"org.joda.time.format.DateTimeFormatter", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"0x123456;8"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", "java.lang.String", "I9"}}), new String[][]{{"getPivotYear", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-34"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=-34, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getChronolgy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"-10"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "Paring not suupported"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "int", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "2020-01-01", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-9223369833536552997"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sunday, March 12, -292274985", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:3>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "--1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:0>", "<sample:5>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=0, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:3>", "137438953473"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}), new String[][]{{"isPrinter", "", "3"}, {"parseMillis", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:5>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:9>", "\t-2.5", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"l"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:4>", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:3>"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false), new String[][]{{"getParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:1>", "-1"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "0a/b", "2147483464"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseDateTime", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "true1E-5"}}), new String[][]{{"estimateParsedLength", "", "0"}, {"estimateParsedLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}), new String[][]{{"getPrinter", "", "0"}, {"estimatePrintedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "PToH"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-511"}, false, 3, new String[][]{}), new String[][]{{"getDefaultYear", "", "2"}, {"getDefaultYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"a"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "L"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-05 {getCenturyOfEra=19, getDayOfMonth=5, getDayOfWeek=1, getDayOfYear=5, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-1493514415", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{}), new String[][]{{"getSecondOfDay", "", "2"}, {"centuryOfEra", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime$Property", actual.getClass().getName());
  assertEquals("Property[centuryOfEra] {get=19, getAsShortText=19, getAsString=19, getAsText=19, getLeapAmount=0, getMaximumValue=2922789, getMaximumValueOverall=2922789, getMinimumValue=0, getMinimumValueOverall=0, ...#235#490113409", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZone", "org.joda.time.DateTimeZone", "<sample:2>"}}), new String[][]{{"parseLocalDate", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-0.i"}, false, 7, new String[][]{}), new String[][]{{"getZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:2>"}}), new String[][]{{"isBeforeNow", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"9223372036854775746"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"2020,01-01"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 1, new String[][]{}), new String[][]{{"parseMillis", "java.lang.String", "1"}, {"print", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "-9223372036854775806"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "10"}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"getDefaultYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"5I"}, false, 7, new String[][]{}), new String[][]{{"dayOfWeek", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfWeek] {get=4, getAsShortText=Thu, getAsString=4, getAsText=Thursday, getLeapAmount=0, getMaximumValue=7, getMaximumValueOverall=7, getMinimumValue=1, getMinimumValueOverall=1, getName=da...#222#1371180512", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "I", "-2147483647"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "b."}}), new String[][]{{"isEqual", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:7>", "<sample:10>"}}), new String[][]{{"getMillisOfSecond", "", "1"}, {"millisOfSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#-304628391", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"estimateParsedLength", "", "0"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:5>", "1.1234567", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-9223369837563084800"}}), new String[][]{{"isPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "PT1H0x1Fnull"}}), new String[][]{{"getPivotYear", "", "5"}, {"parseLocalDate", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "200-01-011"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "tre"}}), new String[][]{{"withOffsetParsed", "", "6"}, {"getChronolgy", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"A\u00e9"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:3>"}}), new String[][]{{"isSupported", "org.joda.time.DurationFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}), new String[][]{{"printTo", "java.io.Writer,long", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483626"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "PT1H"}}), new String[][]{{"getPrinter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"1/a/b"}, false, 7, new String[][]{}), new String[][]{{"minusSeconds", "int", "0"}, {"dayOfYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=19, getAsShortText=19, getAsString=19, getAsText=19, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName=day...#221#296664780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"/\n"}, false, 3, new String[][]{}), new String[][]{{"isAfter", "org.joda.time.ReadablePartial", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:2>", "<sample:6>"}}), new String[][]{{"getParser", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"2147483621"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:7>", "-9223372036854775745"}}), new String[][]{{"isOffsetParsed", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 7, new String[][]{}), new String[][]{{"parseLocalDateTime", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:3>", "<sample:5>"}}), new String[][]{{"parseLocalDate", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-,1_"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "-9223372036854775808"}}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "6"}, {"getMonthOfYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMillis", new String[]{"java.lang.String"}, new String[]{"+1+0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}), new String[][]{{"parseLocalDateTime", "java.lang.String", "5"}, {"plusHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("246953-10-09T07:00:00.000 {getCenturyOfEra=2469, getDayOfMonth=9, getDayOfWeek=2, getDayOfYear=282, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year]...#443#722665122", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<sample:7>"}}), new String[][]{{"estimateParsedLength", "", "1"}, {"estimateParsedLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withOffsetParsed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadablePartial", "<sample:3>", "<sample:0>"}}), new String[][]{{"print", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "2"}, {"estimatePrintedLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:2>", "0"}}), new String[][]{{"parseLocalDate", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483578"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:0>", "1"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:3>", "<sample:2>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "<null>"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"estimateParsedLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:6>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"--"}, false, 3, new String[][]{}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-02T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=2, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-893201607", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronolgy", ""}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"\tP"}, false, 7, new String[][]{}), new String[][]{{"getCenturyOfEra", "", "2"}, {"getSecondOfMinute", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"e"}, false, 1, new String[][]{}), new String[][]{{"toDateTime", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T23:59:59.999Z {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=2, getDayOfYear=1, getEra=1, getHourOfDay=23, getMillis=8952767999999, getMillisOfDay=86399999, getMillisOfSecond=999, getMi...#336#-1345833296", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:9>", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Monday, April 13, 5881637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<null>", "274877906977"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-4611686018427387893"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{}), new String[][]{{"parseDateTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", ".1http://example.com/a?b=c"}}), new String[][]{{"printTo", "java.io.Writer,long", "6"}, {"isOffsetParsed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"4194303"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withChronology", "org.joda.time.Chronology", "<null>"}}), new String[][]{{"getDefaultYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194303", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}), new String[][]{{"parseMillis", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"getParser", "", "5"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"1aCbc"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-1"}, {"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"getWeekyear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "{!a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thursday, 4 4, 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"isPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"4611686018427387904"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:5>", "62"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "<a>b<//a>>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"P21I"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<null>", "-1"}}), new String[][]{{"isBefore", "org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:4>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "1e10"}}), new String[][]{{"parseLocalTime", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "1.12345678", "2147483646"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}), new String[][]{{"plusMillis", "int", "6"}, {"minusYears", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1968-01-01T00:00:00.003 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=1, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#1155747476", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"[1L"}, false, 5, new String[][]{}), new String[][]{{"getMonthOfYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"httq://example.com/a?b=c"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withLocale", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "576460752303423487"}}, 3), new String[][]{{"getChronolgy", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 2), new String[][]{{"getDefaultYear", "", "5"}, {"getChronology", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "TITTLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tuesday, February 2, 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"estimatePrintedLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"3"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:0>"}}), new String[][]{{"parseDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#317#-1006023697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"-1.56"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<sample:5>"}}), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}), new String[][]{{"getLocale", "", "0"}, {"parseMutableDateTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}, 3), new String[][]{{"isAfter", "long", "2"}, {"getDayOfYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-2147483648"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-2147483648"}}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPrinter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withLocale", "java.util.Locale", "<sample:3>"}}), new String[][]{{"parseMutableDateTime", "java.lang.String", "7"}, {"isAfter", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:7>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:2>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDateTime", new String[]{"java.lang.String"}, new String[]{"010"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:5>", "<sample:7>"}}), new String[][]{{"getValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1970, 1, 1, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<sample:2>", "-1"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withOffsetParsed", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:2>", "-0.0", "1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "-1073741824"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:6>", "<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<sample:2>", "<sample:8>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:2>", "0"}, {"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<null>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"parseLocalDate", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd \ufffd \ufffd \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "org.joda.time.ReadableInstant", "<sample:3>"}}, 3), new String[][]{{"parseLocalTime", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("00:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=0, getMillisOfDay=0, getMi...#287#-2075417548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,long", "<sample:3>", "26"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"int"}, new String[]{"-23"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}, {"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"parseMillis", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "isOffsetParsed", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"43"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "2147483587"}}, 2), new String[][]{{"parseMillis", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadablePartial"}, new String[]{"<empty>", "<null>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:2>", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:6>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,long", "<sample:1>", "-42"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "\014"}}), new String[][]{{"isParser", "", "5"}, {"print", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-9223372036854775782"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Saturday, May 16, -292275055", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "-2147483648"}}), new String[][]{{"getPrinter", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:4>", "<sample:6>"}, {"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", "0xFFFFFFFFParsing not supported"}}, 2), new String[][]{{"parseLocalDateTime", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.StringBuffer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"-2147483577"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 2), new String[][]{{"getDefaultYear", "", "0"}, {"withPivotYear", "int", "1"}, {"print", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Thursday, 4 23, 1962", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:4>", "1L", "2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withZoneUTC", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2), new String[][]{{"withPivotYear", "int", "0"}, {"getLocale", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.io.Writer", "org.joda.time.ReadableInstant"}, new String[]{"<sample:7>", "<sample:3>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:5>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"268435457"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=268435457, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withDefaultYear", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isOffsetParsed", ""}}), new String[][]{{"printTo", "java.lang.Appendable,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"nul;"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:6>", "<sample:1>"}}, 2), new String[][]{{"getValue", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getPivotYear", ""}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "[,2]"}}), new String[][]{{"print", "org.joda.time.ReadableInstant", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "print", "long", "-5"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withDefaultYear", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"[1,]"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadablePartial", "<sample:3>", "<sample:5>"}}), new String[][]{{"plus", "long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"-\n:.0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:4>", "-1"}, {"org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", "java.lang.String", "\t-2.5<a>b</a>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"01"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-05T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=5, getDayOfWeek=1, getDayOfYear=5, getEra=1, getHourOfDay=0, getMillis=374400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay...#319#709521586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 1), new String[][]{{"isPrinter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "<sample:2>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatter", "parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "<sample:10>", "1L", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1073741823"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isPrinter", ""}}), new String[][]{{"parseLocalDate", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1), new String[][]{{"getChronolgy", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseInto", new String[]{"org.joda.time.ReadWritableInstant", "java.lang.String", "int"}, new String[]{"<sample:6>", "\t", "-2147483646"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<sample:4>", "36"}, {"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"1B.5"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseMillis", "java.lang.String", "1.5e300"}}), new String[][]{{"weekyear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[weekyear] {get=1970, getAsShortText=1970, getAsString=1970, getAsText=1970, getLeapAmount=1, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimu...#256#1114473037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseDateTime", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}), new String[][]{{"isSupported", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"0e1["}, false, 7, new String[][]{}), new String[][]{{"getMillisOfSecond", "", "4"}, {"toDateTime", "org.joda.time.ReadableInstant", "7"}, {"minusHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("-243010-03-23T17:00:00.000Z {getCenturyOfEra=2433, getDayOfMonth=27, getDayOfWeek=5, getDayOfYear=207, getEra=1, getHourOfDay=17, getMillis=-7730941129200000, getMillisOfDay=61200000, getMillisOfSecon...#348#-160057376", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getLocale", ""}}, 1), new String[][]{{"parseMutableDateTime", "java.lang.String", "4"}, {"getYear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "getPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}), new String[][]{{"estimateParsedLength", "", "6"}, {"estimatePrintedLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalDate", new String[]{"java.lang.String"}, new String[]{"\t5"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.StringBuffer,long", "<empty>", "36028797018963968"}}, 3), new String[][]{{"dayOfWeek", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfWeek] {get=4, getAsShortText=Thu, getAsString=4, getAsText=Thursday, getLeapAmount=0, getMaximumValue=7, getMaximumValueOverall=7, getMinimumValue=1, getMinimumValueOverall=1, getName=da...#222#1371180512", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"long"}, new String[]{"-4611686018427387887"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tuesday, September 8, -146136543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "long"}, new String[]{"<empty>", "-9223372036854775808"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalDate", "java.lang.String", "OT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tuesday, February 16, -292274998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "print", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatter", "parseLocalTime", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseLocalTime", new String[]{"java.lang.String"}, new String[]{"1e0"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatter", "withPivotYear", "java.lang.Integer", "1"}}), new String[][]{{"getMillisOfSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withZoneUTC", new String[]{}, new String[]{}, false), new String[][]{{"parseMutableDateTime", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "printTo", new String[]{"java.lang.Appendable", "org.joda.time.ReadablePartial"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatter", "isParser", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "parseMutableDateTime", new String[]{"java.lang.String"}, new String[]{"2020,01-01"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "printTo", "java.io.Writer,org.joda.time.ReadableInstant", "<sample:1>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatter", "org.joda.time.format.DateTimeFormatter", "withChronology", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatter", "getDefaultYear", ""}}, 2), new String[][]{{"parseLocalDate", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
