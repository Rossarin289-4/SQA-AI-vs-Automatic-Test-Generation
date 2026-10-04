package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getDifference", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial", "0"}, {"isLeap", "long", "1"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<null>", "3410248757173576442", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=108068451-02-09T13:06:16.442Z,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<null>", "-3528501219481026464", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-1", "1", "1", "10"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "2"}, {"getDifferenceAsLong", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"year", "", "6"}, {"roundHalfEven", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:12>", "<sample:7>"}, true), new String[][]{{"centuryOfEra", "", "7"}, {"roundCeiling", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("978336000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:13>", "<sample:0>"}, true), new String[][]{{"centuryOfEra", "", "0"}, {"getLeapAmount", "long", "6"}, {"roundFloor", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2176300800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false), new String[][]{{"add", "long,int", "6"}, {"getAsText", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:16>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"era", "", "0"}, {"getAsText", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:24>", "<sample:3>"}, true), new String[][]{{"dayOfYear", "", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:17>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"yearOfEra", "", "5"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"getAsShortText", "int,java.util.Locale", "1"}, {"getMinimumValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"yearOfEra", "", "3"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"getMinimumValue", "org.joda.time.ReadablePartial", "6"}, {"roundCeiling", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1152000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"yearOfEra", "", "3"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"add", "long,long", "2"}, {"getAsShortText", "long,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:16>", "<null>"}, true, 0, null, 2), new String[][]{{"yearOfEra", "", "3"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"add", "long,long", "2"}, {"getMinimumValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:9>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"yearOfEra", "", "7"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"add", "long,long", "1"}, {"getDifference", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", ""}}, 1), new String[][]{{"subtract", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-15777677221996", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}}), new String[][]{{"getMaximumValue", "", "3"}, {"getLeapAmount", "long", "3"}, {"getDifferenceAsLong", "long,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-292271024", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}}), new String[][]{{"getMaximumValue", "", "3"}, {"getLeapAmount", "long", "3"}, {"getDifferenceAsLong", "long,long", "6"}, {"get", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:6>", "-9223372036854775808"}}, 1), new String[][]{{"getDifferenceAsLong", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<null>", "<empty>"}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "6"}, {"getAsShortText", "long", "7"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"9", "10", "9", "10", "0", "20", "0"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "3528501219481026401"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61858966002000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}, {"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-3528501219481026464"}}), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"get", "long", "6"}, {"addWrapField", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:3>"}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:6>", "8195950776015426168"}}), new String[][]{{"getMinimumValue", "long", "3"}, {"add", "long,long", "6"}, {"set", "long,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<sample:3>"}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:7>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2", "5", "37", "1073741796", "0", "1073741792"}}), new String[][]{{"isLeap", "long", "0"}, {"getAsText", "long,java.util.Locale", "7"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"roundHalfEven", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:16>", "-12219292800000", "1073741792"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "0", "-2147483622", "9", "-20", "2147483624"}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}}, 1), new String[][]{{"getMillis", "int,long", "4"}, {"isSupported", "", "6"}, {"subtract", "long,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5647452493881599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 64, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<sample:1>", "-3528501219481026464"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "5", "20", "1073741796", "2", "1073741796", "10", "20"}}, 2), new String[][]{{"getDifference", "long,long", "3"}, {"subtract", "long,int", "5"}, {"add", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12622780800003", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 0, null, 3), new String[][]{{"weekOfWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false), new String[][]{{"roundHalfEven", "long", "1"}, {"getMinimumValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:16>", "<sample:11>"}, true), new String[][]{{"years", "", "3"}, {"subtract", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}}), new String[][]{{"getValue", "long", "5"}, {"compareTo", "org.joda.time.DurationField", "3"}, {"subtract", "long,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-15777676799996", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 24, new String[][]{}, 1), new String[][]{{"roundHalfFloor", "long", "4"}, {"getMaximumTextLength", "java.util.Locale", "2"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("era {getName=era}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"centuries", "", "3"}, {"getDifferenceAsLong", "long,long", "1"}, {"subtract", "long,int", "3"}, {"getDifference", "long,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2922770", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "months", ""}, {"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "halfdays", ""}}, 1), new String[][]{{"add", "long,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}}), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"-1", "20", "2147483647", "-2147483648", "2147467263", "2147483647", "37"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"9", "20", "2147483647", "-2147483648", "2147467263", "2147483647", "37"}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"9", "10", "2147483647", "-2147483648", "2147467263", "-75", "37"}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 2), new String[][]{{"getAsText", "int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"7057002438962052802"}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7056857530264452802", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"7345232815113764546"}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7345081987843364546", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"7363247213623246530"}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7363096016474446530", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223182644166775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223182677862775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-9223372036854251520"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223182677862251520", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:0>", "-2545574827706931672"}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 3), new String[][]{{"roundCeiling", "long", "4"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("dayOfYear {getName=dayOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:0>", "-2545574827706931672"}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 3), new String[][]{{"roundCeiling", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036765973616", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:7>", "-9223372036854775807", "9223372036854775807"}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "-1"}, {"org.joda.time.chrono.GJChronology", "eras", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<sample:1>"}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"add", "long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"4097975388007713085"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "-1", "10", "2147483647", "10", "-1", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4098059538151713085", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}, {"getRangeDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}, {"getRangeDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}, {"getRangeDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfHalfday] {getMaximumValue=11, getMinimumValue=0, getName=hourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}}, 1), new String[][]{{"roundHalfEven", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"getAsShortText", "long,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "4097975388007713084", "0", "0", "2147467263", "2147467263"}}, 2), new String[][]{{"getMillis", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"add", "long,long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<null>", "3528501219481026402"}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "3410248757173576441", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=108068451-02-09T13:06:16.441Z,mdfw=2] {getMinimumDaysInFirstWeek=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"add", "long,long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "0", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01,mdfw=2] {getMinimumDaysInFirstWeek=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:;>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:;>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hours", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<i:0>"}, {"org.joda.time.chrono.GJChronology", "hours", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:3>", "9223372036854775807"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "-52", "20", "74"}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<i:-131072>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 3), new String[][]{{"getLeapAmount", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:10>"}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 3), new String[][]{{"add", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "1", "2147483647", "10", "-1"}}, 3), new String[][]{{"add", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}, 3), new String[][]{{"isSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}, 3), new String[][]{{"getValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}, 3), new String[][]{{"getValue", "long", "5"}, {"getValue", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2922770", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"getValue", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}}, 3), new String[][]{{"isSupported", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-10", "0", "0", "-2147483648", "1", "-2147483648", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<null>", "4097975388007713085", "-1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:6>", "4097975388007713085", "-1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "4097975388007712957", "-1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:4>", "-3528501219481026464"}, {"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "3410248757173576441"}}, 3), new String[][]{{"getAsShortText", "int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:4>", "-3528501219481026464"}, {"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "3410248757173576441"}}, 3), new String[][]{{"getAsShortText", "int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"1", "10", "-2147483648", "10", "2147483647", "2147483647", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAsShortText", "int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}}), new String[][]{{"getAsText", "int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "0", "2147467263", "10"}}), new String[][]{{"getAsText", "int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "0", "37", "20", "-1", "10"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "0", "37", "20", "-1", "2097142"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial", "0"}, {"isLeap", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:4>", "3410248757173576441"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800000"}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:4>", "3410248757173576441"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800000"}, {"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:4>", "3410248757173576441"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"3410248757173576441"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410178730405576441", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}, {"org.joda.time.chrono.GJChronology", "getParam", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "-9223372036854775808"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"1705124378586788338"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1705089364641188338", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"852562189293394169"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("852544681802194169", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"1128663626283364850"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1128640449310564850", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"1128593257539187095"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1128570082035187095", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-1128593257539187095"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1128570115817587095", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-564296628769593547"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-564285074238393547", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"3528501219481026401"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528428764527426401", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"7057002438962052802"}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7056857530264452802", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("276", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}), new String[][]{{"roundCeiling", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036765973616", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}), new String[][]{{"roundCeiling", "long", "4"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("dayOfYear {getName=dayOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:0>"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}, {"getDifferenceAsLong", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"roundHalfFloor", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"roundHalfFloor", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"roundHalfFloor", "long", "7"}, {"add", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4003", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "4097975388007713084"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4097975388007713084", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}, {"org.joda.time.chrono.GJChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:0>", "-9223372036854775808", "9223372036854775807"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:4>", "-9223372036854775807", "9223372036854775807"}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:3>", "-9223372036854775807", "-9223372036854775807"}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "-1"}, {"org.joda.time.chrono.GJChronology", "eras", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "-9223372036854775807", "-4611685949707911167"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "-1"}, {"org.joda.time.chrono.GJChronology", "eras", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:4>", "4097975388007713085"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "9", "2147467263", "2147467263", "9", "10", "-1", "2147467263"}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[129861640, 6, 23]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<null>", "4097975388007713085"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "9", "2147467263", "2147467263", "9", "10", "-1", "2147467263"}, {"org.joda.time.chrono.GJChronology", "year", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "3528501219481026400"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[111815722]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:7>", "9223372036854775807", "37"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<null>", "-9223372036854775808", "9223372036854775807"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-12219292800001", "-2147483648", "1", "-2147483648", "2147467263"}, {"org.joda.time.chrono.GJChronology", "months", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"4097975388007713085"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "-1", "10", "2147483647", "10", "-1", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4098059538151713085", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "2147467263", "9", "0", "1", "-2147483648", "-1"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "2147483647", "2147467263", "9", "0", "1", "-2147483648", "-1"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "2"}, {"getRangeDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "-12219292800000"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "-12219292800000"}, {"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-12219292799999"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-6109646399995"}}), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("clockhourOfHalfday {getName=clockhourOfHalfday}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getType", "", "2"}, {"getDurationType", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("hours {getName=hours}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223182706063624193", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"4611686018427387903"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611591321867387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-2545574827706931671"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545522589921331671", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-5091149655413863342"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5091045146578663342", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1209600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1209600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"3410248757173576442"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "20", "0", "-2147483648", "2147483647", "9", "37"}, {"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410178730405576442", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-3410248757173576428"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "20", "0", "-2147483648", "2147483647", "9", "37"}, {"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3410178763669576428", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"convertLocalToUTC", "long,boolean,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"3410248757173576442", "20", "2147483647", "2147483647", "37"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}, {"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false), new String[][]{{"get", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"get", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"getAsShortText", "long,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}, {"org.joda.time.chrono.GJChronology", "hours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}, {"org.joda.time.chrono.GJChronology", "hours", ""}}), new String[][]{{"getMillis", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "4097975388007713084", "0", "0", "2147467263", "2147467263"}}), new String[][]{{"getMillis", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "9223372036854775807", "-9223372036854775808", "-1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}}), new String[][]{{"getAsText", "int,java.util.Locale", "3"}, {"add", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "20"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545574825978931672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "32788"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545571994823731672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "-32788"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545577660590131672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "-65576"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545580493473331672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "-16394"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545576244148531672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931672", "-8197"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545575535927731672", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706964440", "-8197"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545575535927764440", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706964440", "8154"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545574123201364440", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}, {"getAsText", "int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<null>", "3528501219481026402"}}), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}, {"getAsText", "int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<null>", "3528501219481026402"}}), new String[][]{{"getAsText", "int,java.util.Locale", "0"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<null>", "3392234358664094458", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=107497597-07-18T19:08:14.458Z,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:4>", "1764250609740521469", "2"}, true), new String[][]{{"millisOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1582-10-15T00:00:00.000Z {getMillis=-12219292800000, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "int,long", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:11>", "9223372036854775771", "1"}, true), new String[][]{{"weekyears", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "-9223372036854740961", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "3410248757173576441"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62132353245559", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "8195950775981871728", "6"}, true), new String[][]{{"yearOfCentury", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "8195950775981871728", "6"}, true), new String[][]{{"centuries", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "8195950775981871754", "1"}, true), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "3521514635687774533", "1"}, true), new String[][]{{"years", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:10>", "3521514635687774592", "1"}, true), new String[][]{{"withUTC", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC,cutover=111594326-06-10T09:16:14.592Z,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"3528501219481026403"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528573675903426403", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:6>", "0", "2147483647"}}), new String[][]{{"roundHalfFloor", "long", "1"}, {"getMaximumValue", "long", "2"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1439", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "3528501219481026401"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528501219481026401", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "-2545574827706931671"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "1", "1", "0", "-2147483648", "-1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}), new String[][]{{"getLeapDurationField", "", "4"}, {"getMinimumValue", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:5>", "3392234358664094458"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62087054327542", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false), new String[][]{{"get", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-1", "9", "10", "-2147483648", "10", "-2147483648", "9"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getAsText", "long", "3"}, {"getMinimumValue", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"3528501219481026402"}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "20", "10", "-2147483648", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528573676335426402", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}), new String[][]{{"getValue", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "-2545574827706931672"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}, {"org.joda.time.chrono.GJChronology", "weeks", ""}}), new String[][]{{"getAsShortText", "long", "6"}, {"isSupported", "", "2"}, {"getDifference", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "months", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<null>", "4097975388007713084"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "3410248757173576440"}, {"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "9223372036854775807"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:5>", "3528501219481026402", "9"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}, {"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "7"}, {"get", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "4097975388007713085"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDifference", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}}), new String[][]{{"add", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "0"}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}), new String[][]{{"getValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "0"}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}), new String[][]{{"getValueAsLong", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "0"}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "2147483647", "2147483647", "10", "-1"}}), new String[][]{{"getMillis", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94670856000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "long", "5"}, {"getValue", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2922770", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getValue", "long,long", "5"}, {"getValue", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2922770", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "9223372036854775807"}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1424434086", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "3392234358664094458"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "3392234358664094458"}}), new String[][]{{"isSupported", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isSupported", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<null>", "3410248757173576441"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:0>", "-12219292800000", "3410248757173576440"}}), new String[][]{{"getAsText", "long,java.util.Locale", "5"}, {"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:0>", "-12219292800000", "3410248757173576440"}}), new String[][]{{"getAsText", "long,java.util.Locale", "5"}, {"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}, {"getMinimumValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false), new String[][]{{"getDifference", "long,long", "1"}, {"getValueAsLong", "long,long", "6"}, {"getValue", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"-1", "1", "2147467263"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147467262", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}}), new String[][]{{"add", "long,long", "1"}, {"getValueAsLong", "long,long", "6"}, {"getValue", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}, {"org.joda.time.chrono.GJChronology", "withUTC", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "3410248757173576441"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"4097834650519357755"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4097918797812157755", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"8195669301038715460"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8195837594501115460", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"-8195669301038715499"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8195837560718715499", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"-8195669301072269931"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8195837560752269931", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"-4097834650536134965"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4097918763960134965", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false), new String[][]{{"get", "long", "6"}, {"getLeapDurationField", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"8195669301072269931"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8195837594534669931", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:5>", "-2545574827706931670"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-2147483648", "20", "10", "-2147483648", "20", "2147467263", "37"}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62095159731670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:5>", "-2545574827706931694"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-2147483648", "20", "10", "-2147483648", "20", "2147467263", "37"}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62095159731694", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:4>", "-2545574827706931694"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-2147483648", "-10", "10", "-2147483648", "20", "2147467263", "37"}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791070690306", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:4>", "-2545574827706931682"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791070690318", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:3>", "3528501219481026401", "-2545574827706931670"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:0>", "3528501219481026401", "-2545574827706931670"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"getValueAsLong", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true), new String[][]{{"dayOfMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true), new String[][]{{"centuryOfEra", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true), new String[][]{{"centuryOfEra", "", "7"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("centuryOfEra", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"centuryOfEra", "", "7"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("centuryOfEra", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"centuryOfEra", "", "7"}, {"getName", "", "7"}, {"getAsShortText", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
}
