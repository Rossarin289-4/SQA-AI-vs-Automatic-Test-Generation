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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<sample:0>"}}, 1), new String[][]{{"getUnicodeLocaleType", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2", "0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y, h:mm:ss a zzzz] {getMaxLengthEstimate=68, getPattern=MMM d, y, h:mm:ss a zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-679469484", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss z] {getMaxLengthEstimate=12, getPattern=HH:mm:ss z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"}8"}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"FastDateFormat[", "<sample:1>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"{\"a\":1}", "<sample:9>", "<sample:0>"}, true), new String[][]{{"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"{\"a\"E:1}", "<sample:9>", "<sample:1>"}, true), new String[][]{{"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1", "<null>", "<sample:3>"}, true), new String[][]{{"format", "long", "2"}, {"getPattern", "", "6"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"a<wb", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"W--1", "<null>"}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3599999", "3599999"}, false, 0, null, 3), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "7"}, {"appendTo", "java.lang.StringBuffer,int", "3"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"1D"}, true, 0, null, 1), new String[][]{{"format", "long,java.lang.StringBuffer", "0"}, {"compareTo", "java.lang.StringBuffer", "6"}, {"codePointAt", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"Z[", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-0800[ {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"ZZ[", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date,java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-08:00[ {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"41G", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[41G] {getMaxLengthEstimate=4, getPattern=41G, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"0", "1", "<sample:2>"}, true, 0, null, 3), new String[][]{{"format", "long", "3"}, {"format", "long,java.lang.StringBuffer", "2"}, {"append", "char[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("jeudi 1 janvier 70 \u00e0 00:00:00 GMTa {length=34}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "60000"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long", "-2147483648"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}}, 1), new String[][]{{"estimateLength", "", "0"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "5"}, {"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"Z[", "<sample:3>"}, true), new String[][]{{"format", "java.util.Calendar,java.lang.StringBuffer", "3"}, {"append", "char", "1"}, {"capacity", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<sample:0>", "<null>"}, true, 0, null, 2), new String[][]{{"format", "long", "2"}, {"format", "java.util.Calendar,java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("03.10.26 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1<", "<sample:0>"}, true), new String[][]{{"getPattern", "", "2"}, {"format", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"k--d1--0", "<sample:3>"}, true, 0, null, 2), new String[][]{{"format", "java.util.Calendar", "4"}, {"format", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "false", "48", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"k--d1--0", "<empty>", "<sample:1>"}, true), new String[][]{{"format", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("24--11--0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\rSJT{L", "<sample:11>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"1KHTL", "<sample:6>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-9223372036854775808", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<empty>"}}, 1), new String[][]{{"getUnicodeLocaleType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "false", "3", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "4611686018427387903", "<sample:0>"}}, 1), new String[][]{{"getDisplayScript", "java.util.Locale", "4"}, {"clone", "", "7"}, {"clone", "", "6"}, {"getVariant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:kez>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "4611686018427387903", "<sample:1>"}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "4"}, {"clone", "", "7"}, {"clone", "", "6"}, {"getDisplayVariant", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:kez>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "4611686018427387903", "<sample:1>"}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "4"}, {"clone", "", "7"}, {"clone", "", "6"}, {"getDisplayVariant", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "4611686018427387903", "<sample:1>"}}, 2), new String[][]{{"toLanguageTag", "", "4"}, {"clone", "", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "9223372036854775806", "<sample:1>"}}, 2), new String[][]{{"toLanguageTag", "", "4"}, {"clone", "", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"3534938", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"17", "-30000"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"<a>b<Iar>+1", "<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "2020-02-30T25:61:61", "<sample:2>"}}, 3), new String[][]{{"getOffsetsByWall", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE d MMMM y] {getMaxLengthEstimate=26, getPattern=EEEE d MMMM y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"86", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:0>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=28, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 26, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1090910329", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, d. MMMM y 'um' HH:mm:ss z] {getMaxLengthEstimate=47, getPattern=EEEE, d. MMMM y 'um' HH:mm:ss z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3599999", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "3", "<sample:7>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3599999"}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "3", "<sample:7>"}}, 1), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"31.1234567890123456", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "-4611686018427387904"}, {"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"31.1234567880123456}", "<null>"}, false, 4, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "0"}, {"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\010A", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getLocale", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<null>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "66"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:`b>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 3), new String[][]{{"clone", "", "3"}, {"isDirty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 3), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 3), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3632853", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 3), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "3"}, {"getDisplayName", "boolean,int,java.util.Locale", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3632853", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 1), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "7"}, {"getDisplayName", "boolean,int,java.util.Locale", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 1), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "1.12345678901234567", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "1.12345678901234567", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<empty>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "4"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"p1.5f", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"p1.Wf", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1.", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"p1/Wf", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "2147483647", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1/", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"60000", "1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"setRawOffset", "int", "2"}, {"observesDaylightTime", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<null>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3632853", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0x12F456789", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"10", "<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"60006"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"74"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60001", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "3", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"1800000", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "3", "-2147483647"}, {"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3632853", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "3", "-2147483647"}, {"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3634901", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "toString", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "a", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"60000", "59999", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getUnicodeLocaleType", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:0>", "<empty>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"60000", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"010", "<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[010] {getMaxLengthEstimate=3, getPattern=010, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.Locale"}, new String[]{"3600000", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[010] {getMaxLengthEstimate=3, getPattern=010, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5.", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[5.] {getMaxLengthEstimate=2, getPattern=5., getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2147483647", "3599999", "<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFFF", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFFF", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<empty>", "<sample:3>"}, {"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5.", "<sample:1>"}, true), new String[][]{{"getMaxLengthEstimate", "", "6"}, {"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"5m.", "<sample:1>"}, true), new String[][]{{"getMaxLengthEstimate", "", "6"}, {"format", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("50.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "true", "0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "60001"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "60001"}, false), new String[][]{{"estimateLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"1", "3"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y, h:mm a] {getMaxLengthEstimate=30, getPattern=MMMM d, y, h:mm a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int"}, new String[]{"2", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y, h:mm:ss a z] {getMaxLengthEstimate=32, getPattern=MMM d, y, h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"10", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"<a>b</a>", "<empty>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-1", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "2020-02-30T25:61:61", "<sample:2>"}}), new String[][]{{"getOffsetsByWall", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=28, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"4", "<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"0", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=28, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "true", "3", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-29", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "0x123456789", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-29", "3"}, false, 15, new String[][]{}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912408", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906783829", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"4", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1509261052", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2889777", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1112912505", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 25, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2891265", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "hashCode", new String[]{}, new String[]{}, false, 26, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-414282262", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[EEEE, MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=51, getPattern=EEEE, MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-2147483649", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "32", "<sample:7>"}}), new String[][]{{"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{",l", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<empty>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "-4611686018427387904"}, {"org.apache.commons.lang.time.FastDateFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"59999", "<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[y-MM-dd] {getMaxLengthEstimate=8, getPattern=y-MM-dd, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[sample] {getMaxLengthEstimate=0, getPattern=sample, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5f", "<sample:5>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "3632853", "<sample:1>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}), new String[][]{{"clone", "", "3"}, {"getOffsetsByStandard", "long,int[]", "7"}, {"getDisplayName", "boolean,int,java.util.Locale", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"{\"a\":1}", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[{\"a\":1}] {getMaxLengthEstimate=8, getPattern={\"a\":1}, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "1.12345678901234567", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "0", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"2", "<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[2] {getMaxLengthEstimate=1, getPattern=2, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0x1F", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5f", "<empty>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0a {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "59999", "2"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}}), new String[][]{{"codePointAt", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "59999", "2"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", "int,int", "59999", "2"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<null>"}}), new String[][]{{"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0Infinity {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"3", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[3] {getMaxLengthEstimate=1, getPattern=3, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-1.5", "<sample:2>"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0.\u00e9", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[0.\u00e9] {getMaxLengthEstimate=3, getPattern=0.\u00e9, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"/", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[/] {getMaxLengthEstimate=1, getPattern=/, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"/", "<null>"}, true), new String[][]{{"format", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0", "<sample:2>"}, true), new String[][]{{"format", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.12345678901234567", "<sample:3>"}, true), new String[][]{{"getMaxLengthEstimate", "", "2"}, {"format", "long,java.lang.StringBuffer", "0"}, {"length", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[h:mm:ss a] {getMaxLengthEstimate=13, getPattern=h:mm:ss a, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss zzzz] {getMaxLengthEstimate=49, getPattern=HH:mm:ss zzzz, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"2"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"22"}, true), new String[][]{{"format", "long,java.lang.StringBuffer", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("22 {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "false", "-2147483647", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMM d, y] {getMaxLengthEstimate=12, getPattern=MMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[EEEE, MMMM d, y] {getMaxLengthEstimate=29, getPattern=EEEE, MMMM d, y, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-2147483647", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"1", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss z] {getMaxLengthEstimate=12, getPattern=HH:mm:ss z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone", "java.util.Locale"}, new String[]{"3", "<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[3] {getMaxLengthEstimate=1, getPattern=3, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.Locale"}, new String[]{"59999", "0", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneOverridesCalendar", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=0, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getRawOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar", "<null>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<empty>", "false", "1", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "false", "1", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:4>", "false", "-1", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:11>", "false", "0", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}, {"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "12:30:45", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"long"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "long,java.lang.StringBuffer", "-9223372036854775808", "<sample:2>"}, {"org.apache.commons.lang.time.FastDateFormat", "parsePattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"2", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[HH:mm:ss] {getMaxLengthEstimate=8, getPattern=HH:mm:ss, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.Locale"}, new String[]{"-51", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"\t"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[\t] {getMaxLengthEstimate=1, getPattern=\t, getTimeZoneOverridesCalendar=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"\t"}, true), new String[][]{{"getTimeZone", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=2, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[0] {getMaxLengthEstimate=1, getPattern=0, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " ", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "init", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " ", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"010", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'10", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"2147483648", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"0", "<sample:2>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String", "java.util.TimeZone"}, new String[]{"\n8<a>b</a>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getTimeInstance", new String[]{"int", "java.util.TimeZone"}, new String[]{"-46", "<sample:11>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseToken", "java.lang.String,int[]", "", "<sample:0>"}, {"org.apache.commons.lang.time.FastDateFormat", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"insert", "int,long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<empty>"}, false, 12, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<null>"}, {"org.apache.commons.lang.time.FastDateFormat", "format", "long", "3600001"}}), new String[][]{{"insert", "int,long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateInstance", new String[]{"int"}, new String[]{"0"}, true, 0, null, 2), new String[][]{{"getTimeZone", "", "0"}, {"isDirty", "", "0"}, {"toZoneId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getId=America/Los_Angeles}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"1", "3600000", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"1", "1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=39, getPattern=MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"1", "1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[MMMM d, y 'at' h:mm:ss a z] {getMaxLengthEstimate=39, getPattern=MMMM d, y 'at' h:mm:ss a z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"2", "1", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[dd.MM.y, HH:mm:ss z] {getMaxLengthEstimate=22, getPattern=dd.MM.y, HH:mm:ss z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateFormat[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[a] {getMaxLengthEstimate=0, getPattern=a, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"3", "1", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.time.FastDateFormat", actual.getClass().getName());
  assertEquals("FastDateFormat[dd/MM/y HH:mm:ss z] {getMaxLengthEstimate=21, getPattern=dd/MM/y HH:mm:ss z, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getDateTimeInstance", new String[]{"int", "int", "java.util.TimeZone"}, new String[]{"3", "0", "<sample:2>"}, true), new String[][]{{"getTimeZoneOverridesCalendar", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{}, new String[]{}, true), new String[][]{{"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "selectNumberRule", new String[]{"int", "int"}, new String[]{"60000", "59999"}, false), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateFormat[] {getMaxLengthEstimate=0, getPattern=, getTimeZoneOverridesCalendar=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.lang.time.FastDateFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "--1", "<sample:7>"}, {"org.apache.commons.lang.time.FastDateFormat", "getTimeZone", ""}, {"org.apache.commons.lang.time.FastDateFormat", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.FastDateFormat", "org.apache.commons.lang.time.FastDateFormat", "getInstance", new String[]{"java.lang.String"}, new String[]{"0"}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
}
