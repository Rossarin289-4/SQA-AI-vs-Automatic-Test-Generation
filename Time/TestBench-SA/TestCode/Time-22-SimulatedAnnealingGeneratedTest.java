package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:4>", "0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<i:-1>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-1", "2147483647"}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"1", "7"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "0"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P7M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=7, getSeconds=0, getValues=[0, 7, 0, 0, 0, 0, 0, 0], getW...#227#-851574114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"-65534", "174"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483632", "-2147483136"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}), new String[][]{{"minusMonths", "int", "4"}, {"withField", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M5DT0.001S {getDays=5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=...#268#-915599261", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:4>", "0"}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<empty>", "<sample:7>", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483648"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<null>", "0"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "getPeriodType", ""}, {"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.base.BasePeriod", "setValues", "int[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<empty>", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0.100S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.100S {getDays=0, getFieldTypes=[hours, minutes, seconds, millis], getHours=0, getMillis=100, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 100], getWeeks=0, getYears=0, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:3>", "10"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<null>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<null>", "2147483647"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}, 1), new String[][]{{"getValue", "int", "6"}, {"setMinutes", "int", "6"}, {"add", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1000Y-2M-10W7DT3H3M5.006S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=6, getMinutes=3, getMonths=-2, getSeconds=5, getValues=[1000,...#262#-265532203", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P1000Y-2M-10W2DT3H4M5.006S {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=6, getMinutes=4, getMonths=-2, getSeconds=5, getValues=[1000,...#262#945439193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:7>", "-52"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "0", "2147483647", "-65534", "0", "-2147483602", "-28", "8417", "-1"}}, 3), new String[][]{{"add", "org.joda.time.ReadableInterval", "6"}, {"add", "org.joda.time.ReadableInterval", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2147483647M-65534WT-2147483602H-28M8417S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483602, getMillis=0, getMinutes=-28, getMonths=2147483...#323#10467907", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647M-65534WT-2147483602H-28M8416.999S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483602, getMillis=-1, getMinutes=-28, getMonths=21...#329#-761548771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "getValues", ""}}, 3), new String[][]{{"isEqual", "org.joda.time.ReadableDuration", "7"}, {"toPeriodFrom", "org.joda.time.ReadableInstant", "3"}, {"withPeriodType", "org.joda.time.PeriodType", "1"}, {"minusHours", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"10"}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "isSupported", "org.joda.time.DurationFieldType", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "10", "-2147483648"}, {"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "-39"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-39Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-39, 0, 0, 0, 0, 0, 0, 0], ...#233#-2019614744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"10", "-39"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"10", "-39"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"10", "7"}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"10", "7"}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:8>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:11>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:2>", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P8D {getDays=8, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 8, 0, 0, 0, 0], getW...#227#165835412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 4, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 3, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 6, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}, {"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 6, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P6DT0.001S {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 1...#234#-99952848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[6, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1), new String[][]{{"indexOf", "org.joda.time.DurationFieldType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:5>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "97"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P98D {getDays=98, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 98, 0, 0, 0, 0], g...#230#-1164203709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "97"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P97D {getDays=97, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 97, 0, 0, 0, 0], g...#230#348631394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "75"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P75D {getDays=75, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 75, 0, 0, 0, 0], g...#230#-1614169822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"toPeriod", "org.joda.time.PeriodType", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsException, get...#390#-2092734013", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"toPeriod", "org.joda.time.PeriodType", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=0, getFieldTypes=[days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0], getWeeks=0, getYears=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 11, new String[][]{}, 2), new String[][]{{"toPeriod", "org.joda.time.PeriodType", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=0, getFieldTypes=[days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0], getWeeks=0, getYears=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}}, 1), new String[][]{{"toStandardMinutes", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<empty>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "7"}, {"org.joda.time.base.BasePeriod", "getValue", "int", "536870912"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483578", "2147483647"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}, 2), new String[][]{{"minusMonths", "int", "4"}, {"withField", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M5DT0.001S {getDays=5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=[...#266#1390489627", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-1073741789", "2147483605"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:6>"}}, 2), new String[][]{{"minusMonths", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:5>"}}, 2), new String[][]{{"minusMonths", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647MT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=[0,...#264#193416778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"minusMonths", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483647, getSeconds=0...#289#-174921946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-2147483648"}}, 2), new String[][]{{"toMutablePeriod", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-2147483648"}}, 2), new String[][]{{"toMutablePeriod", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-2147483648"}}, 2), new String[][]{{"toMutablePeriod", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y-1M-1W-1DT-1H-1M-1.001S {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-1, getMillis=-1, getMinutes=-1, getMonths=-1, getSeconds=-1, getValues=...#267#93567172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"withDays", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[2147483647, 0, 0, 0, 0], getWeeks=...#222#-2010576482", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=2147483647, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 21...#254#-204947792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBound...#417#-2045961357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoun...#419#179309299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1, 0, 0, 0, 0], g...#230#969649960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "toString", "org.joda.time.format.PeriodFormatter", "<sample:1>"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<null>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:3>", "0"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<i:-1>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-1", "2147483647"}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:3>", "0"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "1", "2147483647"}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:3>", "0"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "1", "2147483647"}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "0"}}), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "0"}}), new String[][]{{"setPeriod", "org.joda.time.ReadablePeriod", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483648"}}), new String[][]{{"add", "long,org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.005S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=5, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 5],...#232#-1423820542", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483648"}}), new String[][]{{"add", "long,org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.004S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=4, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 4], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483648"}}), new String[][]{{"add", "long,org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648DT0.004S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=4, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0,...#264#-2134914441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"add", "long,org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.002S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=2, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 2],...#232#-1170863457", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "long,org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"-32767", "174"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:3>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "-65298"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-65298Y-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-6...#274#2060615842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"0", "65298"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P65298Y-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[652...#271#1139353621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"1", "7"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P7M-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=7, getSeconds=0, getValues=[0, 7, 0...#259#2044048840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValue", new String[]{"int", "int"}, new String[]{"1", "6"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P6M-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=6, getSeconds=0, getValues=[0, 6, 0...#259#-1891115575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-39"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "getFieldTypes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsE...#431#-1993404680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#417#1898981201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setValues", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "getFieldTypes", ""}, {"org.joda.time.base.BasePeriod", "equals", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExce...#428#1417079672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "174"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P174D {getDays=174, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 174, 0, 0, 0, 0]...#233#128150526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValues", ""}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:6>", "174"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648DT0.001S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0,...#264#1302905940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTime] {getName=DayTime, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-2147483648, 0, 0, 0, 0], getWee...#225#1609367914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[0] {getName=0, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1529161537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}}), new String[][]{{"withDaysRemoved", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:0>", "-2147483648"}}), new String[][]{{"setPeriod", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:0>", "-2147483648"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:4>"}}), new String[][]{{"setMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2147483647M0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=2147483647, getMonths=0, getSeconds=0, getValues=[0, 0...#261#-469703125", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<null>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<null>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:1>", "<null>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3DT0.001S {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 1...#234#-770722931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toMutablePeriod", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.joda.time.DurationFieldType,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "174"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P175D {getDays=175, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 175, 0, 0, 0, 0]...#233#824241597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "161"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P162D {getDays=162, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 162, 0, 0, 0, 0]...#233#-1368018337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "97"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P98D {getDays=98, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 98, 0, 0, 0, 0], g...#230#-1164203709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "75"}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P75D {getDays=75, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 75, 0, 0, 0, 0], g...#230#-1614169822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "37"}, false, 5, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "2147483647"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getPeriodType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTime] {getName=DayTime, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false), new String[][]{{"toPeriod", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false), new String[][]{{"toPeriod", "org.joda.time.PeriodType", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsException, get...#390#-2092734013", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-39"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-4194343"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-4194343D {getDays=-4194343, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -41943...#248#932040305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1D {getDays=-1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -1, 0, 0, 0, 0], g...#230#969649960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "-2"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2D {getDays=-2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -2, 0, 0, 0, 0], g...#230#-543185143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "-2"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "2"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[sample] {getName=sample, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[DayTime] {getName=DayTime, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("months {getName=months}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "-65534"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "174", "174", "-65534", "-39", "-2147483648", "7", "174", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P174Y174M-65534W-65534DT-2147483648H7M174S {getDays=-65534, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=-2147483648, getMillis=0, getMinutes=7, getMonths=174...#318#999894118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0.001S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT0S", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-2147483648D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P3D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1D", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#-568615827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<null>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-65534"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-65534DT0.001S {getDays=-65534, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -65...#249#1535179854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-65534DT0.001S {getDays=-65534, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -65...#249#1535179854", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-65534"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-65534D {getDays=-65534, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-65534, 0, 0, 0, 0], getWeeks=0, getYears=...#210#-951150756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-65534D {getDays=-65534, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-65534, 0, 0, 0, 0], getWeeks=0, getYears=...#210#-951150756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "toString", ""}}), new String[][]{{"plusYears", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "0"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}), new String[][]{{"plusYears", "int", "7"}, {"getDays", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<null>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "7"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<null>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483632", "3"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.base.BasePeriod", "setValues", "int[]", "<null>"}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483632", "3"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483632", "3"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}), new String[][]{{"minusMonths", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483632", "-2147483136"}, {"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<null>"}}), new String[][]{{"minusMonths", "int", "4"}, {"withField", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483647M5D {getDays=5, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=-2147483647, getSeconds=0, getValues=[0, -214...#259#1710885131", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[] {getName=, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:1>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P2147483647D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBound...#417#-2045961357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"getDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"getDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:2>"}}, 3), new String[][]{{"getDays", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:2>"}}, 3), new String[][]{{"getDays", "", "1"}, {"toStandardWeeks", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:3>"}, {"org.joda.time.base.BasePeriod", "getFieldTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:7>"}, {"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P292276967Y10M2W1DT16H0.010S {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=16, getMillis=10, getMinutes=0, getMonths=10, getSeconds=0, getValues=[2...#274#492921522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:7>"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:10>"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:10>"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:10>"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:10>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:5>", "7"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P7D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#1684431225", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toPeriod", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:10>"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:5>", "7"}}, 1), new String[][]{{"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483641, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483641D {getDays=-2147483641, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1052093049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, -2147483648, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:4>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toString", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:4>", "46"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P00000000T000000.001", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 4, 0, 0, 0, 0], getW...#227#1029643928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<empty>", "<sample:3>", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<empty>", "<null>", "3"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "<sample:1>", "1"}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "10", "256", "10", "174", "1", "-39", "-2147483648", "5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<null>", "<sample:0>", "-21"}, false, 11, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "10", "256", "10", "174", "2147483647", "-39", "-2147483648", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"1", "-1", "-2147483648", "7", "1", "7", "7", "174"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:4>", "-2147483632"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1Y-1M-2147483648W7DT1H7M7.174S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=174, getMinutes=7, getMonths=-1, getSeconds=7, getValues...#281#-1447692998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"-2147483632", "-1", "-2147483648", "7", "1", "7", "7", "174"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-2147483632"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483632Y-1M-2147483648W7DT1H7M7.174S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=174, getMinutes=7, getMonths=-1, getSeconds=7,...#311#1685430966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"0", "-1", "-2147483648", "7", "1", "7", "7", "174"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-2147483632"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-1M-2147483648W7DT1H7M7.174S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=174, getMinutes=7, getMonths=-1, getSeconds=7, getValues=[...#279#356111762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"0", "3", "-2147483648", "7", "1", "7", "7", "174"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3M-2147483648W7DT1H7M7.174S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=174, getMinutes=7, getMonths=3, getSeconds=7, getValues=[0,...#276#-1147003193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setPeriod", new String[]{"int", "int", "int", "int", "int", "int", "int", "int"}, new String[]{"0", "3", "-2147483648", "7", "1", "7", "7", "-2147483648"}, false, 1, new String[][]{{"org.joda.time.base.BasePeriod", "addField", "org.joda.time.DurationFieldType,int", "<sample:1>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P3M-2147483648W7DT1H7M-2147476.648S {getDays=7, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=1, getMillis=-2147483648, getMinutes=7, getMonths=3, getSeconds=7...#299#168727052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483632"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toPeriod", ""}, {"org.joda.time.base.BasePeriod", "getValue", "int", "-2147483648"}, {"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P2D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#1404765379", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriod", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.joda.time.base.BasePeriod", "toMutablePeriod", ""}, {"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:1>", "<sample:2>", "1"}, {"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<sample:0>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false), new String[][]{{"getStandardMinutes", "", "1"}, {"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "4"}, {"getValues", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}), new String[][]{{"getStandardMinutes", "", "1"}, {"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "4"}, {"getValues", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-2147483648, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationFrom", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"getStandardMinutes", "", "1"}, {"toPeriodTo", "org.joda.time.ReadableInstant,org.joda.time.PeriodType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoun...#419#179309299", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "addFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:2>", "<sample:4>", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[days, days, days]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:4>", "-1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "<sample:7>", "-1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("millis {getName=millis}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "getFieldType", new String[]{"int"}, new String[]{"-39"}, false, 2, new String[][]{{"org.joda.time.base.BasePeriod", "hashCode", ""}, {"org.joda.time.base.BasePeriod", "get", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "indexOf", "org.joda.time.DurationFieldType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "-1", "-39", "-65534", "-65534", "174", "-2147483632", "0", "1"}, {"org.joda.time.base.BasePeriod", "setFieldInto", "int[],org.joda.time.DurationFieldType,int", "<sample:0>", "<sample:7>", "-2147483632"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "toDurationTo", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "int,int,int,int,int,int,int,int", "-1", "-78", "-65534", "-65534", "174", "-2147483632", "0", "2147483647"}}), new String[][]{{"isEqual", "org.joda.time.ReadableDuration", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483632"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483632D {getDays=-2147483632, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1902984215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:5>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "mergePeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<sample:1>"}, false, 6, new String[][]{{"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:0>", "-2147483648"}, {"org.joda.time.base.BasePeriod", "toDurationFrom", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.base.BasePeriod", "toPeriod", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{{"org.joda.time.base.BasePeriod", "toString", ""}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:2>", "-2147483632"}, {"org.joda.time.base.BasePeriod", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483632D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOut...#428#-1283411211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "get", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsEx...#408#1964894123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "isSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "getValue", "int", "1073741823"}, {"org.joda.time.base.BasePeriod", "checkPeriodType", "org.joda.time.PeriodType", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "getValue", "int", "7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P4D {getDays=4, getFieldTypes=[days, hours, minutes, seconds, millis], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[4, 0, 0, 0, 0], getWeeks=0, getYears=0, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:7>"}}), new String[][]{{"withMonthsRemoved", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"org.joda.time.base.BasePeriod", "addPeriod", "org.joda.time.ReadablePeriod", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[0] {getName=0, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "174"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "6"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P6D {getDays=6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 6, 0, 0, 0, 0], getW...#227#597739670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addField", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "-6"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "P-6D {getDays=-6, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, -6, 0, 0, 0, 0], g...#230#1995409037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "setFieldInto", new String[]{"int[]", "org.joda.time.DurationFieldType", "int"}, new String[]{"<empty>", "<sample:2>", "-1"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "mergePeriodInto", "int[],org.joda.time.ReadablePeriod", "<empty>", "<sample:2>"}, {"org.joda.time.base.BasePeriod", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "addPeriodInto", new String[]{"int[]", "org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Days] {getName=Days, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[] {getName=, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "3"}}, 2), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "3"}}, 2), new String[][]{{"size", "", "3"}, {"isSupported", "org.joda.time.DurationFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "checkPeriodType", new String[]{"org.joda.time.PeriodType"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.joda.time.base.BasePeriod", "toDurationTo", "org.joda.time.ReadableInstant", "<sample:0>"}, {"org.joda.time.base.BasePeriod", "size", ""}, {"org.joda.time.base.BasePeriod", "setValue", "int,int", "-2147483648", "3"}}, 2), new String[][]{{"size", "", "3"}, {"isSupported", "org.joda.time.DurationFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.joda.time.base.BasePeriod", "setPeriod", "org.joda.time.ReadablePeriod", "<sample:4>"}, {"org.joda.time.base.BasePeriod", "setField", "org.joda.time.DurationFieldType,int", "<sample:6>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "P-2147483648D {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#257#1139882930", SearchInputFactory_scaffolding.receiverState());
 }
}
