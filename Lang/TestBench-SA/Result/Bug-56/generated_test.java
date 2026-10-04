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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd HH:mm] {getMaxLengthEstimate=14, getPattern=y-MM-dd HH:mm, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"2"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2", "2147483647"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60000", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d] {getMaxLengthEstimate=11, getPattern=y MMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=33, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a] {getMaxLengthEstimate=13, getPattern=h:mm:ss a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "0", "<null>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69-12-31 16:00:00 Pacific Standard Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "getTimeZone", ""}}, 2), new String[][]{{"getID", "", "3"}, {"hasSameRules", "java.util.TimeZone", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"aaaaaaaa`aaaaaa`aaaaaaaaaaaaaa", "<sample:1>", "<sample:0>"}, true), new String[][]{{"format", "java.util.Date", "4"}, {"parseObject", "java.lang.String,java.text.ParsePosition", "3"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM`PM`PM {length=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d] {getMaxLengthEstimate=11, getPattern=y MMM d, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:0>", "<sample:2>"}, true), new String[][]{{"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=49, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"Z"}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"ZD", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "0"}, {"format", "long,java.lang.StringBuffer", "0"}, {"appendCodePoint", "int", "7"}, {"length", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2", "3", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y, h:mm a] {getMaxLengthEstimate=24, getPattern=MMM d, y, h:mm a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"a", "<sample:6>"}, true), new String[][]{{"format", "java.util.Calendar", "6"}, {"clone", "", "6"}, {"formatToCharacterIterator", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"4{DD6wwww3,081w_\u00e9_2+8:.^^^>ah;29^k,\t>yyyyy$D$#5z3hkFZZWwWWHWHGEh222567\n\n21.12345", "<sample:9>"}, true), new String[][]{{"format", "java.util.Calendar", "3"}, {"format", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"4{DDDwwww2\u00e93,081hw_\u00e9_+8m.^^^>ah29^^,\t>yyyy$D$$wz3hkFZZzwW4HWHGEh122567\n\n21.12345", "<sample:15>"}, true), new String[][]{{"format", "java.util.Calendar", "3"}, {"format", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2", "0"}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"\010K", "<empty>"}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "1", "<empty>", "<sample:20>"}, true, 0, null, 3), new String[][]{{"clone", "", "6"}, {"getTimeZone", "", "0"}, {"setID", "java.lang.String", "4"}, {"getOffsets", "long,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "Unknown class: ", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "12:30:45", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<empty>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=2, getPattern=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"aaaaaaaaaaaaaaa`aaaaaaaaaaaaaa", "<sample:0>"}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{" ", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[ ] {getMaxLengthEstimate=1, getPattern= , getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{" ", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[ ] {getMaxLengthEstimate=1, getPattern= , getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{" ", "<null>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M/d/yy, h:mm a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "4"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-536870911", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-536870911", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3599942"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-536870911", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.12345678901234567", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.12345678901234567] {getMaxLengthEstimate=19, getPattern=1.12345678901234567, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-35"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 3:59 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1073741859"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/13/70, 2:15 vorm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"3600000"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2", "2147483647"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60000", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 5:00 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1800000"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2", "2147483647"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60000", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:30 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1799957"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3599999"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60000", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:29 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"60001"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-60039", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:01 nachm.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2251801961168896"}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "0", "4"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "0", "4"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2:3", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2:3] {getMaxLengthEstimate=3, getPattern=2:3, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-996441111", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2889777", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912505", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "0", "<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d HH:mm:ss zzzz] {getMaxLengthEstimate=40, getPattern=y MMMM d HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2147483647", "0", "<sample:0>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-127009534", "2139095034"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 \u00d6S {length=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"appendCodePoint", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample12/31/69, 4:00 \u00d6S\000 {length=24}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 12, new String[][]{}, 3), new String[][]{{"appendCodePoint", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<empty>"}}, 3), new String[][]{{"codePointBefore", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"3600000"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMM d] {getMaxLengthEstimate=11, getPattern=y MMM d, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getMaxLengthEstimate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"44", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<empty>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "`", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "10", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "36028797018963968", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-36028797018963968", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "36028797018963968", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "72022409665839104", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:.>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.25", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.25] {getMaxLengthEstimate=4, getPattern=1.25, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "30000", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"3600001", "3", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3599995", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "0x123456789", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3599995", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "0x123456789", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3599995", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "0x123456789", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483648", "10"}, false, 0, null, 3), new String[][]{{"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483648", "-51"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60061", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAll", "int,java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:2>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:2>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:3>"}}), new String[][]{{"addAll", "int,java.util.Collection", "5"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "3599999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3599999"}, {"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<empty>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<empty>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-51>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<empty>", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<empty>", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}}), new String[][]{{"ensureCapacity", "int", "5"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59999", "-2147483647", "<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=2, getPattern=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("M/d/yy, h:mm a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "1048579", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<sample:0>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd HH:mm:ss z] {getMaxLengthEstimate=22, getPattern=y-MM-dd HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd HH:mm:ss zzzz] {getMaxLengthEstimate=58, getPattern=y-MM-dd HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"1", "1", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d HH:mm:ss z] {getMaxLengthEstimate=25, getPattern=y MMMM d HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-2147483647", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-2147483647", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0x123456789", "<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3", "3"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2251801961168896"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8/31/87, 11:13 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1150669702645678080"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4/24/41, 10:07 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"2301339405291356160"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8/18/12, 3:15 AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2301339405291356160"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10/19/77, 5:44 AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2013109029139644416"}, false, 6, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4/9/07, 5:12 AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2012546079186223104"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/28/68, 4:16 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-1"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 3:59 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12/31/69, 4:00 PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60000", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3600000", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"3600001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"10", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0x123456789", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-0.0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[-0.0] {getMaxLengthEstimate=4, getPattern=-0.0, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1] {getMaxLengthEstimate=1, getPattern=1, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"+1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[+1] {getMaxLengthEstimate=2, getPattern=+1, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2:3", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2:3] {getMaxLengthEstimate=3, getPattern=2:3, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-997469350", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483648", "<sample:1>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "0", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d HH:mm:ss zzzz] {getMaxLengthEstimate=40, getPattern=y MMMM d HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "true", "3600000", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"60000", "2147483647"}, false), new String[][]{{"estimateLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5d", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 12, new String[][]{}), new String[][]{{"appendCodePoint", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:5>"}, false, 14, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}}), new String[][]{{"codePointBefore", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:4>"}, false, 14, new String[][]{}), new String[][]{{"codePointBefore", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:4>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5/5/03, 6:07 AM {length=15}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:4>"}, true), new String[][]{{"getPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y MMM d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:4>"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:4>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2147483647", "60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.12345678] {getMaxLengthEstimate=10, getPattern=1.12345678, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:3>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("69 Dec 31 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"1", "<sample:6>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69 Dec 31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<null>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dec 31, 69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:2>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}, {"format", "long", "3"}, {"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:3>"}, true), new String[][]{{"getMaxLengthEstimate", "", "7"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69 Dec 31", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<null>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Dec 31, 69 {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:3>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Jan 1, 70 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:5>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("January 1, 70 {length=13}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<empty>"}, true), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:3>"}, true), new String[][]{{"getLocale", "", "5"}, {"getCountry", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=33, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483648", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "`", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{" ", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"}", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3600001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "36028797018963968", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "36028797018963968", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"abc"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<null>", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "60061", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-2147483648", "-2147483648", "<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"68", "<sample:3>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1M2020-12-4T25:61:51", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "0x1F1.5d", "<sample:5>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long", "14"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2147483588"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm a] {getMaxLengthEstimate=10, getPattern=h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"3"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3599975", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}, {"substring", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:0>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}, {"substring", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"http://example.com/a?b=c", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:0>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Saturday, October 3, 26 {length=23}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<null>", "true", "0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-51", "<null>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"60000", "<empty>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"isDirty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isDirty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isDirty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "2", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y, h:mm:ss a] {getMaxLengthEstimate=33, getPattern=MMMM d, y, h:mm:ss a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "2", "<sample:0>", "<null>"}, true), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("January 1, 70, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "2", "<sample:0>", "<empty>"}, true), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("70 Jan 1 00:00:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "2", "<sample:2>", "<empty>"}, true), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("70 Jan 1, Thu 00:00:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "1", "<null>", "<empty>"}, true), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69 Dec 31, Wed 16:00:00 PST", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "1", "<sample:2>", "<empty>"}, true, 0, null, 1), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("70 Jan 1, Thu 00:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "1", "<sample:2>", "<empty>"}, true, 0, null, 2), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("70 Jan 1, Thu 00:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "1", "<sample:2>", "<empty>"}, true), new String[][]{{"format", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69 Dec 31, Wed 23:59:59 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-0.0", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[-0.0] {getMaxLengthEstimate=4, getPattern=-0.0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2147483649", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483648", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "3"}, false), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "3"}, {"estimateLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "0", "<sample:3>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"format", "long", "7"}, {"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "0", "<sample:3>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "long", "7"}, {"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}}), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"contains", "java.lang.Object", "1"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.5"}, true), new String[][]{{"format", "java.util.Calendar", "4"}, {"format", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"3"}, true), new String[][]{{"getLocale", "", "7"}, {"getScript", "", "7"}, {"getCountry", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "0", "<sample:3>", "<sample:9>"}, true), new String[][]{{"format", "long", "7"}, {"getTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "0", "<empty>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("70-01-01 00:00:00 Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1.1234567890123456", "<sample:0>", "<sample:3>"}, true), new String[][]{{"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"36", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"57"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-46"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"23"}, false, 7, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
