package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[d MMMM y] {getMaxLengthEstimate=17, getPattern=d MMMM y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:ba>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "-2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "17592189644415", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<null>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm] {getMaxLengthEstimate=5, getPattern=HH:mm, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"EastDateFprmat[", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:5>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}, {"format", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:00:00 AM GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y] {getMaxLengthEstimate=18, getPattern=MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=49, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"GastDateFormat[", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<sample:2>"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "5"}, {"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "16"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:3>"}}, 2), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "0"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372036854775808", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12/2/55, 8:47 AM {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"k\u00e9", "<empty>", "<null>"}, true), new String[][]{{"format", "java.util.Calendar", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("19\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"k\u00e8", "<sample:6>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("24\u00e8 {length=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:6>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "4"}, {"append", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("+0000sample {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"Siitle"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<sample:7>", "<sample:3>"}, true), new String[][]{{"format", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("55-12-02", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"j", "<sample:10>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "33"}, false, 4, new String[][]{}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"K", "<sample:3>"}, true), new String[][]{{"format", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"600w001L", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"0", "1", "<sample:0>"}, true), new String[][]{{"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "1", "<sample:2>"}, true), new String[][]{{"getPattern", "", "0"}, {"getTimeZoneOverridesCalendar", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"D", "<sample:1>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("276 {length=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.123W5678", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.123W5678] {getMaxLengthEstimate=13, getPattern=1.123W5678, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"FaDDa"}, true), new String[][]{{"format", "java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1PM276PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"3", "0"}, true), new String[][]{{"format", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:00:00 PM Pacific Standard Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"Z"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar", "5"}, {"format", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"ZZ", "<sample:3>", "<sample:3>"}, true), new String[][]{{"format", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+00:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483648", "1800012"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}, {"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "true", "49", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"60000", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"--1", "<sample:6>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"60001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-983498363", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2", "2147483646"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3599999", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483648", "119998", "<sample:6>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"2147483647", "60000", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:7>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.d", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.d] {getMaxLengthEstimate=6, getPattern=1.d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"-4254303", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "false", "40", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:\"b>", "<sample:0>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2147483647", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"-47", "2147483647", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-1.5{\"a\":1}", "<sample:0>", "<empty>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 4, new String[][]{}, 1), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.5e3U00", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"-125537"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:3>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.123456781.5f"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M/d/yy, h:mm a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "3600004"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3600008", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1e1", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"9223372036854775807", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2[20-02-30T225:61:61", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"51", "<sample:3>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"59974"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 1), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.25] {getMaxLengthEstimate=4, getPattern=1.25, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"a", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1799999", "<sample:5>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-274877786944"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"c2FastDa", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"30053", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, d. MMMM y] {getMaxLengthEstimate=30, getPattern=EEEE, d. MMMM y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "-42", "60007"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"-2147483648", "2", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"-2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"\u00e9./aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\u00e9./aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=9, getPattern=\u00e9./aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "false", "21", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483648", "2147483647", "<sample:5>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483647", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\n] {getMaxLengthEstimate=1, getPattern=\n, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"120002", "<sample:1>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a b", "<sample:5>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2147483647", "4124287", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "false", "-2147483648", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"12:/:45"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[12:/:45] {getMaxLengthEstimate=7, getPattern=12:/:45, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"4254303", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"Hello, World1.123456782"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2147483647", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"ii", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<null>", "false", "-2147483647", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483648", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-59"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"60007"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3599999", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3600008", "2147483647", "<sample:0>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"54", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1073801826"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"119998", "16897218", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"10", "-2147483648", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-997469350", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.25", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "33", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0x1F", "<sample:0>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"4", "10"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M/d/yy, h:mm a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "http://example.com/a?b=c", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.2", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.2] {getMaxLengthEstimate=3, getPattern=1.2, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"3"}, true), new String[][]{{"format", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-42", "10"}, false, 7, new String[][]{}), new String[][]{{"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"/a/b", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/2/55, 8:47 AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"15", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'15", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"[1,2]5.", "<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[[1,2]5.] {getMaxLengthEstimate=7, getPattern=[1,2]5., getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<i:-1>"}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 PM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2.2147483648", "<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[-2.2147483648] {getMaxLengthEstimate=13, getPattern=-2.2147483648, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-X", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-1.", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'-1.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"]2147483648", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("']2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"2", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2] {getMaxLengthEstimate=1, getPattern=2, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"[1", "<sample:0>", "<sample:4>"}, true), new String[][]{{"getMaxLengthEstimate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "9223372036854775781"}, {"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "134217727", "8173"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1]", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"5+1", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'5+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3", "-4254303"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:4>", "<sample:2>"}}), new String[][]{{"clear", "", "3"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"36026597995708418", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("6/11/07, 1:08 PM {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Unknown class: +1", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"60001", "2147483647"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"FastDa", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-3600008", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "u2020-01-01", "<sample:7>"}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "2020-01-01", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-2147483648", "<empty>"}, true), new String[][]{{"parseObject", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"-2147483637"}, true), new String[][]{{"format", "java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483637", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "2147483647"}}), new String[][]{{"delete", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:3>"}}), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getLocale", "", "1"}, {"getDisplayScript", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "33"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"60000", "<sample:2>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("60000 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=49, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483643", "60001"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483647", "<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L-1", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.d"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1.5 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"2020-01-1"}, true), new String[][]{{"getLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "true", "-84", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss z] {getMaxLengthEstimate=13, getPattern=HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y] {getMaxLengthEstimate=18, getPattern=MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"1097364152321", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("10/9/04, 4:22 PM {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a z] {getMaxLengthEstimate=17, getPattern=h:mm:ss a z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<empty>"}, true), new String[][]{{"parseObject", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 PM {length=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"--1\u00e9", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[--1\u00e9] {getMaxLengthEstimate=4, getPattern=--1\u00e9, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"3147483648"}, true), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[3147483648] {getMaxLengthEstimate=10, getPattern=3147483648, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:4>"}, true), new String[][]{{"getMaxLengthEstimate", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1.5", "<sample:1>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.5] {getMaxLengthEstimate=3, getPattern=1.5, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/2/55, 8:47 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-", "<sample:1>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60000", "<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"append", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample12/31/69, 4:01 PMfalse {length=28}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-1.5{\"a#:1}", "<sample:2>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1.5{\"PM#:1} {length=12}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\u00e9./", "<null>"}, true), new String[][]{{"clone", "", "5"}, {"format", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<null>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a z] {getMaxLengthEstimate=18, getPattern=h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "2", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y, h:mm:ss a] {getMaxLengthEstimate=44, getPattern=EEEE, MMMM d, y, h:mm:ss a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "7199486"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2/20/51, 9:43 AM {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"toLanguageTag", "", "0"}, {"getDisplayVariant", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"6_000", "<sample:7>"}, true), new String[][]{{"getTimeZone", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"7", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "6"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:6>"}}), new String[][]{{"getExtensionKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "65494", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:4>", "false", "0", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getOffsetsByWall", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\u00ea", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\u00ea] {getMaxLengthEstimate=1, getPattern=\u00ea, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-1800000", "<empty>"}}), new String[][]{{"toZoneId", "", "3"}, {"normalized", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneOffset", actual.getClass().getName());
  assertEquals("Z {getId=Z, getTotalSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\n] {getMaxLengthEstimate=1, getPattern=\n, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"288230374004228097", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12/13/26, 6:57 PM {length=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}, {"replace", "int,int,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDSTSavings", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2020-01-01] {getMaxLengthEstimate=10, getPattern=2020-01-01, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"12:30:5"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12:30:5 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"134217729"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"]", "<sample:4>"}, true), new String[][]{{"getTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDisplayLanguage", "", "5"}, {"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("en-US", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<empty>"}, true), new String[][]{{"getMaxLengthEstimate", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"4254342", "<sample:5>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:6>", "<sample:4>"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.1234567890123456", "<sample:3>"}, true), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.1234567890123456] {getMaxLengthEstimate=18, getPattern=1.1234567890123456, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"]", "<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[]] {getMaxLengthEstimate=1, getPattern=], getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getMaxLengthEstimate", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:2>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-1.[{\"a\"\":1}", "<sample:0>"}, true), new String[][]{{"getMaxLengthEstimate", "", "4"}, {"format", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.[{\"AM\"\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<null>"}, true), new String[][]{{"format", "long", "1"}, {"getMaxLengthEstimate", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:4>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=2, getPattern=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"0+", "<sample:2>"}, true), new String[][]{{"getTimeZone", "", "7"}, {"setRawOffset", "int", "6"}, {"getID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1077341840", "1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:0>"}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"1"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample4:00:00 PM PST {length=20}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"3600000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2147483648", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3", "<sample:2>"}, true, 0, null, 3), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[dd/MM/y] {getMaxLengthEstimate=8, getPattern=dd/MM/y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}}), new String[][]{{"getDisplayName", "boolean,int,java.util.Locale", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
