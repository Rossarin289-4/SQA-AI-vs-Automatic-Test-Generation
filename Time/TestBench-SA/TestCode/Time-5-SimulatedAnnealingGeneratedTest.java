package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Period", "minusDays", "int", "1001"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Period", "withHours", "int", "1491"}, {"org.joda.time.Period", "minusDays", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -2147483648, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483648, ...#257#737703281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 255, 256, 1000, -2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT255H256M999.998S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=255, getMillis=-2, getMinutes=256, getMonths=0, getSeconds=1000, getValues=[0, 0, ...#258#38327280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, getFieldTypes=[years, days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0], getWeeks=0, getYears=0, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:7>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusWeeks", "int", "84"}}), new String[][]{{"getHours", "", "0"}, {"plusYears", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2147483647, 0, 0, 0,...#254#-1210412347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "parse", new String[]{"java.lang.String", "org.joda.time.format.PeriodFormatter"}, new String[]{"/a/b", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMinutes", new String[]{"int"}, new String[]{"-288"}, false, 2, new String[][]{{"org.joda.time.Period", "withYears", "int", "10081"}, {"org.joda.time.Period", "withDays", "int", "84"}, {"org.joda.time.Period", "toStandardWeeks", ""}}, 2), new String[][]{{"withWeeks", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2WT288M0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=288, getMonths=0, getSeconds=0, getValues=[0, 0, 2, 0, 0, 2...#242#1736491924", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusHours", new String[]{"int"}, new String[]{"-8388526"}, false, 0, new String[][]{{"org.joda.time.Period", "toPeriod", ""}, {"org.joda.time.Period", "getSeconds", ""}}), new String[][]{{"plusMonths", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT8388526H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=8388526, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 8388...#246#465078666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMinutes", new String[]{"int"}, new String[]{"1073741823"}, false, 17, new String[][]{{"org.joda.time.Period", "negated", ""}, {"org.joda.time.Period", "plusMillis", "int", "168"}, {"org.joda.time.Period", "withMillis", "int", "-2147483648"}}), new String[][]{{"minusMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1073741823M0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=1073741823, getMonths=0, getSeconds=0, getValues=[0, 1073741823, 0, 100], getWeek...#224#1464103101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withFields", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"1509"}, true, 0, null, 2), new String[][]{{"negated", "", "0"}, {"plusDays", "int", "2"}, {"normalizedStandard", "org.joda.time.PeriodType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"86401"}, false, 0, null, 3), new String[][]{{"plusMillis", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86401M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=86401, getSeconds=0, getValues=[0, 86401, 0, 0, 0, 0,...#239#1257387742", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:0>"}, false, 7, new String[][]{{"org.joda.time.Period", "setPeriod", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:5>"}, {"org.joda.time.Period", "withSeconds", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.joda.time.Period", "getMillis", ""}, {"org.joda.time.Period", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<null>", "-47"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P3Y3M3W-2147483645DT3H3M3.003S {getDays=-2147483645, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=3, getMinutes=3, getMonths=3, getSeconds=3, get...#274#370949001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withHours", new String[]{"int"}, new String[]{"604801"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}}), new String[][]{{"minusMonths", "int", "1"}, {"toStandardMinutes", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusYears", new String[]{"int"}, new String[]{"86400000"}, false, 1, new String[][]{{"org.joda.time.Period", "plusSeconds", "int", "604800001"}, {"org.joda.time.Period", "withField", "org.joda.time.DurationFieldType,int", "<sample:2>", "2081"}}, 2), new String[][]{{"withFields", "org.joda.time.ReadablePeriod", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-86400000Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-86400000, 0, 0, 0, 0...#251#-358872404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"40"}, false, 6, new String[][]{{"org.joda.time.Period", "minusMonths", "int", "-60"}, {"org.joda.time.Period", "toString", ""}}, 2), new String[][]{{"normalizedStandard", "", "1"}, {"getSeconds", "", "7"}, {"toStandardDuration", "", "7"}, {"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-89478485D {getDays=-89478485, getFieldTypes=[days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-89478485], getWeeks=0, getYears=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "-144"}, false, 7, new String[][]{{"org.joda.time.Period", "setField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-604799"}, {"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "plusMinutes", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "months", new String[]{"int"}, new String[]{"-1082130291"}, true), new String[][]{{"multipliedBy", "int", "3"}, {"getMillis", "", "4"}, {"getDays", "", "7"}, {"minusSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1082130291M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-1082130291, getSeconds=0, getValues=[0, -10821...#257#1664597395", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 8, new String[][]{{"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:1>"}, {"org.joda.time.Period", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:3>", "10128"}, {"org.joda.time.Period", "withMinutes", "int", "-8388526"}}, 1), new String[][]{{"toStandardDuration", "", "4"}, {"toPeriodTo", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-5879489Y-11M-1W-2DT-20H-31M-23.648S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-20, getMillis=-648, getMinutes=-31, getMonths=-11, getSeconds...#301#-588277030", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"5191"}, false, 2, new String[][]{{"org.joda.time.Period", "size", ""}, {"org.joda.time.Period", "minusWeeks", "int", "68"}}, 2), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "1"}, {"minusYears", "int", "2"}, {"getFieldType", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:7>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:7>", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "fieldDifference", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial"}, new String[]{"<sample:6>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"plusHours", "int", "2"}, {"plusDays", "int", "7"}, {"get", "org.joda.time.DurationFieldType", "3"}, {"withMonths", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647M4D {getDays=4, getFieldTypes=[years, months, days], getHours=0, getMillis=0, getMinutes=0, getMonths=2147483647, getSeconds=0, getValues=[0, 2147483647, 4], getWeeks=0, getYears=0, size=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:2>"}, {"org.joda.time.Period", "minusWeeks", "int", "-2147221503"}, {"org.joda.time.Period", "normalizedStandard", ""}}), new String[][]{{"toPeriod", "org.joda.time.Chronology", "5"}, {"multipliedBy", "int", "5"}, {"withMonths", "int", "4"}, {"normalizedStandard", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P178956970Y7M-7101W-3DT-6H-28M-16S {getDays=-3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-6, getMillis=0, getMinutes=-28, getMonths=7, getSeconds=-16, get...#294#347313270", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusYears", new String[]{"int"}, new String[]{"167"}, false, 10, new String[][]{{"org.joda.time.Period", "plusDays", "int", "1209591810"}}), new String[][]{{"normalizedStandard", "", "2"}, {"minusDays", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P167Y-213044W-4DT-2H-8M {getDays=-4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2, getMillis=0, getMinutes=-8, getMonths=0, getSeconds=0, getValues=[167, 0...#269#162428983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toPeriod", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Period", "withField", "org.joda.time.DurationFieldType,int", "<sample:0>", "999"}, {"org.joda.time.Period", "multipliedBy", "int", "1799942"}}, 3), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "2"}, {"toStandardWeeks", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMinutes", new String[]{"int"}, new String[]{"604800"}, false, 3, new String[][]{{"org.joda.time.Period", "setField", "org.joda.time.DurationFieldType,int", "<sample:7>", "-604799"}, {"org.joda.time.Period", "minusMillis", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-292277024Y-7M-2W-604799DT-8H604788M-55.805S {getDays=-604799, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=604788, getMonths=...#325#1491739694", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-604799DT-8H-12M-55.805S {getDays=-604799, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, ge...#316#-1336695469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"-29967"}, false, 13, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}, {"org.joda.time.Period", "withHours", "int", "169"}, {"org.joda.time.Period", "minusHours", "int", "4190704"}}, 3), new String[][]{{"plusMonths", "int", "1"}, {"normalizedStandard", "org.joda.time.PeriodType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"10"}, false, 8, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}, {"org.joda.time.Period", "getMonths", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}}, 1), new String[][]{{"plusMillis", "int", "3"}, {"getDays", "", "1"}, {"multipliedBy", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT10M-2147483.647S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483647, getMinutes=10, getMonths=0, getSeconds=0, getValues=[0, ...#264#-236913604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMinutes", new String[]{"int"}, new String[]{"1048240"}, false, 9, new String[][]{{"org.joda.time.Period", "minusWeeks", "int", "3600001"}, {"org.joda.time.Period", "toStandardSeconds", ""}, {"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}, 2), new String[][]{{"isSupported", "org.joda.time.DurationFieldType", "7"}, {"plusWeeks", "int", "2"}, {"multipliedBy", "int", "3"}, {"withSeconds", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1048240M4.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=1048240, getMonths=0, getSeconds=4, getValues=[0, 0, 0, 0...#252#207451729", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Period", "minusDays", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Period", "withHours", "int", "1440"}, {"org.joda.time.Period", "minusDays", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Period", "withHours", "int", "1440"}, {"org.joda.time.Period", "minusDays", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, -2147483648, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Period", "withHours", "int", "1491"}, {"org.joda.time.Period", "minusDays", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-2147483648, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, ...#257#1061391795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "withHours", "int", "-1428"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toStandardMinutes", ""}, {"org.joda.time.Period", "withHours", "int", "-1432"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "1000", "604800001", "3"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "1"}, {"org.joda.time.Period", "normalizedStandard", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H1000M604800001.003S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=3, getMinutes=1000, getMonths=1440...#322#2139272386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "1000", "604800001", "-125"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "1"}, {"org.joda.time.Period", "normalizedStandard", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H1000M604800000.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=1000, getMonths=1...#328#-926570688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1001"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "28"}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}, 1), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT605404800S {getSeconds=605404800, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1044"}, false, 0, new String[][]{{"org.joda.time.Period", "minusWeeks", "int", "4163"}}, 1), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT631411200S {getSeconds=631411200, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1044"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}, 1), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT631411200S {getSeconds=631411200, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1073740780"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}, 1), new String[][]{{"toStandardHours", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"988"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}, 1), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT597542400S {getSeconds=597542400, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"604799"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P604799Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[604799, 0, 0, 0, 0, 0, 0...#242#-865941164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"25"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P25Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[25, 0, 0, 0, 0, 0, 0, 0], ge...#230#1764537902", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-25"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-25Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-25, 0, 0, 0, 0, 0, 0, 0], ...#233#-2057024079", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"61"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P61Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[61, 0, 0, 0, 0, 0, 0, 0], ge...#230#967287222", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"52"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P52Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[52, 0, 0, 0, 0, 0, 0, 0], ge...#230#-2054625580", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-55"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-55Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-55, 0, 0, 0, 0, 0, 0, 0], ...#233#-116921862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"524233"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P524233Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[524233, 0, 0, 0, 0, 0, 0...#242#1694105718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-524233"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-524233Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-524233, 0, 0, 0, 0, 0,...#245#-1910167415", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-524233"}, false, 7, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Period", "getMinutes", ""}, {"org.joda.time.Period", "getYears", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"605848474"}, false, 8, new String[][]{{"org.joda.time.Period", "getHours", ""}, {"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P605848474YT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValue...#285#1219527800", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"604800"}, false, 0, new String[][]{{"org.joda.time.Period", "toString", ""}, {"org.joda.time.Period", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<sample:7>"}, {"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}}, 1), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"10079", "3600", "-1998", "4163", "-2147483648", "60001", "10080", "47"}, false, 0, new String[][]{{"org.joda.time.Period", "size", ""}, {"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P10079Y3600M-1998W4163DT-2147483648H60001M10080.047S {getDays=4163, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=47, getMinutes=60001, ...#342#-862876716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"10079", "3600", "-1998", "4163", "86400001", "60001", "10080", "47"}, false, 0, new String[][]{{"org.joda.time.Period", "size", ""}, {"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P10079Y3600M-1998W4163DT86400001H60001M10080.047S {getDays=4163, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=86400001, getMillis=47, getMinutes=60001, getMon...#333#-1706276693", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"10079", "2147483647", "-1998", "4163", "86400001", "60001", "10080", "47"}, false, 0, new String[][]{{"org.joda.time.Period", "size", ""}, {"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P10079Y2147483647M-1998W4163DT86400001H60001M10080.047S {getDays=4163, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=86400001, getMillis=47, getMinutes=60001, ...#351#870897378", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483648, ...#257#737703281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT255H256M999.998S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=255, getMillis=-2, getMinutes=256, getMonths=0, getSeconds=1000, getValues=[0, 0, ...#258#38327280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, ...#257#1061391795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "toPeriod", ""}, {"org.joda.time.Period", "indexOf", "org.joda.time.DurationFieldType", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "withHours", "int", "86399"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "withHours", "int", "86399"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-805", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "withHours", "int", "-86399"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Period", "withHours", "int", "-171806"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Period", "withHours", "int", "-171806"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-520244"}, false, 5, new String[][]{}, 3), new String[][]{{"toStandardHours", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"2098643"}, false, 12, new String[][]{}, 3), new String[][]{{"toStandardHours", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<sample:4>"}, {"org.joda.time.Period", "normalizedStandard", ""}, {"org.joda.time.Period", "minusHours", "int", "24"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}, {"org.joda.time.Period", "normalizedStandard", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}, {"org.joda.time.Period", "normalizedStandard", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}, {"org.joda.time.Period", "normalizedStandard", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"plusYears", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647Y-306783378W-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[21474...#288#13982207", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"plusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4Y-306783378W-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, -3067833...#261#1476286417", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"plusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, 0, 0, 0, 0, 0, 1...#234#-1908726223", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"plusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, 0, 0, 0, 0, 0, 0], getW...#227#-1853538523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "normalizedStandard", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"plusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-178956966Y-8M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-8, getSeconds=0, getValues=[-178956966, -8, ...#259#-1509755823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"536870873"}, true, 0, null, 2), new String[][]{{"negated", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-536870873Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-536870873, 0, 0, 0,...#254#-795494973", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-536870873"}, true, 0, null, 2), new String[][]{{"negated", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P536870873Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[536870873, 0, 0, 0, 0...#251#1664024688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-536870855"}, true, 0, null, 2), new String[][]{{"negated", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P536870855Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[536870855, 0, 0, 0, 0...#251#80545188", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Minutes", actual.getClass().getName());
  assertEquals("PT0M {getMinutes=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<null>"}}, 2), new String[][]{{"toStandardSeconds", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "toString", "org.joda.time.format.PeriodFormatter", "<sample:5>"}, {"org.joda.time.Period", "minusMinutes", "int", "-10"}}, 2), new String[][]{{"toStandardSeconds", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "70"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "6"}, {"org.joda.time.Period", "getPeriodType", ""}}, 1), new String[][]{{"setPeriod", "long", "1"}, {"addMillis", "int", "3"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "6"}, {"org.joda.time.Period", "getPeriodType", ""}}, 1), new String[][]{{"setPeriod", "long", "1"}, {"addMillis", "int", "3"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "6"}, {"org.joda.time.Period", "getPeriodType", ""}}, 1), new String[][]{{"setPeriod", "long", "1"}, {"addMillis", "int", "3"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483648, ...#257#737703281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "6"}, {"org.joda.time.Period", "getPeriodType", ""}}, 1), new String[][]{{"setPeriod", "long", "1"}, {"addMillis", "int", "3"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT255H256M999.998S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=255, getMillis=-2, getMinutes=256, getMonths=0, getSeconds=1000, getValues=[0, 0, ...#258#38327280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "6"}, {"org.joda.time.Period", "getPeriodType", ""}}, 1), new String[][]{{"setPeriod", "long", "1"}, {"addMillis", "int", "3"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Period", "minusDays", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "minusDays", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "minusDays", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "minusDays", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-292277024, -7, -2, -2, -8, -12, -55, -805]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Period", "minusDays", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Period", "minusDays", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Period", "minusDays", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, -2147483648, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValues", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Period", "minusDays", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "1000", "604800001", "-125"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "1"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H1000M604800000.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=1000, getMonths=1...#328#-926570688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "1000", "1209600002", "-125"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "1"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H1000M1209600001.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=1000, getMonths=...#331#119299247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "1000", "1209600002", "-125"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "0"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H1000M1209600001.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=1000, getMonths=...#331#119299247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1440", "-1", "86400", "1001", "999", "1209600002", "-125"}, false, 0, new String[][]{{"org.joda.time.Period", "minusYears", "int", "0"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1440M-1W86400DT1001H999M1209600001.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=999, getMonths=14...#328#-614209749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1504", "-1", "86400", "1001", "999", "1209600002", "-125"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1504M-1W86400DT1001H999M1209600001.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1001, getMillis=-125, getMinutes=999, getMonths=15...#328#-2123754590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"86401", "1504", "-1", "86400", "950", "999", "3599999", "-125"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P86401Y1504M-1W86400DT950H999M3599998.875S {getDays=86400, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=950, getMillis=-125, getMinutes=999, getMonths=1504, g...#316#1148556147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "multipliedBy", new String[]{"int"}, new String[]{"86400"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "multipliedBy", new String[]{"int"}, new String[]{"86400"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}, {"org.joda.time.Period", "withYears", "int", "10081"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "multipliedBy", new String[]{"int"}, new String[]{"-67022464"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardWeeks", ""}}), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1209600002"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "59"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1209600002W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 1209600002, 0,...#254#-1284354021", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1209600002"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "59"}}), new String[][]{{"toStandardHours", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"604801"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "59"}}), new String[][]{{"toStandardHours", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Hours", actual.getClass().getName());
  assertEquals("PT101606568H {getHours=101606568, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1209600002"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "59"}, {"org.joda.time.Period", "minusWeeks", "int", "60"}}), new String[][]{{"toStandardHours", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1001"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "28"}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT605404800S {getSeconds=605404800, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"988"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}), new String[][]{{"toStandardHours", "", "5"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT597542400S {getSeconds=597542400, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1976"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}), new String[][]{{"toStandardHours", "", "7"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT1195084800S {getSeconds=1195084800, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"1914"}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardDays", ""}, {"org.joda.time.Period", "minusWeeks", "int", "4163"}}), new String[][]{{"toStandardHours", "", "7"}, {"toStandardSeconds", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT1157587200S {getSeconds=1157587200, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "minusMonths", "int", "168"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Period", "minusMonths", "int", "192"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "minusMonths", "int", "192"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"86399"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86399M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=86399, getSeconds=0, getValues=[0, 86399, 0, 0, 0, 0,...#239#606510720", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"1102207"}, false, 0, new String[][]{{"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1102207M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=1102207, getSeconds=0, getValues=[0, 1102207, 0, 0,...#245#-1952508738", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"-43199"}, false, 0, new String[][]{{"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-43199M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-43199, getSeconds=0, getValues=[0, -43199, 0, 0, 0,...#242#-246447202", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"-43197"}, false, 0, new String[][]{{"org.joda.time.Period", "toString", ""}, {"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-43197M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-43197, getSeconds=0, getValues=[0, -43197, 0, 0, 0,...#242#315659228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"604800"}, false, 0, new String[][]{{"org.joda.time.Period", "toString", ""}, {"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P604800M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=604800, getSeconds=0, getValues=[0, 604800, 0, 0, 0,...#242#876897687", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withMonths", new String[]{"int"}, new String[]{"604800"}, false, 0, new String[][]{{"org.joda.time.Period", "toString", ""}, {"org.joda.time.Period", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "10081"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.Period", "withMinutes", "int", "10081"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Standard", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Standard", String.valueOf(actual));
  assertEquals("receiver state after the call", "P3DT0.001S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 1...#234#-770722931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.Period", "withMonths", "int", "23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMonths", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "plusSeconds", "int", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0.001S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "60"}, false, 2, new String[][]{{"org.joda.time.Period", "plusMinutes", "int", "86400001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P60DT0.001S {getDays=60, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 60, 0, 0, 0...#237#828393854", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "60"}, false, 3, new String[][]{{"org.joda.time.Period", "plusMinutes", "int", "86400001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W60DT-8H-12M-55.805S {getDays=60, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#716050553", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "60"}, false, 12, new String[][]{{"org.joda.time.Period", "plusMinutes", "int", "69622273"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648M60D {getDays=60, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -2...#262#125680939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "120"}, false, 13, new String[][]{{"org.joda.time.Period", "plusMinutes", "int", "69622247"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P120DT0.001S {getDays=120, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 120, 0, 0...#240#-400328823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "120"}, false, 12, new String[][]{{"org.joda.time.Period", "plusMinutes", "int", "69622247"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648M120D {getDays=120, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, ...#265#-212599920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "120"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"1044"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1044S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=1044, getValues=[0, 0, 0, 0, 0, 0, 1044...#237#611762180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"1021"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1021S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=1021, getValues=[0, 0, 0, 0, 0, 0, 1021...#237#-124087355", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"169"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT169S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=169, getValues=[0, 0, 0, 0, 0, 0, 169, 0...#234#-1967401261", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"169"}, true), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT169S {getMillis=169000, getStandardDays=0, getStandardHours=0, getStandardMinutes=2, getStandardSeconds=169}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"338"}, true), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT338S {getMillis=338000, getStandardDays=0, getStandardHours=0, getStandardMinutes=5, getStandardSeconds=338}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "seconds", new String[]{"int"}, new String[]{"-338"}, true), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-338S {getMillis=-338000, getStandardDays=0, getStandardHours=0, getStandardMinutes=-5, getStandardSeconds=-338}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "withHours", "int", "86399"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Period", "getMinutes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMillis", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.Period", "toStandardHours", ""}, {"org.joda.time.Period", "getMinutes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"86401"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86401YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[86401, 0, 0, 0, 0,...#246#608809710", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"86350"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86350YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[86350, 0, 0, 0, 0,...#246#589410453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-86401"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-86401YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-86401, 0, 0, 0, ...#249#-908323875", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-86421"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-86421YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-86421, 0, 0, 0, ...#249#130334043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"86421"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P86421YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[86421, 0, 0, 0, 0,...#246#-523315792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"43210"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P43210YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[43210, 0, 0, 0, 0,...#246#638385395", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"167"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P167YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[167, 0, 0, 0, 0, 0, ...#240#-1342673037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"6"}, false), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P6YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[6, 0, 0, 0, 0, 0, 0, 1...#234#-1922575313", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-6"}, false, 1, new String[][]{}), new String[][]{{"minusMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-6YT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-6, 0, 0, 0, 0, 0, 0,...#237#123565244", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}), new String[][]{{"toStandardHours", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}, {"org.joda.time.Period", "plusWeeks", "int", "168"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P3Y3M3W3DT3H3M3.003S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=3, getMinutes=3, getMonths=3, getSeconds=3, getValues=[3, 3, 3, 3, ...#244#774833637", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}, {"org.joda.time.Period", "plusWeeks", "int", "168"}}), new String[][]{{"minusMonths", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P3Y-2147483644M3W3DT3H3M3.003S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=3, getMinutes=3, getMonths=-2147483644, getSeconds=3, get...#274#1052130280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}, {"org.joda.time.Period", "plusWeeks", "int", "168"}}), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}, {"org.joda.time.Period", "plusWeeks", "int", "168"}}), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1428"}, {"org.joda.time.Period", "plusWeeks", "int", "84"}}), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusWeeks", "int", "84"}}), new String[][]{{"getHours", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusWeeks", "int", "84"}}), new String[][]{{"getHours", "", "0"}, {"plusYears", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647Y-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues...#286#-1957451941", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Period", "plusWeeks", "int", "84"}}), new String[][]{{"getHours", "", "0"}, {"plusYears", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647Y1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2147483647, 0, 0, ...#256#-48200010", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "normalizedStandard", ""}, {"org.joda.time.Period", "minusHours", "int", "24"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<sample:4>"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}, {"org.joda.time.Period", "normalizedStandard", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"1044"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1044Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[1044, 0, 0, 0, 0, 0, 0, 0]...#236#1325291858", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"994"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P994Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[994, 0, 0, 0, 0, 0, 0, 0], ...#233#-544515195", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"1002"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1002Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[1002, 0, 0, 0, 0, 0, 0, 0]...#236#1989052240", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"4125"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4125Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4125, 0, 0, 0, 0, 0, 0, 0]...#236#-962922639", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"266269"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P266269Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[266269, 0, 0, 0, 0, 0, 0...#242#1590401838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"266333"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P266333Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[266333, 0, 0, 0, 0, 0, 0...#242#705925584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"169"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P169Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[169, 0, 0, 0, 0, 0, 0, 0], ...#233#-1492999515", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"-169"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-169Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-169, 0, 0, 0, 0, 0, 0, 0]...#236#956513482", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"-2147483645"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483645H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483645, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#1403414463", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusHours", new String[]{"int"}, new String[]{"20158"}, false, 0, new String[][]{{"org.joda.time.Period", "minusDays", "int", "2098643"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT20158H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=20158, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 20158, 0...#240#1514564834", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"167"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.167S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=167, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1...#236#1147620127", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"423"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.423S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=423, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 4...#236#-2147421950", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"59"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.059S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=59, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 59...#234#-2075287059", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:8>"}, false, 4, new String[][]{{"org.joda.time.Period", "plus", "org.joda.time.ReadablePeriod", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Period", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1, 0, 0, 0, 0], g...#230#969649960", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "years", new String[]{"int"}, new String[]{"2147483647"}, true), new String[][]{{"negated", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483647, 0, 0, ...#257#444366294", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusMillis", new String[]{"int"}, new String[]{"10081"}, false, 0, new String[][]{{"org.joda.time.Period", "minusWeeks", "int", "3600"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT10.081S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=10081, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0...#241#-1283463839", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "70"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "70"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Period", "minusMinutes", "int", "70"}}), new String[][]{{"toStandardSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValues", new String[]{"int[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"toStandardSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT-2147460S {getSeconds=-2147460, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"toStandardSeconds", "", "5"}, {"toStandardHours", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Hours", actual.getClass().getName());
  assertEquals("PT-596H {getHours=-596, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"toStandardSeconds", "", "5"}, {"toStandardHours", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Hours", actual.getClass().getName());
  assertEquals("PT0H {getHours=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getWeeks", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.Period", "plusDays", "int", "999"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483648, ...#257#737703281", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusWeeks", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.joda.time.Period", "get", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.Period", "plusDays", "int", "999"}, {"org.joda.time.Period", "withMinutes", "int", "12"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1073741824W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -1073741824, ...#257#-1586102667", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.joda.time.Period", "minusDays", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Period", "toStandardSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.008S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=8, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 8],...#232#-1676777627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toMutablePeriod", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"setPeriod", "long", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"1000"}, false, 0, new String[][]{{"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1000M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-1000, getSeconds=0, getValues=[0, -1000, 0, 0, 0, 0,...#239#136810953", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"500"}, false, 0, new String[][]{{"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-500M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-500, getSeconds=0, getValues=[0, -500, 0, 0, 0, 0, 0,...#236#-826090943", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"1000"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1048466"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:9>"}}), new String[][]{{"plusWeeks", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1000M-1W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-1000, getSeconds=0, getValues=[0, -1000, -1, 0, 0...#244#186804092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1048466"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:9>"}}), new String[][]{{"plusWeeks", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-3M-1W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-3, getSeconds=0, getValues=[0, -3, -1, 0, 0, 0, 0, 0...#235#2132180006", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"25"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1048466"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:9>"}}), new String[][]{{"plusWeeks", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-25M-1W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-25, getSeconds=0, getValues=[0, -25, -1, 0, 0, 0, 0...#238#-2046117344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"25"}, false, 0, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1048466"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:9>"}}), new String[][]{{"plusWeeks", "int", "1"}, {"withHours", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-25M-1WT3H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=0, getMinutes=0, getMonths=-25, getSeconds=0, getValues=[0, -25, -1, 0, 3, 0...#241#1121035005", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "minusMonths", new String[]{"int"}, new String[]{"25"}, false, 10, new String[][]{{"org.joda.time.Period", "withHours", "int", "-1048466"}, {"org.joda.time.Period", "withPeriodType", "org.joda.time.PeriodType", "<sample:9>"}}), new String[][]{{"plusWeeks", "int", "1"}, {"withHours", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-25M-1WT3H-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=0, getMinutes=-2147483648, getMonths=-25, getSeconds=0, getValue...#273#1695756976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2147483648, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-959014525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.joda.time.Period", "withSeconds", "int", "-1428"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "parse", new String[]{"java.lang.String", "org.joda.time.format.PeriodFormatter"}, new String[]{"/a/b", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "millis", new String[]{"int"}, new String[]{"604800001"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT604800.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=604800001, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0,...#253#852864428", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "withYears", new String[]{"int"}, new String[]{"-33"}, false, 0, new String[][]{{"org.joda.time.Period", "plusHours", "int", "86399999"}}), new String[][]{{"toDurationFrom", "org.joda.time.ReadableInstant", "4"}, {"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-289272H {getDays=0, getFieldTypes=[hours], getHours=-289272, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-289272], getWeeks=0, getYears=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "toStandardMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Minutes", actual.getClass().getName());
  assertEquals("PT0M {getMinutes=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getValue", new String[]{"int"}, new String[]{"86400"}, false, 0, new String[][]{{"org.joda.time.Period", "normalizedStandard", ""}, {"org.joda.time.Period", "minusDays", "int", "86399999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getSeconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 11, new String[][]{{"org.joda.time.Period", "withFields", "org.joda.time.ReadablePeriod", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[days, days, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-2147483648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[0, 0, 0,...#258#1089706849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[days, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483648, ...#257#737703281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getFieldTypes", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, getFieldTypes=[years, days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0], getWeeks=0, getYears=0, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-292277024Y-7M-2W-2DT-8H-12M-55.805S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-8, getMillis=-805, getMinutes=-12, getMonths=-7, getSeconds=-...#301#-2110753980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483648H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#258#-558259818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Period", "getDays", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT-2147483.648S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-2147483648, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0...#259#1479276783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Period", "getDays", ""}, {"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "-524233", "3601", "169", "-1", "86400", "86400", "2147483647", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86400", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-524233Y3601M169W-1DT86400H86400M2147483647.061S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=86400, getMillis=61, getMinutes=86400, getMonths=3...#333#-40354176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "getHours", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Period", "setPeriod", "int,int,int,int,int,int,int,int", "-524233", "3601", "169", "-1", "86400", "999", "2147483647", "61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86400", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-524233Y3601M169W-1DT86400H999M2147483647.061S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=86400, getMillis=61, getMinutes=999, getMonths=3601,...#327#-1152541975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMillis", "int", "605848474"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Period", "minusMillis", "int", "1211696948"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "plusSeconds", new String[]{"int"}, new String[]{"10081"}, false, 0, new String[][]{{"org.joda.time.Period", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<null>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT10081S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=10081, getValues=[0, 0, 0, 0, 0, 0, 10...#240#-408712783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Period", "org.joda.time.Period", "setValue", new String[]{"int", "int"}, new String[]{"86399999", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
