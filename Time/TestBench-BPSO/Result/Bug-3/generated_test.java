package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "era", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayOfMon...#217#1764491825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfYear", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "yearOfCentury", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-01-02T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=2, getDayOfWeek=4, getDayOfYear=2, getEra=1, getHourOfDay=16, getMillis=-31363200000, getMillisOfDay=57600000, getMillisOfSecond=0, get...#336#-1175926495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "set", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0001-12-31T16:00:00.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=31, getDayOfWeek=5, getDayOfYear=365, getEra=0, getHourOfDay=16, getMillis=-62167219622000, getMillisOfDay=57600000, getMillisOfSeco...#347#1934653687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addSeconds", new String[]{"int"}, new String[]{"124"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setYear", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0001-12-31T16:02:04.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=31, getDayOfWeek=1, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=-62104061098000, getMillisOfDay=57724000, getMillisOfSecon...#345#-339055622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "56"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "millisOfSecond", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "toString", "java.lang.String", "1.12345h78-01234567"}}), new String[][]{{"roundHalfFloor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:1>", "-10"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setDayOfWeek", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1970, getAsShortText=1970, getAsString=1970, getAsText=1970, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#2108357693", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1970-01-02T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=2, getEra=1, getHourOfDay=16, getMillis=172800000, getMillisOfDay=57600000, getMillisOfSecond=0, getMin...#333#1007630033", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.MutableDateTime", "addMinutes", "int", "-15"}, {"org.joda.time.MutableDateTime", "toDate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "getSecondOfMinute", ""}}), new String[][]{{"roundHalfEven", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "weekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "5"}}), new String[][]{{"set", "int", "6"}, {"addMillis", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-09-14T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=17, getDayOfWeek=6, getDayOfYear=17, getEra=1, getHourOfDay=0, getMillis=-8294399997, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=...#318#-1866968164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-09-14T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=17, getDayOfWeek=6, getDayOfYear=17, getEra=1, getHourOfDay=0, getMillis=-8294399997, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=...#318#-1866968164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"I", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"long"}, new String[]{"4"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "addSeconds", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillisOfDay", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "addMonths", "int", "2147483615"}, {"org.joda.time.MutableDateTime", "addDays", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "178958994-09-03T00:00:00.006-07:00 {getCenturyOfEra=1789589, getDayOfMonth=3, getDayOfWeek=3, getDayOfYear=246, getEra=1, getHourOfDay=0, getMillis=5647338237682800006, getMillisOfDay=6, getMillisOfSe...#342#615622153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMinuteOfDay", new String[]{"int"}, new String[]{"11"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setWeekyear", "int", "8"}, {"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeFieldType", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0008-01-02T00:11:00.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=2, getDayOfWeek=3, getDayOfYear=2, getEra=1, getHourOfDay=0, getMillis=-61914642962000, getMillisOfDay=660000, getMillisOfSecond=0, g...#336#-2132375371", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setHourOfDay", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T02:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=2, getMillis=1791018000000, getMillisOfDay=7200000, getMillisOfSecond=0, ge...#338#-1720407953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<sample:4>", "38"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#338#-1670102913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "millisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "hourOfDay", ""}, {"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<null>", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#433396795", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "3"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTimeISO", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-09-06T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=6, getDayOfWeek=7, getDayOfYear=249, getEra=1, getHourOfDay=17, getMillis=1788739200000, getMillisOfDay=61200000, getMillisOfSecond=0, ...#341#1744926164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:0>", "4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=17, getMillis=1791072000000, getMillisOfDay=61200000, getMillisOfSecond=0, ...#342#1052920495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "set", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "4"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "checkChronology", "org.joda.time.Chronology", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "get", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setHourOfDay", "int", "88"}, {"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<sample:4>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "292278994-08-17T00:12:55.807-07:00 {getCenturyOfEra=2922789, getDayOfMonth=17, getDayOfWeek=7, getDayOfYear=229, getEra=1, getHourOfDay=0, getMillis=9223372036854775807, getMillisOfDay=775807, getMill...#354#-909673186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfWeek", new String[]{}, new String[]{}, false), new String[][]{{"roundCeiling", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2026-10-04T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=277, getEra=1, getHourOfDay=0, getMillis=1791097200000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#648456899", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-04T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=277, getEra=1, getHourOfDay=0, getMillis=1791097200000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#648456899", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"' is not suXppor\ted"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setZone", "org.joda.time.DateTimeZone", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" is not suXppor\ted", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-18T16:00:00.003-08:00 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=3, getDayOfYear=352, getEra=1, getHourOfDay=16, getMillis=3, getMillisOfDay=57600003, getMillisOfSecond=3, getMinuteOf...#330#-143589874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "millisOfDay", ""}, {"org.joda.time.MutableDateTime", "setTime", "org.joda.time.ReadableInstant", "<sample:3>"}}), new String[][]{{"roundFloor", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addHours", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "addYears", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "toString", "java.lang.String", ".5i"}}), new String[][]{{"add", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "setTime", "org.joda.time.ReadableInstant", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#302119019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "addMinutes", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "5881637-04-13T16:00:00.001-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=16, getMillis=185544378255600001, getMillisOfDay=57600001, getMillis...#352#85693698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"int", "int", "int", "int"}, new String[]{"12", "0", "47", "2"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillisOfDay", "int", "2147483647"}, {"org.joda.time.MutableDateTime", "minuteOfHour", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T12:00:47.002-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=12, getMillis=1791054047002, getMillisOfDay=43247002, getMillisOfSecond=2, ...#342#1200658460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "yearOfEra", ""}, {"org.joda.time.MutableDateTime", "setDate", "org.joda.time.ReadableInstant", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "-292275055-05-16T16:47:04.192Z {getCenturyOfEra=!ArithmeticException, getDayOfMonth=!ArithmeticException, getDayOfWeek=!ArithmeticException, getDayOfYear=!ArithmeticException, getEra=!ArithmeticExcept...#596#1956795964", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setWeekOfWeekyear", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.004Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=4, getMillisOfDay=4, getMillisOfSecond=4, getMinuteOfDay=0, getMin...#310#602825718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isAfterNow", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "getDayOfMonth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfMonth", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addMillis", new String[]{"int"}, new String[]{"38"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfCentury", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addYears", "int", "39"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2008-12-31T16:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=366, getEra=1, getHourOfDay=16, getMillis=1230768000000, getMillisOfDay=57600000, getMillisOfSecond=0,...#341#-1705823540", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2008-12-31T16:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=366, getEra=1, getHourOfDay=16, getMillis=1230768000000, getMillisOfDay=57600000, getMillisOfSecond=0,...#341#-1705823540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.003Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMinute...#305#1471807736", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String"}, new String[]{"Field '"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "setDayOfYear", "int", "124"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2110743209", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-05-04T16:00:00.001-07:00 {getCenturyOfEra=19, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=124, getEra=1, getHourOfDay=16, getMillis=-20825999999, getMillisOfDay=57600001, getMillisOfSecond=1, g...#339#1816524840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"long"}, new String[]{"-9223372036854771712"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getDayOfMonth", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"long"}, new String[]{"-44"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "getYearOfCentury", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-18T23:59:59.959Z {getCenturyOfEra=17, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=112, getEra=1, getHourOfDay=23, getMillis=-41, getMillisOfDay=86399959, getMillisOfSecond=959, getMinuteOfD...#331#1357131292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfWeek", new String[]{"int"}, new String[]{"39"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getSecondOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "dayOfYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=5, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:11>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.008-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=8, getMillisOfDay=57600008, getMillisOfSecond=8, getMinuteOf...#329#-1804723851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setWeekyear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDateTime", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"47", "2147483647", "1", "-1", "-12", "-607", "-2147483648"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getYearOfCentury", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "era", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getLeapAmount", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfDay", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfMonth", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMonthOfYear", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addWeeks", "int", "112"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMonthOfYear", new String[]{"int"}, new String[]{"34"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setDayOfMonth", "int", "-41"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#328#-879208618", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod", "<sample:7>"}}, 3), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "6"}, {"getAsText", "java.util.Locale", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.003-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=3, getMillisOfDay=57600003, getMillisOfSecond=3, getMinuteOf...#329#593962251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getSecondOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setHourOfDay", "int", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21600", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T06:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=6, getMillis=-36000000, getMillisOfDay=21600000, getMillisOfSecond=0, getM...#336#1291017143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"2147483648", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "setYear", "int", "-2147483615"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2026-10-03T07:00:00.000Z {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=7, getMillis=1791010800000, getMillisOfDay=25200000, getMillisOfSecond=0, getMin...#335#1816946946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMinuteOfHour", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration", "int"}, new String[]{"<sample:1>", "126"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-02T23:59:59.874-07:00 {getCenturyOfEra=20, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=275, getEra=1, getHourOfDay=23, getMillis=1791010799874, getMillisOfDay=86399874, getMillisOfSecond=874...#346#-1424547252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "add", "long", "-9223372036854775807"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addMonths", new String[]{"int"}, new String[]{"14"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2027-12-03T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=5, getDayOfYear=337, getEra=1, getHourOfDay=0, getMillis=1827820800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1957932748", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-19T16:00:00.006Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=16, getMillis=57600006, getMillisOfDay=57600006, getMillisOfSecond=6, getMinute...#331#-2093239917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "minuteOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getMutableDateTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setSecondOfDay", new String[]{"int"}, new String[]{"-167"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isBefore", new String[]{"long"}, new String[]{"-4481126543819315002"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "era", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "setZoneRetainFields", "org.joda.time.DateTimeZone", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=!LimitException, getAsShortText=!LimitException, getAsString=!LimitException, getAsText=!LimitException, getLeapAmount=!LimitException, getMaximumValue=!LimitException, getMaximumVa...#309#-1561766872", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillisOfDay", "int", "15"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.015-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800015, getMillisOfDay=15, getMillisOfSecond=15, getMin...#328#-1281457166", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.015-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800015, getMillisOfDay=15, getMillisOfSecond=15, getMin...#329#-297253202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isBeforeNow", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "addWeeks", "int", "-41"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=!LimitException, getAsShortText=!LimitException, getAsString=!LimitException, getAsText=!LimitException, getLeapAmount=!LimitException, getMaximumValue=!LimitException, getMax...#322#1984778509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTimeISO", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=276, getAsShortText=276, getAsString=276, getAsText=276, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#641838434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setYear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfCentury", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setHourOfDay", new String[]{"int"}, new String[]{"1073741759"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "getSecondOfMinute", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfWeek", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isAfter", new String[]{"long"}, new String[]{"-1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfYear", new String[]{"int"}, new String[]{"-8197"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "isAfterNow", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isEqual", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfCentury", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getDayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[yearOfCentury] {get=!LimitException, getAsShortText=!LimitException, getAsString=!LimitException, getAsText=!LimitException, getLeapAmount=!LimitException, getMaximumValue=!LimitException, ge...#331#-809095536", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "5881637-04-13T16:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=16, getMillis=185544378255600000, getMillisOfDay=57600000, getMillis...#352#-1721971040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "millisOfSecond", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=!LimitException, getAsShortText=!LimitException, getAsString=!LimitException, getAsText=!LimitException, getLeapAmount=!LimitException, getMaximumValue=!LimitException, g...#333#-17687933", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfMonth", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "addMillis", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "1970-01-12T20:31:23.650Z {getCenturyOfEra=17, getDayOfMonth=17, getDayOfWeek=7, getDayOfYear=137, getEra=1, getHourOfDay=20, getMillis=2147483650, getMillisOfDay=73883650, getMillisOfSecond=650, getMi...#338#-1938070770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addMinutes", new String[]{"int"}, new String[]{"-5"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "toGregorianCalendar", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T15:55:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=15, getMillis=-300000, getMillisOfDay=57300000, getMillisOfSecond=0, getMi...#336#-860277309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMonthOfYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeFieldType", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDateTime", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"7", "-2147483648", "0", "-2", "528482319", "2147483647", "-1"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getMillis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "getWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addYears", new String[]{"int"}, new String[]{"124"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1421798366", String.valueOf(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "minuteOfHour", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isLeap", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"Illegal roundin[ modx: ", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toInstant", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getCenturyOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Instant", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.005Z {getMillis=5, isAfterNow=false, isBeforeNow=true, isEqualNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfMonth", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-18T16:00:00.003-08:00 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=3, getDayOfYear=352, getEra=1, getHourOfDay=16, getMillis=3, getMillisOfDay=57600003, getMillisOfSecond=3, getMinuteOf...#330#-143589874", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1686, getAsShortText=1686, getAsString=1686, getAsText=1686, getLeapAmount=0, getMaximumValue=292272708, getMaximumValueOverall=292272708, getMinimumValue=-292269337, getMinimumVal...#249#514413732", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setWeekyear", new String[]{"int"}, new String[]{"18"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addHours", new String[]{"int"}, new String[]{"7"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T23:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=23, getMillis=25200001, getMillisOfDay=82800001, getMillisOfSecond=1, getM...#337#2133719471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "era", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "setSecondOfDay", "int", "-2"}}), new String[][]{{"getAsString", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "2512-12-31T16:00:00.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=26, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#962388565", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "setMinuteOfDay", "int", "38"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.005-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=5, getMillisOfDay=57600005, getMillisOfSecond=5, getMinuteOf...#329#-1224505649", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"long"}, new String[]{"-2852608688135209588"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T04:13:10.412-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=4, getMillis=1791025990412, getMillisOfDay=15190412, getMillisOfSecond=412,...#344#-1909133554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "monthOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[monthOfYear] {get=12, getAsShortText=Dec, getAsString=12, getAsText=December, getLeapAmount=0, getMaximumValue=12, getMaximumValueOverall=12, getMinimumValue=1, getMinimumValueOverall=1, getN...#230#1959182232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toCalendar", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=5,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,tra...#942#-750154474", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.000-08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillis", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"int", "int", "int", "int"}, new String[]{"2147483615", "27", "8388612", "5"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "monthOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getFieldType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toCalendar", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setMillis", "org.joda.time.ReadableInstant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=185544378198000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,s...#806#1075569515", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "5881516-07-07T07:00:00.000Z {getCenturyOfEra=58813, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=313, getEra=1, getHourOfDay=7, getMillis=185544378198000000, getMillisOfDay=25200000, getMillisOfSeco...#347#122208156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMinuteOfHour", new String[]{"int"}, new String[]{"-56"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"minus", "long", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.002Z {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=2, getMillisOfDay=2, getMillisOfSecond=2, getMinuteOfDay=0, getMinute...#305#-346607624", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"long"}, new String[]{"-4481126543819298679"}, false, 4, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}, {"org.joda.time.MutableDateTime", "setTime", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-141999221-06-29T11:58:43.321-07:52:58 {getCenturyOfEra=1419992, getDayOfMonth=29, getDayOfWeek=5, getDayOfYear=180, getEra=0, getHourOfDay=11, getMillis=-4481124752808498679, getMillisOfDay=43123321,...#366#4666163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMinuteOfDay", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "getSecondOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "year", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setWeekyear", "int", "1"}}), new String[][]{{"compareTo", "org.joda.time.ReadableInstant", "2"}, {"compareTo", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0284-12-18T00:00:00.003Z {getCenturyOfEra=1, getDayOfMonth=22, getDayOfWeek=4, getDayOfYear=112, getEra=1, getHourOfDay=0, getMillis=-53174620799997, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOf...#323#1385798809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration", "int"}, new String[]{"<sample:5>", "-262149"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "setDateTime", "int,int,int,int,int,int,int", "-15", "43", "2147483647", "-299", "-2147483648", "2097187", "38"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#512#2057534809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addYears", "int", "-41"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1928-12-31T16:00:00.004-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=1, getDayOfYear=366, getEra=1, getHourOfDay=16, getMillis=-1293839999996, getMillisOfDay=57600004, getMillisOfSecond=4...#342#-1150932186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{}, new String[]{}, true), new String[][]{{"dayOfYear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=276, getAsShortText=276, getAsString=276, getAsText=276, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#641838434", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "toCalendar", "java.util.Locale", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[yearOfEra] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=1, getMinimumValueOv...#241#-1367164427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-292275055-05-16T16:47:04.192Z {getCenturyOfEra=!ArithmeticException, getDayOfMonth=!ArithmeticException, getDayOfWeek=!ArithmeticException, getDayOfYear=!ArithmeticException, getEra=!ArithmeticExcept...#596#1956795964", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:10>"}, false, 1, new String[][]{}), new String[][]{{"isBefore", "org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}), new String[][]{{"getWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillisOfSecond", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{}, new String[]{}, true), new String[][]{{"monthOfYear", "", "3"}, {"compareTo", "org.joda.time.ReadablePartial", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"long"}, new String[]{"-4481126543819298618"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-141999278-09-27T16:00:00.000-07:52:58 {getCenturyOfEra=1419992, getDayOfMonth=27, getDayOfWeek=3, getDayOfYear=270, getEra=0, getHourOfDay=16, getMillis=-4481126543779622000, getMillisOfDay=57600000,...#362#1008632434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDateTime", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "setChronology", "org.joda.time.Chronology", "<sample:0>"}}), new String[][]{{"isAfter", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2512-12-31T16:00:00.001-08:00 {getCenturyOfEra=26, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1122976182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"--1", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getSecondOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "getSecondOfMinute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "millisOfDay", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#338#-1670102913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setSecondOfDay", new String[]{"int"}, new String[]{"86"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "getMinuteOfDay", ""}, {"org.joda.time.MutableDateTime", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T00:01:26.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010886000, getMillisOfDay=86000, getMillisOfSecond=0, getM...#333#-1438227633", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration", "int"}, new String[]{"<sample:7>", "16777224"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "setTime", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-04T11:25:33.088-07:00 {getCenturyOfEra=20, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=277, getEra=1, getHourOfDay=11, getMillis=1791138333088, getMillisOfDay=41133088, getMillisOfSecond=88,...#344#-147733461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setSecondOfMinute", new String[]{"int"}, new String[]{"15"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfYear", new String[]{"int"}, new String[]{"-39"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.004-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=4, getMillisOfDay=57600004, getMillisOfSecond=4, getMinuteOf...#329#1832211949", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "set", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T15:59:59.999-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=15, getMillis=-1, getMillisOfDay=57599999, getMillisOfSecond=999, getMinut...#334#2000634754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"getWeekOfWeekyear", "", "6"}, {"hourOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=18, getAsShortText=18, getAsString=18, getAsText=18, getLeapAmount=0, getMaximumValue=23, getMaximumValueOverall=23, getMinimumValue=0, getMinimumValueOverall=0, getName=hourO...#219#747848393", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "set", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMinuteOfHour", new String[]{"int"}, new String[]{"78"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setHourOfDay", "int", "2050"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:3>", "62"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "addWeeks", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-11T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=15, getDayOfWeek=3, getDayOfYear=105, getEra=1, getHourOfDay=0, getMillis=-691199997, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=...#319#1603560844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "year", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDate", new String[]{"int", "int", "int"}, new String[]{"5", "-3", "2147483647"}, false, 3, new String[][]{{"org.joda.time.MutableDateTime", "setDate", "org.joda.time.ReadableInstant", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillis", "long", "32706"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:32.706-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=32706, getMillisOfDay=57632706, getMillisOfSecond=706, getMi...#336#-1044946874", SearchInputFactory_scaffolding.receiverState());
 }
}
