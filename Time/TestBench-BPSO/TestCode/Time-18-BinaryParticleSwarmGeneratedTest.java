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
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:4>", "-3423199777791", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<null>"}, true), new String[][]{{"centuryOfEra", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648,cutover=1970-01-01] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isLeap", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292269054", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:0>", "-2545574827706915286", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=-80664086-12-09T00:31:24.714Z,mdfw=5] {getMinimumDaysInFirstWeek=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "long,int", "1"}, {"getAsShortText", "long,java.util.Locale", "1"}, {"addWrapField", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("31536000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false), new String[][]{{"getLeapAmount", "long", "6"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"1", "2", "-2", "-59", "1", "-2147483648", "-6"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "millisOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getMinimumValue", "org.joda.time.ReadablePartial", "2"}, {"getMaximumValue", "org.joda.time.ReadablePartial", "3"}, {"getMaximumShortTextLength", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}), new String[][]{{"era", "", "3"}, {"addWrapField", "long,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}}), new String[][]{{"getDifference", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false), new String[][]{{"subtract", "long,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-157766399996", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getLeapDurationField", "", "2"}, {"add", "long,long", "2"}, {"set", "long,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-14399998", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:8>", "-2545574827706931670", "882125304870256623"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}, {"org.joda.time.chrono.GJChronology", "withUTC", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[108617836, 9, 4, 0, 3, 46, 6, 293]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:4>", "<empty>"}}, 2), new String[][]{{"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:8>", "3528501219481026403", "-6820497514347152810"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-327942277, -8, 0, -1, -20, -42, -37, -213]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:5>", "-12219292800000", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false), new String[][]{{"centuries", "", "5"}, {"subtract", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12621917221997", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}}), new String[][]{{"toMutableDateTime", "org.joda.time.Chronology", "3"}, {"millisOfSecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#-304628391", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"65537", "5", "1", "1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2005991161200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<s:>"}}, 1), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"weekyearOfCentury", "", "3"}, {"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial", "3"}, {"roundHalfEven", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775616", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"years", "", "5"}, {"subtract", "long,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372005318775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:2>"}, true), new String[][]{{"months", "", "0"}, {"add", "long,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1555200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:7>"}, true), new String[][]{{"yearOfCentury", "", "1"}, {"addWrapField", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("156643200004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"set", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62009539621996", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:0>"}, true), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"addWrapField", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}, 3), new String[][]{{"getAsText", "long,java.util.Locale", "5"}, {"roundHalfCeiling", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036825975809", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"set", "long,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:8>", "<sample:6>"}, true), new String[][]{{"weekyear", "", "5"}, {"set", "long,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62137152000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "hashCode", ""}}, 3), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "4"}, {"addWrapField", "long,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"weekyearOfCentury", "", "3"}, {"roundHalfFloor", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("979200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:1>"}, true), new String[][]{{"centuryOfEra", "", "3"}, {"roundHalfCeiling", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("978336000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"-184", "2", "18", "62"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}, {"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int,int,int,int", "-1", "-2", "1073741779", "0", "-186", "2147483647", "36"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-67938192421938", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"yearOfEra", "", "5"}, {"getDifferenceAsLong", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDifferenceAsLong", "long,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("292271022", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"2", "1073741823", "2147483647", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:7>", "-1272857782597643499", "3410248757173576442"}, {"org.joda.time.chrono.GJChronology", "secondOfDay", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.MillisDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getAsText", "long,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("807", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "assemble", new String[]{"org.joda.time.chrono.AssembledChronology$Fields"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}}, 1), new String[][]{{"isAfter", "org.joda.time.ReadableInstant", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[GJChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "centuries", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1), new String[][]{{"clockhourOfDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:2>", "<sample:2>", "66"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}}, 2), new String[][]{{"getLeapAmount", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getParam", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfHalfday] {getMaximumValue=11, getMinimumValue=0, getName=hourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"dayOfYear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getLeapDurationField", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "eras", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:0>", "3528501219481026369", "-59"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", "long", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}}, 1), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "years", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"convertLocalToUTC", "long,boolean,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:3>", "-9223372036854775808", "3410248757173576441"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-2545574827706931670"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545627066097331670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"weekOfWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86399", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648,cutover=1970-01-01T00:00:00.003Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}, 1), new String[][]{{"getLeapDurationField", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"seconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "3410248759321060151"}}, 3), new String[][]{{"add", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "2048996490096878749", "-12219292799998"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:3>", "4097975388007713084", "2147483647"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4283517975112113084", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "-2147483648", "40", "-72", "1073741823", "-4194302", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-1272857782597643503"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2147483648", "2147483647", "18", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1272883886975243503", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "3528501219481026373", "4097905019263535420", "-42"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "long", "int"}, new String[]{"<sample:1>", "2199023255552", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"get", "org.joda.time.DateTimeField", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1575", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfDay", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"subtract", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[GJChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-3423199777790"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3424409377790", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-1272787413853465835"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1272813517021465835", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("dayOfYear {getName=dayOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}}, 1), new String[][]{{"roundHalfCeiling", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483646", "2147483647", "2147483647", "2147483647", "10", "1073741825", "3"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:3>"}, {"org.joda.time.chrono.GJChronology", "weeks", ""}}, 1), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"centuryOfEra", "", "7"}, {"remainder", "long", "1"}, {"getAsText", "long,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2922790", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"halfdays", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "-1272576307620932843"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"-5091149655413863344", "4097975388007713115", "-2147483648"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "era", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"-2545574827706931670"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}, {"org.joda.time.chrono.GJChronology", "centuryOfEra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545522589921331670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"-2147483648", "65537", "9", "-59", "0", "18", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getGregorianCutover", ""}, {"org.joda.time.chrono.GJChronology", "years", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<null>", "7", "3410248757173576440"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfHalfday] {getMaximumValue=11, getMinimumValue=0, getName=hourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", ""}, {"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}}), new String[][]{{"add", "long,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-1272787413853465835"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1272813517021465835", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "1764250609757290417"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "getBase", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "julianToGregorianByWeekyear", new String[]{"long"}, new String[]{"3528501219481026401"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3528428764441026401", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:8>", "<sample:3>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "months", ""}, {"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:5>", "3410248757173576440"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62100817245560", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles,cutover=5881637-04-13T07:00:00.000Z] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:6>", "3410248757169382138"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[108068451, 2, 9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", ""}, {"org.joda.time.chrono.GJChronology", "monthOfYear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekOfWeekyear] {getMaximumValue=53, getMinimumValue=1, getName=weekOfWeekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millisOfSecond", new String[]{}, new String[]{}, false), new String[][]{{"getDifference", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "days", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getMillis", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1582-10-15T00:00:00.000Z {getMillis=-12219292800000, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "882125304878645208"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"clockhourOfHalfday", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "millisOfDay", ""}}), new String[][]{{"getLeapDurationField", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-2545574827706931671", "76"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545574821140531671", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hours", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "getDateTimeMillis", "int,int,int,int", "-2", "-29", "84", "-18"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:6>"}, true), new String[][]{{"dayOfYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false), new String[][]{{"compareTo", "org.joda.time.DurationField", "7"}, {"getMillis", "int,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7776000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"long", "long", "int"}, new String[]{"3410248757173576477", "-1272857782597643499", "0"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePeriod,long,long", "<sample:7>", "1755243410502549385", "-1272787138975558891"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3410248757173576477", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "int,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5647336533504000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "long,long", "0"}, {"getMillis", "int,long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", "long", "1764250609757290417"}, {"org.joda.time.chrono.GJChronology", "millis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJDayOfWeekDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "4097979786054224188"}}), new String[][]{{"getAsText", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"int", "int", "int", "int"}, new String[]{"-2", "-2147483646", "-19", "34"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdayOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "9003776054963201"}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"hours", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfHalfday", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:10>", "2545574827706931670"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "get", "org.joda.time.ReadablePartial,long", "<sample:1>", "3528501253840764771"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[80668025, 1, 23, 84531670]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfEra", ""}, {"org.joda.time.chrono.GJChronology", "hourOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-1764250609757290417", "9"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfDay", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1764250608979690417", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:4>", "<sample:7>"}, true), new String[][]{{"halfdays", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "withUTC", ""}}), new String[][]{{"set", "long,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:8>", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weekyears] {getName=weekyears, getUnitMillis=31556952000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:1>", "<sample:2>"}, true), new String[][]{{"add", "long,long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:2>", "4294967297"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "year", ""}}), new String[][]{{"toDateTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1582-10-14T16:07:02.000-07:52:58 {getCenturyOfEra=15, getDayOfMonth=14, getDayOfWeek=4, getDayOfYear=287, getEra=1, getHourOfDay=16, getMillis=-12219292800000, getMillisOfDay=58022000, getMillisOfSeco...#346#-1808321721", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "set", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<null>", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfHalfday", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfCentury", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "getMinimumDaysInFirstWeek", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology", actual.getClass().getName());
  assertEquals("ZonedChronology[GJChronology[UTC], America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"add", "long,long,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyearOfCentury", ""}}), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292272992", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdayOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hourOfDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[hourOfDay] {getMaximumValue=23, getMinimumValue=0, getName=hourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}}), new String[][]{{"getDifferenceAsLong", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:1>"}}), new String[][]{{"getUnitMillis", "", "7"}, {"getValueAsLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:1>", "4097975388007713084"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"millis", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.MillisDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "secondOfMinute", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:4>", "<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648,cutover=1970-01-01T00:00:00.003Z,mdfw=1] {getMinimumDaysInFirstWeek=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withUTC", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "3410248757173576407", "-3423199777787", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"weekyearOfCentury", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyearOfCentury] {getMaximumValue=100, getMinimumValue=1, getName=weekyearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getParam", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[JulianChronology[UTC], GregorianChronology[UTC], 1582-10-15T00:00:00.000Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}}), new String[][]{{"getDifference", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "millis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "halfdays", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "yearOfEra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292278993, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<null>", "-4522711405567", "-2147483648"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "yearOfCentury", ""}, {"org.joda.time.chrono.GJChronology", "days", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4522711405567", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:3>", "-3423199777791", "-24"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3425273377791", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyearOfCentury", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "clockhourOfHalfday", ""}}), new String[][]{{"getLeapDurationField", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<null>", "<sample:3>"}, true), new String[][]{{"clockhourOfHalfday", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfMinute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"getLeapDurationField", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "withZone", "org.joda.time.DateTimeZone", "<sample:6>"}}), new String[][]{{"isSupported", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[--596:-31:-23.-648] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:3>", "0", "3410248756099834616"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("303506247", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"monthOfYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "4097975388007713085"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "months", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:7>", "1", "29"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("40089600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "-12219292800005"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<null>", "<sample:0>"}, {"org.joda.time.chrono.GJChronology", "clockhourOfHalfday", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GJChronology[UTC]", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "halfdays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "-12219292800002", "3528501219514580834", "-1"}}), new String[][]{{"getMillis", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("129600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<null>", "4097975388007713084"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long", "long"}, new String[]{"<sample:2>", "1290801812362947819", "-12219292799880"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "days", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyear", ""}}), new String[][]{{"dayOfWeek", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsShortText", "long,java.util.Locale", "6"}, {"getAsText", "long,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePartial", "long"}, new String[]{"<sample:8>", "3492472422462062434"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "monthOfYear", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[110674015, 5, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isLeap", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weeks", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:4>"}, {"org.joda.time.chrono.GJChronology", "add", "long,long,int", "550730660621312", "-9223372036854775808", "16393"}}), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("weeks {getName=weeks}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"secondOfDay", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "gregorianToJulianByWeekyear", new String[]{"long"}, new String[]{"-2545574827706931670"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2545627066097331670", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"clockhourOfHalfday", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minuteOfHour", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("seconds {getName=seconds}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMaximumValue", "org.joda.time.ReadablePartial", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292272992", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"centuries", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[centuries] {getName=centuries, getUnitMillis=3155695200000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "7"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant"}, new String[]{"<sample:3>", "<sample:1>"}, true), new String[][]{{"getGregorianCutover", "", "3"}, {"plus", "long", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("-292275055-05-16T16:47:04.192Z {getMillis=-9223372036854775808, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:2>"}}), new String[][]{{"getValueAsLong", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "validate", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "3410248757173576485"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "1764250609740513201"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "set", "org.joda.time.ReadablePartial,long", "<sample:4>", "-6820497514347152880"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "minutes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.GJChronology", "weekyears", ""}}), new String[][]{{"getValueAsLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "minuteOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, true), new String[][]{{"get", "org.joda.time.ReadablePeriod,long", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "get", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "4097975388007713085"}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "weeks", ""}, {"org.joda.time.chrono.GJChronology", "millis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "eras", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "long,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getDateTimeMillis", new String[]{"long", "int", "int", "int", "int"}, new String[]{"1272787413853465835", "1073741823", "0", "-1", "0"}, false, 4, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "12219292799999", "4097975388007713086", "65514"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone", "org.joda.time.ReadableInstant", "int"}, new String[]{"<sample:0>", "<null>", "4"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "year", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"roundFloor", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372017158400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "add", new String[]{"org.joda.time.ReadablePeriod", "long", "int"}, new String[]{"<sample:4>", "-12214997832705", "2145386495"}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("185349178166989295", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "julianToGregorianByYear", "long", "56"}}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("weekyears", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAsShortText", "int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getBase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.GJChronology", "hourOfHalfday", ""}, {"org.joda.time.chrono.GJChronology", "yearOfEra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"addWrapField", "long,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32054400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"centuryOfEra", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "toString", ""}}), new String[][]{{"getAsShortText", "long,java.util.Locale", "1"}, {"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remainder", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("57600004", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.GJChronology", "validate", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<sample:2>"}}), new String[][]{{"compareTo", "org.joda.time.DurationField", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "add", "long,long,int", "3528501494358933345", "8195950776015426168", "1074790399"}, {"org.joda.time.chrono.GJChronology", "weekOfWeekyear", ""}}), new String[][]{{"dayOfMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "secondOfDay", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"get", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "monthOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isLeap", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "era", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getRangeDurationField", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getMaximumValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("53", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekOfWeekyear", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "1"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"dayOfYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true), new String[][]{{"centuryOfEra", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "hourOfHalfday", new String[]{}, new String[]{}, false), new String[][]{{"getAsText", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "seconds", new String[]{}, new String[]{}, false), new String[][]{{"getMillis", "int,long", "0"}, {"getUnitMillis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"minuteOfDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "weekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.GJChronology", "assemble", "org.joda.time.chrono.AssembledChronology$Fields", "<sample:4>"}}), new String[][]{{"get", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfMonth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.GJChronology", "months", ""}}), new String[][]{{"getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getGregorianCutover", new String[]{}, new String[]{}, false), new String[][]{{"withDurationAdded", "org.joda.time.ReadableDuration,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "getInstanceUTC", new String[]{}, new String[]{}, true), new String[][]{{"getMinimumDaysInFirstWeek", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuries", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getMillis", "long,long", "2"}, {"getMillis", "int,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3155673600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "clockhourOfDay", new String[]{}, new String[]{}, false), new String[][]{{"getLeapAmount", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "withZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"clockhourOfDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "centuryOfEra", new String[]{}, new String[]{}, false), new String[][]{{"roundCeiling", "long", "5"}, {"getDifference", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfWeek", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Fri", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.GJChronology", "org.joda.time.chrono.GJChronology", "dayOfYear", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getAsShortText", "int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.receiverState());
 }
}
