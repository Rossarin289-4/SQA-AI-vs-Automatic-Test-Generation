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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"214", "<sample:3>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"FastDateFormat[", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"getVariant", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"6w0", "<empty>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "1783588"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "7"}, {"appendTo", "java.lang.StringBuffer,int", "3"}, {"appendTo", "java.lang.StringBuffer,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("03/10/26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"SITLE", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd HH:mm] {getMaxLengthEstimate=14, getPattern=y-MM-dd HH:mm, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2", "0"}, true), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:6>"}, true, 0, null, 2), new String[][]{{"clone", "", "2"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "1"}, {"append", "int", "6"}, {"insert", "int,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"4", "59999"}, false), new String[][]{{"estimateLength", "", "7"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "4"}, {"appendTo", "java.lang.StringBuffer,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"+1", "<sample:2>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=50, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "0", "<null>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"format", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69 Dec 31 16:00:00 Pacific Standard Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Gello, orld", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"Z3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[Z3] {getMaxLengthEstimate=6, getPattern=Z3, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"Z{[2,2]", "<null>", "<sample:2>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-0800{[2,2] {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"ZZ{\\2-22]", "<sample:2>", "<sample:0>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample+00:00{\\2-22] {length=19}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1e10", "<sample:4>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-2147483648", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=12, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<sample:3>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE HH:mm:ss zzzz] {getMaxLengthEstimate=45, getPattern=y MMMM d, EEEE HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\ta b", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x12345789", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x12X315789", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2147483648", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2147483648", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{".21p47483648", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Unkknown class9 ", "<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-2147483643"}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-2147483648", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-21[4483648", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"13:P0:45", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2147483647", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"[", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "59937", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60001", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.1234567890123456", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"getDisplayName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59999", "<sample:2>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "false", "-2147483647", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "false", "2147483647", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\t", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\t] {getMaxLengthEstimate=1, getPattern=\t, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"60000", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[60000] {getMaxLengthEstimate=5, getPattern=60000, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:1>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.1234567890123456", "<sample:5>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.1234567890123456 {length=18}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"[1,2]", "<sample:5>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("[1,2] {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"[1,2]", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[[1,2]] {getMaxLengthEstimate=5, getPattern=[1,2], getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\\1,2]", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\\1,2]] {getMaxLengthEstimate=5, getPattern=\\1,2], getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\\1,D2]", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\\1,D2]] {getMaxLengthEstimate=9, getPattern=\\1,D2], getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}, 2), new String[][]{{"observesDaylightTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"30003", "<sample:1>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss z] {getMaxLengthEstimate=13, getPattern=HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-1073741817"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "0x123456789", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-36028797018933968", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "123456789012345678901234567890", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600001", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE HH:mm:ss zzzz] {getMaxLengthEstimate=45, getPattern=y MMMM d, EEEE HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "2048", "<sample:3>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<sample:5>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE HH:mm:ss zzzz] {getMaxLengthEstimate=45, getPattern=y MMMM d, EEEE HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<sample:3>", "<sample:0>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("94 Aug 17, Sun 07:12:55 Greenwich Mean Time {length=43}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<sample:3>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a zzzz] {getMaxLengthEstimate=66, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE HH:mm:ss zzzz] {getMaxLengthEstimate=66, getPattern=y MMMM d, EEEE HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<null>", "<sample:0>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample03 May 5, Tue 06:07:08 Pacific Standard Time {length=50}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<null>", "<sample:0>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("94 Aug 16, Sat 23:12:55 Pacific Standard Time {length=45}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "0", "<null>", "<sample:0>"}, true), new String[][]{{"format", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2147483648", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2147483648] {getMaxLengthEstimate=10, getPattern=2147483648, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1L", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\u00e9", "<sample:2>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\u00e9", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\u00e9] {getMaxLengthEstimate=1, getPattern=\u00e9, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\t", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\t] {getMaxLengthEstimate=1, getPattern=\t, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\010` a", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\010` a] {getMaxLengthEstimate=5, getPattern=\010` a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\007` a", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\007` a] {getMaxLengthEstimate=5, getPattern=\007` a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"PT1H", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"60000", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-2147483648", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"010", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'10", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"01B", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0C", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0C", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0C3", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0C3", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"8C3", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2147483648", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2147483648", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-21p47483648", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3", "60000"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"3600000"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-2147483643"}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a,b,c", "<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.5d", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.5d] {getMaxLengthEstimate=7, getPattern=1.5d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.5d", "<sample:3>"}, true), new String[][]{{"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.123456789W01234567", "<sample:3>"}, true), new String[][]{{"getPattern", "", "1"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.123456789W022345671.5d", "<empty>"}, true), new String[][]{{"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789W022345671.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2147483647", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"[", "<sample:6>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60001", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"2020-01-01", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "-1", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59999", "<sample:6>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "false", "60000", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<null>", "false", "2147483647", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"-1", "3", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\t", "<empty>"}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"{\"a\":1}", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getOffsetsByWall", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getOffsetsByWall", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getOffsetsByWall", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getOffsetsByWall", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}), new String[][]{{"observesDaylightTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "-2147483648", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"10", "-2147483647", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"60001", "<empty>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm] {getMaxLengthEstimate=5, getPattern=HH:mm, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss z] {getMaxLengthEstimate=13, getPattern=HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample15:59:59 PST {length=18}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:2>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample15:59:59 {length=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"-1", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "60000", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "i", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\t", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}), new String[][]{{"getDisplayName", "java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:0>"}}), new String[][]{{"getDisplayName", "java.util.Locale", "4"}, {"getOffsetsByStandard", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "123456789012345678901234567890", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "http://example.com/a?b=c", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "3599999"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-f1", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11E,6\u00e9", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<empty>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "36000001.1234567", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"123456789012345678901234567890", "<sample:5>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("123456789012345678901234567890 {length=30}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1234567890123545678901234567890", "<sample:5>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1234567890123545678901234567890 {length=31}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\u00e9", "<sample:1>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\u00e9 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5.", "<sample:1>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5. {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5.[1,2]", "<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5.[1,2] {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5.[1,2]", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[5.[1,2]] {getMaxLengthEstimate=7, getPattern=5.[1,2], getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("fr_FR {getCountry=FR, getDisplayCountry=France, getDisplayLanguage=French, getDisplayName=French (France), getDisplayScript=, getDisplayVariant=, getISO3Country=FRA, getISO3Language=fra, getLanguage=f...#248#-1593483848", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2147483647", "4", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"12:30:45", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'2:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2889777", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912505", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"-2147483648", "10", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2147483647", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600000", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<null>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"getVariant", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"getVariant", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample (a)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getLocale", "", "5"}, {"getDisplayName", "java.util.Locale", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:1>"}, true, 0, null, 3), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("13:06:00 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"2147483647", "60000", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"59999", "59999"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:1>"}, true), new String[][]{{"format", "java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Oct 3, 26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "true", "2147483647", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2889777", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912505", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d] {getMaxLengthEstimate=11, getPattern=y MMMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d] {getMaxLengthEstimate=11, getPattern=y MMMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getTimeZoneOverridesCalendar", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getTimeZoneOverridesCalendar", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y MMMM d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getTimeZoneOverridesCalendar", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y MMM d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"12", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"60001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"120002"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
