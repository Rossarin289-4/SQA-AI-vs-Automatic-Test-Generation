package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}), new String[][]{{"isLeap", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:6>", "<sample:3>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false), new String[][]{{"addWrapField", "long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true), new String[][]{{"minuteOfDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:10>"}}), new String[][]{{"isLeap", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "withZone", "org.joda.time.DateTimeZone", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "3410248757173576440"}}, 3), new String[][]{{"getMillis", "int,long", "7"}, {"add", "long,long", "0"}, {"add", "long,int", "7"}, {"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:9>", "24507305077076"}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:6>", "-636393706926732918"}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:10>", "7057002438962052804", "-1202000211207232774"}, {"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61958874144924", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"getMaximumShortTextLength", "java.util.Locale", "5"}, {"getAsShortText", "int,java.util.Locale", "1"}, {"getMaximumValue", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2922730", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}, {"org.joda.time.chrono.GJChronology", "years", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "5"}, {"getDifference", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "3410248757173576440"}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-10800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}, {"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}}), new String[][]{{"getAsShortText", "long", "0"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}, {"add", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31536000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<null>", "-12219292800000", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<null>", "-12219292799968", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1582-10-15T00:00:00.032Z,mdfw=5] {getMinimumDaysInFirstWeek=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:10>", "-636393706926732918", "0"}, {"org.joda.time.chrono.GJChronology", "weeks", ""}}, 2), new String[][]{{"getDifferenceAsLong", "long,long", "3"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}, {"org.joda.time.chrono.GJChronology", "weeks", ""}}), new String[][]{{"isLenient", "", "5"}, {"roundHalfCeiling", "long", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "1"}, {"add", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}, {"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 2), new String[][]{{"getLeapAmount", "long", "2"}, {"getMaximumTextLength", "java.util.Locale", "2"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "3"}, {"getDifferenceAsLong", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-1202000211240787206", "8125416", "2147483647", "-2147483648", "-2146435114"}, {"org.joda.time.chrono.GJChronology", "add", "long,long,int", "12219292799990", "4097975422333897099", "-2146435098"}}), new String[][]{{"getLeapAmount", "long", "6"}, {"getMinimumValue", "org.joda.time.ReadablePartial", "0"}, {"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "3"}, {"getAsText", "long,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:1>"}, true), new String[][]{{"clockhourOfHalfday", "", "4"}, {"add", "long,long", "2"}, {"addWrapField", "long,int", "3"}, {"get", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:7>", "<sample:0>"}, true), new String[][]{{"years", "", "5"}, {"isPrecise", "", "0"}, {"subtract", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"months", "", "2"}, {"getMillis", "int", "4"}, {"add", "long,long", "7"}, {"add", "long,long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372031581197809", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"months", "", "6"}, {"getMillis", "long,long", "7"}, {"getDifferenceAsLong", "long,long", "6"}, {"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false), new String[][]{{"getMaximumValue", "long", "3"}, {"get", "long", "6"}, {"remainder", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("62135740800003", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "5", "10", "5", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-1073741832", "5", "0", "5", "41", "1", "-2146435098"}, {"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<sample:2>"}, {"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}}, 3), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}, {"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:2>", "-2545574827706931629", "2146435098"}}, 2), new String[][]{{"addWrapField", "long,int", "3"}, {"getMinimumValue", "", "5"}, {"roundHalfCeiling", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:1>"}, true), new String[][]{{"year", "", "3"}, {"getName", "", "5"}, {"roundCeiling", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getAsText", "long,java.util.Locale", "2"}, {"addWrapField", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28857600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:7>", "3410248757173576442"}}), new String[][]{{"getDifferenceAsLong", "long,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("292271022", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"5", "2", "2147483647", "2147483647", "0", "-2146435114", "8126423"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"weekyear", "", "6"}, {"getName", "", "0"}, {"set", "long,java.lang.String", "5"}, {"getLeapAmount", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 3), new String[][]{{"weekyear", "", "5"}, {"getName", "", "0"}, {"set", "long,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"weekyear", "", "1"}, {"getRangeDurationField", "", "5"}, {"set", "long,java.lang.String", "5"}, {"addWrapField", "long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94953600002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "8125416", "1", "2", "5"}, {"org.joda.time.chrono.GJChronology", "era", ""}}), new String[][]{{"getAsShortText", "long", "1"}, {"set", "long,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"add", "long,long,int", "7"}, {"set", "org.joda.time.ReadablePartial,long", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:2>", "<sample:1>", "7"}, true, 0, null, 3), new String[][]{{"dayOfMonth", "", "2"}, {"isLenient", "", "3"}, {"roundCeiling", "long", "5"}, {"getMaximumValue", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "2147483647", "-10", "10"}}, 3), new String[][]{{"minuteOfDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "minutes", ""}}, 1), new String[][]{{"add", "long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94694400002", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "minutes", ""}, {"org.joda.time.chrono.GJChronology", "era", ""}}, 1), new String[][]{{"add", "long,int", "5"}, {"getValue", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "minutes", ""}, {"org.joda.time.chrono.GJChronology", "era", ""}}, 1), new String[][]{{"add", "long,int", "5"}, {"getValue", "long,long", "1"}, {"compareTo", "org.joda.time.DurationField", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "minutes", ""}}, 1), new String[][]{{"add", "long,int", "5"}, {"getValue", "long,long", "1"}, {"compareTo", "org.joda.time.DurationField", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"-10", "50", "1073741823", "-1073741823", "0", "-2147483648", "10"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483628", "8126440", "1073741823", "-1073741832", "-1", "-2146435114", "2147483647"}, false, 10, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:6>", "<sample:3>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.chrono.GJChronology", "getZone", ""}, {"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800001"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"6820497514347152902", "2147483647", "3932119", "2147483644", "9"}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"isLeap", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975388007713085"}, {"org.joda.time.chrono.GJChronology", "millis", ""}}, 1), new String[][]{{"getAsText", "long,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:4>", "4097975388007713085", "-2146435114"}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("292278994", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}, 2), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "10", "41", "2147483628", "-2146435114", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "10", "41", "2147483628", "-2146435114", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "9", "41", "2147483628", "-2146435114", "2147483647"}}, 1), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"get", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"get", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}, 3), new String[][]{{"get", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("229", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}, 3), new String[][]{{"getAsText", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "4097975388007713084"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=5881637-04-13T07:00:00.000Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}}, 1), new String[][]{{"add", "long,long", "2"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"3528501219481026403", "9223372036854775807", "1073741823"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:8>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"clockhourOfHalfday", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"weekyearOfCentury", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:10>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"eras", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getMinimumDaysInFirstWeek", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:10>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"dayOfWeek", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}, {"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[GJChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}}, 3), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}, {"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}}, 3), new String[][]{{"subtract", "long,long", "3"}, {"getValue", "long", "7"}, {"getValue", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:10>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getMinimumDaysInFirstWeek", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"dayOfWeek", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"era", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"minuteOfDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"era", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"days", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}, 3), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}, 3), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}, 2), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975388007713084"}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:10>"}}, 1), new String[][]{{"isLeap", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "3528501219481026403"}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "3528501219481026403"}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getDifferenceAsLong", "long,long", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "4097975388007713085"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:5>", "4097975388007713085", "-1"}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:4>", "-2545574827706931670", "3528501219481026402"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}, 3), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getAsText", "long,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:4>", "-12219292799990", "0"}}, 1), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"4097975388007713084", "2147483647", "-2147483648", "1", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:3>"}, {"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "2147483647", "10", "10"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[GJChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "2147483647", "10", "10"}}), new String[][]{{"minuteOfDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "2147483647", "10", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}, {"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}, {"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "long,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "3528501219481026402"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:5>", "<sample:6>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:3>", "3528501219481026401", "10"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528501220345026401", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94694400002", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94694400002", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"10", "-1", "0", "2147483647", "-1", "-2147483648", "-1"}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "10", "-2147483648"}}), new String[][]{{"isLeap", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "10", "-2147483648"}}), new String[][]{{"getAsShortText", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "10", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "10", "-2147483648"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "10", "-2147483648"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "5"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:9>"}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931671", "-2147483648", "1073741823", "41", "-2147483648"}}), new String[][]{{"getLeapAmount", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}), new String[][]{{"set", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}}), new String[][]{{"roundHalfFloor", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-230400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800001"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800001"}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<null>", "-1", "3410248757173576396"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfHalfday", ""}, {"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "-1"}, {"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}), new String[][]{{"addWrapField", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfHalfday] {getMaximumValue=11, getMinimumValue=0, getName=hourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "9007201402224639"}, {"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}), new String[][]{{"getRangeDurationField", "", "7"}, {"getDifferenceAsLong", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:10>"}, true), new String[][]{{"minuteOfDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "1073741823", "0", "-2146435114", "8126440"}, {"org.joda.time.chrono.GJChronology", "months", ""}}), new String[][]{{"isSupported", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975388007713085"}, {"org.joda.time.chrono.GJChronology", "millis", ""}}), new String[][]{{"getAsText", "long,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getDifference", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.joda.time.chrono.GJChronology", "seconds", ""}, {"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:4>", "4097975388007713085", "-2146435114"}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("292278994", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"4097975388007713085"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4097891239764513085", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"2048987694003856519"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2048945619277456519", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "10", "10", "41", "2147483628", "-2146435114", "8126440"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "10", "41", "2147483628", "-2146435114", "8126440"}}), new String[][]{{"getMillis", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "10", "41", "2147483628", "-2146435114", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "1073741823", "-1", "9", "41", "2147483628", "-2146435114", "2147483647"}}), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "9223372036854775807", "3410248757173576442", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"0", "-2147483648", "1", "1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getAsText", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getAsText", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-2545574827706931671"}}), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("halfdayOfDay", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}), new String[][]{{"getValueAsLong", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=1970-01-01T00:00:00.001Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"weekyearOfCentury", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"months", "", "4"}, {"getValue", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:10>"}, true), new String[][]{{"getGregorianCutover", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("41159300-06-12T07:00:00.000Z {getMillis=1298799901321200000, isAfterNow=true, isBeforeNow=false, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648,cutover=-292274998-02-16T07:52:58.000Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-1", "2147483647", "1", "1", "1", "2147483647", "10"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:3>"}, true), new String[][]{{"get", "org.joda.time.ReadablePartial,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"weekyears", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:2>"}, true), new String[][]{{"hourOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:4>"}, true), new String[][]{{"clockhourOfHalfday", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:1>"}, true), new String[][]{{"seconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<null>", "4097975388007713084", "1073741823"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4097975388007713084", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1123199999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<null>", "-2545574827706931671", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}, {"org.joda.time.chrono.GJChronology", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1123200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"days", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "5"}, {"getLeapAmount", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"3410248757173576442"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410318785323976442", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false), new String[][]{{"validate", "org.joda.time.ReadablePartial,int[]", "0"}, {"withZone", "org.joda.time.DateTimeZone", "4"}, {"get", "org.joda.time.ReadablePartial,long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"3410248757173576440"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410318785151176440", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false), new String[][]{{"getRangeDurationField", "", "1"}, {"getAsText", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}}), new String[][]{{"getMillis", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}), new String[][]{{"add", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1209600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "3528501219481026401"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "hours", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[111815722, 6, 19]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "41", "8126440", "-2146435114", "-2146435114"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:1>", "-12219292800001", "1073741823"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"dayOfWeek", "", "6"}, {"getLeapDurationField", "", "0"}, {"getLeapAmount", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}), new String[][]{{"getAsText", "long,java.util.Locale", "7"}, {"set", "long,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975388007713083"}, {"org.joda.time.chrono.GJChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:0>"}, true), new String[][]{{"weekyearOfCentury", "", "6"}, {"roundHalfFloor", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("979200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:10>", "<sample:5>"}, true), new String[][]{{"weekyearOfCentury", "", "6"}, {"roundHalfFloor", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3097883648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-12219292799999"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "int,java.util.Locale", "5"}, {"get", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "long,java.util.Locale", "5"}, {"getAsText", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AD", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "weekyears", ""}}), new String[][]{{"isSupported", "", "0"}, {"add", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"3528501219481026403"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528428764441026403", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"4097975388007713084", "1", "8126440", "-1073741832", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false), new String[][]{{"getAsShortText", "long,java.util.Locale", "7"}, {"getLeapAmount", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1582-10-15T00:00:00.000Z {getMillis=-12219292800000, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}), new String[][]{{"compareTo", "org.joda.time.DurationField", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "7"}, {"getAsText", "long", "2"}, {"add", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("240003", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"3410248757173576441"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410178730405576441", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}, {"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Jan", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"getAsShortText", "int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Apr", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false), new String[][]{{"getAsShortText", "long", "3"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("secondOfMinute {getName=secondOfMinute}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getAsText", "long,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getAsText", "long,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:4>", "-12219292799990", "0"}, {"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:4>", "-12219292799990", "0"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}, {"getDifference", "long,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 3), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 3), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}, 3), new String[][]{{"getValue", "long", "3"}, {"getDifferenceAsLong", "long,long", "6"}, {"isSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "7"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}, {"org.joda.time.chrono.GJChronology", "getZone", ""}}, 2), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}, {"org.joda.time.chrono.GJChronology", "getZone", ""}}, 2), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "6"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"2147483628", "41", "-2146435114", "-2147483647"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "withUTC", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "long", "1"}, {"getUnitMillis", "", "7"}, {"getValue", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "-2147483648", "0", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}, {"org.joda.time.chrono.GJChronology", "withUTC", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:4>", "3410248757173576442", "0"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}, {"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}}, 2), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800000"}, {"org.joda.time.chrono.GJChronology", "add", "long,long,int", "4097975388007713083", "-1", "1073741823"}, {"org.joda.time.chrono.GJChronology", "months", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfSecond", ""}, {"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-12219292800000"}, {"org.joda.time.chrono.GJChronology", "add", "long,long,int", "-4097975388007713083", "-1", "1073741765"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false), new String[][]{{"getValueAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"weekyears", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"weekyear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"dayOfMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "-10"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-2545574827706931672", "-2147483648", "2147483647", "41", "2147483628"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "-5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "-2545574827706931670"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545574827706931670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "2545574827706931635"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62133784690365", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:0>", "2545574827706931635"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2545574827706931635", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "1272787413853465817"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62119048956183", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "636393706926732908"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62111639689092", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:3>", "1705124378586788221"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975388007713083"}, {"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62118290033779", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:7>", "3410248757173576442"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "4097975422367451484"}, {"org.joda.time.chrono.GJChronology", "weekyears", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62037745245558", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
