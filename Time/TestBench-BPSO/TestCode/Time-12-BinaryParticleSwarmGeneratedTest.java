package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "era", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.LocalDate", "toString", "java.lang.String,java.util.Locale", ".3193829732634", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfWeek", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "withYear", "int", "21600008"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfWeek] {get=6, getAsShortText=Sat, getAsString=6, getAsText=Saturday, getLeapAmount=0, getMaximumValue=7, getMaximumValueOverall=7, getMinimumValue=1, getMinimumValueOverall=1, getName=da...#222#-754440442", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromCalendarFields", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "plusDays", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:6>", "-21600001"}}), new String[][]{{"getField", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withMonthOfYear", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "withYear", "int", "-6290456"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-10-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=5, getDayOfYear=304, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#361#478074724", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withDayOfWeek", new String[]{"int"}, new String[]{"4"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtStartOfDay", "org.joda.time.DateTimeZone", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.LocalDate", "getFields", ""}}), new String[][]{{"roundFloorCopy", "", "1"}, {"withCenturyOfEra", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtCurrentTime", ""}}), new String[][]{{"isBeforeNow", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.joda.time.LocalDate", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:5>"}}), new String[][]{{"withMinimumValue", "", "2"}, {"getDayOfMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getField", new String[]{"int"}, new String[]{"43200016"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "plusSeconds", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withEra", new String[]{"int"}, new String[]{"-59999"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "withYearOfCentury", "int", "12"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-4", "<sample:5>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withDayOfYear", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.LocalDate", "centuryOfEra", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-01-10 {getCenturyOfEra=19, getDayOfMonth=10, getDayOfWeek=5, getDayOfYear=10, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#357#1706395103", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYearOfEra", new String[]{"int"}, new String[]{"3599971"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "isAfter", "org.joda.time.ReadablePartial", "<sample:6>"}}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "6"}, {"toDateMidnight", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("3599971-12-22T00:00:00.000-08:00 {getCenturyOfEra=35999, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=356, getEra=1, getHourOfDay=0, getMillis=113541975532800000, getMillisOfDay=0, getMillisOfSecond...#341#151523909", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "getEra", ""}, {"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, monthOfYear, dayOfMonth]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "plusDays", "int", "58"}, {"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "2147483647", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusWeeks", new String[]{"int"}, new String[]{"-21599873"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "getDayOfWeek", ""}}), new String[][]{{"plusHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("415939-02-08T16:00:00.001 {getCenturyOfEra=4159, getDayOfMonth=8, getDayOfWeek=3, getDayOfYear=39, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year],...#440#1393945436", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusWeeks", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "4108"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "plusWeeks", "int", "16385"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getMinuteOfHour", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:6>", "7200000"}, {"org.joda.time.LocalDateTime", "toDate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"1000", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "getFieldTypes", ""}, {"org.joda.time.LocalDate", "getValue", "int", "268435446"}}), new String[][]{{"plusWeeks", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("5881580-07-31 {getCenturyOfEra=58815, getDayOfMonth=31, getDayOfWeek=4, getDayOfYear=213, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOf...#377#196425112", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDate", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<null>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 00:00:00 PST 1969 {getDate=31, getDay=3, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-57600000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekOfWeekyear", new String[]{"int"}, new String[]{"9"}, false, 0, null, 1), new String[][]{{"weekOfWeekyear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[weekOfWeekyear] {get=9, getAsShortText=9, getAsString=9, getAsText=9, getLeapAmount=0, getMaximumValue=53, getMaximumValueOverall=53, getMinimumValue=1, getMinimumValueOverall=1, getName=week...#225#341378653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.LocalDate", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.LocalDate", "getFieldType", "int", "2147483641"}}), new String[][]{{"getMinutes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "monthOfYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1565110380", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfMonth", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"roundHalfCeilingCopy", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "withMonthOfYear", "int", "11"}, {"org.joda.time.LocalDateTime", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "toString", new String[]{"java.lang.String"}, new String[]{"-1.52147483648"}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:9>", "4194306"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.52147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusMonths", new String[]{"int"}, new String[]{"3"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "getWeekyear", ""}, {"org.joda.time.LocalDate", "getValues", ""}}), new String[][]{{"minusMonths", "int", "0"}, {"minusYears", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("178958940-05-30 {getCenturyOfEra=1789589, getDayOfMonth=30, getDayOfWeek=1, getDayOfYear=151, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mon...#389#-391773561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusDays", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "minusYears", "int", "60059"}}), new String[][]{{"getYearOfCentury", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusYears", new String[]{"int"}, new String[]{"-7200000"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "plusMonths", "int", "20"}, {"org.joda.time.LocalDate", "toDate", ""}}), new String[][]{{"toDateTimeAtMidnight", "org.joda.time.DateTimeZone", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("-7198031-12-31T00:00:00.000--596:-31:-23.-648 {getCenturyOfEra=71980, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=0, getHourOfDay=0, getMillis=-227210052338916352, getMillisOfDay=0, get...#355#1687649617", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:12>"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "dayOfYear", ""}}), new String[][]{{"getChronology", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "yearOfEra", ""}}), new String[][]{{"toDate", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Dec 15 00:00:00 PST 1969 {getDate=15, getDay=1, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=-1440000000, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toLocalDateTime", new String[]{"org.joda.time.LocalTime"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toDateTime", "org.joda.time.ReadableInstant", "<sample:7>"}}), new String[][]{{"minusYears", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-12-31T16:00:00.005 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=4, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#438#-1539804905", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "year", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtMidnight", ""}}), new String[][]{{"roundHalfFloorCopy", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2027-01-01 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=5, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#355#-617758676", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, true), new String[][]{{"withDayOfMonth", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-01 {getCenturyOfEra=20, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=274, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#110882364", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekyear", new String[]{"int"}, new String[]{"-3600001"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "yearOfCentury", ""}, {"org.joda.time.LocalDate", "monthOfYear", ""}}), new String[][]{{"dayOfMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=9, getAsShortText=9, getAsString=9, getAsText=9, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayOfMon...#217#1390683261", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getYear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:1>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"setCopy", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("0000-12-31 {getCenturyOfEra=0, getDayOfMonth=31, getDayOfWeek=7, getDayOfYear=366, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#347#-1443706997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "minusMonths", "int", "-1001"}}), new String[][]{{"getLocalDate", "", "4"}, {"getWeekOfWeekyear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusWeeks", new String[]{"int"}, new String[]{"1001"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:3>"}}, 1), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "isSupported", "org.joda.time.DateTimeFieldType", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"centuryOfEra", "", "3"}, {"addWrapFieldToCopy", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1926-10-03 {getCenturyOfEra=19, getDayOfMonth=3, getDayOfWeek=7, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#1188720733", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getDayOfWeek", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<null>", "9"}, {"org.joda.time.LocalDateTime", "withSecondOfMinute", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "weekyear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "toLocalDate", ""}}), new String[][]{{"roundHalfFloorCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-29T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=29, getDayOfWeek=1, getDayOfYear=363, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#422#937855342", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getDayOfYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "get", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.LocalDateTime", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "centuryOfEra", ""}, {"org.joda.time.LocalDate", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:10>", "0"}}, 3), new String[][]{{"compareTo", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusMonths", new String[]{"int"}, new String[]{"3599938"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toString", "java.lang.String,java.util.Locale", "2.5", "<sample:3>"}}, 2), new String[][]{{"plusYears", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-297969-12-03 {getCenturyOfEra=2979, getDayOfMonth=3, getDayOfWeek=3, getDayOfYear=337, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYe...#375#-489644885", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusWeeks", new String[]{"int"}, new String[]{"9"}, false), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "4"}, {"toDateTimeAtStartOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-12-05T00:00:00.000-08:00 {getCenturyOfEra=20, getDayOfMonth=5, getDayOfWeek=6, getDayOfYear=339, getEra=1, getHourOfDay=0, getMillis=1796457600000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#1155426910", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{}, new String[]{}, true), new String[][]{{"minusMonths", "int", "4"}, {"toDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Mar 03 00:00:00 PST 178954945 {getDate=3, getDay=3, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=-5647450702780800000, getTimezoneOffset=480, getYear=178953045}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekyear", new String[]{"int"}, new String[]{"59999"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtMidnight", "org.joda.time.DateTimeZone", "<sample:10>"}}, 2), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "1"}, {"addToCopy", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("60003-01-06 {getCenturyOfEra=600, getDayOfMonth=6, getDayOfWeek=1, getDayOfYear=6, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#788741921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true), new String[][]{{"plusMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("190690351-02-20T09:43:26.464 {getCenturyOfEra=1906903, getDayOfMonth=20, getDayOfWeek=2, getDayOfYear=51, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField...#457#1754969977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "weekyear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDate", "era", ""}}), new String[][]{{"roundHalfEvenCopy", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-29 {getCenturyOfEra=19, getDayOfMonth=29, getDayOfWeek=1, getDayOfYear=363, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#302826953", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "era", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "dayOfMonth", ""}}, 1), new String[][]{{"roundHalfEvenCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("0001-01-01T00:00:00.000 {getCenturyOfEra=0, getDayOfMonth=1, getDayOfWeek=1, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], DateT...#409#-1992497511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true), new String[][]{{"minusHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("190690351-02-20T09:43:26.464 {getCenturyOfEra=1906903, getDayOfMonth=20, getDayOfWeek=2, getDayOfYear=51, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField...#457#1754969977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toLocalDateTime", new String[]{"org.joda.time.LocalTime"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "centuryOfEra", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:10>"}, true, 0, null, 1), new String[][]{{"plusMonths", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusMonths", new String[]{"int"}, new String[]{"120128"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getField", "int,org.joda.time.Chronology", "-29", "<sample:0>"}}), new String[][]{{"plusMonths", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("-8041-04-30T16:00:00.000 {getCenturyOfEra=80, getDayOfMonth=30, getDayOfWeek=4, getDayOfYear=120, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], ...#439#1180580753", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusDays", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "getYearOfEra", ""}, {"org.joda.time.LocalDateTime", "getYearOfCentury", ""}}), new String[][]{{"plusMinutes", "int", "0"}, {"minusMonths", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("-5881724-01-30T13:52:00.000 {getCenturyOfEra=58817, getDayOfMonth=30, getDayOfWeek=7, getDayOfYear=30, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[ye...#450#-1324741825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTime", "org.joda.time.LocalTime", "<sample:7>"}, {"org.joda.time.LocalDate", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:10>", "7200002"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "parse", new String[]{"java.lang.String"}, new String[]{"-11"}, true), new String[][]{{"getYearOfEra", "", "0"}, {"withCenturyOfEra", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-0311-01-01 {getCenturyOfEra=3, getDayOfMonth=1, getDayOfWeek=6, getDayOfYear=1, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-1502623461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getMonthOfYear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfMonth", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=31, getAsShortText=31, getAsString=31, getAsText=31, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayO...#221#-805112273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"Field mus;t nnt be null", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYearOfCentury", new String[]{"int"}, new String[]{"-64"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getCenturyOfEra", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[yearOfEra] {get=2026, getAsShortText=2026, getAsString=2026, getAsText=2026, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=1, getMinimumValueOv...#241#1839893031", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "plusMonths", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusMonths", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.joda.time.LocalDate", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-178954944-03-03 {getCenturyOfEra=1789549, getDayOfMonth=3, getDayOfWeek=1, getDayOfYear=63, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[mont...#390#635313684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "parse", new String[]{"java.lang.String"}, new String[]{"Z1,2]"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withSecondOfMinute", new String[]{"int"}, new String[]{"3600001"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getCenturyOfEra", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtStartOfDay", "org.joda.time.DateTimeZone", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-09-09 {getCenturyOfEra=20, getDayOfMonth=9, getDayOfWeek=3, getDayOfYear=252, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#357#2085938915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "weekOfWeekyear", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[weekOfWeekyear] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getLeapAmount=0, getMaximumValue=53, getMaximumValueOverall=53, getMinimumValue=1, getMinimumValueOverall=1, getName=week...#225#-755266739", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "plusMonths", new String[]{"int"}, new String[]{"7200000"}, false, 2, new String[][]{}, 3), new String[][]{{"getWeekyear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("601970", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withCenturyOfEra", new String[]{"int"}, new String[]{"3599976"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getChronology", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFieldType", new String[]{"int"}, new String[]{"117"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getMonthOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toInterval", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusMonths", new String[]{"int"}, new String[]{"116"}, false, 4, new String[][]{{"org.joda.time.LocalDate", "minusMonths", "int", "-2"}}, 1), new String[][]{{"toDateTimeAtStartOfDay", "org.joda.time.DateTimeZone", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2017-02-03T00:00:00.000--596:-31:-23.-648 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=5, getDayOfYear=34, getEra=1, getHourOfDay=0, getMillis=1488227483648, getMillisOfDay=0, getMillisOfSecond=...#335#-544349632", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getDayOfYear", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("365", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDateTimeAtStartOfDay", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "era", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[era] {get=1, getAsShortText=AD, getAsString=1, getAsText=AD, getLeapAmount=0, getMaximumValue=1, getMaximumValueOverall=1, getMinimumValue=0, getMinimumValueOverall=0, getName=era, isLeap=fal...#203#1131407923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}}, 2), new String[][]{{"dayOfYear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusDays", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2941832-01-07 {getCenturyOfEra=29418, getDayOfMonth=7, getDayOfWeek=6, getDayOfYear=7, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYea...#372#-621187495", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "year", ""}, {"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=2026, getAsShortText=2026, getAsString=2026, getAsText=2026, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#-833436065", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withDayOfWeek", new String[]{"int"}, new String[]{"4194362"}, false, 4, new String[][]{{"org.joda.time.LocalDateTime", "getFields", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getYearOfCentury", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfMonth", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfMonth] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getLeapAmount=0, getMaximumValue=31, getMaximumValueOverall=31, getMinimumValue=1, getMinimumValueOverall=1, getName=dayOfMon...#217#1764491825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.LocalDate", "getWeekyear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, monthOfYear, dayOfMonth]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.LocalDate", "dayOfMonth", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withMillisOfDay", new String[]{"int"}, new String[]{"-58"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withEra", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "weekOfWeekyear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withDayOfMonth", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.joda.time.LocalDateTime", "withDayOfWeek", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "toLocalTime", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalTime", actual.getClass().getName());
  assertEquals("16:00:00.000 {getFieldTypes=[hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond], getFields=[DateTimeField[hourOfDay], DateTimeField[minuteOfHour], Date.., getHourOfDay=16, getMillisOfDay=5760000...#296#511759813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusWeeks", new String[]{"int"}, new String[]{"1007"}, false, 0, null, 1), new String[][]{{"toDateTimeAtStartOfDay", "org.joda.time.DateTimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2007-06-16T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=16, getDayOfWeek=6, getDayOfYear=167, getEra=1, getHourOfDay=0, getMillis=1181977200000, getMillisOfDay=0, getMillisOfSecond=0, getMinu...#326#1048714592", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "centuryOfEra", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[centuryOfEra] {get=20, getAsShortText=20, getAsString=20, getAsText=20, getLeapAmount=0, getMaximumValue=2922789, getMaximumValueOverall=2922789, getMinimumValue=0, getMinimumValueOverall=0, ...#235#-934965907", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "parse", new String[]{"java.lang.String", "org.joda.time.format.DateTimeFormatter"}, new String[]{"", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1970-01-01 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], Da...#354#-279303209", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusWeeks", new String[]{"int"}, new String[]{"-105"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2028-10-07 {getCenturyOfEra=20, getDayOfMonth=7, getDayOfWeek=6, getDayOfYear=281, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-587294504", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "116", "<sample:8>"}, {"org.joda.time.LocalDate", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "parse", new String[]{"java.lang.String"}, new String[]{"..5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withDayOfMonth", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "weekyear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime$Property", actual.getClass().getName());
  assertEquals("Property[weekyear] {get=1970, getAsShortText=1970, getAsString=1970, getAsText=1970, getLeapAmount=1, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimu...#256#1114473037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withCenturyOfEra", new String[]{"int"}, new String[]{"3600001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getLocalMillis", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getField", new String[]{"int"}, new String[]{"-60000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "dayOfWeek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getValue", new String[]{"int"}, new String[]{"3"}, false, 5, new String[][]{{"org.joda.time.LocalDate", "plusMonths", "int", "120000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withEra", new String[]{"int"}, new String[]{"513"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "getEra", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withSecondOfMinute", new String[]{"int"}, new String[]{"-4"}, false, 4, new String[][]{{"org.joda.time.LocalDateTime", "minusDays", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.joda.time.LocalDate", "toDateMidnight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withCenturyOfEra", new String[]{"int"}, new String[]{"3599976"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getDayOfWeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "plusYears", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "weekOfWeekyear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2016-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=1, getDayOfYear=277, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#890881690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.LocalDate", "toDateTime", "org.joda.time.ReadableInstant", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.LocalDate", "era", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withYearOfEra", new String[]{"int"}, new String[]{"2098152"}, false, 7, new String[][]{{"org.joda.time.LocalDate", "getField", "int,org.joda.time.Chronology", "1", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2098152-12-31 {getCenturyOfEra=20981, getDayOfMonth=31, getDayOfWeek=7, getDayOfYear=366, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOf...#379#-1097108397", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"6", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "now", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateMidnight", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.LocalDate", "toLocalDateTime", "org.joda.time.LocalTime", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateMidnight", actual.getClass().getName());
  assertEquals("1969-12-31T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=0, getMillis=-57600000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#322#908490192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "parse", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "fromCalendarFields", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withDayOfYear", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getDayOfWeek", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.LocalDate", "era", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getValue", new String[]{"int"}, new String[]{"-59999"}, false, 5, new String[][]{{"org.joda.time.LocalDateTime", "getMillisOfSecond", ""}, {"org.joda.time.LocalDateTime", "getDayOfMonth", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000-07:00 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1791010800000, getMillisOfDay=0, getMillisOfSecond=0, getMinut...#326#-1207646050", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFieldType", new String[]{"int"}, new String[]{"3600001"}, false, 0, new String[][]{{"org.joda.time.LocalDate", "toDate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withEra", new String[]{"int"}, new String[]{"-2098152"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "fromDateFields", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusSeconds", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.joda.time.LocalDateTime", "plusWeeks", "int", "250"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("2038-01-18T19:14:08.000 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=1, getDayOfYear=18, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Da...#435#-17271661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.000 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#988275625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("5881637-04-12 {getCenturyOfEra=58816, getDayOfMonth=12, getDayOfWeek=7, getDayOfYear=102, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOf...#377#-1653108260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withMillisOfDay", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withWeekyear", new String[]{"int"}, new String[]{"7200000"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("7200000-01-05 {getCenturyOfEra=72000, getDayOfMonth=5, getDayOfWeek=3, getDayOfYear=5, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYea...#371#-1757802774", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.LocalDateTime", "withHourOfDay", "int", "10799987"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31T16:00:00.001 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#437#-1914584471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "minusWeeks", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate", actual.getClass().getName());
  assertEquals("-41155247-01-31 {getCenturyOfEra=411552, getDayOfMonth=31, getDayOfWeek=6, getDayOfYear=31, getEra=0, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[month...#385#-861540231", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1969, getAsShortText=1969, getAsString=1969, getAsText=1969, getLeapAmount=0, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumVal...#249#620180817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "centuryOfEra", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.LocalDate", "monthOfYear", ""}, {"org.joda.time.LocalDate", "getField", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[centuryOfEra] {get=20, getAsShortText=20, getAsString=20, getAsText=20, getLeapAmount=0, getMaximumValue=2922789, getMaximumValueOverall=2922789, getMinimumValue=0, getMinimumValueOverall=0, ...#235#-934965907", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "getDayOfYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withMillisOfSecond", new String[]{"int"}, new String[]{"120000"}, false, 6, new String[][]{{"org.joda.time.LocalDateTime", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfEra", new String[]{}, new String[]{}, false), new String[][]{{"getDifference", "org.joda.time.ReadableInstant", "4"}, {"getFieldType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("yearOfEra {getName=yearOfEra}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "parse", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "withDate", new String[]{"int", "int", "int"}, new String[]{"2", "-43200002", "12"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "getMillisOfDay", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getMonthOfYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "indexOf", "org.joda.time.DurationFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toLocalDateTime", new String[]{"org.joda.time.LocalTime"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:47:04.192 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], D...#440#1902540971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.LocalDate", "size", ""}, {"org.joda.time.LocalDate", "toDateTimeAtMidnight", "org.joda.time.DateTimeZone", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "withMonthOfYear", new String[]{"int"}, new String[]{"30030"}, false, 7, new String[][]{{"org.joda.time.LocalDate", "withMonthOfYear", "int", "1000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "yearOfEra", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.LocalDate", "minusWeeks", "int", "10"}}), new String[][]{{"getLeapAmount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1969-12-31 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear],...#360#1090944836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getFieldTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, monthOfYear, dayOfMonth]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", "minusYears", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.LocalDateTime", "getCenturyOfEra", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfYear", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDate$Property", actual.getClass().getName());
  assertEquals("Property[dayOfYear] {get=276, getAsShortText=276, getAsString=276, getAsText=276, getLeapAmount=0, getMaximumValue=365, getMaximumValueOverall=366, getMinimumValue=1, getMinimumValueOverall=1, getName...#225#641838434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "getWeekyear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.LocalDate", "withDayOfWeek", "int", "-250"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2026", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "toDateTimeAtStartOfDay", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2026-10-03T00:00:00.000--596:-31:-23.-648 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getHourOfDay=0, getMillis=1793133083648, getMillisOfDay=0, getMillisOfSecond...#338#-885539895", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.LocalDate", "getYear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.LocalDate", "org.joda.time.LocalDate", "dayOfMonth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.LocalDate", "monthOfYear", ""}}), new String[][]{{"getDifference", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20729", String.valueOf(actual));
  assertEquals("receiver state after the call", "2026-10-03 {getCenturyOfEra=20, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=276, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[monthOfYear], ...#359#-1539918334", SearchInputFactory_scaffolding.receiverState());
 }
}
