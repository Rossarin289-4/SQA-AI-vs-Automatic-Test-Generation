package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "months", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "27", "-4086", "72", "16384"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}}), new String[][]{{"subtract", "long,long", "5"}, {"getValue", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"roundHalfEven", "long", "4"}, {"addWrapField", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("604800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}, 3), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-2545574827706931671"}}), new String[][]{{"getAsText", "long", "0"}, {"set", "long,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:0>", "-1764268201926557744", "29360128"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDifference", "long,long", "2"}, {"roundCeiling", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775616", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfHour", ""}}), new String[][]{{"addWrapField", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("157852800004", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:8>", "-12219292800000", "-4194271"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}}), new String[][]{{"getAsShortText", "long,java.util.Locale", "0"}, {"getLeapAmount", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "long,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "-24438585600002"}}), new String[][]{{"roundHalfEven", "long", "2"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:5>", "3410248756099834618", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=108068451-01-28T02:50:34.618Z,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "withZone", "org.joda.time.DateTimeZone", "<null>"}, {"org.joda.time.chrono.GJChronology", "getBase", ""}}, 3), new String[][]{{"isLeap", "long", "7"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "6"}, {"getAsShortText", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<null>", "3528501219481026403"}}), new String[][]{{"getMinimumValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"subtract", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12621917221997", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"72", "2", "-2147479552", "134210049", "51", "2147483647", "-536868864"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}, {"org.joda.time.chrono.GJChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}}), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "1"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("millisOfDay {getName=millisOfDay}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2), new String[][]{{"weekyear", "", "0"}, {"set", "long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62103599646193", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}}), new String[][]{{"addWrapField", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:8>", "0", "4097975388007713085"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[129859670, 5, 3, 1, 12, 48, 33, 85]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"add", "long,int", "1"}, {"subtract", "long,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3997", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"-9223372036854775808", "2048987694003856542", "-1073741801"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<sample:1>", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfHalfday] {getMaximumValue=11, getMinimumValue=0, getName=hourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"remainder", "long", "5"}, {"roundHalfFloor", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:5>", "-2545574827706931671", "7057002438962052806"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "3528501219481026473", "9223372036854775807"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"remainder", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}, 2), new String[][]{{"set", "long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036828802807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}}, 3), new String[][]{{"getAsText", "int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"set", "long,java.lang.String,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"-2545574827706931670"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545627066615731670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}}, 1), new String[][]{{"set", "long,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"1073737728", "8223", "16456", "-1073737728"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1424434086", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getUnitMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJDayOfWeekDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "years", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"subtract", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:7>", "<sample:6>", "2147483602"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"3410248757173576442"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410318785323976442", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:0>", "-3410248757173576443", "3410248757173576445"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:1>", "12219292800001", "-1764250609740513200"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:3>", "<sample:1>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}}, 1), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<null>", "-9223372036854775808", "852702926781806782"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1582-10-15T00:00:00.000Z {getMillis=-12219292800000, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:5>", "0", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:1>", "<sample:1>", "-42"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "-1705124378586788221", "4097975405187582269"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=5881637-04-13T07:00:00.000Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:1>", "6820497514347152882", "6820497514347152882"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:5>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"4097975388007713085", "2", "43", "-2147483648", "2"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "1764250609740513201"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1764250609740513201", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isSupported", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}}), new String[][]{{"getAsText", "long,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:7>", "-9223372036854775808"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "3528501219481026402"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "1705405853563498876"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791049026402", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "0", "513", "72", "1", "-2147483642", "-16384", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"32778", "2147483647", "20", "-2147483648"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:4>", "8195950776015426170"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790991426170", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "0", "523", "1026", "2147483642", "10", "2097162"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-2545574827706931671"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545522589921331671", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "0"}, {"isLeap", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:7>", "<sample:4>"}, true), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:0>", "1705133174680859004"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "-2251799813685249"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"set", "long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", "long", "1705405853563498876"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[UTC]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"4097975388007713084", "8195950776015426168", "-1073737758"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:7>", "3410266349359620857"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62022688379143", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "0", "5", "-2", "2147483647", "16958"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"minuteOfHour", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-4611686018427387905"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611780683537787905", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1582-10-15T00:00:00.000Z {getMillis=-12219292800000, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getAsText", "int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:4>", "-1272787413853465836", "12219292800001"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "2048987694003856542"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"roundFloor", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-259200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMillis", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}, {"org.joda.time.chrono.GJChronology", "dayOfYear", ""}}), new String[][]{{"getMillis", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-12219292800001"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12220156800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<null>"}, true), new String[][]{{"yearOfEra", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}}), new String[][]{{"getAsText", "int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "long,int,int,int,int", "-6109646400000", "0", "2147483647", "-4194271", "-2147483648"}}), new String[][]{{"subtract", "long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372031584375807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<null>", "-9223372036854775808"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:10>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:1>", "4097975388007713083"}}), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1382400003", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}), new String[][]{{"subtract", "long,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "-2545574827706931672"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111838726", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "org.joda.time.ReadablePeriod,long,int", "<sample:0>", "-576466861949823488", "2147483602"}}), new String[][]{{"getAsText", "long,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getLeapAmount", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "-9223372036854775808"}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}}), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("minutes {getName=minutes}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "3528501219481026402", "-6109646399938", "-16446"}}), new String[][]{{"days", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "3528501219481026401"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfYear", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[111815722, 6, 19]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByYear", new String[]{"long"}, new String[]{"-1"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1123200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:0>"}, true), new String[][]{{"years", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfDay", ""}}), new String[][]{{"getDifference", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByYear", new String[]{"long"}, new String[]{"3410248757173576440"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfHalfday", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410318785323976440", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long", "<sample:0>", "-2545574827706866161"}}), new String[][]{{"getDifferenceAsLong", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"clockhourOfHalfday", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "3410811707126997752"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:3>", "3528501219481026403"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getValueAsLong", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:3>", "<sample:1>"}}), new String[][]{{"getDifference", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDifference", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}}), new String[][]{{"getDifferenceAsLong", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}), new String[][]{{"isSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "millis", ""}}), new String[][]{{"subtract", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
}
