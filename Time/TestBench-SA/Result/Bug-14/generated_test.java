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
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "-2147483648", "<sample:0>", "-2147483648"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", "long", "8258715387168731"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-4611686027017322496", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686039977322496", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686568191590257", "-9016476384100240"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "1073741316", "<sample:1>", "2147483647"}, false, 12, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:0>", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8258715387168737", "-8258715387168737"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "9223372036854775807", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"4611686018427387903", "2305843284095795128"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-481036337042", "-2074"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:6>", "-2147483647", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("876830969", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-131506677304429892", "-8445383172685720"}, false, 10, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-962072641316", "-9223372036854775808"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "-1073479679", "<sample:5>", "-2147483648"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50694502", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"9223372036854775784", "4611686568191590257"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:7>", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "4611686568183201773"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-412316860306", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "-481036337042"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-65753338618660514", "412316860306"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715386906592"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213033486656060306", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8258715387176940", "-2147483872"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:3>", "-2147482657", "<sample:0>", "-2147482616"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-1037", "25524630128889732"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5655595837879976940", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-42", "-2147483907"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:3>", "-1073741328", "<sample:0>", "-2147482616"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "0"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-1037", "25524630128889732"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5647337214508800042", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"9223372036854775807", "1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372034262775809", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "57"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372023894775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372029078775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "10"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-0.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-8258715387168737"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372029078775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-4611686018427387904", "5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-0.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-8258715387168737"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686039163387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"4611686018427387904", "5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-0.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-8258715387168737"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611685997691387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-4611686018427387904", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686031387387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-4611686027017322496", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00.0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686039977322496", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0x123456789", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-9223372036854775808", "-1.["}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "-2147482632", "<null>", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"8293899759257547", "1.12345678"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "-9223372036854775808"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "10", "<sample:0>", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-271712945914245156", "1p/1"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "-9223372036854775808"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "0", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2592000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2629746000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2551440384", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-8258717534652368", "]1-25H", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "-8258715387168737", "2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-501"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"140737488354827"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "4611686018427387903"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737219200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"140737488354792"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:0>", "10", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737219200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"281474976709584"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:0>", "10", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("281475907200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-71776119061218352"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:0>", "10", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-71776119513600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-1119745905569816648"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168769"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-2239491811139633296"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168769"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2592000000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-9223372036854775808", "1xFFFFhFFFF", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-240518168521", "-9223372036854775808"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"9223372036853727231", "1xFFFFhF", "<sample:0>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-481036337042", "-9223372036854775808"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"9223372036854775807", "1xFFFGhF", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-481036337042", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"9223372036854775807", "1", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-481036337042", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372018537975807", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "79", "-481036337042"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:3>", "1073741823", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-481036337042"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-483062400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:5>", "<sample:4>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "79", "-481036337041"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"add", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "10", "<null>", "10"}}, 2), new String[][]{{"add", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "-2147483648", "<null>", "2"}, false, 8, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-1", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:3>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "9223372036854775807", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "-2147483648", "<sample:1>", "2"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-1", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "9223372036854775807", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "-2147483648", "<sample:2>", "2"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-1", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "9223372036854775807", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "-2147483648", "<sample:1>", "57"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "4611686018427387903", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "1073741824", "<sample:1>"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "0", "-2147482589"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-2147483648", "<sample:1>"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "0", "-2147482589"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "-58", "<null>", "-2147483648"}, false, 12, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "71", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "-2106", "<empty>", "-134217727"}, false, 12, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "71", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "0", "<empty>", "-2147482632"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686568191590257", "-9016476384100240"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "4", "1.1234567", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-4146949879102437", "72132103063466032"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:1>", "-1", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8260914410424287", "-1"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8260488631224287", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8257615875540959", "79"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8257423894740959", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8257615875540959", "-4129357693584388"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:5>", "10", "<sample:0>", "<null>", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"2"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "4611686568183201773"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1900800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"34359738370"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "4611684369159946221"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2132538370", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"34359738404"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "4611684369159946221"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2132538404", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"34359705636"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "4611684369159946221"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2132505636", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:7>", "2", "<empty>", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2629800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-481036205850", "-67108867"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-197", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-515395944218", "-67108867"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-212", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-1030791888436", "-67108867"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-424", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-2061583776872", "-1140850691"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "2147483647"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:5>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-849", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-4123167553744", "-76"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "2147483647"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-2147483648", "<null>", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1698", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-2254119096025009"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "4611686018426863615"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "1", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2253377491200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-48"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "4611686018426863615"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "53", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("518400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "2147483647", "<sample:3>", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<sample:1>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:5>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:2>", "1", "<sample:1>", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "-1073741824", "<empty>", "2147418110"}, false, 12, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387169752", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "1", "<sample:0>", "-1"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", "long", "-8258715387168736"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"2", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"4", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "4", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147482624", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482624", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147482632", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482632", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147482632", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "2147483647", "<null>", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482632", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147482632", "<sample:2>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "2147483647", "<null>", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482632", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:3>", "<null>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:3>", "<null>"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"9223372036854775807", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372029078775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"9223372036854775807", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372034262775809", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"4611686027017322496", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686047753322496", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"2", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("20736000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"4", "-5"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("20736000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"4", "50"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5183999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"48", "50"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5183999952", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"48", "25"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00..0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2591999952", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"48", "25"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:0>", "2", "<sample:2>", "-00.l0", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "8258715387168737"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2678400048", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-8258715387168735"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "-9223372036854775808"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String", "0", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<null>", "0", "<sample:2>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"8258715387168731", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8258717979168731", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"8258715387168731", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5204774358952031269", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"8188346642991067", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5204844727609808933", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"4", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213033074252799996", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-8258715387168736"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:6>", "2", "<empty>", "-2147482632"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2536031264", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-8258715387168739"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2536031261", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-8258713239685091"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2091514909", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"8258713239685091"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1710085091", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"16517426479370182"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2037770182", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"16517426479370241"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168731"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2037770241", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"16517426479370241"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168684"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2469770241", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"16517425405628417"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168684"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1396028417", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"16517425405628399"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "8258715387168684"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1396028399", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", "java.lang.String,java.util.Locale", "0", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", "long", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}), new String[][]{{"getField", "org.joda.time.Chronology", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.12345678", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"1", "-1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-9223372036854775808", "-1.["}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "-2147482632", "<null>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "2", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "1", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2592000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-8258715387168736", "1.25", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036137600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372035584751616", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018976000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"4611686568183201773"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686568652800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"4611686568183201773"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686568048000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"4611686568183201773"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "-9223372036854775808", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686568048000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"2305843284091600886"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "-9223372036854775808", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843282857600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<empty>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "-9223372036854775808", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"140737488354792"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:4>", "10", "<sample:1>", "-8258715387168736", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "4611686018427387903"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737219200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-8258715387168737", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-4398046511100"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-2196875771902"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-4393751543804"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:1>", "2", "<sample:1>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"8293899759257547"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:1>", "2", "<sample:1>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-8293899759257547"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"559872952784908324"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "-8258715387168737"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"79", "0xFFFFFFFF", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "4", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:7>", "1", "<empty>", "1.5", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "2147483647", "<sample:2>", "0"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "8258715387168731", "-0.0", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "4", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:0>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "int,java.util.Locale", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"4", "8258715387168731"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "2", "<sample:3>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "4611686568183201773", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3402137", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"35", "8260914410424283"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "2", "<sample:3>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "4611686568183201773", "-2147483648"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3403043", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"35", "4130457205212109"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "2", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "4611686568183201773", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1701521", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "-2147482632", "<empty>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "-2147483648", "<null>", "2"}, false, 8, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-1", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:3>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "9223372036854775807", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<null>", "10", "<null>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "-2147483604", "<sample:0>", "57"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "-1", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "42", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "42", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-19", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-67108883", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-67108883", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "-2147483648", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "-1073741824", "<sample:3>"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "1073741824", "<sample:1>"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "0", "-2147482589"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686568183201773", "79"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686760164001773", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"3458765063576354797", "79"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3458765255470754797", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"3440750665066872813", "79"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3440750857047672813", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"3458765063576354746", "4"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3458765073944354746", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"1729382531788177373", "4"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1729382540082577373", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"3458765063576354746", "4"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3458765074117154746", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"3458765063307919290", "4"}, false, 13, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3458765073675919290", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"2305843558701072314", "4"}, false, 13, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387168737", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843569069072314", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-481036337042", "-8258715387168736"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3401939", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "-1", "<null>", "-2147483648"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"4611686568183201773"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "1", "<sample:2>", "-2147482632"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "0", "<sample:2>", "2147482632"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10, 292272984, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-8258715387168736"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258715331200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-4129357693584432"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4129358832000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-9384615428229089"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9384614380800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-16517431042772930"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517431267200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-33034862085545860"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-33034863312000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-33034862085545860"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-33034860460800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-66069706991222536"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-66069706060800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686568183201773", "-481036337042"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686568191590257", "8258715387168731"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "int"}, new String[]{"9223372036854775807", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "2", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"long"}, new String[]{"4611686568191590257"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"-8258715387168736"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8257615875540959", "-1"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:5>", "10", "<sample:0>", "<null>", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8257618467540959", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "2305843284095795128", "-8258715387168736"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8258715387168737", "9223372036853727231"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"79"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"4", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2629746000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2551440384", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2629800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, false, 10, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"0", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-481036337042", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-197", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-481036336978", "1073741858"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-198", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-240518168489", "1073741922"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-99", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "2147483647", "<empty>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-4123167553744", "-76"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "1", "2147483647"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-2147483645", "<null>", "-23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1698", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-4123167553744", "76"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", "long,long", "0", "9223372036854775800"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "2", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1567", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"8258715387168715", "83"}, false, 11, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", "long,long", "0", "9223372036854775800"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3402137", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8258715387168737"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258715331200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"10510515200853985"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10510517059200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"10510515200853985"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10510516195200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"10510515200853985"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10510517404800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "1", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8258715387168735"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258650790400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-9016476384100240"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9016438665600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-9016476384100240"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "-9016476384100240"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9016476422400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036362351616", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-8258715387168735"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "-1073741824", "<sample:0>", "1073709027"}, false, 13, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:5>", "1073741316", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258715387169752", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"9223372036854775807", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "0", "<sample:2>", "1073741316"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "0", "<sample:2>", "2147482632"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10, 12, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-8258715387168735", "010"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258702427168735", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-8258715387168735", "010"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "int,java.util.Locale", "2", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258702427168735", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-16517430774337470", "010"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517422998337470", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"16517430774337470", "0010"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16517451510337470", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"16517430774337470", "0010"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-1", "<empty>", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16517451510337470", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-144115188075855951", "+1"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "0", "<sample:2>", "-2147482632"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-1", "<empty>", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-144114892328655951", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-144115188075856207", "+1"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "0", "<sample:2>", "-2147482632"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-1", "<empty>", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-144114892328656207", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-144115188075856207", "+1"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "0", "<sample:2>", "-2147482632"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-1", "<empty>", "2"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-144115203627856207", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "0", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<null>", "2147483647", "<sample:3>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "-17179869184", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-8258715387168737"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258717923200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-8258715387168735"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "-481036337042"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-8258715386120085"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "-481036337042"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"4611686568191590257"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686568048000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036137600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372035446400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "-2147482632", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482632", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "-1073741316", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1073741316", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:3>", "-1073741332", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1073741332", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "-536870666", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-536870666", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "536870666", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("536870666", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:8>", "-268435333", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-268435333", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "2147483647", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:4>", "2147483647", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-2147482632", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "8293899759257547"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482632", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-2147482636", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "8293899759257547"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482636", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-2147482636", "<sample:3>"}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147482636", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "2147482636", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147482636", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:1>", "-2147483648", "<sample:6>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "4611686568191590257"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"4"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:6>", "2", "<sample:2>", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:0>", "2147483647", "<sample:0>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"288230376151711721", "-1"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "17592186044412"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("288230373559711721", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-436849163854938141", "-1"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-436849166446938141", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-436844765808427037", "2"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-436844760624427037", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8258715387168735", "2"}, false, 10, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long", "-50"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258710203168735", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "1", "TITLE", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:6>", "0", "<null>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"2305843009213693898", "4"}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843019581693898", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"2305843013508661194", "0"}, false, 16, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String", "4", "d"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843013508661194", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"4611686027017322388", "4"}, false, 16, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "2305843009213693954"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686037558122388", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"9223372036853727190", "79"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "39"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223371844961424426", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-481036337042"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "2", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-480470400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8258715387168735"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "2", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258715331200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"8258715387168735"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "2", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8258716713600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"8259814898796524"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-1", "-1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8259816067200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"16519629797593056"}, false, 9, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "17", "-1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16519630924800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"4611686568191590257"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8258715387168737", "-8258715387168737"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "9223372036854775807", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "0", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8258715387176929", "-2314101724600862689"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "9223372036853727231", "1L", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "0", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("949880825", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"8258715387168725", "2314101724600862689"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "9223372036853727231", "1L", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "0", "1"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-949880824", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
