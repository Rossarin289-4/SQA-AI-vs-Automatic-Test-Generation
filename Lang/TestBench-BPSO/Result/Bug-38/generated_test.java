package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"12:30:E5", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[12:30:E5] {getMaxLengthEstimate=10, getPattern=12:30:E5, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"FassDateFormat[", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:0>"}, true), new String[][]{{"format", "java.util.Calendar", "0"}, {"format", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+0000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<sample:1>", "<sample:3>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "60000", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:3>"}, true), new String[][]{{"format", "long", "6"}, {"parseObject", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"W"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[W] {getMaxLengthEstimate=4, getPattern=W, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"GastDateFormat[", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"29", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"estimateLength", "", "4"}, {"estimateLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a zzzz] {getMaxLengthEstimate=66, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"ZZ22"}, true, 0, null, 3), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}, {"insert", "int,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.0-07:0022 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "2", "<sample:8>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d HH:mm:ss] {getMaxLengthEstimate=20, getPattern=y MMM d HH:mm:ss, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-.0", "<sample:7>"}, true), new String[][]{{"format", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "1"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<empty>", "<sample:9>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}, {"append", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("00:00:00 Greenwich Mean TimeInfinity {length=36}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"0", "0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE HH:mm:ss zzzz] {getMaxLengthEstimate=66, getPattern=y MMMM d, EEEE HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"3", "<sample:0>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar", "0"}, {"format", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Sitle", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"{\"a\"}:1~k", "<empty>"}, true), new String[][]{{"format", "java.util.Calendar", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"PM\"}:1~12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"0", "0"}, true), new String[][]{{"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wednesday, December 31, 69 at 4:00:00 PM Pacific Standard Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<sample:5>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.01.70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getTimeZone", "", "3"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1K", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1K] {getMaxLengthEstimate=5, getPattern=1K, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"w5k", "<sample:4>", "<sample:11>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1524 {length=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "4", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"120000", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483648", "<empty>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"3"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<empty>", "true", "29", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"1799968", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "-2147483648", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"15fUnknown class: "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"{\"a\":1~", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[{\"a\":1~] {getMaxLengthEstimate=12, getPattern={\"a\":1~, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"0", "6", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483648", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"119983", "2147483647", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1800000", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getLocale", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"60000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-1>", "<sample:3>", "<sample:6>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483647", "-1", "<empty>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"nudl", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"011"}, true, 0, null, 2), new String[][]{{"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("011", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600000", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"259", "<sample:5>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2147483647", "120000", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2147483647", "30"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"36000L00"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.4f--1", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-4294967294", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3600001", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-1", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[-1] {getMaxLengthEstimate=2, getPattern=-1, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"120000", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:=>", "<sample:0>", "<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"-3600001", "7199998", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1073741823", "<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d] {getMaxLengthEstimate=11, getPattern=y MMMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"/a0b", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"{\"a\":}1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[{\"a\":}1.25] {getMaxLengthEstimate=15, getPattern={\"a\":}1.25, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:0>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Samstag, 3. Oktober 26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:2>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"59988", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1800000", "<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<null>"}, true, 0, null, 2), new String[][]{{"getTimeZoneOverridesCalendar", "", "2"}, {"format", "java.util.Date", "4"}, {"getPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EEEE, d. MMMM y", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<sample:6>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"-17", "-7200002", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=54, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"+1", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getTimeZoneOverridesCalendar", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"29", "-3599999", "<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=54, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-37", "<sample:2>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2147483647", "29", "<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483648", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600057", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "false", "4", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1800000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"Hello, WorldFastDateFormat[", "<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3599999", "-2147221504", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"120000", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"FastDateFormt[2020-02-30T25:61:61", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372036854775768", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.12345678", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.12345678] {getMaxLengthEstimate=10, getPattern=1.12345678, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"3600000", "3600000", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "36", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"FastDateFormat[", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"/10", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[/10] {getMaxLengthEstimate=3, getPattern=/10, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a b1.25", "<null>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"8", "3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2147483647", "<empty>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<null>", "true", "7199998", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<empty>"}, true), new String[][]{{"format", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("16:00:00 PST", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\n", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\n] {getMaxLengthEstimate=1, getPattern=\n, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"14", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.1234568901234567"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.1234568901234567] {getMaxLengthEstimate=18, getPattern=1.1234568901234567, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"nknown class: "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"3", "3"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d] {getMaxLengthEstimate=11, getPattern=y MMM d, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "true", "33554434", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getID", "", "1"}, {"toZoneId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"3"}, true), new String[][]{{"format", "java.util.Calendar", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a] {getMaxLengthEstimate=13, getPattern=h:mm:ss a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<i:-30>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("03 May 5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[aaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=2, getPattern=aaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"H"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[H] {getMaxLengthEstimate=4, getPattern=H, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"/", "<sample:8>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[/] {getMaxLengthEstimate=1, getPattern=/, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:0>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("August 17, 94 {length=13}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"!", "<empty>"}, true), new String[][]{{"getLocale", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<sample:5>"}, true), new String[][]{{"getTimeZone", "", "0"}, {"isDirty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{".0234567", "<sample:6>"}, true), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{" ", "<sample:2>"}, true), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"123456789012345678:01234567890", "<sample:1>"}, true), new String[][]{{"getPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678:01234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[--1] {getMaxLengthEstimate=3, getPattern=--1, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2L", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d] {getMaxLengthEstimate=11, getPattern=y MMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getOffset", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.d", "<sample:2>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1.5 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"a"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.5d", "<null>"}, true), new String[][]{{"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<empty>"}, true), new String[][]{{"getPattern", "", "0"}, {"getTimeZoneOverridesCalendar", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a b1.25+1", "<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"0.12345678"}, true), new String[][]{{"getLocale", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.123", "<empty>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}, {"append", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.123false {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-2147483648", "<sample:2>"}, true), new String[][]{{"getPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:0>"}, true), new String[][]{{"parseObject", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a", "<sample:1>"}, true), new String[][]{{"getMaxLengthEstimate", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-2147483648", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[-2147483648] {getMaxLengthEstimate=11, getPattern=-2147483648, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{" "}, true), new String[][]{{"format", "java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[6] {getMaxLengthEstimate=1, getPattern=6, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}), new String[][]{{"getDisplayName", "java.util.Locale", "2"}, {"getUnicodeLocaleKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"format", "java.util.Calendar", "1"}, {"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1.1234567890123456", "<sample:3>", "<sample:5>"}, true), new String[][]{{"parseObject", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"setRawOffset", "int", "2"}, {"getDisplayName", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"observesDaylightTime", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.1234567", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.1234567] {getMaxLengthEstimate=9, getPattern=1.1234567, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"2020-01-01", "<sample:3>"}, true), new String[][]{{"getLocale", "", "6"}, {"getExtension", "char", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<null>"}, true), new String[][]{{"getMaxLengthEstimate", "", "5"}, {"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"reverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("emiT dradnatS cificaP MA 00:60:5 {length=32}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<empty>"}, false, 4, new String[][]{}), new String[][]{{"append", "java.lang.CharSequence,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3", "<sample:6>"}, true), new String[][]{{"format", "java.util.Date", "7"}, {"parseObject", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"[[", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[[[] {getMaxLengthEstimate=2, getPattern=[[, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"parseObject", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true), new String[][]{{"getPattern", "", "1"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("26 Oct 3 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<null>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "6"}, {"charAt", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-29", "<sample:2>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:4>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}, {"offsetByCodePoints", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1"}, true), new String[][]{{"getLocale", "", "6"}, {"getExtensionKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"I", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:3>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "0"}, {"substring", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("O", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.12345678", "<sample:2>"}, true, 0, null, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.12345678] {getMaxLengthEstimate=10, getPattern=1.12345678, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"]", "<sample:1>", "<sample:0>"}, true), new String[][]{{"getMaxLengthEstimate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"+2010", "<sample:2>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[+2010] {getMaxLengthEstimate=5, getPattern=+2010, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getDisplayName", "boolean,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.5d", "<sample:3>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.53", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getLastRuleInstance", "", "6"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"60000", "<sample:5>"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "7"}, {"append", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("60000 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2020-/2-01", "<empty>", "<sample:0>"}, true), new String[][]{{"format", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-/2-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a z] {getMaxLengthEstimate=17, getPattern=h:mm:ss a z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"", "<sample:2>", "<sample:4>"}, true), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<sample:2>"}, true), new String[][]{{"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"clone", "", "2"}, {"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<sample:3>"}, true), new String[][]{{"getPattern", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y MMM d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<empty>"}, true), new String[][]{{"getMaxLengthEstimate", "", "2"}, {"getTimeZoneOverridesCalendar", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<null>"}, true), new String[][]{{"format", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4:00:00 PM Pacific Standard Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-37", "-1073741853", "<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:6>", "<null>"}, true), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"-1800000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:1>"}, true), new String[][]{{"format", "java.util.Calendar", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Oct 3, 26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:1>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Z", "<sample:0>"}, true), new String[][]{{"format", "java.util.Date", "0"}, {"format", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "true", "53", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-0-0.5", "<sample:1>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "7"}, {"format", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0-0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "]", "<sample:1>"}}), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getOffsetsByStandard", "long,int[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"29"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "true", "-2147483648", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}}, 3), new String[][]{{"getDisplayLanguage", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:3>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "0"}, {"getDSTSavings", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"10", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
