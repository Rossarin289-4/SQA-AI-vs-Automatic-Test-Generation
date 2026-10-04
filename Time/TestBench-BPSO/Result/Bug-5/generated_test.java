package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "weeks", new String[]{"int"}, new String[]{"50"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P50W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 50, 0, 0, 0, 0, 0], ge...#230#434466406", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-1073681825"}, true), new String[][]{{"toStandardMinutes", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"-6"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-6S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-6, getValues=[0, 0, 0, 0, 0, 0, -6, 0], ...#231#1370237050", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMillis", new String[]{"int"}, new String[]{"3599997"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}}), new String[][]{{"normalizedStandard", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT59M59.997S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=997, getMinutes=59, getMonths=0, getSeconds=59, getValues=[0, 0, 0, 0, 0, 5...#244#-1756804097", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"86399999"}, false, 0, new String[][]{{"org.joda.time.Period", "setField", "org.joda.time.DurationFieldType,int", "<sample:7>", "25"}}), new String[][]{{"plusDays", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P25DT86399999M {getDays=25, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=86399999, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2...#254#98023178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P25D {getDays=25, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 25, 0, 0, 0, 0], g...#230#947037159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "-95"}, false, 0, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"2147483628"}, false, 0, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:7>"}}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "7"}, {"normalizedStandard", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-4Y-4M-8W-1DT-35M-27.632S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-632, getMinutes=-35, getMonths=-4, getSeconds=-27, getValue...#272#-1227226696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"120000"}, false, 0, new String[][]{{"org.joda.time.Period", "getMonths", ""}, {"org.joda.time.Period", "withMillis", "int", "2147483647"}}), new String[][]{{"minusHours", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-120000WT-3H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-3, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -120000, 0, ...#251#1124816245", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusYears", new String[]{"int"}, new String[]{"60025"}, false, 0, new String[][]{{"org.joda.time.Period", "withSeconds", "int", "604801"}}, 1), new String[][]{{"withFields", "org.joda.time.ReadablePeriod", "7"}, {"normalizedStandard", "org.joda.time.PeriodType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDays", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "getDays", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withFields", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusSeconds", "int", "604752"}, {"org.joda.time.Period", "normalizedStandard", "org.joda.time.PeriodType", "<sample:1>"}}), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"604831"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "toStandardDays", ""}}), new String[][]{{"minusMinutes", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:5>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.Period", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<sample:8>"}}, 2), new String[][]{{"plusYears", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-1M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -1, 0, 0], ...#231#1705969009", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"86662104"}, true), new String[][]{{"getHours", "", "5"}, {"plusHours", "int", "2"}, {"plusHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483648H86662.104S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=86662104, getMinutes=0, getMonths=0, getSeconds=0, ge...#282#861090998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"1404"}, false, 3, new String[][]{{"org.joda.time.Period", "minusMonths", "int", "1037"}}, 2), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "2"}, {"withMinutes", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-292277024Y-7M-2W-1405DT-8H4M-55.805S {getDays=-1405, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=4, getMonths=-7, getSeconds...#304#1220677410", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"3599984"}, false, 5, new String[][]{}), new String[][]{{"withMonths", "int", "3"}, {"normalizedStandard", "", "2"}, {"getFieldTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"32839"}, false, 0, null, 2), new String[][]{{"plusDays", "int", "5"}, {"plusSeconds", "int", "2"}, {"negated", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-32839Y-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-32839, 0, 0, -2, 0,...#247#481433172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusSeconds", new String[]{"int"}, new String[]{"-1055"}, false, 0, null, 2), new String[][]{{"minusMonths", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1055S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=1055, getValues=[0, 0, 0, 0, 0, 0, 1055...#237#-677883932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Minutes", actual.getClass().getName());
  assertEquals("PT0M {getMinutes=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"-2147483648"}, true), new String[][]{{"minusWeeks", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false), new String[][]{{"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "2"}, {"getValue", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withDays", new String[]{"int"}, new String[]{"-86354"}, false, 0, new String[][]{{"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:5>"}}), new String[][]{{"getFieldType", "int", "5"}, {"isSupported", "org.joda.time.Chronology", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3Y-3M-3W-3DT-3H-3M-3.003S {getDays=-3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-3, getMillis=-3, getMinutes=-3, getMonths=-3, getSeconds=-3, getValues=...#267#-738858096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "parse", new String[]{"java.lang.String", "org.joda.time.format.PeriodFormatter"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"-1073741824"}, true, 0, null, 2), new String[][]{{"minusMillis", "int", "2"}, {"getValues", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, -1073741824, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"toPeriodTo", "org.joda.time.ReadableInstant", "7"}, {"getDays", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Period", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<null>", "-251041"}}, 1), new String[][]{{"get", "org.joda.time.DurationFieldType", "4"}, {"getPeriodType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "100"}, false, 6, new String[][]{{"org.joda.time.Period", "minusSeconds", "int", "-2"}}, 1), new String[][]{{"withHours", "int", "6"}, {"plusHours", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}}, 1), new String[][]{{"negated", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-6Y-6M-6W-6DT2147483642H-6M-6.006S {getDays=-6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483642, getMillis=-6, getMinutes=-6, getMonths=-6, getSecond...#291#-1308638396", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"2551551"}, false, 1, new String[][]{{"org.joda.time.Period", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}}), new String[][]{{"multipliedBy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2551550D {getDays=-2551550, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -25515...#248#1850426696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:5>"}}), new String[][]{{"toPeriodFrom", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withWeeks", new String[]{"int"}, new String[]{"558"}, false, 4, new String[][]{{"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "minusYears", "int", "-1"}}, 2), new String[][]{{"toStandardHours", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.Period", "getFieldTypes", ""}}), new String[][]{{"toPeriodFrom", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-244978Y-9M-3W-4DT-8H {getDays=-4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=0, getMinutes=0, getMonths=-9, getSeconds=0, getValues=[-244978...#266#417184904", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:7>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDuration", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "getSeconds", ""}}), new String[][]{{"toPeriod", "org.joda.time.Chronology", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withFields", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3), new String[][]{{"toStandardSeconds", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:4>", "<sample:8>"}, true), new String[][]{{"toStandardDuration", "", "0"}, {"getStandardDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:12>", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1957770404", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusDays", new String[]{"int"}, new String[]{"118"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P118D {getDays=118, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 118, 0, 0, 0, 0]...#233#-2006372812", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"1457"}, false, 0, new String[][]{{"org.joda.time.Period", "withSeconds", "int", "-13"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1457M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-1457, getSeconds=0, getValues=[0, -1457, 0, 0, 0, 0,...#239#-187632861", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2Y-2M-2W-2DT-2H-2M-2.002S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2, getMillis=-2, getMinutes=-2, getMonths=-2, getSeconds=-2, getValues=...#267#-322645462", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "151200000"}, false, 6, new String[][]{{"org.joda.time.Period", "negated", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P151200000DT-2147483648H {getDays=151200000, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, g...#284#-1565281923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getYears", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValues", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y-1M-1W-1DT-1H-1M-1.001S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-1, getMillis=-1, getMinutes=-1, getMonths=-1, getSeconds=-1, getValues=...#267#93567172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValues", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getYears", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "toMutablePeriod", ""}, {"org.joda.time.Period", "withYears", "int", "604800000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-185542587183600S {getMillis=-185542587183600000, getStandardDays=-2147483647, getStandardHours=-51539607551, getStandardMinutes=-3092376453060, getStandardSeconds=-185542587183600}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getFieldTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValue", new String[]{"int"}, new String[]{"43200"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toString", ""}, {"org.joda.time.Period", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:4>", "118"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"59999"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValue", new String[]{"int", "int"}, new String[]{"59", "47"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Period", "withMillis", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValues", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toPeriod", ""}}, 3), new String[][]{{"get", "org.joda.time.DurationFieldType", "1"}, {"addSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2147483647S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=2147483647, getValues=[0, 0, 0, 0...#255#2452663", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardMinutes", ""}}, 1), new String[][]{{"toMutablePeriod", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"604779"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "134217742"}}, 3), new String[][]{{"getHours", "", "0"}, {"toStandardWeeks", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Weeks", actual.getClass().getName());
  assertEquals("P0W {getWeeks=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "weeks", new String[]{"int"}, new String[]{"3599"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P3599W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 3599, 0, 0, 0, 0, 0]...#236#-456793985", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"739017729"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-739017729W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -739017729, 0,...#254#-456874615", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "1439"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1439D {getDays=1439, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1439, 0, 0, 0,...#236#887145581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"1440"}, false, 0, new String[][]{{"org.joda.time.Period", "plusMillis", "int", "3599999"}}, 3), new String[][]{{"getHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Period", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483647D {getDays=-2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1740908275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"1003"}, false, 0, null, 2), new String[][]{{"getMinutes", "", "0"}, {"minus", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3Y-3M-3W-3DT-3H-3M-4.006S {getDays=-3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-3, getMillis=-1006, getMinutes=-3, getMonths=-3, getSeconds=-3, getValu...#273#256271332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "minusYears", "int", "3468929"}}, 3), new String[][]{{"isGreaterThan", "org.joda.time.Days", "2"}, {"toStandardWeeks", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Weeks", actual.getClass().getName());
  assertEquals("P0W {getWeeks=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"604800000"}, false, 0, null, 1), new String[][]{{"getValue", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-604800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:11>", "161"}, false, 0, new String[][]{{"org.joda.time.Period", "getSeconds", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P161D {getDays=161, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 161, 0, 0, 0, 0]...#233#-2064109408", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMillis", new String[]{"int"}, new String[]{"-719"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.Period", "minusDays", "int", "59970"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"8388667", "604800", "-13", "147", "-24", "7", "24", "302399"}, false, 3, new String[][]{{"org.joda.time.Period", "getMonths", ""}, {"org.joda.time.Period", "toStandardDuration", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P8388667Y604800M-13W147DT-24H7M326.399S {getDays=147, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-24, getMillis=302399, getMinutes=7, getMonths=604800, getS...#309#144678204", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "withField", "org.joda.time.DurationFieldType,int", "<sample:3>", "302400038"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"10079"}, false, 0, null, 3), new String[][]{{"get", "org.joda.time.DurationFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2), new String[][]{{"minusMonths", "int", "7"}, {"getWeeks", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"7"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P7M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=7, getSeconds=0, getValues=[0, 7, 0, 0, 0, 0, 0, 0], getW...#227#-851574114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "2147483647", "302400000", "53", "60001", "26", "1000", "1000", "2147483647"}, {"org.joda.time.Period", "equals", "java.lang.Object", "<i:1>"}}, 2), new String[][]{{"withMinutesRemoved", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[StandardNoMinutes] {getName=StandardNoMinutes, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647Y302400000M53W60001DT26H1000M2148483.647S {getDays=60001, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=26, getMillis=2147483647, getMinutes=1000, g...#352#759714915", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "negated", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getFieldTypes", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "1498"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"604800"}, true, 0, null, 1), new String[][]{{"minusSeconds", "int", "3"}, {"minusHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483648H604800M-1S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=604800, getMonths=0, getSeconds=-1, get...#280#-1977501638", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getWeeks", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusYears", new String[]{"int"}, new String[]{"-30000"}, false, 0, new String[][]{{"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}}, 2), new String[][]{{"negated", "", "1"}, {"normalizedStandard", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-30000Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-30000, 0, 0, 0, 0, 0, 0...#242#52869195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.joda.time.Period", "getValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardSeconds", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Period", "minusYears", "int", "525728"}}, 3), new String[][]{{"negated", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.joda.time.Period", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:8>", "-2147483648"}}, 2), new String[][]{{"minusSeconds", "int", "1"}, {"withDays", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-292277024Y-7M-2W-2147483648DT-8H-12M-54.805S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonth...#328#1104816546", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "-1073681856"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "withMonths", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:9>", "11"}, false, 6, new String[][]{{"org.joda.time.Period", "getPeriodType", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2), new String[][]{{"normalizedStandard", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3550W-5DT-3H-14M-8S {getDays=-5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-3, getMillis=0, getMinutes=-14, getMonths=0, getSeconds=-8, getValues=[0, 0, ...#263#1859556548", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"-1498"}, false, 0, null, 3), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3Y-3M-3W-3DT-1501H-3M-3.003S {getDays=-3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-1501, getMillis=-3, getMinutes=-3, getMonths=-3, getSeconds=-3, getV...#276#-1307698348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"3600"}, false, 5, new String[][]{}, 2), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"1498"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}, {"org.joda.time.Period", "withWeeks", "int", "-3599999"}}, 3), new String[][]{{"plusHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1498MT2147483647H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483647, getMillis=0, getMinutes=0, getMonths=1498, getSeconds=0, getValues=[0,...#266#-1413620631", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Period", "negated", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Period", "setField", "org.joda.time.DurationFieldType,int", "<sample:4>", "32874"}}, 3), new String[][]{{"withSecondsRemoved", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "days", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 2), new String[][]{{"getDays", "", "3"}, {"plusDays", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Period", "getSeconds", ""}}, 3), new String[][]{{"plusMillis", "int", "5"}, {"negated", "", "2"}, {"withMinutes", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4Y4M4W4DT4H-2147483648M4.002S {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=4, getMillis=2, getMinutes=-2147483648, getMonths=4, getSeconds=4, get...#274#747097797", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getYears", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldType", new String[]{"int"}, new String[]{"1001"}, false, 0, new String[][]{{"org.joda.time.Period", "getValue", "int", "1075541824"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withDays", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"org.joda.time.Period", "plusMonths", "int", "120072"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P8D {getDays=8, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 8, 0, 0, 0, 0], getW...#227#165835412", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1), new String[][]{{"size", "", "7"}, {"indexOf", "org.joda.time.DurationFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"302400"}, false, 0, null, 1), new String[][]{{"withMonths", "int", "1"}, {"toDurationFrom", "org.joda.time.ReadableInstant", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-1091318400S {getMillis=-1091318400000, getStandardDays=-12631, getStandardHours=-303144, getStandardMinutes=-18188640, getStandardSeconds=-1091318400}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "days", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"5016"}, true, 0, null, 3), new String[][]{{"getValues", "", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 5016, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:6>", "1440"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"22"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P22M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=22, getSeconds=0, getValues=[0, 22, 0, 0, 0, 0, 0, 0], g...#230#1299907929", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "multipliedBy", new String[]{"int"}, new String[]{"1001"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:9>"}, false, 0, new String[][]{{"org.joda.time.Period", "getValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, ...#257#1061391795", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"47"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P47W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 47, 0, 0, 0, 0, 0], ge...#230#-1634362242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"302400021"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648DT-302400.021S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-302400021, getMinutes=0, getMonths=0, getSeconds=0...#288#-172136136", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValue", new String[]{"int", "int"}, new String[]{"1392", "10081"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getSeconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"1498"}, false, 2, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "1008"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1498WT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -1498, 0, 0,...#246#2026224184", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"151200000"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "getYears", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT151200000H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=151200000, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, ...#252#112494435", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "parse", new String[]{"java.lang.String"}, new String[]{"TITLEWeeks"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.Period", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:0>"}}), new String[][]{{"toStandardWeeks", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Weeks", actual.getClass().getName());
  assertEquals("P0W {getWeeks=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"10081"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT10.081S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=10081, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0...#241#-1283463839", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "parse", new String[]{"java.lang.String", "org.joda.time.format.PeriodFormatter"}, new String[]{"Min1utes", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.Period", "withHours", "int", "1441"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "getYears", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[0] {getName=0, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"302400"}, false, 0, new String[][]{{"org.joda.time.Period", "withYears", "int", "168"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT302400H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=302400, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 302400...#243#87096691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValue", new String[]{"int"}, new String[]{"131122"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "47"}, {"org.joda.time.Period", "plusDays", "int", "138"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"86463"}, false, 4, new String[][]{{"org.joda.time.Period", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648DT86.463S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=86463, getMinutes=0, getMonths=0, getSeconds=0, getValue...#273#1532095254", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"-86401"}, false, 3, new String[][]{{"org.joda.time.Period", "getSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-292277024Y86394M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=86394, getSec...#310#-1883130554", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "multipliedBy", new String[]{"int"}, new String[]{"-32721"}, false), new String[][]{{"getYears", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 6, new String[][]{}), new String[][]{{"toMutablePeriod", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"1441"}, true), new String[][]{{"plusYears", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147482207Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147482207, 0, 0, ...#257#871863635", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "negated", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusYears", new String[]{"int"}, new String[]{"604888"}, false, 6, new String[][]{{"org.joda.time.Period", "toPeriod", ""}, {"org.joda.time.Period", "minusMonths", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-604888YT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[...#278#-1961943726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMinutes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "minusSeconds", "int", "86400000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Period", "withMillis", "int", "86399999"}, {"org.joda.time.Period", "plusDays", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"60000"}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-60000M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-60000, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -60...#243#-885029908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "86400030"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86400030DT0.001S {getDays=86400030, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#255#221760021", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"518"}, true), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y517M-1W-1DT-1H-1M-1.001S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-1, getMillis=-1, getMinutes=-1, getMonths=517, getSeconds=-1, getValue...#270#-612819517", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.joda.time.Period", "getWeeks", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "<sample:8>", "3600000"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"131122"}, false, 0, new String[][]{{"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:4>"}}), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P917854D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsException...#400#1917560737", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Period", "addField", "org.joda.time.DurationFieldType,int", "<sample:6>", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1073741823D {getDays=1073741823, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 10...#254#-437863420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.Period", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldType", new String[]{"int"}, new String[]{"3600048"}, false, 5, new String[][]{{"org.joda.time.Period", "minusSeconds", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Period", "minusHours", "int", "118"}, {"org.joda.time.Period", "withDays", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-4Y-4M-4W-4DT-4H-4M-4.004S {getDays=-4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-4, getMillis=-4, getMinutes=-4, getMonths=-4, getSeconds=-4, getValues=...#267#-1155070730", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Period", "getPeriodType", ""}, {"org.joda.time.Period", "withMonths", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusSeconds", new String[]{"int"}, new String[]{"3546"}, false, 1, new String[][]{{"org.joda.time.Period", "size", ""}, {"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT3546S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=3546, getValues=[0, 0, 0, 0, 0, 0, 3546...#237#-600128769", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2Y-2M-2W-2DT-2H-2M-2.002S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2, getMillis=-2, getMinutes=-2, getMonths=-2, getSeconds=-2, getValues=...#267#-322645462", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.Period", "withYears", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"-3599952"}, false, 2, new String[][]{}), new String[][]{{"withField", "org.joda.time.DurationFieldType,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1DT3599.953S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3599953, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1...#252#903045692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardSeconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusDays", new String[]{"int"}, new String[]{"84"}, false, 0, new String[][]{{"org.joda.time.Period", "getValues", ""}}), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "4"}, {"withMonths", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "-1073681872"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"1001"}, false, 3, new String[][]{{"org.joda.time.Period", "withSeconds", "int", "100"}}), new String[][]{{"getSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Period", "getDays", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusYears", new String[]{"int"}, new String[]{"86401"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}}), new String[][]{{"getYears", "", "7"}, {"indexOf", "org.joda.time.DurationFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMillis", new String[]{"int"}, new String[]{"268435467"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT268435.467S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=268435467, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0,...#253#-1936824508", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.Period", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"toStandardSeconds", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "days", new String[]{"int"}, new String[]{"4112"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4112D {getDays=4112, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4112, 0, 0, 0,...#236#586251426", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"30"}, false), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1Y-29M1W1DT1H1M1.001S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=1, getMinutes=1, getMonths=-29, getSeconds=1, getValues=[1, -29, ...#250#-1653539696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483647, ...#257#-652158764", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "days", new String[]{"int"}, new String[]{"201326593"}, true), new String[][]{{"getYears", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"1065"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1.065S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1065, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, ...#238#63107345", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:2>", "10"}, false, 7, new String[][]{{"org.joda.time.Period", "getHours", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 1, 0, 0], get...#228#319719034", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValues", new String[]{"int[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusSeconds", new String[]{"int"}, new String[]{"1209599998"}, false, 1, new String[][]{{"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-1209599998S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-1209599998, getValues=[0, 0, 0,...#258#-804570623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:4>", "-49"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "withDays", "int", "-29"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-292277024, -7, -2, -2, -8, -12, -55, -805]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483648H-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds...#291#-2042938195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0.001S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Period", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:4>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"-11"}, false, 6, new String[][]{{"org.joda.time.Period", "getMillis", ""}}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Period", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[days, days, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"86396"}, false, 0, new String[][]{{"org.joda.time.Period", "equals", "java.lang.Object", "<s:b>"}, {"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-86396H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-86396, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, -86396...#243#1307066061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"-2147483641"}, false, 0, new String[][]{{"org.joda.time.Period", "negated", ""}}), new String[][]{{"withMonths", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648MT2147483641H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483641, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0,...#287#-1222153441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getYears", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Period", "getValues", ""}, {"org.joda.time.Period", "withDays", "int", "-302400"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withSeconds", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.Period", "setValue", "int,int", "59999", "319"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"7"}, false), new String[][]{{"plusMinutes", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-8M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-8, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -8, 0, 0], ...#231#-2093876758", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P7M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=7, getSeconds=0, getValues=[0, 7, 0, 0, 0, 0, 0, 0], getW...#227#-851574114", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.joda.time.Period", "toString", ""}}), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "169"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P169D {getDays=169, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 169, 0, 0, 0, 0]...#233#-790348136", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"604800000"}, false, 2, new String[][]{}), new String[][]{{"withSeconds", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-604795.999S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-604799999, getMinutes=0, getMonths=0, getSeconds=4, getValues=[0, 0, 0, ...#256#603757530", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"-1073681833"}, false), new String[][]{{"withPeriodType", "org.joda.time.PeriodType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardHours", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "isSupported", "org.joda.time.DurationFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Hours", actual.getClass().getName());
  assertEquals("PT0H {getHours=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Period", "getMonths", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1DT0.001S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 1...#234#213752779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<null>"}}), new String[][]{{"plus", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Period", "getSeconds", ""}}), new String[][]{{"withWeeksRemoved", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "minusMillis", "int", "136"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"169"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-169D {getDays=-169, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -169, 0, 0, 0,...#236#2048332747", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withSeconds", new String[]{"int"}, new String[]{"1075541824"}, false), new String[][]{{"multipliedBy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1075541824S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=1075541824, getValues=[0, 0, 0, 0...#255#1527329502", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.Period", "withMonths", "int", "111"}, {"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusDays", "int", "-86401"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusDays", new String[]{"int"}, new String[]{"-268434047"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "111"}, {"org.joda.time.Period", "getDays", ""}}), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-268434047D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutO...#426#1437082325", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"3600000"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3600000D {getDays=-3600000, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -36000...#248#-2087563932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.Period", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "-1412"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W3DT-8H-12M-55.805S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-55...#298#-1090826454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusDays", new String[]{"int"}, new String[]{"2096178"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2096178DT-2147483648H {getDays=2096178, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getVa...#278#-1794298935", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1957770431", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"4196399"}, false, 6, new String[][]{}), new String[][]{{"getMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4196399", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Period", "withYears", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"525288"}, false, 1, new String[][]{}), new String[][]{{"withHours", "int", "3"}, {"normalizedStandard", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-52WT-17H-48M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-17, getMillis=0, getMinutes=-48, getMonths=0, getSeconds=0, getValues=[0, 0, -52, 0, ...#250#421394856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "getPeriodType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardDays", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "4095", "-2147483648", "30000", "98", "2002", "-1048563", "2147483647", "3600001"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"-3"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "2002"}}), new String[][]{{"getDays", "", "1"}, {"getFieldType", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("hours {getName=hours}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"13"}, false, 6, new String[][]{}), new String[][]{{"getWeeks", "", "7"}, {"multipliedBy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-13MT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=-13, getSeconds=0, getValues=[0,...#266#-222708456", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.Period", "hashCode", ""}}), new String[][]{{"getMillis", "", "3"}, {"withWeeks", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M1W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=[0, -214...#259#-265014528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"604800062"}, false, 6, new String[][]{}), new String[][]{{"toDurationFrom", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-7730940527999.938S {getMillis=-7730940527999938, getStandardDays=-89478478, getStandardHours=-2147483479, getStandardMinutes=-128849008799, getStandardSeconds=-7730940527999}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"-131071"}, false, 3, new String[][]{}), new String[][]{{"getMonths", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("131064", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"262244"}, true), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "5"}, {"minusMillis", "int", "7"}, {"withMinutes", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2Y2M2W2DT2H4M1.998S {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2, getMillis=-2, getMinutes=4, getMonths=2, getSeconds=2, getValues=[2, 2, 2, 2,...#246#2052367926", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"59952"}, false, 7, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "weeks", new String[]{"int"}, new String[]{"2922"}, true), new String[][]{{"minusDays", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2922W-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0...#268#-1724929264", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"-8"}, false, 0, new String[][]{{"org.joda.time.Period", "getFieldTypes", ""}}), new String[][]{{"get", "org.joda.time.DurationFieldType", "5"}, {"plusHours", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-8WT-1H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-1, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -8, 0, -1, 0, 0, ...#236#-2019354290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"8388617"}, false), new String[][]{{"getYears", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"-60"}, false), new String[][]{{"withHours", "int", "4"}, {"plusDays", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT2147483647H60M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483647, getMillis=0, getMinutes=60, getMonths=0, getSeconds=0, getValues=[0, 0, ...#260#955326225", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDuration", ""}, {"org.joda.time.Period", "minusDays", "int", "-604800000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"172802"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-172802W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -172802, 0, 0, 0,...#245#-341687730", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"-22"}, false, 0, new String[][]{{"org.joda.time.Period", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:3>", "<sample:7>", "1073743265"}}), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsException, get...#390#-2092734013", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "days", new String[]{"int"}, new String[]{"-1018"}, true), new String[][]{{"withPeriodType", "org.joda.time.PeriodType", "6"}, {"normalizedStandard", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-145W-3D {getDays=-3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -145, -3, 0, 0, ...#241#-1909595116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-536840916"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-536840916Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-536840916, 0, 0, 0,...#254#-763987524", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:0>", "739017727"}, false, 0, new String[][]{{"org.joda.time.Period", "addField", "org.joda.time.DurationFieldType,int", "<sample:5>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMonths", new String[]{"int"}, new String[]{"86400001"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86400001M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=86400001, getSeconds=0, getValues=[0, 86400001, 0,...#248#-1406551820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withFields", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1DT0.001S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 1...#234#213752779", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusSeconds", new String[]{"int"}, new String[]{"302400029"}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:10>"}}), new String[][]{{"getValues", "", "7"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, -302400029, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "weeks", new String[]{"int"}, new String[]{"2147483647"}, true), new String[][]{{"minusMonths", "int", "3"}, {"isSupported", "org.joda.time.DurationFieldType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.Period", "withDays", "int", "-2147483648"}, {"org.joda.time.Period", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:6>", "604801"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=[0, -21474...#257#250129404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"-3599"}, true), new String[][]{{"withField", "org.joda.time.DurationFieldType,int", "5"}, {"minusWeeks", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-4W3DT-3.599S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-3599, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -4, 3, 0...#248#325647543", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"46"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P46W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 46, 0, 0, 0, 0, 0], ge...#230#605877183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Period", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:1>", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:8>", "-1073741824"}, false, 0, new String[][]{{"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "7199890", "59", "23", "10079", "2147483647", "3600093", "-2", "3587"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "-2"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -2, 0, 0, 0, 0], g...#230#-543185143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"-3565"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT3565M0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=3565, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 3...#243#-234511178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"-1073680801"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"12"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-12H0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-12, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, -12, 0...#240#-150765892", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusSeconds", new String[]{"int"}, new String[]{"-604799999"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:2>"}}), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT604799999S {getMillis=604799999000, getStandardDays=6999, getStandardHours=167999, getStandardMinutes=10079999, getStandardSeconds=604799999}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-2147483648"}, true), new String[][]{{"withMonths", "int", "6"}, {"minusMillis", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648Y3MT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=3, getSeconds=0, getValues=[-2147483...#269#-1890967570", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTime] {getName=DayTime, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:6>", "1441"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"29977"}, false, 0, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:7>"}}), new String[][]{{"minusHours", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-29977WT-2H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -29977, 0, -2...#248#332023297", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minutes", new String[]{"int"}, new String[]{"3079"}, true), new String[][]{{"getDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "336", "2147483647", "59985", "2147483647", "2147483647", "-302400000", "1209600002"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647Y336M2147483647W59985DT2147483647H2147483647M-301190399.998S {getDays=59985, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483647, getMillis=120...#393#-290782182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-1012"}, false, 7, new String[][]{{"org.joda.time.Period", "minusHours", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:3>"}}), new String[][]{{"plusMonths", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1MT-2147483648H-2147483.647S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=-2147483647, getMinutes=0, getMonths=1, getSecon...#293#1204648744", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "86662180"}, {"org.joda.time.Period", "withField", "org.joda.time.DurationFieldType,int", "<sample:1>", "23"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusDays", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.joda.time.Period", "getFieldType", "int", "190"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1529161537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false), new String[][]{{"toStandardDays", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusWeeks", new String[]{"int"}, new String[]{"7200008"}, false), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-7200008W-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -7200008, -1...#253#507954443", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"68"}, false, 0, new String[][]{{"org.joda.time.Period", "multipliedBy", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-68M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-68, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -68, 0, 0...#234#-590829576", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"2996"}, false), new String[][]{{"withField", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P5DT-2996H {getDays=5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2996, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 5, -2996,...#242#-718530526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "86399999"}, false, 0, new String[][]{{"org.joda.time.Period", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<null>", "<null>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86399999D {getDays=86399999, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 863999...#248#1544170280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "302400"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMillis", "int", "29"}, {"org.joda.time.Period", "getMonths", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P302400D {getDays=302400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 302400, 0,...#242#-268156861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMillis", new String[]{"int"}, new String[]{"-120002"}, false, 0, new String[][]{{"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "-13", "6", "1073741808", "-86399", "2", "1075541798", "60001", "3599997"}}), new String[][]{{"getFieldType", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("hours {getName=hours}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-13Y6M1073741808W-86399DT2H1075541798M63600.997S {getDays=-86399, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2, getMillis=3599997, getMinutes=1075541798, g...#343#1375171702", SearchInputFactory_scaffolding.receiverState());
 }
}
