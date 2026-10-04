package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1E-5", "<sample:2>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1E-5] {getMaxLengthEstimate=6, getPattern=1E-5, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:3>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=49, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<empty>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a\u00e9", "<null>"}, true), new String[][]{{"clone", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:3>"}, true), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+0000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2", "3", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y, h:mm a] {getMaxLengthEstimate=24, getPattern=MMM d, y, h:mm a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=54, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a", "<sample:0>", "<sample:10>"}, true), new String[][]{{"format", "java.util.Date", "1"}, {"parseObject", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3600001", "3600001"}, false), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}, {"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y] {getMaxLengthEstimate=18, getPattern=MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "3600001", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:8>"}}, 2), new String[][]{{"getDisplayName", "java.util.Locale", "0"}, {"setRawOffset", "int", "6"}, {"getOffset", "long", "1"}, {"useDaylightTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"3", "3", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd HH:mm] {getMaxLengthEstimate=14, getPattern=y-MM-dd HH:mm, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "3600001"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "3"}, {"estimateLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"k"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[k] {getMaxLengthEstimate=4, getPattern=k, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"k", "<sample:3>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("16 {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-538215339843286416"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:5>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/5/46, 12:25 \u00d6S", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"k", "<sample:5>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("24 {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"ZZ"}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-08:00 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"0w\"FFFFFwGF2020-01-01010", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[0w\"FFFFFwGF2020-01-01010] {getMaxLengthEstimate=33, getPattern=0w\"FFFFFwGF2020-01-01010, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "false", "-2147483600", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"2K1.5f"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Z3W502147748\"64813:31D5[2,2]010>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "3"}, {"format", "java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-070031502147748\"64813:312765[2,2]010>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Z1W\r7|DD*136848\"638811:32D52,3\\011>\n1F-51.25{\" aa\">:1}5.", "<sample:18>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Calendar", "7"}, {"format", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Z1W\r77|DDD*1268548", "<sample:0>"}, true), new String[][]{{"format", "java.util.Calendar", "7"}, {"format", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"202D-02-30S25961:61"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[202D-02-30S25961:61] {getMaxLengthEstimate=25, getPattern=202D-02-30S25961:61, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"getCountry", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TR", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[d MMMM y EEEE] {getMaxLengthEstimate=25, getPattern=d MMMM y EEEE, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<null>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<null>"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE d MMMM y '\u00e0' HH:mm:ss z] {getMaxLengthEstimate=42, getPattern=EEEE d MMMM y '\u00e0' HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "TITLE", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<null>", "false", "4", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<i:-18>"}, {"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<null>"}, true, 0, null, 1), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("tr_TR {getCountry=TR, getDisplayCountry=Turkey, getDisplayLanguage=Turkish, getDisplayName=Turkish (Turkey), getDisplayScript=, getDisplayVariant=, getISO3Country=TUR, getISO3Language=tur, getLanguage...#250#-456157374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<empty>"}, true, 0, null, 1), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-1", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"-2147483649"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\n", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\n", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\n", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\n", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483462", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:0>"}, true, 0, null, 1), new String[][]{{"format", "long,java.lang.StringBuffer", "4"}, {"append", "java.lang.String", "1"}, {"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("23:12:55aa {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"-1", "4"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"8", "1799999", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "60000", "3599999"}, {"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "60001", "-3599999"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "60000", "3599999"}, {"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "60001", "-3599999"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:4>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "3600000"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "3600000"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}}, 2), new String[][]{{"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"-1", "<sample:1>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:1>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"10", "<sample:5>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-101", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a\u00e9\u00e8", "<sample:1>"}, true, 0, null, 1), new String[][]{{"clone", "", "6"}, {"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b/c", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b/c12:30:45", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b/c12:30:45", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b/c12:30:45", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=26, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3599998", "<sample:3>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+0000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"I", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-1", "<sample:6>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"-1", "<sample:6>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\n", "<sample:3>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date", "5"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "0"}, {"append", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\na {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\t", "<sample:2>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date", "5"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "0"}, {"append", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\ta {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"[", "<empty>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Date", "5"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "0"}, {"append", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("[a {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Unknown \u00e9class: ", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "false", "59999", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"2147483647", "3", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"set", "int,java.lang.Object", "5"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a\u00e9", "<sample:0>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM\u00e9-1.0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3600000", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1", "<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"0", "2147483647", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"4", "59999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"60000", "3600001", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"60000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{".5", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[.5] {getMaxLengthEstimate=2, getPattern=.5, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{".50x1F", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"[", "<sample:3>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<sample:3>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3599999", "<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600001", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<empty>"}, true), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:1>"}, true), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<null>"}, true), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:3>"}, true), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "true", "3600000", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3599999", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "\n", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-9223372036854775808", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"10", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.1234567", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[1.1234567] {getMaxLengthEstimate=9, getPattern=1.1234567, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"["}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[[] {getMaxLengthEstimate=1, getPattern=[, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:5>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a zzzz] {getMaxLengthEstimate=54, getPattern=h:mm:ss a zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"60001", "60001", "<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"2", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a] {getMaxLengthEstimate=13, getPattern=h:mm:ss a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<null>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<empty>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<empty>"}, true), new String[][]{{"format", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11:59:59 PM GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<empty>"}, true), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<empty>"}, true), new String[][]{{"format", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11:59:59 PM Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", "int,int", "10", "3599999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-1.5", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0x1F", "<sample:1>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-1", "-2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-2147483648", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59999", "<sample:0>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y MMMM d, EEEE] {getMaxLengthEstimate=16, getPattern=y MMMM d, EEEE, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDisplayScript", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getDisplayScript", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDisplayScript", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"clone", "", "6"}, {"getPattern", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EEEE, MMMM d, y", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a", "<empty>"}, true), new String[][]{{"clone", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"aa\u00e9", "<sample:2>"}, true), new String[][]{{"clone", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a\u00e9\u00e9", "<sample:2>"}, true), new String[][]{{"clone", "", "6"}, {"getPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\u00e9\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"a\u00e9\u00e9", "<sample:3>"}, true), new String[][]{{"clone", "", "6"}, {"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"1.25", "<null>"}, true), new String[][]{{"getMaxLengthEstimate", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b=c", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"", "<sample:0>"}, true), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z", "<null>"}, true), new String[][]{{"format", "java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0700", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"0w\"FFFFFwFF2020-01-01", "<sample:1>"}, true), new String[][]{{"getLocale", "", "5"}, {"getUnicodeLocaleType", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Unknown class: ", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "5"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}), new String[][]{{"set", "int,java.lang.Object", "5"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat$StringLiteral", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"5.", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[5.] {getMaxLengthEstimate=2, getPattern=5., getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"5.--1", "<sample:0>", "<sample:5>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5.--1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"5.--11.12345678", "<sample:0>", "<sample:7>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5.--11.12345678 {length=15}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"5.--11.123", "<sample:0>", "<sample:8>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5.--11.123 {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"202D-02-30T25:61:61", "<sample:0>", "<sample:11>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a\u00e9", "<sample:0>", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM\u00e9-1.0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"`\u00e9", "<sample:0>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("`\u00e9-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a\u00e9", "<sample:2>", "<null>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\u00d6S\u00e9-1.0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"202D-02-30T25:61:61", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'202", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"\u00e9", "<sample:2>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\u00e9-1.0 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"a", "<sample:2>", "<sample:12>"}, true, 0, null, 1), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}, {"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-9223372036854775808"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-9223372036854775808"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"a\u00e9", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-9223372036854775808"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Hello, World", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-9223372036854775808"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Hello, World", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "-9223372036854775808"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Date", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "+1", "<sample:1>"}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-2", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2", "3", "<sample:5>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Apr 4, 02, 1:06 PM {length=18}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"3599999", "2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"536870911"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "--1", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "--1", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "--1", "<null>"}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-131071>"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:4>"}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-65535>"}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true), new String[][]{{"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "3", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:1>"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "6"}, {"append", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("12:00:00 AM GMT2 {length=16}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2147483648", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2147483648] {getMaxLengthEstimate=10, getPattern=2147483648, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[M/d/yy, h:mm a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa] {getMaxLengthEstimate=2, getPattern=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"aaaXaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"4", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "1.5f", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a\u00e9", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"setRawOffset", "int", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=2,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=2, isDirty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setRawOffset", "int", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=2,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=2, isDirty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"setRawOffset", "int", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=2,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=2, isDirty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1674580754", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-996441111", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912505", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "a,b,c", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("fr_FR {getCountry=FR, getDisplayCountry=France, getDisplayLanguage=French, getDisplayName=French (France), getDisplayScript=, getDisplayVariant=, getISO3Country=FRA, getISO3Language=fra, getLanguage=f...#248#-1593483848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"60000aaaaaaaaaaaaaaaaaaaaaXaaa,aaaa", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "4", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"60000aaaaa[aaaaaa", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"60000aaaaa[aaaaaa", "<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang3.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "2", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[M/d/yy, h:mm a] {getMaxLengthEstimate=22, getPattern=M/d/yy, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "6"}, {"length", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"1"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "6"}, {"length", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"5.", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "6"}, {"length", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Saturday, October 3, 26 {length=23}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59", "<sample:0>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3600000", "<sample:5>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[3600000] {getMaxLengthEstimate=7, getPattern=3600000, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateFormat", "org.apache.commons.lang3.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"28"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
