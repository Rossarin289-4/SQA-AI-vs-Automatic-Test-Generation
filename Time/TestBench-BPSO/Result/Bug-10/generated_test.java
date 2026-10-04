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
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2147479551"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147479551D {getDays=2147479551, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>", "<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>", "<sample:10>", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<null>", "126143475710"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:5>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:10>", "<sample:10>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"2147483642"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>", "<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:0>", "-9223372036586340352"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"1040385"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1040385D {getDays=1040385, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"2147479551"}, false, 3, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "612828338176"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:13>", "<sample:10>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "2147483647"}}, 1), new String[][]{{"isSupported", "org.joda.time.Chronology", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"isSupported", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "2147483647"}, {"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P10D {getDays=10, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:6>", "<sample:1>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-58796", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:2>", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:1>"}}, 1), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "2"}, {"withHours", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "compareTo", "org.joda.time.base.BaseSingleFieldPeriod", "<sample:4>"}}, 3), new String[][]{{"minusHours", "int", "7"}, {"plusDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2DT-4H {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-4, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, -4, 0, 0, 0]...#233#1512098233", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:3>"}}, 3), new String[][]{{"negated", "", "3"}, {"getHours", "", "3"}, {"withSeconds", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT4S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=4, getValues=[0, 0, 0, 0, 0, 0, 4, 0], get...#228#-1737291565", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:9>", "-6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-518400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "0"}}, 2), new String[][]{{"getField", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "4611686018427387892"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "44"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1963636", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"2147481599"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:6>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"1073741821"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1073741821D {getDays=1073741821, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:3>", "-4611686018427387904"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1073741821"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1073741821D {getDays=-1073741821, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false), new String[][]{{"getFieldType", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:4>", "4611686018427387904"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P20D {getDays=20, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "2147483595"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-1073741824D {getDays=-1073741824, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#832743134", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1073741824D {getDays=-1073741824, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"68"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P68D {getDays=68, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483625"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483625D {getDays=-2147483625, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-26"}, false, 6, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "toPeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-26D {getDays=-26, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:6>", "<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-58796", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "compareTo", new String[]{"org.joda.time.base.BaseSingleFieldPeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<null>", "<sample:6>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>", "<sample:8>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}, {"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "33554442"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("905982455", String.valueOf(actual));
  assertEquals("receiver state after the call", "P33554442D {getDays=33554442, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>", "<sample:5>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "-1073741828"}, {"org.joda.time.base.BaseSingleFieldPeriod", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741828", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1073741828D {getDays=-1073741828, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false), new String[][]{{"withField", "org.joda.time.DurationFieldType,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "standardPeriodIn", new String[]{"org.joda.time.ReadablePeriod", "long"}, new String[]{"<sample:6>", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadablePartial", "org.joda.time.ReadablePartial", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58795", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "get", "org.joda.time.DurationFieldType", "<sample:12>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1D {getDays=-1, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:5>", "<sample:10>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getValue", "int", "52"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "setValue", "int", "2147483647"}, {"org.joda.time.base.BaseSingleFieldPeriod", "hashCode", ""}}, 3), new String[][]{{"isSupported", "org.joda.time.DurationFieldType", "5"}, {"indexOf", "org.joda.time.DurationFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "between", new String[]{"org.joda.time.ReadableInstant", "org.joda.time.ReadableInstant", "org.joda.time.DurationFieldType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.Days", "setValue", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BaseSingleFieldPeriod", "getFieldType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483647D {getDays=-2147483647, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
