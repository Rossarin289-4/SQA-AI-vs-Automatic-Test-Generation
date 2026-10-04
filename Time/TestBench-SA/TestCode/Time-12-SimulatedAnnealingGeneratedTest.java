package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "0", "<sample:1>"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "30000"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-04T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=277, getEra=1, getHourOfDay=0, getMillis=1791097200000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#411617597", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-04 {getCenturyOfEra=20, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=277, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-217835035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"2000"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "2"}, {"org.joda.time.LocalDateTime", "plusWeeks", "int", "0"}, {"org.joda.time.LocalDateTime", "plusMillis", "int", "3600001"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("2001-12-22T00:00:00.003 {getCenturyOfEra=21, getDayOfMonth=22, getDayOfWeek=5, getDayOfYear=356, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-2110032529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"4000"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "plusWeeks", "int", "-28"}, {"org.joda.time.LocalDateTime", "toDateTime", ""}}), new String[][]{{"minusYears", "int", "1"}, {"getWeekyear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4001", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getFieldType", new String[]{"int"}, new String[]{"-28"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875315837168"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<null>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292272993-01-04 {getCenturyOfEra=2922730, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=4, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthO...#385#-546011252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:8>"}, {"org.joda.time.LocalDate", "getMonthOfYear", ""}, {"org.joda.time.LocalDate", "toDateMidnight", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"roundCeilingCopy", "", "0"}, {"plusYears", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<null>"}, {"org.joda.time.LocalDate", "toDateMidnight", ""}, {"org.joda.time.LocalDate", "withYear", "int", "4000"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292278994-08-17 {getCenturyOfEra=2922789, getDayOfMonth=17, getDayOfWeek=7, getDayOfYear=229, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mon...#389#-1646988622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"withMaximumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-31 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=2, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#75587801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "59999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:8>", "59999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.joda.time.LocalDate", "withWeekOfWeekyear", "int", "10"}, {"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime", "<null>"}, {"org.joda.time.LocalDate", "get", "org.joda.time.DateTimeFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "millisOfSecond", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.LocalDateTime", "dayOfWeek", ""}}), new String[][]{{"withMaximumValue", "", "0"}, {"getEra", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:01.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1060371381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusDays", new String[]{"int"}, new String[]{"-1800067"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:1>"}, {"org.joda.time.LocalDate", "isAfter", "org.joda.time.ReadablePartial", "<sample:7>"}}, 2), new String[][]{{"centuryOfEra", "", "6"}, {"roundHalfEvenCopy", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("7000-01-01 {getCenturyOfEra=70, getDayOfMonth=1, getDayOfWeek=3, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#353#202827228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getLocalMillis", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.LocalDate", "withMonthOfYear", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1790985600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusMonths", new String[]{"int"}, new String[]{"46"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toString", "java.lang.String", "' is not rupported"}}, 3), new String[][]{{"withDayOfMonth", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2022-12-02 {getCenturyOfEra=20, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=336, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1964289745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "plusMonths", "int", "60"}, {"org.joda.time.LocalDate", "getDayOfYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfD...#322#-345263204", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "40"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "withYearOfEra", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-28"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withMillisOfSecond", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "toDate", ""}}), new String[][]{{"millisOfSecond", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[millisOfSecond] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getLeapAmount=0, getMaximumValue=999, getMaximumValueOverall=999, getMinimumValue=0, getMinimumValueOverall=0, getName=mi...#227#433396795", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfCentury", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "withWeekOfWeekyear", "int", "4"}}), new String[][]{{"roundFloorCopy", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=3, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-544327004", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfCentury", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.LocalDate", "plus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.LocalDate", "isSupported", "org.joda.time.DateTimeFieldType", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[yearOfCentury] {get=7, getAsShortText=7, getAsString=7, getAsText=7, getLeapAmount=0, getMaximumValue=99, getMaximumValueOverall=99, getMinimumValue=0, getMinimumValueOverall=0, getName=yearO...#223#1245128531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withLocalMillis", new String[]{"long"}, new String[]{"-9223371487132516352"}, false, 8, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtMidnight", "org.joda.time.DateTimeZone", "<sample:5>"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "-7", "<sample:0>"}, {"org.joda.time.LocalDate", "dayOfWeek", ""}}), new String[][]{{"toDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri May 18 14:25:51 PDT 292273010 {getDate=18, getDay=5, getHours=14, getMinutes=25, getMonth=4, getSeconds=51, getTime=9223183192166751616, getTimezoneOffset=420, getYear=292271110}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withLocalMillis", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 2, new String[][]{{"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "-7", "<sample:0>"}, {"org.joda.time.LocalDate", "dayOfWeek", ""}}), new String[][]{{"toDate", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "2054"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime", "<sample:2>"}, {"org.joda.time.LocalDate", "toString", "java.lang.String", "[1,2]"}, {"org.joda.time.LocalDate", "plusYears", "int", "59954"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("205426-10-03 {getCenturyOfEra=2054, getDayOfMonth=3, getDayOfWeek=2, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYea...#371#1648178436", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusWeeks", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "isEqual", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"minusMonths", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-09-26 {getCenturyOfEra=20, getDayOfMonth=26, getDayOfWeek=6, getDayOfYear=269, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#359#1457104619", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "toDate", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.LocalDateTime", "property", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.LocalDateTime", "minusMonths", "int", "3897161"}}), new String[][]{{"getDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0010-02-03T04:05:06.000 {getCenturyOfEra=0, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=34, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Dat...#429#1437782145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "toDate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "plusMonths", "int", "1000"}, {"org.joda.time.LocalDateTime", "plusHours", "int", "21600000"}, {"org.joda.time.LocalDateTime", "minusYears", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 19 00:00:00 PST 1969 {getDate=19, getDay=5, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1094399997, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "year", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=2026, getAsShortText=2026, getAsString=2026, getAsText=2026, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#-833436065", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"60000"}, false, 2, new String[][]{{"org.joda.time.LocalDate", "withDayOfYear", "int", "46"}, {"org.joda.time.LocalDate", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("60000-12-31 {getCenturyOfEra=600, getDayOfMonth=31, getDayOfWeek=7, getDayOfYear=366, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear...#366#2116380285", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "withYear", "int", "-59872"}, {"org.joda.time.LocalDate", "getYearOfEra", ""}, {"org.joda.time.LocalDate", "toDateTimeAtStartOfDay", "org.joda.time.DateTimeZone", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getYearOfCentury", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"0x1F", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.joda.time.LocalDateTime", "withCenturyOfEra", "int", "3600001"}, {"org.joda.time.LocalDateTime", "yearOfEra", ""}, {"org.joda.time.LocalDateTime", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<null>", "-4788590"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007-08-09T10:11:00.000 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Dat...#428#-481097871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "get", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=2026, getAsShortText=2026, getAsString=2026, getAsText=2026, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#-833436065", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withDayOfMonth", new String[]{"int"}, new String[]{"3"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "yearOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-03T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=3, getDayOfWeek=3, getDayOfYear=337, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#436#1986167487", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.LocalDate", "dayOfYear", ""}, {"org.joda.time.LocalDate", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime,org.joda.time.DateTimeZone", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1791010800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\t", "<sample:2>"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "withCenturyOfEra", "int", "2054"}, {"org.joda.time.LocalDate", "getDayOfMonth", ""}, {"org.joda.time.LocalDate", "toDate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2019-01-24 {getCenturyOfEra=21, getDayOfMonth=24, getDayOfWeek=7, getDayOfYear=24, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#357#-672014701", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"y$a#'0^}0-0.", "<sample:2>"}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toInterval", "org.joda.time.DateTimeZone", "<sample:2>"}, {"org.joda.time.LocalDate", "toDate", ""}, {"org.joda.time.LocalDate", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969$\ufffd#0^}0-0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusWeeks", new String[]{"int"}, new String[]{"21600001"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "yearOfEra", ""}}), new String[][]{{"weekOfWeekyear", "", "6"}, {"getAsShortText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "year", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.LocalDateTime", "toString", ""}}), new String[][]{{"withMinimumValue", "", "0"}, {"secondOfMinute", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[secondOfMinute] {get=0, getAsShortText=0, getAsString=0, getAsText=0, getLeapAmount=0, getMaximumValue=59, getMaximumValueOverall=59, getMinimumValue=0, getMinimumValueOverall=0, getName=seco...#225#380620045", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "year", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "withSecondOfMinute", "int", "59999"}}), new String[][]{{"getAsText", "", "4"}, {"getAsText", "java.util.Locale", "1"}, {"roundFloorCopy", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=3, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#172383517", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2026-10-03", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{}, new String[]{}, true), new String[][]{{"dayOfYear", "", "6"}, {"get", "", "4"}, {"getLocalDate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getAsShortText", "", "0"}, {"addToCopy", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-30T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=30, getDayOfWeek=2, getDayOfYear=364, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-95438488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromCalendarFields", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfWeek", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.joda.time.LocalDateTime", "getWeekOfWeekyear", ""}}, 1), new String[][]{{"roundHalfFloorCopy", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.005 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-641122967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[monthOfYear], DateTimeField[dayOfMonth]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getFieldTypes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.LocalDateTime", "withDate", "int,int,int", "999", "3", "40"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, monthOfYear, dayOfMonth, millisOfDay]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#434#1403234139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekyear", new String[]{"int"}, new String[]{"59997"}, false, 4, new String[][]{}), new String[][]{{"minusYears", "int", "3"}, {"toDateTime", "org.joda.time.LocalTime", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("59996-10-04T16:00:00.001-07:00 {getCenturyOfEra=599, getDayOfMonth=4, getDayOfWeek=5, getDayOfYear=278, getEra=1, getHourOfDay=16, getMillis=1831147686000001, getMillisOfDay=57600001, getMillisOfSecon...#346#1782694471", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "1"}, false, 0, null, 3), new String[][]{{"withDayOfWeek", "int", "7"}, {"get", "org.joda.time.DateTimeFieldType", "4"}, {"minusMonths", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("0001-06-04 {getCenturyOfEra=0, getDayOfMonth=4, getDayOfWeek=1, getDayOfYear=155, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#1943726588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withFields", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getMinuteOfHour", ""}, {"org.joda.time.LocalDateTime", "minusMillis", "int", "0"}, {"org.joda.time.LocalDateTime", "withSecondOfMinute", "int", "-1800067"}}, 2), new String[][]{{"plusWeeks", "int", "3"}, {"getHourOfDay", "", "3"}, {"isSupported", "org.joda.time.DurationFieldType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "centuryOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toString", "java.lang.String", "' is not supported"}}, 3), new String[][]{{"withMinimumValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("0026-10-03 {getCenturyOfEra=0, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#350#-1725365784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "4000", "<null>"}, {"org.joda.time.LocalDate", "getYearOfCentury", ""}}), new String[][]{{"roundHalfFloorCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusYears", new String[]{"int"}, new String[]{"70708865"}, false), new String[][]{{"minusDays", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("70710891-10-03 {getCenturyOfEra=707108, getDayOfMonth=3, getDayOfWeek=3, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthO...#383#1536539393", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withHourOfDay", "int", "0"}}, 2), new String[][]{{"getMaximumValueOverall", "", "7"}, {"roundCeilingCopy", "", "3"}, {"era", "", "4"}, {"getFieldType", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("era {getName=era}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfCentury", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.LocalDate", "minusWeeks", "int", "-1800067"}, {"org.joda.time.LocalDate", "centuryOfEra", ""}, {"org.joda.time.LocalDate", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}}), new String[][]{{"addWrapFieldToCopy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("0008-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=6, getDayOfYear=222, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-710316761", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withEra", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtMidnight", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withTime", new String[]{"int", "int", "int", "int"}, new String[]{"1", "2147483647", "3600000", "119998"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withYear", new String[]{"int"}, new String[]{"59929"}, false), new String[][]{{"getValue", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "weekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "-2147483648"}, {"org.joda.time.LocalDate", "dayOfYear", ""}}), new String[][]{{"addToCopy", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekyear", new String[]{"int"}, new String[]{"-13513"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtStartOfDay", ""}, {"org.joda.time.LocalDate", "toDate", ""}}, 3), new String[][]{{"minusWeeks", "int", "2"}, {"isSupported", "org.joda.time.DateTimeFieldType", "5"}, {"toInterval", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("-13513-10-04T00:00:00.000-07:52:58/-13513-10-05T00:00:00.000-07:52:58 {containsNow=false, getEndMillis=-488572272422000, getStartMillis=-488572358822000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusDays", new String[]{"int"}, new String[]{"70708865"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "withDurationAdded", "org.joda.time.ReadableDuration,int", "<null>", "-1800131"}, {"org.joda.time.LocalDateTime", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}, {"org.joda.time.LocalDateTime", "hourOfDay", ""}}, 3), new String[][]{{"minusYears", "int", "6"}, {"isAfter", "org.joda.time.ReadablePartial", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getLocalMillis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime,org.joda.time.DateTimeZone", "<sample:3>", "<null>"}, {"org.joda.time.LocalDate", "monthOfYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusDays", new String[]{"int"}, new String[]{"-1073862168"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "equals", "java.lang.Object", "<d:1.486>"}, {"org.joda.time.LocalDate", "toDateTime", "org.joda.time.ReadableInstant", "<sample:1>"}, {"org.joda.time.LocalDate", "getValue", "int", "3600001"}}, 2), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "2"}, {"isBefore", "org.joda.time.ReadablePartial", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtMidnight", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "hashCode", ""}, {"org.joda.time.LocalDate", "toDateTimeAtMidnight", ""}}), new String[][]{{"getYearOfCentury", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "dayOfMonth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.LocalDate", "withLocalMillis", "long", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1970", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.LocalDate", "get", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.LocalDate", "get", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:7>"}, {"org.joda.time.LocalDate", "get", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "year", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getMillisOfSecond", ""}, {"org.joda.time.LocalDateTime", "withCenturyOfEra", "int", "21600000"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "year", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "getMillisOfSecond", ""}, {"org.joda.time.LocalDateTime", "withCenturyOfEra", "int", "21600000"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.joda.time.LocalDateTime", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.joda.time.LocalDateTime", "minus", "org.joda.time.ReadablePeriod", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"30"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "1001"}}, 1), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("0031-12-21T00:00:00.003 {getCenturyOfEra=1, getDayOfMonth=21, getDayOfWeek=5, getDayOfYear=355, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#418#14208696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"60"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "4"}}, 1), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("0061-12-18T00:00:00.003 {getCenturyOfEra=1, getDayOfMonth=18, getDayOfWeek=5, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#418#-1888819072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getFieldType", new String[]{"int"}, new String[]{"-119924"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getFieldType", new String[]{"int"}, new String[]{"-119924"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292272993-01-04 {getCenturyOfEra=2922730, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=4, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthO...#385#-546011252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[292272993, 1, 4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:5>"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[292278994, 8, 17]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:5>"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[292278994, 8, 17]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:8>"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.LocalDate", "getMonthOfYear", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[292278994, 8, 17]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:8>"}, {"org.joda.time.LocalDate", "getMonthOfYear", ""}, {"org.joda.time.LocalDate", "toDateMidnight", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292278994-08-17 {getCenturyOfEra=2922789, getDayOfMonth=17, getDayOfWeek=7, getDayOfYear=229, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mon...#389#-1646988622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<null>"}, {"org.joda.time.LocalDate", "toDateMidnight", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292278994-08-17 {getCenturyOfEra=2922789, getDayOfMonth=17, getDayOfWeek=7, getDayOfYear=229, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mon...#389#-1646988622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<null>"}, {"org.joda.time.LocalDate", "toDateMidnight", ""}, {"org.joda.time.LocalDate", "withYear", "int", "36768"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292272993-01-04 {getCenturyOfEra=2922730, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=4, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthO...#385#-546011252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-18 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=3, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#-950859532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "toDateMidnight", ""}, {"org.joda.time.LocalDate", "withYear", "int", "36768"}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "7"}, {"getMaximumValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-18 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=3, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#-950859532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "getLocalMillis", ""}, {"org.joda.time.LocalDate", "toDateMidnight", ""}}, 3), new String[][]{{"getMaximumTextLength", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:5>"}}, 3), new String[][]{{"withMaximumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:4>"}}, 3), new String[][]{{"withMaximumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:4>"}}, 3), new String[][]{{"withMaximumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-12-31 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=4, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#-778862668", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00/2026-10-04T00:00:00.000-07:00 {containsNow=true, getEndMillis=1791097200000, getStartMillis=1791010800000, isAfterNow=false, isBeforeNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00 {containsNow=false, getEndMillis=28800000, getStartMillis=-57600000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.000-08:00/1969-12-20T00:00:00.000-08:00 {containsNow=false, getEndMillis=115200000, getStartMillis=28800000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<s:a>"}, {"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<b:true>"}, {"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:0>"}, {"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "0009-10-11T12:16:32.064 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#434#1403234139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:45>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.LocalDateTime", "isSupported", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:45>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "centuryOfEra", ""}, {"org.joda.time.LocalDateTime", "getYearOfCentury", ""}}, 2), new String[][]{{"addWrapFieldToCopy", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-22T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=22, getDayOfWeek=7, getDayOfYear=356, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-1920877204", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDateTime", "centuryOfEra", ""}, {"org.joda.time.LocalDateTime", "getYearOfCentury", ""}}, 2), new String[][]{{"addWrapFieldToCopy", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.LocalDateTime", "withEra", "int", "59999"}, {"org.joda.time.LocalDateTime", "centuryOfEra", ""}, {"org.joda.time.LocalDateTime", "getYearOfCentury", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=9, getAsShortText=9, getAsString=9, getAsText=9, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayOfMon...#217#1390683261", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09T10:11:00.000 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Dat...#428#-481097871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"2000"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2000-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=2, getDayOfYear=277, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#358#225731083", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"-2000"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-2000-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=2, getDayOfYear=277, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#362#-700582941", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"-2000"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-2000-12-31 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=7, getDayOfYear=366, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear]...#364#641070953", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"-4000"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-4000-12-31 {getCenturyOfEra=40, getDayOfMonth=31, getDayOfWeek=7, getDayOfYear=366, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear]...#364#-903113295", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYear", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.joda.time.LocalDate", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.LocalDate", "toInterval", "org.joda.time.DateTimeZone", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("0007-08-09T00:00:00.000-07:52:58/0007-08-10T00:00:00.000-07:52:58 {containsNow=false, getEndMillis=-61927171622000, getStartMillis=-61927258022000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.joda.time.LocalDate", "toString", ""}, {"org.joda.time.LocalDate", "plus", "org.joda.time.ReadablePeriod", "<sample:5>"}}, 3), new String[][]{{"gap", "org.joda.time.ReadableInterval", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.002-08:00/2026-10-03T00:00:00.000-07:00 {containsNow=false, getEndMillis=1791010800000, getStartMillis=2, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toInterval", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.joda.time.LocalDate", "yearOfCentury", ""}, {"org.joda.time.LocalDate", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}}, 2), new String[][]{{"gap", "org.joda.time.ReadableInterval", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("0007-08-10T00:00:00.000-07:52:58/1969-12-31T16:00:00.002-08:00 {containsNow=false, getEndMillis=2, getStartMillis=-61927171622000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007-08-09 {getCenturyOfEra=0, getDayOfMonth=9, getDayOfWeek=4, getDayOfYear=221, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], D...#343#-1627122356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"plusDays", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("2026-10-02T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=275, getEra=1, getHourOfDay=0, getMillis=1790924400000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-517502487", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.LocalDate", "getWeekOfWeekyear", ""}, {"org.joda.time.LocalDate", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:1>", "31"}}, 3), new String[][]{{"toInterval", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00/2026-10-04T00:00:00.000-07:00 {containsNow=true, getEndMillis=1791097200000, getStartMillis=1791010800000, isAfterNow=false, isBeforeNow=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTime", new String[]{"org.joda.time.LocalTime", "org.joda.time.DateTimeZone"}, new String[]{"<sample:4>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T16:47:04.192-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=16, getMillis=1791071224192, getMillisOfDay=60424192, getMillisOfSecond=192...#344#-589085331", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTime", new String[]{"org.joda.time.LocalTime", "org.joda.time.DateTimeZone"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T16:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=16, getMillis=1791068400000, getMillisOfDay=57600000, getMillisOfSecond=0, ...#340#-250203602", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTime", new String[]{"org.joda.time.LocalTime", "org.joda.time.DateTimeZone"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "withDayOfWeek", "int", "3600001"}, {"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T16:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=16, getMillis=1791068400000, getMillisOfDay=57600000, getMillisOfSecond=0, ...#340#-250203602", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "withDayOfYear", "int", "2147483647"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "withDayOfYear", "int", "2147483647"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDate", "withDayOfYear", "int", "2147483647"}, {"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"minusYears", "int", "2"}, {"getMinuteOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.LocalDate", "withDayOfYear", "int", "2147483647"}, {"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"minusYears", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"minusYears", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-18 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=3, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#-950859532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.LocalDate", "era", ""}, {"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "60001"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "30000"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "21600001", "<sample:1>"}, {"org.joda.time.LocalDate", "minusWeeks", "int", "30000"}}), new String[][]{{"toDateTimeISO", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "0", "<sample:1>"}}), new String[][]{{"toDateTimeISO", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "0", "<sample:1>"}}), new String[][]{{"toDateTimeISO", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("0009-10-11T00:00:00.000-07:52:58 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getHourOfDay=0, getMillis=-61858656422000, getMillisOfDay=0, getMillisOfSecond=0, get...#328#1283112636", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0009-10-11 {getCenturyOfEra=0, getDayOfMonth=11, getDayOfWeek=7, getDayOfYear=284, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#347#1455973938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "1000"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "0", "<sample:1>"}}), new String[][]{{"getWeekyear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "dayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withEra", new String[]{"int"}, new String[]{"21600001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtCurrentTime", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "property", "org.joda.time.DateTimeFieldType", "<sample:2>"}}), new String[][]{{"isEqualNow", "", "5"}, {"era", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtCurrentTime", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false), new String[][]{{"isEqualNow", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-123694212", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-123694189", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-195773555", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "year", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getMillisOfSecond", ""}, {"org.joda.time.LocalDateTime", "withCenturyOfEra", "int", "21600000"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "plusMinutes", new String[]{"int"}, new String[]{"16"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "isBefore", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.LocalDateTime", "plus", "org.joda.time.ReadableDuration", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:16:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#438#-1667241439", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "plusMinutes", new String[]{"int"}, new String[]{"3"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "isBefore", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.LocalDateTime", "plus", "org.joda.time.ReadableDuration", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:03:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-866227159", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"21600001"}, false, 7, new String[][]{{"org.joda.time.LocalDateTime", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"2147483646"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"60"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "4"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("0061-12-18T00:00:00.003 {getCenturyOfEra=1, getDayOfMonth=18, getDayOfWeek=5, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#418#-1888819072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"60"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "4"}, {"org.joda.time.LocalDateTime", "plusMillis", "int", "3600001"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("0061-12-18T00:00:00.003 {getCenturyOfEra=1, getDayOfMonth=18, getDayOfWeek=5, getDayOfYear=352, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#418#-1888819072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"1000"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "4"}, {"org.joda.time.LocalDateTime", "plusMillis", "int", "3600001"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1001-12-19T00:00:00.003 {getCenturyOfEra=11, getDayOfMonth=19, getDayOfWeek=5, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-2096783070", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"2000"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "2"}, {"org.joda.time.LocalDateTime", "plusMillis", "int", "3600001"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("2001-12-22T00:00:00.003 {getCenturyOfEra=21, getDayOfMonth=22, getDayOfWeek=5, getDayOfYear=356, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#-2110032529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withWeekyear", new String[]{"int"}, new String[]{"4000"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "withYearOfEra", "int", "2"}, {"org.joda.time.LocalDateTime", "plusWeeks", "int", "4"}, {"org.joda.time.LocalDateTime", "plusMillis", "int", "3600001"}}), new String[][]{{"minusYears", "int", "1"}, {"getWeekyear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4001", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=16, getAsShortText=16, getAsString=16, getAsText=16, getLeapAmount=0, getMaximumValue=23, getMaximumValueOverall=23, getMinimumValue=0, getMinimumValueOverall=0, getName=hourO...#219#1221059725", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[hourOfDay] {get=16, getAsShortText=16, getAsString=16, getAsText=16, getLeapAmount=0, getMaximumValue=23, getMaximumValueOverall=23, getMinimumValue=0, getMinimumValueOverall=0, getName=hourO...#219#1221059725", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getLeapAmount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remainder", "", "4"}, {"roundCeilingCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-19T01:00:00.000 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#435#-1005225772", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19T00:00:00.003 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#423#1868475966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "hourOfDay", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"remainder", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getDayOfMonth", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:5>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448560"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<null>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"roundCeilingCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("292272993-01-04 {getCenturyOfEra=2922730, getDayOfMonth=4, getDayOfWeek=7, getDayOfYear=4, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthO...#385#-546011252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:6>"}, {"org.joda.time.LocalDate", "withLocalMillis", "long", "-268716875307448504"}, {"org.joda.time.LocalDate", "withFields", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "2"}, {"setCopy", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"12:30:45", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.joda.time.LocalDate", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.LocalDate", "withDayOfWeek", "int", "4000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "centuryOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "centuryOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=276, getAsShortText=276, getAsString=276, getAsText=276, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#641838434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=365, getAsShortText=365, getAsString=365, getAsText=365, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#-122480896", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=353, getAsShortText=353, getAsString=353, getAsText=353, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#561165922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.LocalDate", "isBefore", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"withMaximumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-12-31 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=4, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#-778862668", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false), new String[][]{{"getWeekOfWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getWeekOfWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.LocalDate", "getDayOfYear", ""}}), new String[][]{{"getWeekOfWeekyear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-19 {getCenturyOfEra=20, getDayOfMonth=19, getDayOfWeek=4, getDayOfYear=353, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#525913841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:45>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.016 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#438#-1124421987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getSecondOfMinute", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}, {"org.joda.time.LocalDateTime", "equals", "java.lang.Object", "<i:45>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "59999"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2191-01-10 {getCenturyOfEra=21, getDayOfMonth=10, getDayOfWeek=1, getDayOfYear=10, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#357#882491453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "59999"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("6001926-10-03 {getCenturyOfEra=60019, getDayOfMonth=3, getDayOfWeek=7, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfY...#377#1901200311", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "59999"}, false), new String[][]{{"getMonthOfYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "59999"}, false), new String[][]{{"getMonthOfYear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "dayOfMonth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=31, getAsShortText=31, getAsString=31, getAsText=31, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayO...#221#-805112273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
}
