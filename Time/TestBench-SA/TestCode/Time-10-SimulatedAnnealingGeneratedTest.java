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
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:5>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", "int", "1"}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}}), new String[][]{{"getField", "org.joda.time.Chronology", "5"}, {"getDifferenceAsLong", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<null>", "<sample:1>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<null>", "9386874258973"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:4>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>", "<sample:12>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:12>", "-4611683681965178880"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-658564", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-89478485D {getDays=-89478485, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -894...#251#-251185310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-1491308D {getDays=-1491308, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -14913...#248#1289282743", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}, 3), new String[][]{{"getField", "org.joda.time.Chronology", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}}, 3), new String[][]{{"getField", "org.joda.time.Chronology", "5"}, {"getDifferenceAsLong", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", "int", "-22"}}, 1), new String[][]{{"getField", "org.joda.time.Chronology", "5"}, {"getDifferenceAsLong", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}}, 3), new String[][]{{"withYearsRemoved", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1"}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:6>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 1), new String[][]{{"isSupported", "org.joda.time.Chronology", "2"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}}, 3), new String[][]{{"getMinutes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}}, 3), new String[][]{{"getMinutes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<s:bJ>"}}, 3), new String[][]{{"normalizedStandard", "org.joda.time.PeriodType", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1529161537", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-89478485D {getDays=-89478485, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -894...#251#-251185310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1491308D {getDays=-1491308, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -14913...#248#1289282743", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-89478485", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483631"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483631D {getDays=-2147483631, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-1073741815"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1073741815D {getDays=-1073741815, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-536870907"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-536870907D {getDays=-536870907, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"536870907"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P536870907D {getDays=536870907, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"getField", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879060722", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"0"}, false, 8, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "2147483630"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-59"}, false, 8, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-59D {getDays=-59, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2097157"}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2097157D {getDays=2097157, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:1>", "576465445740552974"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "0"}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}), new String[][]{{"getField", "org.joda.time.Chronology", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}), new String[][]{{"getField", "org.joda.time.Chronology", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"1073741823"}, false, 8, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}}), new String[][]{{"withYearsRemoved", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}}), new String[][]{{"withMonthsRemoved", "", "5"}, {"withWeeksRemoved", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "10"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}}), new String[][]{{"withMonthsRemoved", "", "5"}, {"withWeeksRemoved", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P10D {getDays=10, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1"}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:5>", "4693437129486"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-691200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879060722", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "0"}, {"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483647D {getDays=-2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"isSupported", "org.joda.time.Chronology", "2"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}}), new String[][]{{"getMinutes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40252795", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-658564", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "2147483613"}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "P10D {getDays=10, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "10"}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "P10D {getDays=10, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "10"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "1073741823"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "-1"}}), new String[][]{{"withDaysRemoved", "", "5"}, {"indexOf", "org.joda.time.DurationFieldType", "5"}, {"getFieldType", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12548", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"7"}, false, 3, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P7D {getDays=7, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483647D {getDays=-2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1"}}), new String[][]{{"withMillisRemoved", "", "5"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Days", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1"}}, 2), new String[][]{{"withMillisRemoved", "", "5"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Days", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "1"}}, 2), new String[][]{{"withMillisRemoved", "", "5"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Days", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:1>", "<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58795", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P5D {getDays=5, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:9>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P5D {getDays=5, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}, 3), new String[][]{{"getField", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:6>", "<sample:3>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "-24"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1382400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 1), new String[][]{{"withMinutesRemoved", "", "6"}, {"withMinutesRemoved", "", "2"}, {"withSecondsRemoved", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:1>"}}, 3), new String[][]{{"getPeriodType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:0>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"-32775"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "0"}}, 1), new String[][]{{"withHoursRemoved", "", "1"}, {"withMillisRemoved", "", "6"}, {"withMinutesRemoved", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"withHoursRemoved", "", "1"}, {"withMillisRemoved", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<null>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "-4096"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-21093", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879060722", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40252795", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:7>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getPeriodType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "1073741823"}, {"org.joda.time.base.BaseSingleFieldPeriod", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1073741823D {getDays=1073741823, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 10...#254#-437863420", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1073741823D {getDays=1073741823, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-89478485", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491308", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-24855", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2145386496"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2145386496", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2145386496D {getDays=-2145386496, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-89478485D {getDays=-89478485, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -894...#251#-251185310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 1), new String[][]{{"minusYears", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y-1491308D {getDays=-1491308, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-1, 0, 0, -1...#253#-944183084", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 1), new String[][]{{"minusYears", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y-24855D {getDays=-24855, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-1, 0, 0, -24855...#247#-218677538", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-24855D {getDays=-24855, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-89478485D {getDays=-89478485, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -894...#251#-251185310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", "int", "2147483647"}}, 3), new String[][]{{"minusWeeks", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647W-89478485D {getDays=-89478485, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0...#283#-1223141714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:7>", "-18773748517946"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-89478485D {getDays=-89478485, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1491308D {getDays=-1491308, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
