package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"Illegal roundjng mode: "}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillisOfSecond", "int", "5"}, {"org.joda.time.MutableDateTime", "monthOfYear", ""}, {"org.joda.time.MutableDateTime", "secondOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addDays", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadableDuration,int", "<sample:0>", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-61858612229936, getMillisOfDay=44192064, getMillisOfSecon...#349#-1226829754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfCentury", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "compareTo", "org.joda.time.ReadableInstant", "<sample:2>"}, {"org.joda.time.MutableDateTime", "setHourOfDay", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[yearOfCentury] {get=86, getAsShortText=86, getAsString=86, getAsText=86, getLeapAmount=0, getMaximumValue=100, getMaximumValueOverall=100, getMinimumValue=1, getMinimumValueOverall=1, getName...#229#1225681059", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T10:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=10, getMillis=36000003, getMillisOfDay=36000003, getMillisOfSecond=3, getMinute...#331#-1448299747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:2>", "5"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "getSecondOfMinute", ""}, {"org.joda.time.MutableDateTime", "getHourOfDay", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-10T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=10, getDayOfWeek=6, getDayOfYear=283, getEra=1, getHourOfDay=17, getMillis=1791676800000, getMillisOfDay=61200000, getMillisOfSecond=0,...#343#1408310047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "era", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getMaximumShortTextLength", "java.util.Locale", "0"}, {"roundFloor", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("-292269055-12-02T16:47:04.192Z {getCenturyOfEra=2922694, getDayOfMonth=6, getDayOfWeek=6, getDayOfYear=96, getEra=1, getHourOfDay=16, getMillis=-9223372036854775808, getMillisOfDay=60424192, getMillis...#356#-146865096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-292269055-12-02T16:47:04.192Z {getCenturyOfEra=2922694, getDayOfMonth=6, getDayOfWeek=6, getDayOfYear=96, getEra=1, getHourOfDay=16, getMillis=-9223372036854775808, getMillisOfDay=60424192, getMillis...#356#-146865096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "weekOfWeekyear", ""}, {"org.joda.time.MutableDateTime", "add", "org.joda.time.DurationFieldType,int", "<sample:1>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1686", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "millisOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setMillis", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.MutableDateTime", "setYear", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfDay] {get=25200000, getAsShortText=25200000, getAsString=25200000, getAsText=25200000, getLeapAmount=0, getMaximumValue=86399999, getMaximumValueOverall=86399999, getMinimumValue=0, g...#259#-1732082055", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0284-07-07T07:00:00.000Z {getCenturyOfEra=1, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=313, getEra=1, getHourOfDay=7, getMillis=-53188765200000, getMillisOfDay=25200000, getMillisOfSecond=0, getM...#337#-1768856969", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "62"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<sample:7>", "4"}, {"org.joda.time.MutableDateTime", "getDayOfYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-09-10T17:00:00.000-07:00 {getCenturyOfEra=19, getDayOfMonth=10, getDayOfWeek=3, getDayOfYear=253, getEra=1, getHourOfDay=17, getMillis=-9676800000, getMillisOfDay=61200000, getMillisOfSecond=0, g...#340#279627666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "centuryOfEra", new String[]{}, new String[]{}, false, 25, new String[][]{}), new String[][]{{"set", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("0069-12-31T16:00:00.003-07:52:58 {getCenturyOfEra=0, getDayOfMonth=31, getDayOfWeek=2, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=-59958144421997, getMillisOfDay=57600003, getMillisOfSecon...#345#-951031520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0069-12-31T16:00:00.003-07:52:58 {getCenturyOfEra=0, getDayOfMonth=31, getDayOfWeek=2, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=-59958144421997, getMillisOfDay=57600003, getMillisOfSecon...#345#-951031520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "centuryOfEra", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.MutableDateTime", "getChronology", ""}}), new String[][]{{"roundHalfFloor", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2000-01-01T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=6, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=946713600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#323#1611893301", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2000-01-01T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=6, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=946713600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#323#1611893301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.MutableDateTime", "weekOfWeekyear", ""}, {"org.joda.time.MutableDateTime", "setChronology", "org.joda.time.Chronology", "<sample:7>"}, {"org.joda.time.MutableDateTime", "addMillis", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.064Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=64, getMillisOfDay=64, getMillisOfSecond=64, getMinuteOfDay=0, get...#313#1898136956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "secondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setDate", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[secondOfMinute] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=59, getMaximumValueOverall=59, getMinimumValue=0, getMinimumValueOverall=0, getName=seco...#225#380620045", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "monthOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.MutableDateTime", "setTime", "int,int,int,int", "51", "-43", "62", "-2147483648"}, {"org.joda.time.MutableDateTime", "property", "org.joda.time.DateTimeFieldType", "<sample:6>"}}, 1), new String[][]{{"getAsShortText", "", "0"}, {"get", "", "0"}, {"getAsShortText", "java.util.Locale", "5"}, {"getMutableDateTime", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getSecondOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "setDayOfYear", "int", "6"}, {"org.joda.time.MutableDateTime", "setDate", "int,int,int", "4", "0", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-09-03T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=6, getDayOfWeek=2, getDayOfYear=6, getEra=1, getHourOfDay=0, getMillis=-9244799997, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0,...#316#1698810935", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:3>", "2147483646"}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadableDuration", "<sample:8>"}, {"org.joda.time.MutableDateTime", "setZone", "org.joda.time.DateTimeZone", "<sample:5>"}, {"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setTime", new String[]{"int", "int", "int", "int"}, new String[]{"2", "1", "6", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T02:01:06.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=2, getMillis=1791018066000, getMillisOfDay=7266000, getMillisOfSecond=0, ge...#338#220034180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setZoneRetainFields", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "yearOfCentury", ""}, {"org.joda.time.MutableDateTime", "getWeekOfWeekyear", ""}, {"org.joda.time.MutableDateTime", "getMinuteOfHour", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadableDuration", "int"}, new String[]{"<sample:5>", "-47"}, false, 4, new String[][]{{"org.joda.time.MutableDateTime", "minuteOfHour", ""}, {"org.joda.time.MutableDateTime", "setMillisOfDay", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-02T23:59:59.909-07:00 {getCenturyOfEra=20, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=275, getEra=1, getHourOfDay=23, getMillis=1791010799909, getMillisOfDay=86399909, getMillisOfSecond=909...#346#1167316300", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{".5", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.joda.time.MutableDateTime", "getMinuteOfHour", ""}, {"org.joda.time.MutableDateTime", "toCalendar", "java.util.Locale", "<null>"}, {"org.joda.time.MutableDateTime", "year", ""}}, 2), new String[][]{{"set", "int", "3"}, {"minuteOfDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[minuteOfDay] {get=736, getAsShortText=736, getAsString=736, getAsText=736, getLeapAmount=0, getMaximumValue=1439, getMaximumValueOverall=1439, getMinimumValue=0, getMinimumValueOverall=0, get...#231#266986347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001-10-11T12:16:32.064-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=4, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-62111073029936, getMillisOfDay=44192064, getMillisOfSecon...#349#2022421901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setWeekOfWeekyear", new String[]{"int"}, new String[]{"3"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "addMinutes", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1970-01-14T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=14, getDayOfWeek=3, getDayOfYear=14, getEra=1, getHourOfDay=16, getMillis=1209600001, getMillisOfDay=57600001, getMillisOfSecond=1, get...#336#1120125334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfMonth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "year", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"roundHalfEven", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2027-01-01T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=5, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=1798790400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteO...#324#-167472445", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2027-01-01T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=5, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=1798790400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteO...#324#-167472445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addSeconds", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "toDateTime", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "year", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "getEra", ""}, {"org.joda.time.MutableDateTime", "dayOfYear", ""}}), new String[][]{{"roundHalfCeiling", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfWeek", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<sample:3>", "3"}, {"org.joda.time.MutableDateTime", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-10T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=10, getDayOfWeek=6, getDayOfYear=283, getEra=1, getHourOfDay=17, getMillis=1791676800000, getMillisOfDay=61200000, getMillisOfSecond=0,...#343#-1670503523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "centuryOfEra", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.DurationFieldType,int", "<sample:2>", "4194300"}, {"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField", "<sample:7>"}, {"org.joda.time.MutableDateTime", "era", ""}}, 2), new String[][]{{"getMaximumValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2922789", String.valueOf(actual));
  assertEquals("receiver state after the call", "13509-12-06T16:00:00.000-08:00 {getCenturyOfEra=135, getDayOfMonth=6, getDayOfWeek=1, getDayOfYear=340, getEra=1, getHourOfDay=16, getMillis=364165027200000, getMillisOfDay=57600000, getMillisOfSecond...#345#-1581260743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMinuteOfDay", new String[]{"int"}, new String[]{"-35"}, false, 3, new String[][]{{"org.joda.time.MutableDateTime", "addWeeks", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "4"}, false, 9, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", ""}, {"org.joda.time.MutableDateTime", "addSeconds", "int", "-4"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTimeISO", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.joda.time.MutableDateTime", "setRounding", "org.joda.time.DateTimeField,int", "<sample:4>", "-43"}, {"org.joda.time.MutableDateTime", "setTime", "org.joda.time.ReadableInstant", "<sample:1>"}, {"org.joda.time.MutableDateTime", "toDateTime", "org.joda.time.Chronology", "<sample:0>"}}, 2), new String[][]{{"copy", "", "0"}, {"millisOfSecond", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=999, getAsShortText=999, getAsString=999, getAsText=999, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, ge...#235#2064683275", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T23:59:59.999-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=23, getMillis=1791097199999, getMillisOfDay=86399999, getMillisOfSecond=999...#346#-467559851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "-13"}}, 3), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57599999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "-13"}}, 3), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Oct 03 00:00:00 PDT 2026 {getDate=3, getDay=6, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=1791010800000, getTimezoneOffset=420, getYear=126}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 13 00:09:30 PST 9 {getDate=13, getDay=0, getHours=0, getMinutes=9, getMonth=9, getSeconds=30, getTime=-61858655429936, getTimezoneOffset=480, getYear=-1891}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-61858612229936, getMillisOfDay=44192064, getMillisOfSecon...#349#-1226829754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"setHours", "int", "2"}, {"getMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3), new String[][]{{"setHours", "int", "2"}, {"getMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.011-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=11, getMillisOfDay=57600011, getMillisOfSecond=11, getMinute...#331#98616465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.MutableDateTime", "weekyear", ""}}, 3), new String[][]{{"setHours", "int", "2"}, {"getMonth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getFieldType", "", "0"}, {"getName", "", "4"}, {"getDurationType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getFieldType", "", "0"}, {"getName", "", "4"}, {"getDurationType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.MutableDateTime", "toDateTime", "org.joda.time.Chronology", "<sample:7>"}}, 2), new String[][]{{"getFieldType", "", "0"}, {"getName", "", "4"}, {"getDurationType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.011-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=11, getMillisOfDay=57600011, getMillisOfSecond=11, getMinute...#331#98616465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"Field must not be nulk"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillisOfSecond", "int", "5"}, {"org.joda.time.MutableDateTime", "monthOfYear", ""}, {"org.joda.time.MutableDateTime", "secondOfDay", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"a"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00d6S", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"`"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"'"}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"("}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"(2"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"(1"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"'"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"n&"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.005Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=5, getMillisOfDay=5, getMillisOfSecond=5, getMinuteOfDay=0, getMin...#310#132810851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "isAfter", "long", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2019-01-23T07:00:00.000Z {getCenturyOfEra=18, getDayOfMonth=23, getDayOfWeek=6, getDayOfYear=23, getEra=1, getHourOfDay=7, getMillis=1791010800000, getMillisOfDay=25200000, getMillisOfSecond=0, getMin...#333#672657627", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfCentury", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getMutableDateTime", "", "1"}, {"millisOfSecond", "", "6"}, {"compareTo", "org.joda.time.ReadablePartial", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.011-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=11, getMillisOfDay=57600011, getMillisOfSecond=11, getMinute...#331#98616465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"-41"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T15:59:59.959-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=15, getMillis=-41, getMillisOfDay=57599959, getMillisOfSecond=959, getMinu...#335#-692594752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"2852608688168764006"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "90397540-10-12T22:06:04.006-07:00 {getCenturyOfEra=903975, getDayOfMonth=12, getDayOfWeek=6, getDayOfYear=286, getEra=1, getHourOfDay=22, getMillis=2852608688168764006, getMillisOfDay=79564006, getMil...#357#-1740124704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"2852608687095022182"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "90397540-09-30T11:50:22.182-07:00 {getCenturyOfEra=903975, getDayOfMonth=30, getDayOfWeek=1, getDayOfYear=274, getEra=1, getHourOfDay=11, getMillis=2852608687095022182, getMillisOfDay=42622182, getMil...#359#1353001348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"2852608687095022133"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "90397540-09-30T11:50:22.133-07:00 {getCenturyOfEra=903975, getDayOfMonth=30, getDayOfWeek=1, getDayOfYear=274, getEra=1, getHourOfDay=11, getMillis=2852608687095022133, getMillisOfDay=42622133, getMil...#359#1451445392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"-4481126543819298617"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "-141999278-09-27T04:58:43.383-07:52:58 {getCenturyOfEra=1419992, getDayOfMonth=27, getDayOfWeek=3, getDayOfYear=270, getEra=0, getHourOfDay=4, getMillis=-4481126543819298617, getMillisOfDay=17923383, ...#365#1382635590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekyear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addYears", "int", "-24"}, {"org.joda.time.MutableDateTime", "getEra", ""}, {"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod,int", "<sample:6>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1946", String.valueOf(actual));
  assertEquals("receiver state after the call", "1946-01-18T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=18, getDayOfWeek=5, getDayOfYear=18, getEra=1, getHourOfDay=16, getMillis=-755827200000, getMillisOfDay=57600000, getMillisOfSecond=0, ...#339#135440276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekyear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "addYears", "int", "-24"}, {"org.joda.time.MutableDateTime", "getEra", ""}, {"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadablePeriod,int", "<sample:2>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1946", String.valueOf(actual));
  assertEquals("receiver state after the call", "1945-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=1, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=-757382400000, getMillisOfDay=57600000, getMillisOfSecond=0,...#341#-170117998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "addMillis", "int", "-1073807360"}, {"org.joda.time.MutableDateTime", "setDateTime", "int,int,int,int,int,int,int", "-13", "2147483647", "6", "5", "6", "2147483647", "-43"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfWeek] {get=5, getAsShortText=Fri, getAsString=5, getAsText=Friday, getLeapAmount=0, getMaximumValue=7, getMaximumValueOverall=7, getMinimumValue=1, getMinimumValueOverall=1, getName=dayO...#220#-1777421449", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-06T13:43:12.643Z {getCenturyOfEra=17, getDayOfMonth=10, getDayOfWeek=5, getDayOfYear=100, getEra=1, getHourOfDay=13, getMillis=-1073807357, getMillisOfDay=49392643, getMillisOfSecond=643, getM...#338#-1887741895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "addMillis", "int", "-1073807360"}, {"org.joda.time.MutableDateTime", "setDateTime", "int,int,int,int,int,int,int", "-13", "2147483647", "6", "5", "6", "2147483647", "-43"}, {"org.joda.time.MutableDateTime", "toDateTimeISO", ""}}, 1), new String[][]{{"compareTo", "org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-06T13:43:12.643Z {getCenturyOfEra=17, getDayOfMonth=10, getDayOfWeek=5, getDayOfYear=100, getEra=1, getHourOfDay=13, getMillis=-1073807357, getMillisOfDay=49392643, getMillisOfSecond=643, getM...#338#-1887741895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "addMillis", "int", "-1073807360"}, {"org.joda.time.MutableDateTime", "setDateTime", "int,int,int,int,int,int,int", "-13", "2147483647", "6", "5", "6", "2147483647", "-43"}, {"org.joda.time.MutableDateTime", "toDateTimeISO", ""}}, 1), new String[][]{{"compareTo", "org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-09-20T13:43:12.640-07:00 {getCenturyOfEra=20, getDayOfMonth=20, getDayOfWeek=7, getDayOfYear=263, getEra=1, getHourOfDay=13, getMillis=1789936992640, getMillisOfDay=49392640, getMillisOfSecond=64...#345#1259603307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}}), new String[][]{{"getHourOfDay", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("0007-08-09T10:11:12.016-07:52:58 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getHourOfDay=10, getMillis=-61927221349984, getMillisOfDay=36672016, getMillisOfSecond...#347#509729384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09T10:11:12.016-07:52:58 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getHourOfDay=10, getMillis=-61927221349984, getMillisOfDay=36672016, getMillisOfSecond...#347#509729384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}}), new String[][]{{"getEra", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007-08-09T10:11:12.016-07:52:58 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getHourOfDay=10, getMillis=-61927221349984, getMillisOfDay=36672016, getMillisOfSecond...#347#509729384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}}), new String[][]{{"getEra", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-61858612229936, getMillisOfDay=44192064, getMillisOfSecon...#349#-1226829754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.MutableDateTime", "getMillisOfDay", ""}}), new String[][]{{"getEra", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.011-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=11, getMillisOfDay=57600011, getMillisOfSecond=11, getMinute...#331#98616465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "millisOfSecond", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "millisOfSecond", ""}}), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "3"}, {"org.joda.time.MutableDateTime", "millisOfSecond", ""}}), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 31 00:00:00 PST 1969 {getDate=31, getDay=1, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=-23817600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-03-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=1, getDayOfYear=90, getEra=1, getHourOfDay=16, getMillis=-23760000000, getMillisOfDay=57600000, getMillisOfSecond=0, g...#339#-78886581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "3"}}), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 31 00:00:00 PST 1969 {getDate=31, getDay=1, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=-23817599999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-03-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=1, getDayOfYear=90, getEra=1, getHourOfDay=16, getMillis=-23759999999, getMillisOfDay=57600001, getMillisOfSecond=1, g...#339#-1640397514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "setMonthOfYear", "int", "-13"}}), new String[][]{{"setHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57599999, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=31, getAsShortText=31, getAsString=31, getAsText=31, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayO...#221#-805112273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=31, getAsShortText=31, getAsString=31, getAsText=31, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayO...#221#-805112273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getFieldType", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("dayOfMonth {getName=dayOfMonth}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getFieldType", "", "0"}, {"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("dayOfMonth", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"Illegal rounding mode: "}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "setMillisOfSecond", "int", "4"}, {"org.joda.time.MutableDateTime", "monthOfYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfCentury", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "minuteOfHour", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[yearOfCentury] {get=69, getAsShortText=69, getAsString=69, getAsText=69, getLeapAmount=0, getMaximumValue=99, getMaximumValueOverall=99, getMinimumValue=0, getMinimumValueOverall=0, getName=y...#227#-954539917", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "yearOfCentury", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "minuteOfHour", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[yearOfCentury] {get=69, getAsShortText=69, getAsString=69, getAsText=69, getLeapAmount=0, getMaximumValue=99, getMaximumValueOverall=99, getMinimumValue=0, getMinimumValueOverall=0, getName=y...#227#-954539917", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"(1"}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"("}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"'"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "get", "org.joda.time.DateTimeField", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMinuteOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("960", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMinuteOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("960", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "addDays", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.joda.time.MutableDateTime", "add", "org.joda.time.ReadableDuration,int", "<sample:0>", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "5879620-04-20T12:16:32.064-07:00 {getCenturyOfEra=58796, getDayOfMonth=20, getDayOfWeek=1, getDayOfYear=111, getEra=1, getHourOfDay=12, getMillis=185480728485392064, getMillisOfDay=44192064, getMillis...#355#-843016840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=365, getAsShortText=365, getAsString=365, getAsText=365, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#-122480896", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=365, getAsShortText=365, getAsString=365, getAsText=365, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#-122480896", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"add", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("-5877521-03-03T00:00:00.003Z {getCenturyOfEra=58779, getDayOfMonth=7, getDayOfWeek=2, getDayOfYear=187, getEra=1, getHourOfDay=0, getMillis=-185542587187199997, getMillisOfDay=3, getMillisOfSecond=3, ...#334#-303959649", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-5877521-03-03T00:00:00.003Z {getCenturyOfEra=58779, getDayOfMonth=7, getDayOfWeek=2, getDayOfYear=187, getEra=1, getHourOfDay=0, getMillis=-185542587187199997, getMillisOfDay=3, getMillisOfSecond=3, ...#334#-303959649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("-5877584-03-24T00:00:00.000-07:52:58 {getCenturyOfEra=58775, getDayOfMonth=24, getDayOfWeek=4, getDayOfYear=84, getEra=0, getHourOfDay=0, getMillis=-185540796173222000, getMillisOfDay=0, getMillisOfSe...#342#-1391618734", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-5877584-03-24T00:00:00.000-07:52:58 {getCenturyOfEra=58775, getDayOfMonth=24, getDayOfWeek=4, getDayOfYear=84, getEra=0, getHourOfDay=0, getMillis=-185540796173222000, getMillisOfDay=0, getMillisOfSe...#342#-1391618734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "dayOfYear", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"add", "int", "0"}, {"millisOfSecond", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#-304628391", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-5877584-03-24T00:00:00.000-07:52:58 {getCenturyOfEra=58775, getDayOfMonth=24, getDayOfWeek=4, getDayOfYear=84, getEra=0, getHourOfDay=0, getMillis=-185540796173222000, getMillisOfDay=0, getMillisOfSe...#342#-1391618734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "getDayOfMonth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-09-10T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=10, getDayOfWeek=4, getDayOfYear=253, getEra=1, getHourOfDay=17, getMillis=1789084800000, getMillisOfDay=61200000, getMillisOfSecond=0,...#342#-312907917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0008-12-16T16:07:02.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=16, getDayOfWeek=2, getDayOfYear=351, getEra=1, getHourOfDay=16, getMillis=-61884432000000, getMillisOfDay=58022000, getMillisOfSecon...#346#-141750625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-09-06T17:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=6, getDayOfWeek=7, getDayOfYear=249, getEra=1, getHourOfDay=17, getMillis=1788739200000, getMillisOfDay=61200000, getMillisOfSecond=0, ...#341#-1333887406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:7>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0009-08-26T16:07:02.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=26, getDayOfWeek=3, getDayOfYear=238, getEra=1, getHourOfDay=16, getMillis=-61862572800000, getMillisOfDay=58022000, getMillisOfSecon...#345#1407995958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setRounding", new String[]{"org.joda.time.DateTimeField"}, new String[]{"<sample:2>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0009-09-25T16:07:02.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=25, getDayOfWeek=5, getDayOfYear=268, getEra=1, getHourOfDay=16, getMillis=-61859980800000, getMillisOfDay=58022000, getMillisOfSecon...#345#885660618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDayOfYear", new String[]{"int"}, new String[]{"-13"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "compareTo", "org.joda.time.ReadableInstant", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toMutableDateTime", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.005Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=5, getMillisOfDay=5, getMillisOfSecond=5, getMinuteOfDay=0, getMin...#310#132810851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#506#-2048876372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getDayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isBeforeNow", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "isBeforeNow", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setWeekOfWeekyear", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getEra", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getEra", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfSecond", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfSecond", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfSecond", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfSecond", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "weekyear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "compareTo", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[weekyear] {get=1686, getAsShortText=1686, getAsString=1686, getAsText=1686, getLeapAmount=0, getMaximumValue=292272708, getMaximumValueOverall=292272708, getMinimumValue=-292269337, getMinimu...#257#-2087351516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "weekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "compareTo", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.MutableDateTime", "weekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime$Property", actual.getClass().getName());
  assertEquals("Property[weekyear] {get=2026, getAsShortText=2026, getAsString=2026, getAsText=2026, getLeapAmount=1, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimu...#256#944303339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "millisOfDay", ""}, {"org.joda.time.MutableDateTime", "era", ""}, {"org.joda.time.MutableDateTime", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "millisOfDay", ""}, {"org.joda.time.MutableDateTime", "era", ""}, {"org.joda.time.MutableDateTime", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}, {"org.joda.time.MutableDateTime", "add", "long", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#507#2050271662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:3>"}, {"org.joda.time.MutableDateTime", "add", "long", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.005-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800005, getMillisOfDay=5, getMillisOfSecond=5, getMinut...#327#235391596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.MutableDateTime", "add", "long", "5"}, {"org.joda.time.MutableDateTime", "isBeforeNow", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0007-08-09T10:11:12.021-07:52:58 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getHourOfDay=10, getMillis=-61927221349979, getMillisOfDay=36672021, getMillisOfSecond...#347#-2034003568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.MutableDateTime", "add", "long", "5"}, {"org.joda.time.MutableDateTime", "dayOfWeek", ""}, {"org.joda.time.MutableDateTime", "isBeforeNow", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.005-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800005, getMillisOfDay=5, getMillisOfSecond=5, getMinut...#327#235391596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.MutableDateTime", "add", "long", "5"}, {"org.joda.time.MutableDateTime", "dayOfWeek", ""}, {"org.joda.time.MutableDateTime", "isBeforeNow", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.069-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-61858612229931, getMillisOfDay=44192069, getMillisOfSecon...#349#-1967544452", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getRoundingField", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.MutableDateTime", "add", "long", "5"}, {"org.joda.time.MutableDateTime", "dayOfWeek", ""}, {"org.joda.time.MutableDateTime", "isBeforeNow", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.016-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=16, getMillisOfDay=57600016, getMillisOfSecond=16, getMinute...#331#-822038789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekyear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekyear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "checkChronology", "org.joda.time.Chronology", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getMillisOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "checkChronology", "org.joda.time.Chronology", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("57600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toGregorianCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.MutableDateTime", "hashCode", ""}, {"org.joda.time.MutableDateTime", "setDayOfWeek", "int", "-1"}}), new String[][]{{"getLeastMaximum", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "toGregorianCalendar", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.MutableDateTime", "hashCode", ""}, {"org.joda.time.MutableDateTime", "setDayOfWeek", "int", "1"}}), new String[][]{{"getLeastMaximum", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.MutableDateTime", "getWeekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfEra", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.MutableDateTime", "getWeekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfEra", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.MutableDateTime", "getWeekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1686", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getYearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "getWeekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setDateTime", new String[]{"int", "int", "int", "int", "int", "int", "int"}, new String[]{"51", "1", "-2147483648", "2147483647", "3", "5", "51"}, false, 0, new String[][]{{"org.joda.time.MutableDateTime", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=0, getMillisOfDay=57600000, getMillisOfSecond=0, getMinuteOf...#329#1174180453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#329#-1882537145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=3, getMillisOfDay=3, getMillisOfSecond=3, getMinuteOfDay=0, getMin...#310#-918341736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=12, getMillis=-61858612229936, getMillisOfDay=44192064, getMillisOfSecon...#349#-1226829754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "getWeekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.MutableDateTime", "toMutableDateTime", "org.joda.time.DateTimeZone", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T15:59:59.999-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=15, getMillis=-1, getMillisOfDay=57599999, getMillisOfSecond=999, getMinut...#334#2000634754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"41"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.041-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=41, getMillisOfDay=57600041, getMillisOfSecond=41, getMinute...#331#1872284843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"82"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.082-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=82, getMillisOfDay=57600082, getMillisOfSecond=82, getMinute...#331#330739973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setMillis", new String[]{"long"}, new String[]{"-41"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1969-12-31T15:59:59.959-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=15, getMillis=-41, getMillisOfDay=57599959, getMillisOfSecond=959, getMinu...#335#-692594752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setZoneRetainFields", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.joda.time.MutableDateTime", "year", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#1990891394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "setZoneRetainFields", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.joda.time.MutableDateTime", "year", ""}, {"org.joda.time.MutableDateTime", "setTime", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-10-03T16:00:00.001-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=16, getMillis=1791068400001, getMillisOfDay=57600001, getMillisOfSecond=1, ...#341#-1739527942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"-1.5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.MutableDateTime", "org.joda.time.MutableDateTime", "add", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:7>", "4"}, false, 6, new String[][]{{"org.joda.time.MutableDateTime", "yearOfEra", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2026-12-06T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=6, getDayOfWeek=7, getDayOfYear=340, getEra=1, getHourOfDay=0, getMillis=1796544000000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#327#-902135044", SearchInputFactory_scaffolding.receiverState());
 }
}
