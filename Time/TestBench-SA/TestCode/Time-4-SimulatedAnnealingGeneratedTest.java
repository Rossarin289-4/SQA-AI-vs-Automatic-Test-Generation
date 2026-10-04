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
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:7>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "10"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "65492"}, false, 14, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:8>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "65492"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:11>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "5"}, {"withMaximumValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=292278993, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[292278993, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-134217718"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "8-"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "5"}, false, 11, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:10>"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-75"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "5"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:10>"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-75"}}, 3), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "3"}, {"without", "org.joda.time.DateTimeFieldType", "1"}, {"toDateTime", "org.joda.time.ReadableInstant", "1"}, {"minusDays", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881176-02-07T06:59:59.999Z {getCenturyOfEra=58812, getDayOfMonth=7, getDayOfWeek=5, getDayOfYear=37, getEra=1, getHourOfDay=6, getMillis=185542587125999999, getMillisOfDay=25199999, getMillisOfSecond...#349#-1500939923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "1073741823"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-315 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[315], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:9>", "-738197535"}, false, 12, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\n1e10", "<sample:0>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "<null>"}}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "1"}, {"getFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "1"}, false, 2, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:5>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-75"}}, 3), new String[][]{{"indexOf", "org.joda.time.DateTimeFieldType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "393361"}, false, 13, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:1>", "0"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:9>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}}, 1), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=2, dayOfYear=12] {getFieldTypes=[centuryOfEra, dayOfYear], getFields=[DateTimeField[centuryOfEra], DateTimeField[dayOfYear]], getValues=[2, 12], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-1"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "`bc", "<sample:0>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-1, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[-1, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:8>", "1073741823"}, false, 11, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1L`bc", "<sample:2>"}, {"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "getFormatter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-5"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "_\n", "<sample:3>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:10>"}, {"org.joda.time.Partial", "getFieldTypes", ""}}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "6"}, {"property", "org.joda.time.DateTimeFieldType", "0"}, {"withMinimumValue", "", "5"}, {"getFieldType", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("clockhourOfHalfday {getName=clockhourOfHalfday}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-5"}, false, 7, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.0134567e0123r5", "<sample:1>"}}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "6"}, {"property", "org.joda.time.DateTimeFieldType", "6"}, {"addToCopy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-5, clockhourOfDay=5, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfDay, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfDay], DateTim.., getValues=[-5, 5,...#212#1245254248", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "393361"}, false, 13, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:10>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<null>"}}), new String[][]{{"isSupported", "org.joda.time.DateTimeFieldType", "5"}, {"withFieldAdded", "org.joda.time.DurationFieldType,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("393361-015 {getFieldTypes=[year, dayOfYear], getFields=[DateTimeField[year], DateTimeField[dayOfYear]], getValues=[393361, 15], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:3>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "getValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getField", "int", "2147483646"}}), new String[][]{{"getPartial", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}}, 3), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "5"}, {"property", "org.joda.time.DateTimeFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getMaximumValue=292272984, getMaximumValueOverall=292272984, getMinimumValue=-292269338, getMinimumValueOverall=-292269338, getName...#206#1375920622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Partial", "getField", "int", "1"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "getField", "int", "1"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "getField", "int", "0"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "getField", "int", "0"}}, 3), new String[][]{{"dayOfYear", "", "7"}, {"set", "long,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "0"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "0"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "0"}}, 3), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[64], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:9>"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toStringList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "toStringList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getValue", "int", "-1"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getValue", "int", "-1"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<null>", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "getValue", "int", "-16777217"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "getField", "int", "1"}, {"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0006", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0007", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#340#11165355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.004Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=4, getMillisOfDay=4, getMillisOfSecond=4, getMinuteOfDay=0, getMin...#309#-315468971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffdZ {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitExcepti...#530#-226530851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1), new String[][]{{"minusSeconds", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1686-04-22T23:59:59.999Z {getCenturyOfEra=17, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=112, getEra=1, getHourOfDay=23, getMillis=-1, getMillisOfDay=86399999, getMillisOfSecond=999, getMinuteOfDa...#329#1727712621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.001-08:00 {getCenturyOfEra=20, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=1, getMillisOfDay=57600001, getMillisOfSecond=1, getMinuteOf...#328#446204254", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.000Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMin...#309#-298885666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 1), new String[][]{{"minusMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("-2115-12-26T21:53:00.004Z {getCenturyOfEra=24, getDayOfMonth=30, getDayOfWeek=3, getDayOfYear=120, getEra=1, getHourOfDay=21, getMillis=-128849018819996, getMillisOfDay=78780004, getMillisOfSecond=4, ...#342#-705152538", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:6>"}}, 1), new String[][]{{"getValues", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"17"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<null>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 2), new String[][]{{"getField", "org.joda.time.Chronology", "5"}, {"getAsShortText", "long", "6"}, {"getAsShortText", "long,java.util.Locale", "4"}, {"add", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 2), new String[][]{{"getField", "org.joda.time.Chronology", "5"}, {"getAsShortText", "long", "6"}, {"getAsShortText", "long,java.util.Locale", "4"}, {"add", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 2), new String[][]{{"getRangeDurationType", "", "5"}, {"getName", "", "6"}, {"getName", "", "4"}, {"getDurationType", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 2), new String[][]{{"getRangeDurationType", "", "5"}, {"getName", "", "6"}, {"getName", "", "3"}, {"getDurationType", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-536870940"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}, 1), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("year", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}, 1), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"getField", "org.joda.time.Chronology", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.SkipDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292272708, getMinimumValue=-292269338, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}, 3), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"isSupported", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "xI", "<sample:3>"}}, 1), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"isSupported", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "xI", "<sample:3>"}, {"org.joda.time.Partial", "getValue", "int", "2147483647"}}, 2), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "5"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("year", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 15, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "xI", "<empty>"}}, 2), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "5"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("year", String.valueOf(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "IWI", "<empty>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:5>"}}, 2), new String[][]{{"getRangeDurationType", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "IWI", "<empty>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:8>"}}, 2), new String[][]{{"getRangeDurationType", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-1"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:8>"}}, 2), new String[][]{{"getRangeDurationType", "", "3"}, {"getName", "", "7"}, {"getField", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292269055, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "getField", "int", "-34"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("year {getName=year}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "2147483647"}, {"org.joda.time.Partial", "getField", "int", "-17"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:8>"}}, 2), new String[][]{{"isSupported", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "10"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0010 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[10], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "131023"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}}, 1), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:10>"}}, 1), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:10>"}}, 1), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:5>"}, {"org.joda.time.Partial", "getValue", "int", "2147483647"}}, 2), new String[][]{{"compareTo", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "130984"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:8>"}}, 2), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-134086744"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:8>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2), new String[][]{{"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "65492"}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:11>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"millisOfSecond", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, getRange=1000, getUnitMillis=1, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"minuteOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"millis", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.MillisDurationField", actual.getClass().getName());
  assertEquals("DurationField[millis] {getName=millis, getUnitMillis=1, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"millisOfSecond", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, getRange=1000, getUnitMillis=1, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"millisOfSecond", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, getRange=1000, getUnitMillis=1, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"millisOfSecond", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"minuteOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, getRange=1440, getUnitMillis=60000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"millisOfSecond", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, getRange=1000, getUnitMillis=1, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "2147483647"}}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "2147483647"}}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0010 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-10, 2, 3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:3>"}, {"org.joda.time.Partial", "getField", "int", "2147483647"}}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "2147483647"}}), new String[][]{{"dayOfYear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "-1"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getField", "int", "2147483647"}}), new String[][]{{"dayOfYear", "", "7"}, {"getAsShortText", "long,java.util.Locale", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"04"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("04", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"14"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "0"}}), new String[][]{{"clockhourOfHalfday", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ZeroIsMaxDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "0"}}), new String[][]{{"centuryOfEra", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922790, getMinimumValue=1, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:1>"}}), new String[][]{{"clockhourOfHalfday", "", "6"}, {"remainder", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:5>"}}), new String[][]{{"clockhourOfHalfday", "", "6"}, {"remainder", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}}), new String[][]{{"toStringList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:4>"}}), new String[][]{{"toStringList", "", "1"}, {"getFormatter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 14, new String[][]{}), new String[][]{{"toStringList", "", "1"}, {"getFormatter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 14, new String[][]{}), new String[][]{{"toStringList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=64, year=100]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getField", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "getValue", "int", "-16777217"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0006", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0007", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1686-04-22T23:59:59.999Z {getCenturyOfEra=17, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=112, getEra=1, getHourOfDay=23, getMillis=-1, getMillisOfDay=86399999, getMillisOfSecond=999, getMinuteOfDa...#329#1727712621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:2>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("year {getName=year}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<null>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}}), new String[][]{{"getName", "", "4"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("year", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"10", "<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:5>"}, {"org.joda.time.Partial", "getValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"getField", "org.joda.time.Chronology", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 12, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"getField", "org.joda.time.Chronology", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:6>", "1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"getField", "org.joda.time.Chronology", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292279536, getMinimumValue=-292268511, getName=year, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "I", "<empty>"}}), new String[][]{{"getRangeDurationType", "", "0"}, {"getName", "", "0"}, {"getName", "", "3"}, {"isSupported", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:3>", "1"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:1>"}}), new String[][]{{"getFieldType", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "1", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:4>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1001170", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getChronology", ""}, {"org.joda.time.Partial", "getFieldType", "int", "2147483647"}}), new String[][]{{"getFieldType", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "getField", "int", "-17"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:10>"}}), new String[][]{{"getRangeDurationType", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:10>"}, {"org.joda.time.Partial", "getFieldTypes", ""}}), new String[][]{{"getRangeDurationType", "", "6"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("year", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:10>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<b:false>"}}), new String[][]{{"getDurationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:10>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<i:1>"}}), new String[][]{{"getDurationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:10>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"getDurationType", "", "3"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("years", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "10"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0010 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[10], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-46"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0046 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-46], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "37"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0037 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[37], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "5"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "5"}, false, 3, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "81"}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<d:1.5>"}, {"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0081 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[81], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "0"}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0000 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[0], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-131072"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-131072 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-131072], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-262150"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:5>"}}), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "3"}, {"minus", "org.joda.time.ReadablePeriod", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-262150 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-262150], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "130984"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:7>"}}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "65492"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:8>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "65492"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:11>", "-134217718"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=65492, getAsShortText=65492, getAsString=65492, getAsText=65492, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-29...#222#225902152", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:9>", "-44"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:8>", "-134217718"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-44, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[-44, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-83"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:8>", "-134217718"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-83, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[-83, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-88"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:10>"}}, 2), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-88, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[-88, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "0"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:12>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:10>"}}, 2), new String[][]{{"getFieldType", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("centuryOfEra {getName=centuryOfEra}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-134217718"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "8-"}}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=0, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[0, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "130984"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "toString", "java.lang.String", "8-"}}), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=130984, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[130984, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("41159300-06-12T00:00:00.000-07:00 {getCenturyOfEra=411593, getDayOfMonth=12, getDayOfWeek=6, getDayOfYear=163, getEra=1, getHourOfDay=0, getMillis=1298799901321200000, getMillisOfDay=0, getMillisOfSec...#344#1156308439", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "2"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "16"}}, 3), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "3"}, {"toDateTime", "org.joda.time.ReadableInstant", "3"}, {"minusWeeks", "int", "0"}, {"minusDays", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("47038854-03-20T06:00:00.001-07:00 {getCenturyOfEra=470389, getDayOfMonth=20, getDayOfWeek=5, getDayOfYear=79, getEra=1, getHourOfDay=6, getMillis=1484340697458000001, getMillisOfDay=21600001, getMilli...#356#1707919911", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"a b", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "--0"}, {"org.joda.time.Partial", "getFields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "010"}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:11>", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111921834", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491362441", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 16, 32]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[64, 100, 255]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "65492"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "2"}, {"compareTo", "org.joda.time.ReadablePartial", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "65492"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:8>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:2>", "65492"}, {"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#-223035874", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:2>", "65492"}, {"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292272992, getMaximumValueOverall=292278993, getMinimumValue=-292269054, getMinimumValueOverall=-292269055, getName...#206#1570233574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:2>", "65492"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292272992, getMaximumValueOverall=292278993, getMinimumValue=-292269054, getMinimumValueOverall=-292269055, getName...#206#1570233574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:2>", "65492"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#-223035874", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:10>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getFields", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=6, year=7]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:2>"}}, 2), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:8>"}, false), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-262143"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0012", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-012", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0064", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0100", String.valueOf(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0064", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[64], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0064", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[64], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0012", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-012", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0064", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0100", String.valueOf(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:3>", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-1", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"eras", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"eras", "", "0"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eras", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"8-"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8-", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
