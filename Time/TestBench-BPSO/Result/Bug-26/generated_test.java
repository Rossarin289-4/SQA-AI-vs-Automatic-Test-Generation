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
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"7199998"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-3968986277775529794user.timezone"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:0>", "<sample:8>"}, true), new String[][]{{"getZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"326564", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "int"}, new String[]{"-7937972555550535298", "-119998"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7938288148657735298", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millis", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "year", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addWrapField", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "days", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"add", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "1"}, {"getShortName", "long,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+596:31:23.647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "monthOfYear", new String[]{}, new String[]{}, false), new String[][]{{"getDifference", "long,long", "7"}, {"add", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7776000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false), new String[][]{{"getDifferenceAsLong", "long,long", "5"}, {"getMaximumValue", "long", "6"}, {"getDifferenceAsLong", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "7"}, {"add", "long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getInstance", new String[]{"org.joda.time.DateTimeField", "org.joda.time.Chronology"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getInstance", new String[]{"org.joda.time.DateTimeField", "org.joda.time.Chronology"}, new String[]{"<sample:10>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "days", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "toString", ""}, {"org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", ""}}, 3), new String[][]{{"getMillis", "int", "1"}, {"getValue", "long,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "int,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<null>", "-6471952376487863580"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376487863580", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withUTC", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false), new String[][]{{"add", "long,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3155673599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "seconds", ""}}, 1), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("999", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<i:2>"}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<null>"}}), new String[][]{{"getMaximumValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}}), new String[][]{{"add", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3002", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getParam", new String[]{}, new String[]{}, false), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "3"}, {"getName", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-94"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-94:00 {getID=-94:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdayOfDay", new String[]{}, new String[]{}, false), new String[][]{{"remainder", "long", "6"}, {"add", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:11>", "<sample:4>"}, true), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "5"}, {"get", "org.joda.time.ReadablePeriod,long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hashCode", ""}}), new String[][]{{"getDifferenceAsLong", "long,long", "7"}, {"subtract", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4996", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMinimumValue", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "long,int,int,int,int", "326620", "3600003", "2147483647", "-56", "-2147483648"}}), new String[][]{{"isLeap", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}}, 2), new String[][]{{"getAsShortText", "long,java.util.Locale", "3"}, {"addWrapField", "long,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4003", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.ZonedChronology", "days", ""}}, 1), new String[][]{{"getDifference", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "monthOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hours", ""}, {"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:5>", "8716337623986975847", "3599999"}}, 1), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "7"}, {"getLeapAmount", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}}), new String[][]{{"roundCeiling", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"getShortName", "long,java.util.Locale", "1"}, {"isStandardOffset", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "useTimeArithmetic", new String[]{"org.joda.time.DurationField"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:8>", "562949957021335"}, false, 5, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePartial,long", "<sample:6>", "-3967860376794945386"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 930803, 3, 12, 3, 41, 335]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-326564", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147157084", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfDay", new String[]{}, new String[]{}, false), new String[][]{{"add", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"roundHalfCeiling", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12516001", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:7>"}}, 3), new String[][]{{"getAsText", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UTC"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "era", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", "int,int,int,int", "-1", "-5", "330662", "-29999"}}, 3), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"5546345482340108585", "4", "36", "9", "14"}, false, 4, new String[][]{{"org.joda.time.chrono.ZonedChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482343252662", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"Pacific/Honolulu"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}}, 3), new String[][]{{"getValueAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+01"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:00 {getID=+01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdays", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-00"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "2147483647", "<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getWrappedField", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicMonthOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"-29999", "2147483647", "43200001", "-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"7199874", "2147483647", "-1", "-2147483595", "-2147483648", "30000", "326557"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "minuteOfHour", ""}}, 2), new String[][]{{"set", "long,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"5546345482340108570", "9", "-36", "2147483647", "163283"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "equals", "java.lang.Object", "<s:k/ey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"8714085824173290599"}, false, 7, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-4005015074794493802", "", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-202103"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-00:03:22.103 {getID=-00:03:22.103, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:4>", "5546345482340108586", "7199998"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-562949957021380", "2147483647"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213596026801821380", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "-9223372034707292160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--596:-31:-23.-648", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"-3968986277775529794"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3968986278643200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "year", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], --596:-31:-23.-648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"8714085824173290598", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}, {"org.joda.time.DateTimeZone", "isStandardOffset", "long", "-562915593622944"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8714085826320774246", String.valueOf(actual));
  assertEquals("receiver state after the call", "--596:-31:-23.-648 {getID=--596:-31:-23.-648, isFixed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"-3600000", "<empty>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-3600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-563499712835200"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-563502700800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "long"}, new String[]{"43201023", "52"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-935143659115310976"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMinimumValue", "long", "5546344382828480811"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-935143659590400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-2147482624"}, true, 0, null, 2), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "7"}, {"toTimeZone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=-596:31:22.624,offset=-2147482624,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=...#353#-173307267", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"65579", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-28668936", "-3968986277775529834"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1635004614", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-5546345482340108570", "-28800008"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "seconds", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "-485345310999208287"}, {"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "2", "true", "-45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-3968986277775529834"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "roundHalfFloor", "long", "-8714085824173290600"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[CopticChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getBase", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfMinute", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BuddhistChronology", actual.getClass().getName());
  assertEquals("BuddhistChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-9007199254740991"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-44", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-44", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"9223372036854775807", "DateSimeZone.setDefaumt", "<sample:1>"}, false, 1, new String[][]{{"org.joda.time.field.LenientDateTimeField", "add", "long,int", "9223372036854775807", "-4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:7>", "-1079258847190642561", "-3968986277775267649"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"342942", "-2147483648", "67108865", "3600001", "326566", "2147483647", "-3600000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "134217727", "<sample:0>", "1800000"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMinimumValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "4357042912086645292"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[138071706, 7, 4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"-6471952376487863588"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2717640000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "year", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"-8709582224545920104", "2147483647", "2147483647", "2147483647", "-59999"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:2>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{" -1.51"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyears", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:6>", "-3964482678148159338", "326545"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "weekyears", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"72057594038254500", "-502789298794721106"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"9223372036854775807", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "get", "long", "59999"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:1>", "70368740577665", "21599980"}}), new String[][]{{"years", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "eras", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"-8714085824173159528"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-3969021462147356481"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "4194304", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"2", "-29999", "326566", "-7199998"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "add", new String[]{"long", "long", "int"}, new String[]{"1079258847190642561", "-9223372036586340352", "2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"64"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "-1984493138887764885"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuries", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:1>", "-970690621998416571", "0"}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfDay", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-970690621998416571", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292272984", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-6183722000336151838"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"60045", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28860045", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 7, new String[][]{{"org.joda.time.field.LenientDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:11>", "584287", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("584287", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuries", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:10>", "-7937972553403576020", "-7200002"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:4>", "-14400004"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-15343618022004", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922796, getMinimumValue=-2922685, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "remainder", new String[]{"long"}, new String[]{"43200001"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "add", "long,int", "17592185984417", "-43199989"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1944000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "get", "long", "-326566"}, {"org.joda.time.field.LenientDateTimeField", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "era", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"5546345482340108621"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482425600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:4>", "<empty>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyears", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:3>", "<sample:4>"}, {"org.joda.time.chrono.ZonedChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<null>"}}), new String[][]{{"getUnitMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31556952000", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weeks", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "long", "5"}, {"isPrecise", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.ZonedChronology", "dayOfMonth", ""}}), new String[][]{{"getAsText", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"485063836022497631", "-536544348", "326556", "43200065", "-4"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"-3968986140336576323"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "2037153", "<sample:7>", "-59999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3968986139452800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-17592229244416", "60001"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-557", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"485345310999208321"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("485345317251600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-1079258847188545451", "-485345310999208285"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "roundHalfCeiling", "long", "-7624873881094710538"}, {"org.joda.time.field.LenientDateTimeField", "add", "long,long", "-6471952376487863542", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-244659795", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getOffsetFromLocal", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.ZonedChronology", "weekyear", ""}}), new String[][]{{"getAsText", "int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.ZonedChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:4>", "18014398509808550"}}), new String[][]{{"getLeapDurationField", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "monthOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-7200010", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("21599990", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "add", new String[]{"long", "long", "int"}, new String[]{"14399952", "21599999", "43199999"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("933119949599953", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.ZonedChronology", "hourOfHalfday", ""}}), new String[][]{{"add", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:2>", "-502789298794721151", "-14999"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-502789298794721151", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"8709582224545920104", "86399984"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"previousTransition", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getInstance", new String[]{"org.joda.time.Chronology", "org.joda.time.DateTimeZone"}, new String[]{"<sample:6>", "<sample:1>"}, true), new String[][]{{"monthOfYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:3>", "-7200010"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7200010", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:5>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-1004452697682599678", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1004452697654221678", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:0>", "-8714085824173290600", "-180"}, false, 0, new String[][]{{"org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.ZonedChronology", "seconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-517244518", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfCentury", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[era] {getMaximumValue=1, getMinimumValue=1, getName=era, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "8714085824164901991"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"3600033"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"8723093023428031590", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"144115188068655871", "-4357042912086645280"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1854230211", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-970690621998416574", "true", "-1005578597593636606"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-970690621970038574", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.ZonedChronology", "secondOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "hours", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "add", "long,int", "-5546345482340108619", "-14999"}, {"org.joda.time.field.LenientDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "-2147483648", "<sample:1>", "60000"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"8714085828468257896"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.ZonedChronology", "millisOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "7200004", "<sample:0>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "days", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:7>", "-6471952376487863517"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376487863517", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsShortText", "int,java.util.Locale", "-29999", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"1701704", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "getParam", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-485345310999208336"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-485345310999208336", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "dayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getAsShortText", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getDifference", "long,long", "5546345482340108442", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292272984", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"getID", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-3968423327822108547"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3968423327865600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "weekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-8709582224545920104"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8709582223497600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31557600000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[year] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-3968986277775529794user.timezoneThe datetime zone \rid '"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"4398046571080", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long,java.util.Locale", "-485345310999208287", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4398071771080", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"-59980"}, false, 2, new String[][]{{"org.joda.time.field.LenientDateTimeField", "getAsText", "long", "-1079258847190642545"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "useTimeArithmetic", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-8709582224545395816", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8709582224517017816", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"43199999"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"long", "int"}, new String[]{"43265501", "4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("43265501", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "add", new String[]{"long", "int"}, new String[]{"43202047", "163282"}, false, 5, new String[][]{{"org.joda.time.field.LenientDateTimeField", "set", "long,java.lang.String", "-3600001", "[1,]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5152788388802047", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269337, getName=weekyear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:3>", "326565", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("326565", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.ZonedChronology", "weekyear", ""}}), new String[][]{{"get", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "ZonedChronology[BuddhistChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.LenientDateTimeField", "org.joda.time.field.LenientDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:3>", "1", "<null>", "I", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
}
