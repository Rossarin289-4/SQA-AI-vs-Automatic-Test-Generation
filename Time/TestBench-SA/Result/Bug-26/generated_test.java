package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:10>", "-2097779"}, false, 14, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, -34, -57, -779]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "add", "long,long,int", "-485345310999208287", "-1", "326564"}}), new String[][]{{"roundHalfEven", "long", "3"}, {"getDifferenceAsLong", "long,long", "3"}, {"add", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("604800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.ZonedChronology", "era", ""}}), new String[][]{{"getValue", "long,long", "2"}, {"getValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "set", "long,int", "60000", "59999"}, {"org.joda.time.field.LenientDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-2097779", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2145385869", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"326566"}, true), new String[][]{{"convertUTCToLocal", "long", "2"}, {"getShortName", "long", "5"}, {"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"5546345482340108586"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<null>", "8714085824173290600"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millisOfSecond", ""}}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}, {"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hashCode", ""}, {"org.joda.time.chrono.ZonedChronology", "millisOfDay", ""}}, 1), new String[][]{{"getValueAsLong", "long,long", "0"}, {"add", "long,long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "minuteOfHour", ""}}, 3), new String[][]{{"getMillis", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("63504000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withUTC", ""}, {"org.joda.time.chrono.ZonedChronology", "seconds", ""}}), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial", "0"}, {"remainder", "long", "1"}, {"getLeapDurationField", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getShortName", new String[]{"long", "java.util.Locale"}, new String[]{"3600001", "<empty>"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UTC"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-6471952376487863581"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuries", new String[]{}, new String[]{}, false), new String[][]{{"getDifferenceAsLong", "long,long", "3"}, {"subtract", "long,long", "5"}, {"getDifference", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "useTimeArithmetic", new String[]{"org.joda.time.DurationField"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "326566", "326565", "43200000", "43199999", "-2147483648", "3600001", "1"}}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "weekyears", ""}}), new String[][]{{"getDifferenceAsLong", "long,long", "1"}, {"add", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "year", new String[]{}, new String[]{}, false), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}, {"getAsText", "int,java.util.Locale", "6"}, {"getMinimumValue", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292268511", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getInstance", new String[]{"org.joda.time.DateTimeField", "org.joda.time.Chronology"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "weekyear", ""}, {"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:3>"}}), new String[][]{{"getDifferenceAsLong", "long,long", "7"}, {"getDifference", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hours", ""}, {"org.joda.time.chrono.ZonedChronology", "toString", ""}}), new String[][]{{"getDifferenceAsLong", "long,long", "5"}, {"getMinimumValue", "org.joda.time.ReadablePartial", "2"}, {"getRangeDurationField", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"<null>"}, true), new String[][]{{"getNameKey", "long", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-01:00 {getID=-01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:3.0>"}}), new String[][]{{"subtract", "long,int", "2"}, {"getDifferenceAsLong", "long,long", "4"}, {"subtract", "long,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4996", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"0", "59999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"-1079258847191166849"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}, {"org.joda.time.DateTimeZone", "getName", "long", "-485345310999208286"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hourOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getAsText", "long,java.util.Locale", "7"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "5"}, {"set", "long,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.ZonedChronology", "era", ""}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-35998", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hourOfDay", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hashCode", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}, {"org.joda.time.chrono.ZonedChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:7>", "-2097779", "10"}}), new String[][]{{"getDifferenceAsLong", "long,long", "7"}, {"roundHalfCeiling", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1716352", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfEra", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.chrono.ZonedChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<sample:2>"}, {"org.joda.time.chrono.ZonedChronology", "minuteOfDay", ""}}, 2), new String[][]{{"set", "long,int", "2"}, {"add", "long,long", "5"}, {"getDifference", "long,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292277024", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfEra", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.ZonedChronology", "minuteOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "centuryOfEra", ""}}, 1), new String[][]{{"set", "long,int", "7"}, {"getLeapAmount", "long", "1"}, {"isLeap", "long", "7"}, {"getMaximumValue", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292279536", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "-3968986277775529794", "59999", "3599999", "2147483647", "59999"}}), new String[][]{{"getDurationField", "", "6"}, {"getMillis", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hashCode", ""}, {"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:4>"}, {"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:3>", "326569"}}, 2), new String[][]{{"add", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:4>"}, {"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<null>"}}, 3), new String[][]{{"getDurationField", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "int,int,int,int", "10", "10", "10", "10"}, {"org.joda.time.chrono.ZonedChronology", "millisOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfMonth", ""}}), new String[][]{{"get", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12516", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"HST"}, true), new String[][]{{"toTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=HST,offset=-36000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,...#338#1908082162", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "monthOfYear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.chrono.ZonedChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:5>"}, {"org.joda.time.chrono.ZonedChronology", "days", ""}}), new String[][]{{"getMinimumValue", "", "4"}, {"roundCeiling", "long", "3"}, {"getAsText", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("December", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyear", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"isLenient", "", "4"}, {"addWrapField", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31449600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getAsShortText", "long,java.util.Locale", "3"}, {"add", "long,long", "1"}, {"addWrapField", "long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854655809", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1), new String[][]{{"convertLocalToUTC", "long,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "get", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "1"}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "1"}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:5>", "1048631"}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:1>", "1048631"}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfYear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "9223372036854775806"}, false, 9, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfYear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "-266338180"}, false, 9, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}, {"org.joda.time.chrono.ZonedChronology", "dayOfYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "2097276"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "-2097779"}, false, 13, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:10>", "-9007199256838771"}, false, 14, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millis", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getLeapAmount", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "-1079258847191166849", "46", "2147483647", "43199999", "59999"}, {"org.joda.time.chrono.ZonedChronology", "months", ""}}, 2), new String[][]{{"getLeapAmount", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "-1079258847191166849", "46", "2147483647", "43199999", "59999"}, {"org.joda.time.chrono.ZonedChronology", "months", ""}}, 3), new String[][]{{"getLeapAmount", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hours", ""}, {"org.joda.time.chrono.ZonedChronology", "months", ""}}, 3), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hours", ""}}, 3), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "0"}, {"roundFloor", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-352", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "days", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "days", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "getBase", ""}, {"org.joda.time.chrono.ZonedChronology", "days", ""}}, 3), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("secondOfDay {getName=secondOfDay}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:1.5>"}, {"org.joda.time.chrono.ZonedChronology", "hashCode", ""}}, 3), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("secondOfDay {getName=secondOfDay}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}, {"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:1.5>"}, {"org.joda.time.chrono.ZonedChronology", "hashCode", ""}}, 3), new String[][]{{"getMinimumValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "int,int,int,int", "1", "326565", "0", "326564"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:3.0>"}, {"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "8714085824173290599", "43200000", "59999", "0", "326564"}}, 3), new String[][]{{"getMaximumValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86399", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:3>", "<empty>"}, {"org.joda.time.chrono.ZonedChronology", "seconds", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:3.0>"}, {"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:2>", "43200000", "326564"}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<d:3.0>"}, {"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:2>", "43200000", "326564"}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86399", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"8714085824173290600", "-485345310999208287"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3789660961", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getName", new String[]{"long"}, new String[]{"-1079258847191166849"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getShortName", new String[]{"long", "java.util.Locale"}, new String[]{"-6471952376487863581", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withUTC", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2053493378", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "long,java.util.Locale", "-6471952376487863582", "<empty>"}, {"org.joda.time.field.LenientDateTimeField", "addWrapField", "long,int", "-9223372036854775797", "59999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "year", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "days", ""}, {"org.joda.time.chrono.ZonedChronology", "halfdayOfDay", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036137600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getDifference", "long,long", "43199999", "60000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-3968986277775529794"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<null>", "<sample:0>"}, {"org.joda.time.field.LenientDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:2>", "326564", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"8714085824173290600"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", "long,long", "0", "-1"}, {"org.joda.time.field.LenientDateTimeField", "getLeapAmount", "long", "-6471952376487863582"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8714085822892800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hours", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "long"}, new String[]{"60001", "43200000"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:8>", "43199999", "<null>", "60001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("104868332121660001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getParam", ""}, {"org.joda.time.chrono.ZonedChronology", "seconds", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2053493378", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"-2097779"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.ZonedChronology", "toString", ""}, {"org.joda.time.chrono.ZonedChronology", "halfdayOfDay", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial", "<sample:0>"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "monthOfYear", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getAsShortText", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:4>", "3599999", "<empty>", "3600000", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"5546345482340108586"}, false, 5, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "int,java.util.Locale", "43200000", "<sample:0>"}, {"org.joda.time.field.LenientDateTimeField", "getMinimumValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345513529600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:3>", "1", "3600001"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "eras", ""}, {"org.joda.time.chrono.ZonedChronology", "days", ""}}, 2), new String[][]{{"getMinimumValue", "", "1"}, {"getLeapAmount", "long", "2"}, {"getLeapDurationField", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922796, getMinimumValue=-2922685, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "-9223372036854775797"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"convertUTCToLocal", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hourOfDay", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePartial,long", "<sample:6>", "-3968986277775529793"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"getRangeDurationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"getField", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicMonthOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("centuryOfEra {getName=centuryOfEra}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[centuryOfEra] {getMaximumValue=2922796, getMinimumValue=-2922685, getName=centuryOfEra, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-1079258847191166849"}, false, 6, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", "long,long", "3600001", "326565"}, {"org.joda.time.field.LenientDateTimeField", "getAsText", "long,java.util.Locale", "5546345482340108586", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1079258852937600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("era {getName=era}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"getDurationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("months {getName=months}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("era {getName=era}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "60000", "<null>", "60000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"isSupported", "org.joda.time.Chronology", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"getField", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "326564", "<sample:0>", "43200001"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isSupported", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"43200001"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:2>", "<empty>"}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "roundHalfFloor", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "int,java.util.Locale", "0", "<empty>"}, {"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<null>", "2147483647", "<empty>", "3600001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"3599999", "10", "-2147483648", "3599999"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-3968986277775529793"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:12>", "-1125899904744845"}, false, 14, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getInstance", new String[]{"org.joda.time.DateTimeField", "org.joda.time.Chronology"}, new String[]{"<sample:7>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:7>", "-9223372036854775797"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "minuteOfHour", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-9223372036854775797", "-3968986277775529794"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "roundCeiling", "long", "8714085824173290599"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "-1079258847191166848"}, false, 1, new String[][]{{"org.joda.time.chrono.ZonedChronology", "minuteOfHour", ""}, {"org.joda.time.chrono.ZonedChronology", "seconds", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"3600001", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "-1079258847191166849", "46", "2147483647", "43199999", "59999"}, {"org.joda.time.chrono.ZonedChronology", "months", ""}}), new String[][]{{"getLeapAmount", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"-6471952376487863581"}, false, 7, new String[][]{{"org.joda.time.field.LenientDateTimeField", "add", "long,long", "-2097779", "0"}, {"org.joda.time.field.LenientDateTimeField", "remainder", "long", "5546345482340108585"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"-1079258847191166848", "0", "43200000", "3599999", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:2>", "60001", "<empty>", "0x1F", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "halfdays", ""}, {"org.joda.time.chrono.ZonedChronology", "minuteOfHour", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-6471952376487863581", "326566"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471159634023863581", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "long,int", "-3968986277775529795", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long,java.util.Locale", "-1079258847191166849", "<null>"}, {"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:0>", "59999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getOffsetFromLocal", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:1>", "3600000", "<sample:2>", "' is not recognised", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "2147483647", "<empty>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumTextLength", "java.util.Locale", "<sample:0>"}, {"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "long", "5546345482340108587"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getNameKey", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"43199999", "59999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"isStandardOffset", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "8714085824173290600"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-3968986277775529795", "326564"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1635004614", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"previousTransition", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"9223372036854775807"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"0", "60001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15552000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:0>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"3600000", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483652", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"43200001", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:7>", "3600001", "<empty>"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:0>", "43200001", "<sample:1>", "59999"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "isLeap", "long", "485345310999208285"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}}), new String[][]{{"set", "long,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "326565", "<null>", "59999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"59999", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59999", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDurationField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2592000000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"-6471952376487863580"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "useTimeArithmetic", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getInstance", new String[]{"org.joda.time.DateTimeField", "org.joda.time.Chronology"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"326564", "3599999", "3599999", "43200001", "43200000", "3600001", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"60000", "5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:0>", "60001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:8>", "-1", "<sample:2>", "59999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"long"}, new String[]{"326565"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumTextLength", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-9223372036854775808", "1L", "<sample:1>"}, false, 6, new String[][]{{"org.joda.time.field.LenientDateTimeField", "get", "long", "60000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"1", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:01 {getID=+01:01, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
}
