package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "-4"}}), new String[][]{{"withMonths", "int", "4"}, {"toStandardMinutes", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:1>", "-2147483647"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:12>", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:10>", "0"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"-19", "262144", "78", "10", "-2", "-19", "524309", "35"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:4>", "0"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BasePeriod", "getFieldType", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "5", "-4"}, {"org.joda.time.base.BasePeriod", "getValues", ""}}), new String[][]{{"setMillis", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-4M0.002S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=2, getMinutes=-4, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -4, 0...#237#-250709615", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT-4M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-4, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -4, 0, 0], ...#231#1918163950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1), new String[][]{{"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "6"}, {"toMutablePeriod", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExce...#410#-98056873", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "0"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}}), new String[][]{{"add", "org.joda.time.ReadableInterval", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[0] {getName=0, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}}, 3), new String[][]{{"toPeriodFrom", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "6"}, {"toStandardSeconds", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "16", "262144", "2147483647", "26", "2147352574", "2147483644", "-70"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "2147483647"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647Y16M262144W2147483647DT26H2147352574M2147483643.930S {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=26, getMillis=-70, getMinute...#370#-407263442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:4>", "42"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s: >"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:5>", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "0", "-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-10Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-10, 0, 0, 0, 0, 0, 0, 0], ...#233#-868368739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"2147483622"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:10>", "-1"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:9>", "-1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<null>", "<sample:3>", "-67108640"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 2), new String[][]{{"setHours", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648DT2147483647H {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2147483647, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0,...#287#1612735292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1DT0.001S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 1...#234#213752779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#-1340668431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:6>", "-19"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:1>", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutO...#426#-2029618571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:13>", "1"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"minusMinutes", "int", "5"}, {"withWeeks", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648WT-2M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-2, getMonths=0, getSeconds=0, getValues=[0, 0, -2147483...#263#73714541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:1>", "-16389"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "35"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}}, 3), new String[][]{{"minusHours", "int", "5"}, {"withYears", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "39", "-2", "2147483647", "5", "-1", "4194266", "2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:10>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647Y39M-2W2147483647DT5H-1M6341749.647S {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=5, getMillis=2147483647, getMinutes=-1, getM...#343#1462132788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:1>", "-5"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<null>", "<sample:5>", "78"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:12>"}}, 2), new String[][]{{"withMillisRemoved", "", "4"}, {"withYearsRemoved", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[StandardNoMillisNoYears] {getName=StandardNoMillisNoYears, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"toStandardWeeks", "", "1"}, {"getPeriodType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Weeks] {getName=Weeks, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<null>", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "<sample:1>", "-2"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"-1", "201326592", "2147483640", "-1073741823", "70", "-2", "-1", "-67108864"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1Y201326592M2147483640W-1073741823DT70H-2M-67109.864S {getDays=-1073741823, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=70, getMillis=-67108864, getMinutes...#356#-1569515252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "2147483647"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutO...#426#-2029618571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<null>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "262144"}}, 2), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:0>"}}, 3), new String[][]{{"getValue", "int", "2"}, {"getYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "-2"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsE...#410#-1796338987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-10", "2"}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:3>", "-19"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "262144"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P262144D {getDays=262144, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 262144, 0,...#242#-1319499929", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 2), new String[][]{{"toStandardDays", "", "4"}, {"getFieldType", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:9>", "536870893"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P536870893D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOf...#424#211282429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P4Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, 0, 0, 0, 0, 0, 0], getW...#227#-1853538523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"8227", "8", "5", "37", "56", "-8", "16777211", "27"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P8227Y8M5W37DT56H-8M16777211.027S {getDays=37, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=56, getMillis=27, getMinutes=-8, getMonths=8, getSeconds=16777211,...#285#1338434904", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2), new String[][]{{"toStandardDays", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:4>", "16777215"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:0>", "2147483646"}}, 3), new String[][]{{"getValues", "", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"4096", "2"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:7>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2), new String[][]{{"withDurationAdded", "long,int", "1"}, {"withMillis", "long", "3"}, {"withDurationAdded", "long,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT2147483.648S {getMillis=2147483648, getStandardDays=24, getStandardHours=596, getStandardMinutes=35791, getStandardSeconds=2147483}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}}, 2), new String[][]{{"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:9>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:6>", "140"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:2>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"1073741805", "55", "-50", "10", "-134213637", "2", "2147483647", "2147483647"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1073741805Y55M-50W10DT-134213637H2M-2145336166.647S {getDays=10, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-134213637, getMillis=2147483647, getMinutes=2,...#354#-254826690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<s:kiy>"}}, 1), new String[][]{{"toPeriod", "org.joda.time.PeriodType,org.joda.time.Chronology", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"262144", "-4"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "2147483647", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-5"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<s:bx>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-5D {getDays=-5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -5, 0, 0, 0, 0], g...#230#-786723156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:5>", "-2147483648"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "-67108864"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<s:>"}, {"org.joda.time.base.BasePeriod", "getPeriodType", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:10>", "-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<empty>", "<sample:2>", "0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-67108907", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "5", "0", "1", "2147483647", "2", "-19", "-2", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P5Y1W1DT2H-19M-1.999S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=2, getMillis=1, getMinutes=-19, getMonths=0, getSeconds=-2, getValues=[5, 0, 1,...#251#1194799811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "2147483631"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483631D {getDays=2147483631, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-1023871445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0.001S {getMillis=1, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "1", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483648, getSeconds=0, getValues=[0, -21474...#257#842115003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"37"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:3>", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "-2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -2, 0, 0, 0, 0], g...#230#-543185143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P10D {getDays=10, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 10, 0, 0, 0, 0], g...#230#-425473981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 4, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<empty>", "<null>", "2147483615"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, 0, 0], getWee...#225#1609367914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExce...#428#1417079672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:2>"}}), new String[][]{{"toStandardDays", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P0D {getDays=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTime] {getName=DayTime, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false), new String[][]{{"toDurationTo", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:1>", "268435437"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0.001S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("weeks {getName=weeks}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:7>", "2147483647"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<null>", "67108864"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "16777214"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P16777214DT0.001S {getDays=16777214, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#255#1830848665", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P16777214DT0.001S {getDays=16777214, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0,...#255#1830848665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"-2147483648", "-2147483648", "2147483647", "2147483647", "-2147483648", "-2147483648", "10", "4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648Y-2147483648M2147483647W2147483647DT-2147483648H-2147483648M10.004S {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648,...#400#-1033341948", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:2>", "2147483647"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "20"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P20D {getDays=20, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 20, 0, 0, 0, 0], g...#230#-78721918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}, {"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:2>", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P9D {getDays=9, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 9, 0, 0, 0, 0], getW...#227#2097366931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "-42", "-10", "-33554454", "-24", "32769", "2147483622", "469761986"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647Y-42M-10W-33554454DT-24H32769M-2147013913.986S {getDays=-33554454, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-24, getMillis=469761986, getMinute...#363#-188561306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:6>", "-23"}}), new String[][]{{"withHoursRemoved", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTimeNoHours] {getName=DayTimeNoHours, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-23D {getDays=-23, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-23, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5...#201#662384214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "<sample:5>", "1048574"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<null>", "<sample:7>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"-32", "-67108864", "-10", "-2", "8", "1", "-20", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-32Y-67108864M-10W-2DT8H1M-2147503.648S {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=8, getMillis=-2147483648, getMinutes=1, getMonths=-67108864...#314#-980168051", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "-2147483625"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483625D {getDays=-2147483625, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1551824691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"withYearsRemoved", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[StandardNoYears] {getName=StandardNoYears, size=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:5>", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1529161537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:7>", "-1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -1, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1, 0, 0, 0, 0], g...#230#969649960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"1073741826", "1", "0", "2147483647", "-2147483648", "33554430", "-2147483648", "28"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1073741826Y1M2147483647DT-2147483648H33554430M-2147483647.972S {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=28, g...#371#-665862636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "2147483647"}}), new String[][]{{"getValues", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 2147483647, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 1, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}}), new String[][]{{"getValue", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P00000000T000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"2147483647", "2147483603", "2147483647", "536870916", "0", "2147483647", "20", "4096"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647Y2147483603M2147483647W536870916DT2147483647M24.096S {getDays=536870916, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=4096, getMinutes...#373#-850943838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:3>", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:10>", "1073741878"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false), new String[][]{{"toPeriod", "org.joda.time.PeriodType,org.joda.time.Chronology", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[] {getName=, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "-268435475"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"toIntervalFrom", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Interval", actual.getClass().getName());
  assertEquals("-292274998-02-16T00:00:00.000/-292274998-02-16T00:00:00.000 {containsNow=false, getEndMillis=-9223370245901222000, getStartMillis=-9223370245901222000, isAfterNow=false, isBeforeNow=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "-2147483648", "1073741814", "74", "-1", "268435463", "65537", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:1>"}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}}), new String[][]{{"withSeconds", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P1DT-2147483648S {getDays=1, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=-2147483648, getValues=[1, 0, 0, -2147483648, 0], get...#228#1965429434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[1, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"toStandardSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT0S {getSeconds=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:8>", "-67108864"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:7>", "-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-6D {getDays=-6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -6, 0, 0, 0, 0], g...#230#1995409037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0000-00--2147483648T00:00:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1529161537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}), new String[][]{{"plus", "org.joda.time.ReadableDuration", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0.003S {getMillis=3, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:10>", "134217709"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"withWeeksRemoved", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2147483647, 0, 0, 0, 0], getWeeks=...#222#-2010576482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"minusMonths", "int", "3"}, {"withSeconds", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1MT2147483647.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=-1, getSeconds=2147483647, getValues=[0,...#264#-1807293725", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}}), new String[][]{{"toStandardHours", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Hours", actual.getClass().getName());
  assertEquals("PT0H {getHours=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-58", "-262081"}}), new String[][]{{"isSupported", "org.joda.time.DurationFieldType", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "2147483647", "262201", "-2147483647", "2147483589", "5", "2147483647", "-2147483648", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647Y262201M-2147483647W2147483589DT5H2147483647M-2147483648S {getDays=2147483589, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=5, getMillis=0, getMinu...#382#-274468534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "2147483647"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "getValue", "int", "524288"}}), new String[][]{{"toStandardMinutes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Minutes", actual.getClass().getName());
  assertEquals("PT0M {getMinutes=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<empty>", "<sample:10>"}, {"org.joda.time.base.BasePeriod", "getPeriodType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "getFieldType", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[] {getName=, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:5>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-1", "524309"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "-2147483647"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "35"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483647D {getDays=-2147483647, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483647, 0, 0, 0, 0], getWee...#225#-120163157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}), new String[][]{{"isShorterThan", "org.joda.time.ReadableDuration", "4"}, {"getStandardMinutes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-185542587187200S {getMillis=-185542587187200000, getStandardDays=-2147483648, getStandardHours=-51539607552, getStandardMinutes=-3092376453120, getStandardSeconds=-185542587187200}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "0"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:9>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:5>"}}), new String[][]{{"withField", "org.joda.time.DurationFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P4D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#420788915", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P3D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#-1775011918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:12>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-2147483648, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:8>"}}), new String[][]{{"setPeriod", "long,long,org.joda.time.Chronology", "6"}, {"setPeriod", "long,org.joda.time.Chronology", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.002S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=2, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 2],...#232#-1170863457", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:7>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[1, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"plusWeeks", "int", "5"}, {"withMonths", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P3M2W-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=3, getSeconds=0, getValues=[0, 3,...#261#-1603715667", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:11>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}}), new String[][]{{"withMonthsRemoved", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:10>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:10>"}}), new String[][]{{"toDuration", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-185542587183600S {getMillis=-185542587183600000, getStandardDays=-2147483647, getStandardHours=-51539607551, getStandardMinutes=-3092376453060, getStandardSeconds=-185542587183600}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:3>"}}), new String[][]{{"getValues", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "getPeriodType", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:7>", "-2147483648"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DayTime", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:5>", "60"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:10>"}, {"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<s:\037>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2147483647D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutO...#439#1719984512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:4>", "<sample:0>", "-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P4DT0.001S {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 1...#234#884522862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#417#1898981201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:7>", "2"}}), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "5"}, {"setPeriod", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 1], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#-568615827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"getMillis", "", "6"}, {"compareTo", "org.joda.time.ReadableDuration", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "2", "2", "-24", "-35", "-2", "524309", "4106", "24"}}), new String[][]{{"getFieldTypes", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2Y2M-24W-35DT-2H524309M4106.024S {getDays=-35, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2, getMillis=24, getMinutes=524309, getMonths=2, getSeconds=4106...#285#1708513876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 7, new String[][]{}), new String[][]{{"withMillis", "long", "5"}, {"plus", "org.joda.time.ReadableDuration", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0.001S {getMillis=1, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "1", "2", "2", "-1", "252", "-10", "-2", "55"}}), new String[][]{{"toStandardSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Seconds", actual.getClass().getName());
  assertEquals("PT38839798S {getSeconds=38839798, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1Y2M2W-1DT252H-10M-1.945S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=252, getMillis=55, getMinutes=-10, getMonths=2, getSeconds=-2, getValues=...#264#1787718475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:5>", "-156"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:10>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}}), new String[][]{{"getValue", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "-67108851"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[a] {getName=a, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"1", "2097162"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2097162M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=2097162, getSeconds=0, getValues=[0, 2097162, 0, 0,...#245#-1340428732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "<sample:1>", "-8"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[1, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DayTime", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:10>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:9>", "-5"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, 0, 0], getWee...#225#1609367914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}), new String[][]{{"toIntervalTo", "org.joda.time.ReadableInstant", "0"}, {"toPeriod", "org.joda.time.PeriodType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0000-00-00T00:00:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:4>", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[0] {getName=0, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:5>"}}), new String[][]{{"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "1"}, {"toMutablePeriod", "", "2"}, {"setYears", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"withYearsRemoved", "", "5"}, {"withMinutesRemoved", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[StandardNoYearsNoMinutes] {getName=StandardNoYearsNoMinutes, size=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>", "<sample:4>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "540693"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "2147483647", "-8388613"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P540693Y-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[54...#274#-231203064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[days, days, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toString", ""}}), new String[][]{{"addMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1DT0.001S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 1...#234#213752779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"2", "2"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2W {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 2, 0, 0, 0, 0, 0], getW...#227#-1638141847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldType", "int", "4"}}), new String[][]{{"toPeriodFrom", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "5"}, {"withHours", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<null>", "<sample:6>", "4"}}), new String[][]{{"withDurationAdded", "org.joda.time.ReadableDuration,int", "2"}, {"toPeriodFrom", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsException, get...#390#-2092734013", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:6>", "262144"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT22649241600S {getMillis=22649241600000, getStandardDays=262144, getStandardHours=6291456, getStandardMinutes=377487360, getStandardSeconds=22649241600}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P262144D {getDays=262144, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 262144, 0,...#242#-1319499929", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:6>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT-86400S {getMillis=-86400000, getStandardDays=-1, getStandardHours=-24, getStandardMinutes=-1440, getStandardSeconds=-86400}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1, 0, 0, 0, 0], g...#230#969649960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"3", "-10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-10D {getDays=-10, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -10, 0, 0, 0, 0]...#233#1005381696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}}), new String[][]{{"compareTo", "org.joda.time.ReadableDuration", "1"}, {"getStandardDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-262149"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -262148, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-262148D {getDays=-262148, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -262148,...#245#270078616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:1>", "-2"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[6, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-2147483648D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:7>", "1073741867"}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "-67108864"}}), new String[][]{{"toStandardDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P-67108864D {getDays=-67108864, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-67108864DT0.001S {getDays=-67108864, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, ...#258#-920648731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"3"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 6, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "4"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P4Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, 0, 0, 0, 0, 0, 0], getW...#227#-1853538523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withMillisRemoved", "", "5"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DayTimeNoMillis", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:6>", "<sample:3>", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:2>", "262115"}}), new String[][]{{"toStandardDays", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Days", actual.getClass().getName());
  assertEquals("P262115D {getDays=262115, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P262115D {getDays=262115, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 262115, 0,...#242#-437230453", SearchInputFactory_scaffolding.receiverState());
 }
}
